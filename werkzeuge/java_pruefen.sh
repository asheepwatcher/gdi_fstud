#!/bin/zsh
# Übersetzt jeden Ordner unter java/ einzeln und meldet, welche sich nicht übersetzen lassen.
# Erwartet werden Fehler nur in den Ordnern, deren Aufgabe absichtlich fehlerhaften Code enthält.
cd "$(dirname "$0")/../java" || exit 1
JAVAC=$(command -v javac)
"$JAVAC" -version > /dev/null 2>&1 || JAVAC=$(find /Applications/Eclipse.app -type f -name javac 2>/dev/null | head -1)
[[ -x $JAVAC ]] || { echo "Kein javac gefunden"; exit 1; }
ok=0; fehler=0; tmp=$(mktemp -d)
for d in */*/; do
	rm -rf $tmp; mkdir -p $tmp
	if "$JAVAC" -nowarn -encoding UTF-8 -d $tmp $d*.java > /dev/null 2>&1; then ok=$((ok+1)); else fehler=$((fehler+1)); echo "nicht uebersetzbar: $d"; fi
done
rm -rf $tmp
echo "uebersetzbar: $ok, nicht uebersetzbar: $fehler"
