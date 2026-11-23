// Kapitel 11: Java: Ausdrücke und Operatoren
// Aufgabe 11.9: Noch mehr Inkrement
// Abschnitt im Skript: e)

package kapitel11.aufgabe09;

public class TeilE {
	public static void main(String[] args) {
		int m = 5, n = 5;
		boolean g = m++ == ++n;

		// Ausgabe zur Kontrolle (steht nicht im Skript)
		System.out.println("m = " + m + ", n = " + n + ", g = " + g);
	}
}
