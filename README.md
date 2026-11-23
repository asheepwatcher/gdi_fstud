# Grundlagen der Informatik – Kompaktskript

Jedes Kapitel ist gleich aufgebaut:

- **Worum geht es?** – das Thema in wenigen Sätzen, das Wichtigste im Merkkasten
- **Beispiele** – das Vorgehen Schritt für Schritt
- **Aufgaben** – zum Selbstrechnen; mit `KLAUSUR` markierte Aufgaben entsprechen einem Aufgabentyp der Probeklausuren, Aufgaben mit ★ gehen über den Standard hinaus
- **Zum Weiterüben** – zusätzliche kurze Übungsaufgaben

Das letzte Kapitel enthält eine vollständige Übungsklausur (120 Punkte) und 30 Kurzfragen zur Wiederholung.
Lösungen sind in diesem Repository nicht enthalten; es gibt sie bei der Übungsleitung.

## Aufbau des Repositorys

| Ordner | Inhalt |
|---|---|
| [`pdf/`](pdf) | Alles zum Lesen und Drucken: [`Skript.pdf`](pdf/Skript.pdf) mit allen Kapiteln, in [`pdf/kapitel/`](pdf/kapitel) jedes Kapitel als eigenes PDF, die [Formelsammlung](pdf/formelsammlung.pdf), die [typischen Fehler](pdf/typische-fehler.pdf), in [`pdf/aufgaben/`](pdf/aufgaben) die Aufgabensammlung und in [`pdf/tests/`](pdf/tests) Einstufungstest und Selbsteinschätzungstests. |
| [`tex/`](tex) | Die LaTeX-Quellen des Skripts: Hauptdatei [`Skript.tex`](tex/Skript.tex), die Kapitel in [`tex/kapitel/`](tex/kapitel), Formelsammlung und typische Fehler, die gemeinsame Präambel und die Stildateien in [`tex/stil/`](tex/stil). Mit `tex/bauen.sh` werden alle PDFs neu erzeugt. |
| [`java/`](java) | Der Java-Code aus dem Skript als `.java`-Dateien: pro Kapitel ein Ordner, darin pro Beispiel bzw. Aufgabe ein Unterordner mit der Nummer aus dem Skript. Details stehen in [`java/README.md`](java/README.md). |
| [`werkzeuge/`](werkzeuge) | Hilfsskripte, die den Ordner `java/` aus den LaTeX-Quellen erzeugen und prüfen. |

Die Dateinamen sind überall gleich aufgebaut: Kapitel 12 heißt `12-kontrollstrukturen` – als TeX-Datei, als PDF, als Test und als Java-Ordner.

## Das ganze Skript

- [Skript.pdf](pdf/Skript.pdf) – alle Kapitel in einem Dokument (117 Seiten)
- [Skript.tex](tex/Skript.tex) – Hauptdatei der LaTeX-Quellen

## Zum Nachschlagen

- [Formelsammlung](pdf/formelsammlung.pdf) – das Wichtigste aus allen Kapiteln auf zwei Seiten
- [Typische Fehler](pdf/typische-fehler.pdf) – häufige Fehler zu jedem Kapitel, jeweils falsch und richtig gegenübergestellt

## Java-Code

- [java/](java) – alle Java-Beispiele und alle Aufgaben mit Code als lauffähige `.java`-Dateien, nach Kapiteln geordnet

## Die einzelnen Kapitel

