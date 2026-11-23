// Kapitel 11: Java: Ausdrücke und Operatoren
// Aufgabe 11.9: Noch mehr Inkrement
// Abschnitt im Skript: f)

package kapitel11.aufgabe09;

public class TeilF {
	public static void main(String[] args) {
		int i = 2;
		int j = i++ + i++ + i++;

		// Ausgabe zur Kontrolle (steht nicht im Skript)
		System.out.println("i = " + i + ", j = " + j);
	}
}
