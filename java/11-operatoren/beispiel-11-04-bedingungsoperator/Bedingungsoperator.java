// Kapitel 11: Java: Ausdrücke und Operatoren
// Beispiel 11.4: Bedingungsoperator
// Abschnitt im Skript: Bedingungsoperator

public class Bedingungsoperator {
	public static void main(String[] args) {
		int a = -7, b = 3, n = 4;

		int max = (a > b) ? a : b;                 // das Maximum von a und b
		int betrag = (a < 0) ? -a : a;             // der Betrag von a
		String text = (n % 2 == 0) ? "gerade" : "ungerade";

		// Ausgabe zur Kontrolle (steht nicht im Skript)
		System.out.println("a = " + a + ", b = " + b + ", n = " + n + ", max = " + max + ", betrag = " + betrag + ", text = " + text);
	}
}
