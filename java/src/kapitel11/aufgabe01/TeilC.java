// Kapitel 11: Java: Ausdrücke und Operatoren
// Aufgabe 11.1: Inkrement und Dekrement
// Abschnitt im Skript: c)

package kapitel11.aufgabe01;

public class TeilC {
	public static void main(String[] args) {
		int x = 2;
		int y = x++ + x++;

		// Ausgabe zur Kontrolle (steht nicht im Skript)
		System.out.println("x = " + x + ", y = " + y);
	}
}