| Nr. | Kapitel | PDF | Quelle |
|---:|---|---|---|
| 1 | Information, Bits und Bytes | [PDF](pdf/kapitel/01-codierung.pdf) | [TeX](tex/kapitel/01-codierung.tex) |
| 2 | Zahlensysteme | [PDF](pdf/kapitel/02-zahlensysteme.pdf) | [TeX](tex/kapitel/02-zahlensysteme.tex) |
| 3 | Rechnen mit Dualzahlen und Zweierkomplement | [PDF](pdf/kapitel/03-zweierkomplement.pdf) | [TeX](tex/kapitel/03-zweierkomplement.tex) |
| 4 | Dualzahlen mit Nachkommastellen und Gleitkommazahlen | [PDF](pdf/kapitel/04-nachkomma.pdf) | [TeX](tex/kapitel/04-nachkomma.tex) |
| 5 | Codierung von Texten | [PDF](pdf/kapitel/05-zeichen.pdf) | [TeX](tex/kapitel/05-zeichen.tex) |
| 6 | Boolesche Algebra | [PDF](pdf/kapitel/06-boole.pdf) | [TeX](tex/kapitel/06-boole.tex) |
| 7 | Aufbau eines Rechners und Betriebssystem | [PDF](pdf/kapitel/07-rechner.pdf) | [TeX](tex/kapitel/07-rechner.tex) |
| 8 | Algorithmen und Programmiersprachen | [PDF](pdf/kapitel/08-algorithmen.pdf) | [TeX](tex/kapitel/08-algorithmen.tex) |
| 9 | Formale Sprachen und Grammatiken | [PDF](pdf/kapitel/09-grammatiken.pdf) | [TeX](tex/kapitel/09-grammatiken.tex) |
| 10 | Java: Variablen, Datentypen, Ein- und Ausgabe | [PDF](pdf/kapitel/10-java-grundlagen.pdf) | [TeX](tex/kapitel/10-java-grundlagen.tex) |
| 11 | Java: Ausdrücke und Operatoren | [PDF](pdf/kapitel/11-operatoren.pdf) | [TeX](tex/kapitel/11-operatoren.tex) |
| 12 | Java: Kontrollstrukturen | [PDF](pdf/kapitel/12-kontrollstrukturen.pdf) | [TeX](tex/kapitel/12-kontrollstrukturen.tex) |
| 13 | Java: Arrays und Aufzählungen | [PDF](pdf/kapitel/13-arrays.pdf) | [TeX](tex/kapitel/13-arrays.tex) |
| 14 | Java: Methoden | [PDF](pdf/kapitel/14-methoden.pdf) | [TeX](tex/kapitel/14-methoden.tex) |
| 15 | Rekursion | [PDF](pdf/kapitel/15-rekursion.pdf) | [TeX](tex/kapitel/15-rekursion.tex) |
| 16 | Algorithmenentwurf und Komplexität | [PDF](pdf/kapitel/16-komplexitaet.pdf) | [TeX](tex/kapitel/16-komplexitaet.tex) |
| 17 | Objektorientierung I: Klassen und Objekte | [PDF](pdf/kapitel/17-klassen.pdf) | [TeX](tex/kapitel/17-klassen.tex) |
| 18 | Objektorientierung II: Vererbung, Polymorphie, Interfaces | [PDF](pdf/kapitel/18-vererbung.pdf) | [TeX](tex/kapitel/18-vererbung.tex) |
| 19 | Strings und Wrapper-Klassen | [PDF](pdf/kapitel/19-strings-wrapper.pdf) | [TeX](tex/kapitel/19-strings-wrapper.tex) |
| 20 | Etwas theoretische Informatik | [PDF](pdf/kapitel/20-theoinf.pdf) | [TeX](tex/kapitel/20-theoinf.tex) |
| 21 | Klausurtraining | [PDF](pdf/kapitel/21-klausurtraining.pdf) | [TeX](tex/kapitel/21-klausurtraining.tex) |

## Aufgabensammlung

Zusätzliche Übungsaufgaben zu jedem Kapitel, nach Schwierigkeit in drei Stufen geordnet: **Grundlagen** zum Einüben der Verfahren, **Klausurniveau** im Stil der Probeklausuren und **Knobelaufgaben** (★) für alle, die tiefer einsteigen wollen. Die Lösungen gibt es bei der Übungsleitung.

- [Aufgabensammlung.pdf](pdf/aufgabensammlung.pdf) – alle Kapitel in einem Dokument

