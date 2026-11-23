// Kapitel 11: Java: Ausdrücke und Operatoren
// Aufgabe 11.1: Inkrement und Dekrement
// Abschnitt im Skript: d)

package kapitel11.aufgabe01;

public class TeilD {
	public static void main(String[] args) {
		int i = 6;
		int j = --i - i--;

		// Ausgabe zur Kontrolle (steht nicht im Skript)
		System.out.println("i = " + i + ", j = " + j);
	}
}
