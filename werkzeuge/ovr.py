T='\t'
def pv(start, zeilen):
    x,y,z=start
    L=['public class Programmverstaendnis {','\tpublic static void main(String[] args) {','\t\tint x, y, z;','']
    for s in zeilen:
        L+=['\t\tx = %d; y = %d; z = %d;'%(x,y,z),'\t\t'+s,'\t\tSystem.out.println("%s   ->   x = " + x + ", y = " + y + ", z = " + z);'%s.replace('"','\\"'),'']
    L=L[:-1]+['\t}','}','']
    return '\n'.join(L)
PVNOTE=['Zum Überprüfen der eigenen Lösung: Vor jeder Zeile werden x, y und z','wieder auf die Ausgangswerte gesetzt.']
ERR=['Achtung: Dieser Code enthält absichtlich Fehler bzw. lässt sich nicht','(vollständig) übersetzen. Das herauszufinden ist Teil der Aufgabe.']
ERRDIRS=['10-java-grundlagen/aufgabe-10-03','10-java-grundlagen/aufgabe-10-09','12-kontrollstrukturen/aufgabe-12-12','13-arrays/aufgabe-13-02','14-methoden/aufgabe-14-03','14-methoden/aufgabe-14-09','14-methoden/aufgabe-14-12','17-klassen/aufgabe-17-04','18-vererbung/aufgabe-18-03']
FIG='18-vererbung/beispiel-18-01-abstrakte-klasse-vererbung-und-polymorph/'
FIGS=[FIG+n+'.java' for n in ('Figur','Rechteck','Quadrat','Dreieck')]
KONTO='17-klassen/beispiel-17-01-eine-klasse-in-uml-und-in-java/Konto.java'
COPY={'17-klassen/beispiel-17-02':[KONTO],'17-klassen/beispiel-17-03':[KONTO],'18-vererbung/beispiel-18-02':FIGS,'18-vererbung/aufgabe-18-03':FIGS,'18-vererbung/beispiel-18-03':FIGS[:1]}
STUB='throw new UnsupportedOperationException("noch nicht implementiert");'
OVR={
 '11-operatoren/beispiel-11-04/0':dict(pre=['int a = -7, b = 3, n = 4;','']),
 '11-operatoren/aufgabe-11-05/0':dict(pre=['int punkte = 73;','String ergebnis;',''],post=['System.out.println(ergebnis);']),
 '12-kontrollstrukturen/aufgabe-12-05/0':dict(pre=['int n = 5;',''],post=['System.out.println(produkt);']),
 '12-kontrollstrukturen/aufgabe-12-11/0':dict(pre=['int n = 6;','']),
 '13-arrays/beispiel-13-02/1':dict(pre=['int[] a = {1, 2, 3};','']),
 '16-komplexitaet/beispiel-16-01/0':dict(name='AufwandLinear',pre=['int n = 1000;','int[] f = new int[n];','int summe = 0;',''],post=['System.out.println("Durchlaeufe bei n = " + n + ": " + n);']),
 '16-komplexitaet/beispiel-16-01/1':dict(name='AufwandQuadratisch',pre=['int n = 1000;','int k = 0;',''],post=['System.out.println("Durchlaeufe bei n = " + n + ": " + k);']),
 '16-komplexitaet/beispiel-16-01/2':dict(name='AufwandLogarithmisch',pre=['int n = 1000;','int k = 0;',''],post=['System.out.println("Durchlaeufe bei n = " + n + ": " + k);']),
 '14-methoden/beispiel-14-03/0':dict(main=['System.out.println(flaeche(2, 3));','System.out.println(flaeche(2.0, 3));','System.out.println(flaeche(1.0));']),
 '14-methoden/beispiel-14-04/0':dict(main=['System.out.println(summe(new double[] {1.5, 2.5, 3.0}));','System.out.println(java.util.Arrays.toString(quadrate(5)));']),
 '14-methoden/aufgabe-14-08/0':dict(extra_members=['enum Datumsformat { DE, US, ISO }'],main=['datumsausgabe(2, 12, 2026, Datumsformat.DE);','datumsausgabe(2, 12, 2026, Datumsformat.US);','datumsausgabe(2, 12, 2026, Datumsformat.ISO);'],name='Datum'),
 '14-methoden/aufgabe-14-03/0':dict(name='Kandidaten',replace=[('static int berechne(int n) { ... }','static int berechne(int n) { return n; }'),('static int berechne(int n, int m) { ... }','static int berechne(int n, int m) { return n + m; }'),('static double berechne(double n) { ... }','static double berechne(double n) { return n; }'),('static double berechne(int zahl) { ... }','static double berechne(int zahl) { return zahl; }'),('static void berechne(String s) { ... }','static void berechne(String s) { }')]),
 '15-rekursion/beispiel-15-01/0':dict(name='Fakultaet',main=['System.out.println(fak(3));','System.out.println(fak(10));']),
 '15-rekursion/beispiel-15-02/0':dict(name='Raetsel',main=['System.out.println(raetsel(472));']),
 '15-rekursion/beispiel-15-03/0':dict(main=['System.out.println(summe(100));','System.out.println(summe(100, 0));','System.out.println(summeIter(100));']),
 '15-rekursion/beispiel-15-04/0':dict(main=["bewege('a', 'b', 'z', 3);"]),
 '15-rekursion/aufgabe-15-05/0':dict(main=['System.out.println(test(36));']),
 '15-rekursion/aufgabe-15-05/1':dict(files={'Variante.java':'public class Variante {\n\tpublic static int test(int x) {\n\t\treturn (x % 3 == 0) ? test(test(x--)) : x / 2 + 1;\n\t}\n\n\tpublic static void main(String[] args) {\n\t\tSystem.out.println(test(36));\n\t}\n}\n'}),
 '15-rekursion/aufgabe-15-06/0':dict(files={'Zahlenfolge.java':'public class Zahlenfolge {\n\tpublic static void berechneFolge(int[] folge, int zahl, int start) {\n\t\t'+STUB+'\n\t}\n\n\tpublic static void main(String[] args) {\n\t\tint startzahl = 10;\n\t\tint[] folge = new int[50];\n\t\tberechneFolge(folge, startzahl, 0);\n\t\tSystem.out.println(java.util.Arrays.toString(folge));\n\t}\n}\n'}),
 '15-rekursion/aufgabe-15-10/0':dict(main=['System.out.println(f(4));']),
 '15-rekursion/aufgabe-15-11/0':dict(main=['System.out.println(g(5));']),
 '15-rekursion/aufgabe-15-11/1':dict(main=['System.out.println(h(5));']),
 '15-rekursion/aufgabe-15-12/0':dict(name='Produkt',main=['System.out.println(produkt(new int[] {2, 3, 4}));']),
 '16-komplexitaet/beispiel-16-05/0':dict(main=['System.out.println(setze(0));','System.out.println(java.util.Arrays.toString(dame));']),
 '16-komplexitaet/aufgabe-16-06/0':dict(files={'Sudoku.java':'public class Sudoku {\n\tprivate static int[][] sudoku = new int[9][9];      // sudoku[zeile][spalte]\n\n\tprivate static boolean spalteOk(int spalte) {\n\t\t'+STUB+'\n\t}\n\n\tprivate static boolean quadratOk(int zeile, int spalte) {\n\t\t'+STUB+'\n\t}\n\n\tpublic static void main(String[] args) {\n\t\tsudoku[0][0] = 5;\n\t\tsudoku[1][0] = 6;\n\t\tsudoku[4][0] = 5;      // die 5 steht doppelt in Spalte 0\n\t\tSystem.out.println(spalteOk(0));        // erwartet: false\n\t\tSystem.out.println(spalteOk(1));        // erwartet: true\n\t}\n}\n'}),
 '16-komplexitaet/aufgabe-16-06/1':dict(skip=True),
 '18-vererbung/beispiel-18-03/0':dict(files={'Skalierbar.java':'public interface Skalierbar {\n\tdouble MAX_FAKTOR = 10;                     // automatisch public static final\n\tvoid skaliere(double faktor);               // automatisch public abstract\n}\n','Dreieck.java':'public class Dreieck extends Figur implements Skalierbar {\n\tprivate double grund, hoehe;\n\n\tpublic Dreieck(double grund, double hoehe) {\n\t\tsuper("Dreieck");\n\t\tthis.grund = grund;\n\t\tthis.hoehe = hoehe;\n\t}\n\n\t@Override\n\tpublic double getFlaeche() {\n\t\treturn grund * hoehe / 2;\n\t}\n\n\t@Override\n\tpublic void skaliere(double faktor) {\n\t\tgrund *= faktor;\n\t\thoehe *= faktor;\n\t}\n}\n','InterfaceTest.java':'public class InterfaceTest {\n\tpublic static void main(String[] args) {\n\t\tDreieck d = new Dreieck(6, 3);\n\t\tSkalierbar s = d;               // ein Interface ist ein Typ wie eine Klasse\n\t\tSystem.out.println(d);\n\t\ts.skaliere(2);\n\t\tSystem.out.println(d);\n\t}\n}\n'}),
 '19-strings-wrapper/beispiel-19-03/0':dict(main=['System.out.println(zaehleVokale("informatik"));']),
 '21-klausurtraining/klausuraufgabe-4/2':dict(main=['System.out.println(f(6));']),
 '21-klausurtraining/klausuraufgabe-6/0':dict(main=['System.out.println(tuWas(3, 4));','System.out.println(tuWas(5, 0));']),
 '14-methoden/aufgabe-14-05/0':dict(files={'Zahldarstellung.java':'public class Zahldarstellung {\n\tpublic static String toString(int[] num) {\n\t\t'+STUB+'\n\t}\n\n\tpublic static boolean istGueltig(int[] num, int base) {\n\t\t'+STUB+'\n\t}\n\n\tpublic static int toInt(int[] num, int base) {\n\t\t'+STUB+'\n\t}\n\n\tpublic static int[] plusEins(int[] num) {\n\t\t'+STUB+'\n\t}\n\n\tpublic static void main(String[] args) {\n\t\tint[] dual = {1, 1, 0, 1};      // 8 + 4 + 1 = 13\n\t\tint[] fuenf = {2, 0, 4, 3};     // 2*125 + 4*5 + 3 = 273\n\t\tSystem.out.println("Dualzahl: " + toString(dual));\n\t\tSystem.out.println("Gueltig zur Basis 5: " + istGueltig(fuenf, 5));\n\t\tSystem.out.println("Gueltig zur Basis 4: " + istGueltig(fuenf, 4));\n\t\tSystem.out.println("Wert: " + toInt(fuenf, 5));\n\t\tSystem.out.println("Um 1 erhoeht: " + toString(plusEins(dual)));\n\t}\n}\n'}),
 '14-methoden/aufgabe-14-06/0':dict(files={'Zahlenfolge.java':'public class Zahlenfolge {\n\tpublic static void berechneFolge(int[] folge, int zahl) {\n\t\t'+STUB+'\n\t}\n\n\tpublic static void printFolge(int[] folge) {\n\t\t'+STUB+'\n\t}\n\n\tpublic static void main(String[] args) {\n\t\tint startzahl = 10;\n\t\tint[] folge = null;     // a) hier das Array geeignet anlegen\n\t\tberechneFolge(folge, startzahl);\n\t\tprintFolge(folge);\n\t}\n}\n'}),
 '21-klausurtraining/klausuraufgabe-5/0':dict(files={'Notenauswertung.java':'public class Notenauswertung {\n\tpublic static String toString(int[] werte) {\n\t\t'+STUB+'\n\t}\n\n\tpublic static double durchschnitt(int[] noten) {\n\t\t'+STUB+'\n\t}\n\n\tpublic static int anzahlBestanden(int[] noten) {\n\t\t'+STUB+'\n\t}\n\n\tpublic static int[] notenspiegel(int[] noten) {\n\t\t'+STUB+'\n\t}\n\n\tpublic static void main(String[] args) {\n\t\tint[] noten = { 2, 5, 1, 3, 2, 2, 4, 5 };\n\t\tSystem.out.println("Noten: " + toString(noten));\n\t\tSystem.out.println("Durchschnitt: " + durchschnitt(noten));\n\t\tSystem.out.println("Bestanden: " + anzahlBestanden(noten));\n\t\tint[] spiegel = notenspiegel(noten);\n\t\tSystem.out.println("Notenspiegel: " + toString(spiegel));\n\t}\n}\n'}),
}
for i,nm in enumerate('ABCD'):
    OVR['16-komplexitaet/aufgabe-16-02/%d'%i]=dict(pre=['int n = 1000;','int k = 0;']+(['int[] a = new int[n];'] if i==0 else [])+[''],post=['System.out.println("Durchlaeufe bei n = " + n + ": " + k);'])