| Nr. | Kapitel | Aufgaben |
|---:|---|---|
| 1 | Information, Bits und Bytes | [Aufgaben](pdf/aufgaben/01-codierung.pdf) |
| 2 | Zahlensysteme | [Aufgaben](pdf/aufgaben/02-zahlensysteme.pdf) |
| 3 | Rechnen mit Dualzahlen und Zweierkomplement | [Aufgaben](pdf/aufgaben/03-zweierkomplement.pdf) |
| 4 | Dualzahlen mit Nachkommastellen und Gleitkommazahlen | [Aufgaben](pdf/aufgaben/04-nachkomma.pdf) |
| 5 | Codierung von Texten | [Aufgaben](pdf/aufgaben/05-zeichen.pdf) |
| 6 | Boolesche Algebra | [Aufgaben](pdf/aufgaben/06-boole.pdf) |
| 7 | Aufbau eines Rechners und Betriebssystem | [Aufgaben](pdf/aufgaben/07-rechner.pdf) |
| 8 | Algorithmen und Programmiersprachen | [Aufgaben](pdf/aufgaben/08-algorithmen.pdf) |
| 9 | Formale Sprachen und Grammatiken | [Aufgaben](pdf/aufgaben/09-grammatiken.pdf) |
| 10 | Java: Variablen, Datentypen, Ein- und Ausgabe | [Aufgaben](pdf/aufgaben/10-java-grundlagen.pdf) |
| 11 | Java: Ausdrücke und Operatoren | [Aufgaben](pdf/aufgaben/11-operatoren.pdf) |
| 12 | Java: Kontrollstrukturen | [Aufgaben](pdf/aufgaben/12-kontrollstrukturen.pdf) |
| 13 | Java: Arrays und Aufzählungen | [Aufgaben](pdf/aufgaben/13-arrays.pdf) |
| 14 | Java: Methoden | [Aufgaben](pdf/aufgaben/14-methoden.pdf) |
| 15 | Rekursion | [Aufgaben](pdf/aufgaben/15-rekursion.pdf) |
| 16 | Algorithmenentwurf und Komplexität | [Aufgaben](pdf/aufgaben/16-komplexitaet.pdf) |
| 17 | Objektorientierung I: Klassen und Objekte | [Aufgaben](pdf/aufgaben/17-klassen.pdf) |
| 18 | Objektorientierung II: Vererbung, Polymorphie, Interfaces | [Aufgaben](pdf/aufgaben/18-vererbung.pdf) |
| 19 | Strings und Wrapper-Klassen | [Aufgaben](pdf/aufgaben/19-strings-wrapper.pdf) |
| 20 | Etwas theoretische Informatik | [Aufgaben](pdf/aufgaben/20-theoinf.pdf) |

## Selbsteinschätzungstests

**Einstufungstest zur Klausur:** Ein Test mit Kurzfragen zu allen 20 Kapiteln (60 Punkte, etwa 60 Minuten). Die Auswertung zeigt für jedes Kapitel, ob es schon sitzt oder ob man es wiederholen sollte, und in welchem Klausur-Aufgabentyp es vorkommt. [Test](pdf/tests/00-einstufungstest.pdf)

Zu jedem Kapitel gibt es zwei gleichwertige Tests (Variante A und B), mit denen man selbst prüfen kann, ob man das Kapitel beherrscht. Wer Variante A nicht besteht, arbeitet das Kapitel nach und versucht es danach mit Variante B. Es gibt kein Zeitlimit; als Richtwert gelten 15 bis 20 Minuten. Jeder Test hat 20 Punkte, mit 14 Punkten gilt er als bestanden. Die letzte Aufgabe ist jeweils eine anspruchsvolle Zusatzaufgabe (★) ohne Wertung. Die Lösungen mit Auswertung gibt es bei der Übungsleitung.

