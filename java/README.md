# Java-Code zum Skript

Hier liegt der gesamte Java-Code aus dem Skript als fertige `.java`-Dateien: alle Beispiele und alle Aufgaben, in denen Code vorkommt.

## Aufbau

Pro Kapitel gibt es einen Ordner, darin pro Beispiel bzw. Aufgabe einen Unterordner, z. B.

```
java/12-kontrollstrukturen/beispiel-12-04-schreibtischtest-einer-schleife/GgT.java
java/12-kontrollstrukturen/aufgabe-12-04-was-wird-ausgegeben/TeilA.java
```

Die Nummern entsprechen den Nummern im Skript (Beispiel 12.4, Aufgabe 12.4). Jeder Unterordner ist für sich übersetzbar; Klassen, die ein Beispiel aus einem anderen Beispiel braucht, liegen dort als Kopie. Im Kopf jeder Datei steht, zu welchem Kapitel und welcher Aufgabe sie gehört.

| Nr. | Kapitel | Beispiele | Aufgaben | Dateien |
|---:|---|---:|---:|---:|
| 3 | [Rechnen mit Dualzahlen und Zweierkomplement](03-zweierkomplement) | 1 | 0 | 1 |
| 4 | [Dualzahlen mit Nachkommastellen und Gleitkommazahlen](04-nachkomma) | 1 | 2 | 3 |
| 5 | [Codierung von Texten](05-zeichen) | 1 | 0 | 1 |
| 10 | [Java: Variablen, Datentypen, Ein- und Ausgabe](10-java-grundlagen) | 3 | 4 | 17 |
| 11 | [Java: Ausdrücke und Operatoren](11-operatoren) | 4 | 7 | 22 |
| 12 | [Java: Kontrollstrukturen](12-kontrollstrukturen) | 5 | 7 | 23 |
| 13 | [Java: Arrays und Aufzählungen](13-arrays) | 5 | 3 | 17 |
| 14 | [Java: Methoden](14-methoden) | 5 | 10 | 17 |
| 15 | [Rekursion](15-rekursion) | 4 | 11 | 22 |
| 16 | [Algorithmenentwurf und Komplexität](16-komplexitaet) | 2 | 2 | 9 |
| 17 | [Objektorientierung I: Klassen und Objekte](17-klassen) | 3 | 3 | 9 |
| 18 | [Objektorientierung II: Vererbung, Polymorphie, Interfaces](18-vererbung) | 4 | 4 | 31 |
| 19 | [Strings und Wrapper-Klassen](19-strings-wrapper) | 4 | 6 | 10 |
| 21 | [Klausurtraining](21-klausurtraining) | 0 | 3 | 6 |

Kapitel ohne Java-Code (z. B. Zahlensysteme, Grammatiken) haben keinen Ordner.

## Ausführen

In Eclipse: die Dateien eines Unterordners in ein Java-Projekt kopieren und die Klasse mit der `main`-Methode starten. Auf der Kommandozeile:

```bash
cd java/12-kontrollstrukturen/beispiel-12-04-schreibtischtest-einer-schleife
javac *.java
java GgT
```

## Was gegenüber dem Skript ergänzt wurde

- **Ausschnitte** stehen im Skript ohne Klasse. Hier sind sie in eine Klasse mit `main`-Methode eingebettet, damit sie sich starten lassen.
- **Fehlende Variablen** (z. B. `n` oder ein Array), die ein Ausschnitt voraussetzt, sind am Anfang mit Beispielwerten angelegt.
- **Kontrollausgabe:** Gibt ein Ausschnitt selbst nichts aus, zeigt eine zusätzliche Zeile am Ende die Werte der Variablen. Sie ist mit dem Kommentar „Ausgabe zur Kontrolle (steht nicht im Skript)“ markiert.
- **Vorlagen:** Bei Aufgaben der Art „Implementieren Sie die folgenden Methoden“ sind die Methoden als Gerüst angelegt und werfen `UnsupportedOperationException("noch nicht implementiert")`, bis sie ausgefüllt sind.
- **Programmverständnis-Tabellen** (z. B. Aufgabe 11.2): Dazu gibt es jeweils ein Programm `Programmverstaendnis.java`, das jede Zeile mit den Ausgangswerten ausführt und `x`, `y` und `z` ausgibt.

## Absichtlich fehlerhafter Code

In diesen Aufgaben soll herausgefunden werden, ob und warum sich Code nicht übersetzen oder ausführen lässt. Die Dateien sind deshalb unverändert übernommen und lassen sich nicht (vollständig) übersetzen:

- [`10-java-grundlagen/aufgabe-10-03-laesst-sich-das-ausfuehren`](10-java-grundlagen/aufgabe-10-03-laesst-sich-das-ausfuehren)
- [`10-java-grundlagen/aufgabe-10-09-richtig-deklariert`](10-java-grundlagen/aufgabe-10-09-richtig-deklariert)
- [`12-kontrollstrukturen/aufgabe-12-12-fehler-finden`](12-kontrollstrukturen/aufgabe-12-12-fehler-finden)
- [`13-arrays/aufgabe-13-02-laesst-sich-das-ausfuehren`](13-arrays/aufgabe-13-02-laesst-sich-das-ausfuehren)
- [`14-methoden/aufgabe-14-03-ueberladen`](14-methoden/aufgabe-14-03-ueberladen)
- [`14-methoden/aufgabe-14-09-sichtbar-oder-nicht`](14-methoden/aufgabe-14-09-sichtbar-oder-nicht)
- [`14-methoden/aufgabe-14-12-fehler-finden`](14-methoden/aufgabe-14-12-fehler-finden)
- [`17-klassen/aufgabe-17-04-fehler-finden`](17-klassen/aufgabe-17-04-fehler-finden)
- [`18-vererbung/aufgabe-18-03-erlaubt-oder-nicht`](18-vererbung/aufgabe-18-03-erlaubt-oder-nicht)

Bei einigen weiteren Aufgaben endet das Programm absichtlich mit einem Laufzeitfehler (z. B. Aufgabe 15.11).