EXTRA={
 '11-operatoren/aufgabe-11-02-programmverstaendnis-i':('Aufgabe 11.2: Programmverständnis I','Kapitel 11: Java: Ausdrücke und Operatoren',pv((2,5,3),['z *= ++z;','x = y-- - ++z;','y -= (x < z) ? x : 2 * x;','x = (y++ > 5) ? y : 3 * y;'])),
 '11-operatoren/aufgabe-11-03-programmverstaendnis-ii':('Aufgabe 11.3: Programmverständnis II','Kapitel 11: Java: Ausdrücke und Operatoren',pv((4,1,2),['z = y++;','y = y++ + ++y;','x += x *= z--;','z -= (x-- - --y);'])),
 '11-operatoren/aufgabe-11-12-programmverstaendnis-iii':('Aufgabe 11.12: Programmverständnis III','Kapitel 11: Java: Ausdrücke und Operatoren',pv((1,3,2),['x += ++y;','y = x++ * z--;','z = (y > x) ? y - x : x - y;','x = y-- - --y;'])),
 '21-klausurtraining/klausuraufgabe-4-programmverstaendnis':('Übungsklausur, Aufgabe 4 a): Programmverständnis','Kapitel 21: Klausurtraining',pv((5,2,4),['x -= y++;','z = x-- + --x;','y *= (x > z) ? y : z;','z = (--y == 1) ? x++ : z++;'])),
}
