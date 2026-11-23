// Kapitel 11: Java: Ausdrücke und Operatoren
// Aufgabe 11.1: Inkrement und Dekrement
// Abschnitt im Skript: e)

package kapitel11.aufgabe01;

public class TeilE {
	public static void main(String[] args) {
		int k = 5;
		k -= k--;

		// Ausgabe zur Kontrolle (steht nicht im Skript)
		System.out.println("k = " + k);
	}
}
