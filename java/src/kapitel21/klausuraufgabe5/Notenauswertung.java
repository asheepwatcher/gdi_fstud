// Kapitel 21: Klausurtraining
// Übungsklausur, Aufgabe 5: Java: Arrays und Methoden

package kapitel21.klausuraufgabe5;

public class Notenauswertung {
	public static String toString(int[] werte) {
		throw new UnsupportedOperationException("noch nicht implementiert");
	}

	public static double durchschnitt(int[] noten) {
		throw new UnsupportedOperationException("noch nicht implementiert");
	}

	public static int anzahlBestanden(int[] noten) {
		throw new UnsupportedOperationException("noch nicht implementiert");
	}

	public static int[] notenspiegel(int[] noten) {
		throw new UnsupportedOperationException("noch nicht implementiert");
	}

	public static void main(String[] args) {
		int[] noten = { 2, 5, 1, 3, 2, 2, 4, 5 };
		System.out.println("Noten: " + toString(noten));
		System.out.println("Durchschnitt: " + durchschnitt(noten));
		System.out.println("Bestanden: " + anzahlBestanden(noten));
		int[] spiegel = notenspiegel(noten);
		System.out.println("Notenspiegel: " + toString(spiegel));
	}
}
