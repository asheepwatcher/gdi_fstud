// Kapitel 11: Java: Ausdrücke und Operatoren
// Aufgabe 11.1: Inkrement und Dekrement
// Abschnitt im Skript: f)

public class TeilF {
	public static void main(String[] args) {
		int p = 3;
		int q = ++p * p++;

		// Ausgabe zur Kontrolle (steht nicht im Skript)
		System.out.println("p = " + p + ", q = " + q);
	}
}
