// Kapitel 11: Java: Ausdrücke und Operatoren
// Aufgabe 11.8: Zuweisungsoperatoren
// Abschnitt im Skript: Nacheinander

package kapitel11.aufgabe08;

public class Nacheinander {
	public static void main(String[] args) {
		int a = 10;
		a += 5;
		a -= 3;
		a *= 2;
		a /= 5;
		a %= 3;

		// Ausgabe zur Kontrolle (steht nicht im Skript)
		System.out.println("a = " + a);
	}
}
