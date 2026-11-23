// Kapitel 11: Java: Ausdrücke und Operatoren
// Aufgabe 11.9: Noch mehr Inkrement
// Abschnitt im Skript: b)

package kapitel11.aufgabe09;

public class TeilB {
	public static void main(String[] args) {
		int a = 1;
		int b = a + a++;

		// Ausgabe zur Kontrolle (steht nicht im Skript)
		System.out.println("a = " + a + ", b = " + b);
	}
}
