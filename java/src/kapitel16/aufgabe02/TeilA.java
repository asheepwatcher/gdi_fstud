// Kapitel 16: Algorithmenentwurf und Komplexität
// Aufgabe 16.2: Aufwand bestimmen
// Abschnitt im Skript: a)

package kapitel16.aufgabe02;

public class TeilA {
	public static void main(String[] args) {
		int n = 1000;
		int k = 0;
		int[] a = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = 0;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				k++;
			}
		}
		System.out.println("Durchlaeufe bei n = " + n + ": " + k);
	}
}
