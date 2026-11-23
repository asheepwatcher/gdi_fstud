// Kapitel 16: Algorithmenentwurf und Komplexität
// Aufgabe 16.2: Aufwand bestimmen
// Abschnitt im Skript: c)

public class TeilC {
	public static void main(String[] args) {
		int n = 1000;
		int k = 0;

		for (int i = 1; i < n; i = i * 2) {
			k++;
		}
		System.out.println("Durchlaeufe bei n = " + n + ": " + k);
	}
}
