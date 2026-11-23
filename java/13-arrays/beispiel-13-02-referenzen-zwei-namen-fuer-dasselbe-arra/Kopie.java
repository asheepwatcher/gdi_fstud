// Kapitel 13: Java: Arrays und Aufzählungen
// Beispiel 13.2: Referenzen: zwei Namen für dasselbe Array
// Abschnitt im Skript: Kopie

public class Kopie {
	public static void main(String[] args) {
		int[] a = {1, 2, 3};

		int[] c = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}

		// Ausgabe zur Kontrolle (steht nicht im Skript)
		System.out.println("a = " + java.util.Arrays.toString(a) + ", c = " + java.util.Arrays.toString(c));
	}
}
