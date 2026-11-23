// Kapitel 13: Java: Arrays und Aufzählungen
// Beispiel 13.1: Summe und Maximum
// Abschnitt im Skript: Durchlaufen

public class Durchlaufen {
	public static void main(String[] args) {
		int[] werte = {10, 4, 7, -1, 8};

		int summe = 0;
		for (int w : werte) {               // For-each: nur lesen
			summe += w;
		}

		int max = werte[0];
		for (int i = 1; i < werte.length; i++) {
			if (werte[i] > max) {
				max = werte[i];
			}
		}
		System.out.println(summe + " " + max);      // 28 10
	}
}
