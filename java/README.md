# Java-Code zum Skript

Hier liegt der gesamte Java-Code aus dem Skript als fertiges **Eclipse-Projekt**: alle Beispiele und alle Aufgaben, in denen Code vorkommt.

## In Eclipse öffnen

1. Repository herunterladen (grüner Knopf *Code → Download ZIP*) und entpacken, oder mit Git klonen.
2. In Eclipse: *File → Import… → General → Existing Projects into Workspace → Next*.
3. Bei *Select root directory* den Ordner `java` aus dem Repository auswählen. Das Projekt **gdi_fstud_java** erscheint in der Liste. *Finish*.
4. Im *Package Explorer* das gewünschte Paket aufklappen, die Klasse mit Rechtsklick anklicken und *Run As → Java Application* wählen.

Das Projekt verwendet das Java, das in Eclipse als Standard eingestellt ist.

## Aufbau

Zu jedem Beispiel und jeder Aufgabe mit Code gibt es ein eigenes Paket. Die Nummer im Paketnamen ist die Nummer im Skript:

```
src/kapitel12/beispiel04/GgT.java      ->  Beispiel 12.4
src/kapitel12/aufgabe04/TeilA.java     ->  Aufgabe 12.4, Teil a)
src/kapitel21/klausuraufgabe5/...      ->  Übungsklausur, Aufgabe 5
```

Im Kopf jeder Datei steht außerdem, zu welchem Kapitel und welcher Aufgabe sie gehört. Klassen, die ein Beispiel aus einem anderen Beispiel braucht, liegen im Paket als Kopie. Eine Liste aller Pakete mit Titeln steht in [UEBERSICHT.md](UEBERSICHT.md).

| Nr. | Kapitel | Beispiele | Aufgaben |
|---:|---|---:|---:|
| 3 | [Rechnen mit Dualzahlen und Zweierkomplement](src/kapitel03) | 1 | 0 |
| 4 | [Dualzahlen mit Nachkommastellen und Gleitkommazahlen](src/kapitel04) | 1 | 2 |
| 5 | [Codierung von Texten](src/kapitel05) | 1 | 0 |
| 10 | [Java: Variablen, Datentypen, Ein- und Ausgabe](src/kapitel10) | 3 | 2 |
| 11 | [Java: Ausdrücke und Operatoren](src/kapitel11) | 4 | 7 |
| 12 | [Java: Kontrollstrukturen](src/kapitel12) | 5 | 6 |
| 13 | [Java: Arrays und Aufzählungen](src/kapitel13) | 5 | 2 |
| 14 | [Java: Methoden](src/kapitel14) | 5 | 7 |
| 15 | [Rekursion](src/kapitel15) | 4 | 11 |
| 16 | [Algorithmenentwurf und Komplexität](src/kapitel16) | 2 | 2 |
| 17 | [Objektorientierung I: Klassen und Objekte](src/kapitel17) | 3 | 2 |
| 18 | [Objektorientierung II: Vererbung, Polymorphie, Interfaces](src/kapitel18) | 4 | 3 |
| 19 | [Strings und Wrapper-Klassen](src/kapitel19) | 4 | 6 |
| 21 | [Klausurtraining](src/kapitel21) | 0 | 3 |

Kapitel ohne Java-Code (z. B. Zahlensysteme, Grammatiken) haben kein Paket.

## Ohne Eclipse

Im Ordner `java` auf der Kommandozeile:

```bash
javac -d bin -encoding UTF-8 $(find src -name '*.java')
java -cp bin kapitel12.beispiel04.GgT
```

## Was gegenüber dem Skript ergänzt wurde

- **Ausschnitte** stehen im Skript ohne Klasse. Hier sind sie in eine Klasse mit `main`-Methode eingebettet, damit sie sich starten lassen.
- **Fehlende Variablen** (z. B. `n` oder ein Array), die ein Ausschnitt voraussetzt, sind am Anfang mit Beispielwerten angelegt.
- **Kontrollausgabe:** Gibt ein Ausschnitt selbst nichts aus, zeigt eine zusätzliche Zeile am Ende die Werte der Variablen. Sie ist mit dem Kommentar „Ausgabe zur Kontrolle (steht nicht im Skript)“ markiert.
- **Vorlagen:** Bei Aufgaben der Art „Implementieren Sie die folgenden Methoden“ sind die Methoden als Gerüst angelegt und werfen `UnsupportedOperationException("noch nicht implementiert")`, bis sie ausgefüllt sind.
- **Programmverständnis-Tabellen** (z. B. Aufgabe 11.2): Dazu gibt es jeweils ein Programm `Programmverstaendnis.java`, das jede Zeile mit den Ausgangswerten ausführt und `x`, `y` und `z` ausgibt.

## Absichtlich fehlerhafter Code

In einigen Aufgaben soll man herausfinden, ob und warum sich Code nicht übersetzen lässt. Dieser Code liegt im Ordner [`fehlersuche`](fehlersuche), der **nicht** zum Build-Pfad gehört. Eclipse zeigt die Dateien an, meldet aber keine Fehler und blockiert nicht den Rest des Projekts. Wer die Fehlermeldungen sehen will, kopiert eine Datei in ein Paket unter `src`.

- [`kapitel10.aufgabe03`](fehlersuche/kapitel10/aufgabe03) – Aufgabe 10.3
- [`kapitel10.aufgabe09`](fehlersuche/kapitel10/aufgabe09) – Aufgabe 10.9
- [`kapitel12.aufgabe12`](fehlersuche/kapitel12/aufgabe12) – Aufgabe 12.12
- [`kapitel13.aufgabe02`](fehlersuche/kapitel13/aufgabe02) – Aufgabe 13.2
- [`kapitel14.aufgabe03`](fehlersuche/kapitel14/aufgabe03) – Aufgabe 14.3
- [`kapitel14.aufgabe09`](fehlersuche/kapitel14/aufgabe09) – Aufgabe 14.9
- [`kapitel14.aufgabe12`](fehlersuche/kapitel14/aufgabe12) – Aufgabe 14.12
- [`kapitel17.aufgabe04`](fehlersuche/kapitel17/aufgabe04) – Aufgabe 17.4
- [`kapitel18.aufgabe03`](fehlersuche/kapitel18/aufgabe03) – Aufgabe 18.3

Bei einigen weiteren Aufgaben endet das Programm absichtlich mit einem Laufzeitfehler (z. B. Aufgabe 15.11).
