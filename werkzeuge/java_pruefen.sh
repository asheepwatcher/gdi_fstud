#!/bin/zsh
# Prüft das Eclipse-Projekt in java/: Alles unter src/ muss sich zusammen übersetzen lassen,
# jedes Paket unter fehlersuche/ dagegen nicht (dort steckt absichtlich fehlerhafter Code).
cd "$(dirname "$0")/../java" || exit 1
JAVAC=$(command -v javac)
"$JAVAC" -version > /dev/null 2>&1 || JAVAC=$(find /Applications/Eclipse.app -type f -name javac 2>/dev/null | head -1)
[[ -x $JAVAC ]] || { echo "Kein javac gefunden"; exit 1; }
tmp=$(mktemp -d)
if "$JAVAC" -nowarn -encoding UTF-8 -d $tmp $(find src -name '*.java'); then
	echo "src: alles uebersetzbar ($(find src -name '*.java' | wc -l | tr -d ' ') Dateien)"
else
	echo "src: FEHLER beim Uebersetzen"; rm -rf $tmp; exit 1
fi
ok=0
for d in fehlersuche/*/*/; do
	rm -rf $tmp; mkdir -p $tmp
	if "$JAVAC" -nowarn -encoding UTF-8 -d $tmp $d*.java > /dev/null 2>&1; then echo "unerwartet uebersetzbar: $d"; else ok=$((ok+1)); fi
done
rm -rf $tmp
echo "fehlersuche: $ok Pakete mit dem erwarteten Uebersetzungsfehler"
