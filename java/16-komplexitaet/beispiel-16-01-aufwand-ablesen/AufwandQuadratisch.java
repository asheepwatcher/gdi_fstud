// Kapitel 16: Algorithmenentwurf und Komplexität
// Beispiel 16.1: Aufwand ablesen
// Abschnitt im Skript: O(n²)

public class AufwandQuadratisch {
	public static void main(String[] args) {
		int n = 1000;
		int k = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				k++;
			}
		}
		System.out.println("Durchlaeufe bei n = " + n + ": " + k);
	}
}
