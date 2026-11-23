// Kapitel 11: Java: Ausdrücke und Operatoren
// Beispiel 11.1: Präfix und Postfix
// Abschnitt im Skript: Präfix

package kapitel11.beispiel01;

public class Praefix {
	public static void main(String[] args) {
		int n = 5;
		int m = ++n;     // m = 6, n = 6

		// Ausgabe zur Kontrolle (steht nicht im Skript)
		System.out.println("n = " + n + ", m = " + m);
	}
}