| Nr. | Kapitel | Variante A | Variante B |
|---:|---|---|---|
| 1 | Information, Bits und Bytes | [Test](pdf/tests/01-codierung-a.pdf) | [Test](pdf/tests/01-codierung-b.pdf) |
| 2 | Zahlensysteme | [Test](pdf/tests/02-zahlensysteme-a.pdf) | [Test](pdf/tests/02-zahlensysteme-b.pdf) |
| 3 | Rechnen mit Dualzahlen und Zweierkomplement | [Test](pdf/tests/03-zweierkomplement-a.pdf) | [Test](pdf/tests/03-zweierkomplement-b.pdf) |
| 4 | Dualzahlen mit Nachkommastellen und Gleitkommazahlen | [Test](pdf/tests/04-nachkomma-a.pdf) | [Test](pdf/tests/04-nachkomma-b.pdf) |
| 5 | Codierung von Texten | [Test](pdf/tests/05-zeichen-a.pdf) | [Test](pdf/tests/05-zeichen-b.pdf) |
| 6 | Boolesche Algebra | [Test](pdf/tests/06-boole-a.pdf) | [Test](pdf/tests/06-boole-b.pdf) |
| 7 | Aufbau eines Rechners und Betriebssystem | [Test](pdf/tests/07-rechner-a.pdf) | [Test](pdf/tests/07-rechner-b.pdf) |
| 8 | Algorithmen und Programmiersprachen | [Test](pdf/tests/08-algorithmen-a.pdf) | [Test](pdf/tests/08-algorithmen-b.pdf) |
| 9 | Formale Sprachen und Grammatiken | [Test](pdf/tests/09-grammatiken-a.pdf) | [Test](pdf/tests/09-grammatiken-b.pdf) |
| 10 | Java: Variablen, Datentypen, Ein- und Ausgabe | [Test](pdf/tests/10-java-grundlagen-a.pdf) | [Test](pdf/tests/10-java-grundlagen-b.pdf) |
| 11 | Java: Ausdrücke und Operatoren | [Test](pdf/tests/11-operatoren-a.pdf) | [Test](pdf/tests/11-operatoren-b.pdf) |
| 12 | Java: Kontrollstrukturen | [Test](pdf/tests/12-kontrollstrukturen-a.pdf) | [Test](pdf/tests/12-kontrollstrukturen-b.pdf) |
| 13 | Java: Arrays und Aufzählungen | [Test](pdf/tests/13-arrays-a.pdf) | [Test](pdf/tests/13-arrays-b.pdf) |
| 14 | Java: Methoden | [Test](pdf/tests/14-methoden-a.pdf) | [Test](pdf/tests/14-methoden-b.pdf) |
| 15 | Rekursion | [Test](pdf/tests/15-rekursion-a.pdf) | [Test](pdf/tests/15-rekursion-b.pdf) |
| 16 | Algorithmenentwurf und Komplexität | [Test](pdf/tests/16-komplexitaet-a.pdf) | [Test](pdf/tests/16-komplexitaet-b.pdf) |
| 17 | Objektorientierung I: Klassen und Objekte | [Test](pdf/tests/17-klassen-a.pdf) | [Test](pdf/tests/17-klassen-b.pdf) |
| 18 | Objektorientierung II: Vererbung, Polymorphie, Interfaces | [Test](pdf/tests/18-vererbung-a.pdf) | [Test](pdf/tests/18-vererbung-b.pdf) |
| 19 | Strings und Wrapper-Klassen | [Test](pdf/tests/19-strings-wrapper-a.pdf) | [Test](pdf/tests/19-strings-wrapper-b.pdf) |
| 20 | Etwas theoretische Informatik | [Test](pdf/tests/20-theoinf-a.pdf) | [Test](pdf/tests/20-theoinf-b.pdf) |

## Lizenz

© 2026 asheepwatcher

Alle Inhalte dieses Repositorys (Texte, PDFs, LaTeX-Quellen und Java-Code) stehen unter der Lizenz [Creative Commons Namensnennung – Nicht kommerziell – Keine Bearbeitungen 4.0 International (CC BY-NC-ND 4.0)](https://creativecommons.org/licenses/by-nc-nd/4.0/deed.de). Das bedeutet:

- **Namensnennung:** Bei jeder Weitergabe muss der Rechteinhaber genannt und auf die Lizenz verwiesen werden.
- **Nicht kommerziell:** Die Inhalte dürfen nicht für kommerzielle Zwecke verwendet werden.
- **Keine Bearbeitungen:** Veränderte oder auf diesen Inhalten aufbauende Fassungen dürfen nicht weitergegeben werden.

Der vollständige Lizenztext steht in der Datei [LICENSE](LICENSE).

