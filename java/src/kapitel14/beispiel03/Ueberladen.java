// Kapitel 14: Java: Methoden
// Beispiel 14.3: Überladen
// Abschnitt im Skript: Überladen

package kapitel14.beispiel03;

public class Ueberladen {
	static double flaeche(double radius) { return Math.PI * radius * radius; }     // Kreis
	static double flaeche(double a, double b) { return a * b; }                    // Rechteck
	static int flaeche(int a, int b) { return a * b; }                             // Rechteck (ganzzahlig)

	// NICHT erlaubt, weil sich nur der Rückgabetyp unterscheidet:
	// static float flaeche(double radius) { ... }

	public static void main(String[] args) {
		System.out.println(flaeche(2, 3));
		System.out.println(flaeche(2.0, 3));
		System.out.println(flaeche(1.0));
	}
}
