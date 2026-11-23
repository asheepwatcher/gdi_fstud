// Kapitel 16: Algorithmenentwurf und Komplexität
// Beispiel 16.1: Aufwand ablesen
// Abschnitt im Skript: O(n)

package kapitel16.beispiel01;

public class AufwandLinear {
	public static void main(String[] args) {
		int n = 1000;
		int[] f = new int[n];
		int summe = 0;

		for (int i = 0; i < n; i++) {
			summe += f[i];
		}
		System.out.println("Durchlaeufe bei n = " + n + ": " + n);
	}
}
