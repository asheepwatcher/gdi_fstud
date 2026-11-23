#!/usr/bin/env python3
# Zieht alle javacode-Blöcke aus tex/kapitel/*.tex und legt sie als übersetzbare
# Java-Dateien im Ordner java/ ab (ein Unterordner pro Beispiel bzw. Aufgabe).
# Ergänzungen und Sonderfälle (fehlende Variablen, main-Methoden, Vorlagen) stehen in ovr.py.
# Aufruf:  python3 werkzeuge/java_extrahieren.py      danach:  werkzeuge/java_pruefen.sh
import re, os, sys, glob, json, shutil, unicodedata
HIER=os.path.dirname(os.path.abspath(__file__))
SRC=os.path.join(HIER,'..','tex','kapitel')
OUT=sys.argv[1] if len(sys.argv)>1 else os.path.join(HIER,'..','java')
sys.path.insert(0,os.path.dirname(os.path.abspath(__file__)))
import ovr
OVR0=ovr.OVR
def ascii_(s):
    for a,b in (('ä','ae'),('ö','oe'),('ü','ue'),('Ä','Ae'),('Ö','Oe'),('Ü','Ue'),('ß','ss')): s=s.replace(a,b)
    return unicodedata.normalize('NFKD',s).encode('ascii','ignore').decode()
def detex(s):
    s=re.sub(r'\\(code|textbf|emph|enquote|texttt)\{([^}]*)\}',r'\2',s)
    s=s.replace('\\,',' ').replace('\\ ',' ').replace('\\&','&').replace('\\%','%').replace('\\_','_').replace('--','–')
    s=re.sub(r'\$([^$]*)\$',r'\1',s); s=re.sub(r'\\[a-zA-Z]+','',s); s=s.replace('{','').replace('}','')
    return re.sub(r'\s+',' ',s).strip()
def slug(s,n=40):
    s=re.sub(r'[^a-z0-9]+','-',ascii_(detex(s)).lower()).strip('-')
    return s[:n].rstrip('-')
def camel(s):
    w=re.findall(r'[A-Za-z0-9]+',ascii_(detex(s)))
    r=''.join(x[:1].upper()+x[1:] for x in w)
    m=re.match(r'^([a-z])\)',detex(s))
    if m: return 'Teil'+m.group(1).upper()
    if not r or r[0].isdigit(): r='Teil'+r
    return r
TYPE=re.compile(r'^(?:public\s+|abstract\s+|final\s+)*(class|interface|enum)\s+(\w+)')
blocks=[]
for f in sorted(glob.glob(SRC+'/[0-9][0-9]-*.tex')):
    base=os.path.basename(f)[:-4]; chap=int(base[:2])
    if chap==0: continue
    L=open(f,encoding='utf8').read().split('\n')
    sect=''; kind='einfuehrung'; num=0; title='Einführung'; nb=0; na=0; nk=0; i=0; item=''
    while i<len(L):
        l=L[i]
        m=re.match(r'\\section\{([^}]*)\}',l)
        if m: sect=m.group(1)
        m=re.match(r'\\beispiel\{(.*)\}\s*$',l)
        if m: nb+=1; kind='beispiel'; num=nb; title=m.group(1); item=''
        m=re.match(r'\\aufgabe(?:\[[^\]]*\])?\{(.*?)\}(\\label\{.*\})?\s*$',l)
        if m: na+=1; kind='aufgabe'; num=na; title=m.group(1); item=''
        m=re.match(r'\\klausuraufgabe\{(\d+)\) (.*?)\}\{',l)
        if m: kind='klausur'; num=int(m.group(1)); title=m.group(2); item=''
        m=re.match(r'\s*\\item(?:\[.*?\])?\s',l+' ')
        m2=re.match(r'\s*\\begin\{javacode\}(?:\[([^\]]*)\])?\{(.*)\}\s*$',l)
        if m2:
            j=i+1; code=[]
            while not re.match(r'\s*\\end\{javacode\}',L[j]): code.append(L[j]); j+=1
            blocks.append(dict(base=base,chap=chap,sect=sect,kind=kind,num=num,title=title,bt=m2.group(2),opt=m2.group(1) or '',code=code))
            i=j
        i+=1
# group
groups={}
for b in blocks:
    key=(b['base'],b['kind'],b['num'])
    groups.setdefault(key,[]).append(b)
