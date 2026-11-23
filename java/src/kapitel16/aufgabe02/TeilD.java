// Kapitel 16: Algorithmenentwurf und Komplexität
// Aufgabe 16.2: Aufwand bestimmen
// Abschnitt im Skript: d)

package kapitel16.aufgabe02;

public class TeilD {
	public static void main(String[] args) {
		int n = 1000;
		int k = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 10; j++) {
				k++;
			}
		}
		System.out.println("Durchlaeufe bei n = " + n + ": " + k);
	}
}
