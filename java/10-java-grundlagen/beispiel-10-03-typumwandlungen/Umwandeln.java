// Kapitel 10: Java: Variablen, Datentypen, Ein- und Ausgabe
// Beispiel 10.3: Typumwandlungen
// Abschnitt im Skript: Umwandeln

public class Umwandeln {
	public static void main(String[] args) {
		int i = 4;
		double d = i;               // erlaubt (implizit): d ist 4.0
		int j = (int) 8.8;          // nur mit Cast: j ist 8, die Nachkommastellen fallen weg
		short s = (short) 40000;    // Überlauf: s ist -25536
		int code = 'A' + 1;         // char wird zu int: 66
		char c = (char) code;       // 'B'

		// Ausgabe zur Kontrolle (steht nicht im Skript)
		System.out.println("i = " + i + ", d = " + d + ", j = " + j + ", s = " + s + ", code = " + code + ", c = " + c);
	}
}