for alt in glob.glob(os.path.join(OUT,'[0-9][0-9]-*')): shutil.rmtree(alt)
index=[]
def header(b,extra=None):
    k={'beispiel':'Beispiel %d.%d'%(b['chap'],b['num']),'aufgabe':'Aufgabe %d.%d'%(b['chap'],b['num']),'klausur':'Übungsklausur, Aufgabe %d'%b['num'],'einfuehrung':'Einführung'}[b['kind']]
    h=['// Kapitel %d: %s'%(b['chap'],detex(b['sect'])),'// %s: %s'%(k,detex(b['title']))]
    bt=detex(b['bt'])
    if bt and not bt.endswith('.java'): h.append('// Abschnitt im Skript: %s'%bt)
    if extra: h+=['// '+x for x in extra]
    return '\n'.join(h)+'\n\n'
def split_types(code):
    # returns list of (name, text); imports/comments before first type are prefix for all
    out=[]; prefix=[]; cur=None; depth=0; pending=[]
    for l in code:
        if depth==0:
            m=TYPE.match(l)
            if m:
                cur=[m.group(2), pending+[l]]; pending=[]; out.append(cur)
            elif cur is None and (l.startswith('import ') or l.startswith('package ')): prefix.append(l)
            elif l.strip()=='' or l.strip().startswith('//') or l.strip().startswith('@'): pending.append(l)
            elif cur is not None: cur[1].append(l)
            else: pending.append(l)
        else: cur[1].append(l)
        s=re.sub(r'"(\\.|[^"\\])*"|\'(\\.|[^\'\\])\'|//.*','',l)
        depth+=s.count('{')-s.count('}')
    res=[]
    for name,ls in out:
        while ls and ls[0].strip()=='': ls=ls[1:]
        while ls and ls[-1].strip()=='': ls=ls[:-1]
        res.append((name,('\n'.join(prefix)+'\n\n' if prefix else '')+'\n'.join(ls)+'\n'))
    return res
HEAD=re.compile(r'^\s*(?:(?:public|private|protected)\s+)?(?:static\s+)?(?:final\s+)?[\w\[\]<>]+\s+\w+\s*\([^;{}]*\)\s*(?://.*)?$')
def is_members(code):
    d=0
    for l in code:
        s=l.strip()
        if d==0 and s and not s.startswith('//'):
            if re.match(r'^(public |private |protected )?static\b',s) or HEAD.match(l): return True
        t=re.sub(r'"(\\.|[^"\\])*"|//.*','',l); d+=t.count('{')-t.count('}')
    return False
def stubify(code):
    out=[]
    for l in code:
        if HEAD.match(l) and '{' not in l:
            m=re.match(r'^(\s*)(.*?\))\s*(//.*)?$',l)
            if m.group(3): out.append(m.group(1)+m.group(3))
            out.append(m.group(1)+m.group(2)+' {'); out.append(m.group(1)+'\tthrow new UnsupportedOperationException("noch nicht implementiert");'); out.append(m.group(1)+'}'); out.append('')
        else: out.append(l)
    while out and out[-1]=='': out.pop()
    return out
