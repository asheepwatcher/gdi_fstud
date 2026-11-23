#!/bin/zsh
# Baut das Gesamtskript und aus jedem Kapitel ein eigenes PDF.
# Ergebnis: ../pdf/Skript.pdf, ../pdf/kapitel/, Formelsammlung, typische Fehler, ../pdf/aufgaben/ und ../pdf/tests/
cd "$(dirname "$0")" || exit 1
mkdir -p ../pdf/kapitel .einzeln
latexmk -g -pdf -interaction=nonstopmode Skript.tex > /dev/null || { echo "Fehler im Gesamtskript"; exit 1; }
cp Skript.pdf ../pdf/Skript.pdf && echo "Skript.pdf"
for f in kapitel/[0-9][0-9]-*.tex; do
	datei=${f:t:r}
	nr=${datei[1,2]}
	[[ $nr == 00 ]] && continue
	for lauf in 1 2; do
		pdflatex -interaction=nonstopmode -output-directory=.einzeln -jobname="$datei" \
			"\def\kapitelnr{$((10#$nr))}\def\kapiteldatei{$datei}\input{einzelkapitel}" > /dev/null
	done
	if [[ -f .einzeln/$datei.pdf ]]; then
		cp ".einzeln/$datei.pdf" "../pdf/kapitel/$datei.pdf" && echo "kapitel/$datei.pdf"
	else
		echo "FEHLER bei $datei"
	fi
done
# Formelsammlung und typische Fehler
for doc in formelsammlung typische-fehler; do
	latexmk -pdf -interaction=nonstopmode $doc.tex > /dev/null && cp $doc.pdf ../pdf/$doc.pdf && echo "$doc.pdf"
done
# Aufgabensammlung: je Kapitel Aufgaben und Lösungen sowie beides als Gesamtdokument
mkdir -p ../pdf/aufgaben/loesungen
for f in aufgaben/[0-9][0-9]-*.tex; do
	datei=${f:t:r}
	pdflatex -interaction=nonstopmode -output-directory=.einzeln -jobname="$datei" \
		"\def\aufgabendatei{$datei}\input{aufgaben}" > /dev/null
	pdflatex -interaction=nonstopmode -output-directory=.einzeln -jobname="$datei-loesung" \
		"\def\aufgabendatei{$datei}\def\mitloesung{1}\input{aufgaben}" > /dev/null
	if [[ -f .einzeln/$datei.pdf && -f .einzeln/$datei-loesung.pdf ]]; then
		cp ".einzeln/$datei.pdf" "../pdf/aufgaben/$datei.pdf"
		cp ".einzeln/$datei-loesung.pdf" "../pdf/aufgaben/loesungen/$datei-loesung.pdf" && echo "aufgaben/$datei.pdf"
	else
		echo "FEHLER bei Aufgaben $datei"
	fi
done
for lauf in 1 2 3; do
	pdflatex -interaction=nonstopmode -output-directory=.einzeln -jobname=aufgabensammlung "\input{aufgabensammlung}" > /dev/null
	pdflatex -interaction=nonstopmode -output-directory=.einzeln -jobname=aufgabensammlung-loesung "\def\mitloesung{1}\input{aufgabensammlung}" > /dev/null
done
cp .einzeln/aufgabensammlung.pdf ../pdf/aufgabensammlung.pdf && cp .einzeln/aufgabensammlung-loesung.pdf ../pdf/aufgabensammlung-loesung.pdf && echo "aufgabensammlung.pdf"

# Selbsteinschätzungstests: je Test ein PDF ohne und eines mit Lösung
mkdir -p ../pdf/tests/loesungen
for f in tests/[0-9][0-9]-*.tex; do
	datei=${f:t:r}
	for lauf in 1 2; do
		pdflatex -interaction=nonstopmode -output-directory=.einzeln -jobname="$datei" \
			"\def\testdatei{$datei}\input{test}" > /dev/null
		pdflatex -interaction=nonstopmode -output-directory=.einzeln -jobname="$datei-loesung" \
			"\def\testdatei{$datei}\def\mitloesung{1}\input{test}" > /dev/null
	done
	if [[ -f .einzeln/$datei.pdf && -f .einzeln/$datei-loesung.pdf ]]; then
		cp ".einzeln/$datei.pdf" "../pdf/tests/$datei.pdf"
		cp ".einzeln/$datei-loesung.pdf" "../pdf/tests/loesungen/$datei-loesung.pdf" && echo "tests/$datei.pdf"
	else
		echo "FEHLER bei Test $datei"
	fi
done
rm -rf .einzeln
latexmk -C > /dev/null 2>&1
rm -f Skript.listing
