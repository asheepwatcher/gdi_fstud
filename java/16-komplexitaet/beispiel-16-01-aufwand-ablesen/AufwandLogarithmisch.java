// Kapitel 16: Algorithmenentwurf und Komplexität
// Beispiel 16.1: Aufwand ablesen
// Abschnitt im Skript: O(log n)

public class AufwandLogarithmisch {
	public static void main(String[] args) {
		int n = 1000;
		int k = 0;

		int i = n;
		while (i > 1) {
			i = i / 2;
			k++;
		}
		System.out.println("Durchlaeufe bei n = " + n + ": " + k);
	}
}