def indent(ls,n): return [('\t'*n+l if l.strip() else '') for l in ls]
for key in sorted(groups, key=lambda k:(k[0],{'einfuehrung':0,'beispiel':1,'aufgabe':2,'klausur':3}[k[1]],k[2])):
    bl=groups[key]; b0=bl[0]
    dname={'einfuehrung':'einfuehrung','beispiel':'beispiel-%02d-%02d-'%(b0['chap'],b0['num']),'aufgabe':'aufgabe-%02d-%02d-'%(b0['chap'],b0['num']),'klausur':'klausuraufgabe-%d-'%b0['num']}[b0['kind']]
    if b0['kind']!='einfuehrung': dname+=slug(b0['title'])
    d=os.path.join(OUT,b0['base'],dname); os.makedirs(d,exist_ok=True); used=set()
    for bi,b in enumerate(bl):
        oid='%s/%s/%d'%(b['base'],dname,bi)
        short='%s/%s/%d'%(b['base'],re.match(r'(einfuehrung|beispiel-\d+-\d+|aufgabe-\d+-\d+|klausuraufgabe-\d+)',dname).group(1),bi)
        ov=OVR0.get(short,{})
        if ov.get('skip'): continue
        errdir=any((b['base']+'/'+dname).startswith(e) for e in ovr.ERRDIRS)
        if errdir: ov=dict(ov); ov['note']=ovr.ERR
        code=b['code'][:]
        while code and code[-1].strip()=='': code.pop()
        files=[]
        if 'files' in ov:
            files=[(n,header(dict(b,bt=''),ov.get('note'))+t) for n,t in ov['files'].items()]; cls='manuell'
        else:
            code=[l for l in code]
            if 'replace' in ov:
                txt='\n'.join(code)
                for a,c in ov['replace']: 
                    assert a in txt,(oid,a); txt=txt.replace(a,c)
                code=txt.split('\n')
            has_type=any(TYPE.match(l) for l in code)
            if has_type:
                cls='typen'
                for name,text in split_types(code):
                    pre=ov.get('imports','')
                    files.append((name+'.java',header(b,ov.get('note'))+(pre+'\n\n' if pre else '')+text))
            else:
                name=ov.get('name') or camel(b['bt'])
                n0=name; k=2
                while name in used: name=n0+str(k); k+=1
                imp=''
                if 'Scanner' in '\n'.join(code): imp='import java.util.Scanner;\n\n'
                if ov.get('imports'): imp+=ov['imports']+'\n\n'
                if is_members(code) or ov.get('members'):
                    cls='methoden'
                    body=stubify(code)
                    extra=ov.get('extra_members',[])
                    mainl=ov.get('main')
                    if not mainl and 'void main(' not in '\n'.join(code):
                        mc=re.search(r'\\ (\w+\(.*\))\s*$',b['bt'])
                        if mc:
                            call=mc.group(1); fn=call.split('(')[0]
                            isvoid=re.search(r'void\s+'+fn+r'\s*\(','\n'.join(code))
                            mainl=[call+';'] if isvoid else ['System.out.println('+call+');']
                    if mainl: body=body+['','public static void main(String[] args) {']+['\t'+x for x in mainl]+['}']
                    text=imp+'public class %s {\n'%name+'\n'.join(indent(extra+([''] if extra else [])+body,1))+'\n}\n'
                else:
                    cls='anweisungen'
                    pre=ov.get('pre',[])
                    post=ov.get('post',[])
                    alltxt='\n'.join(pre+code+post)
                    if 'System.out' not in alltxt and not errdir:
                        names=[]; dd=0
                        for l in pre+code:
                            if dd==0:
                                mm=re.match(r'^\s*(?:final\s+)?(int|long|short|byte|double|float|boolean|char|String|Integer|Double)((?:\[\])*)\s+(.+);\s*(//.*)?$',l)
                                if mm:
                                    rest=re.sub(r'\{[^}]*\}|\([^)]*\)|"[^"]*"','',mm.group(3))
                                    for part in rest.split(','):
                                        nm=re.match(r'\s*(\w+)',part)
                                        if nm and nm.group(1) not in [x[0] for x in names]: names.append((nm.group(1),len(mm.group(2))//2))
                            t=re.sub(r'"(\\.|[^"\\])*"|//.*','',l); dd+=t.count('{')-t.count('}')
                        if names:
                            def show(n,dim): return n if dim==0 else ('java.util.Arrays.toString(%s)'%n if dim==1 else 'java.util.Arrays.deepToString(%s)'%n)
                            post=post+['','// Ausgabe zur Kontrolle (steht nicht im Skript)','System.out.println('+' + ", '.join(('"' if i==0 else '')+'%s = " + %s'%(n,show(n,d)) for i,(n,d) in enumerate(names))+');']
                    ov=dict(ov); ov['post']=post
                    text=imp+'public class %s {\n'%name+'\n'.join(indent(ov.get('extra_members',[]),1))+('\n\n' if ov.get('extra_members') else '')+'\tpublic static void main(String[] args) {\n'+'\n'.join(indent(pre+code+ov.get('post',[]),2))+'\n\t}\n}\n'
                files.append((name+'.java',header(b,ov.get('note'))+text))
        for n,t in files:
            n0=n
            used.add(n[:-5])
            open(os.path.join(d,n),'w',encoding='utf8').write(t)
        index.append(dict(id=oid,dir=os.path.relpath(d,OUT),cls=cls,files=[n for n,_ in files],bt=b['bt'],kind=b['kind']))
for pref,srcs in ovr.COPY.items():
    tgt=[x['dir'] for x in index if x['dir'].startswith(pref)][0]
    for sp in srcs:
        t=open(os.path.join(OUT,sp),encoding='utf8').read()
        body=t.split('\n\n',1)[1]
        open(os.path.join(OUT,tgt,os.path.basename(sp)),'w',encoding='utf8').write('// Kopie aus '+os.path.dirname(sp).split('/')[-1]+', damit dieser Ordner für sich übersetzbar ist\n\n'+body)
for dname,(tit,kap,text) in ovr.EXTRA.items():
    d=os.path.join(OUT,dname); os.makedirs(d,exist_ok=True)
    open(os.path.join(d,'Programmverstaendnis.java'),'w',encoding='utf8').write('// '+kap+'\n// '+tit+'\n'+''.join('// '+x+'\n' for x in ovr.PVNOTE)+'\n'+text)
print(len(blocks),'Blöcke,',len(groups),'Ordner,',sum(len(x['files']) for x in index),'Dateien')
from collections import Counter; print(Counter(x['cls'] for x in index))
