// Kapitel 12: Java: Kontrollstrukturen
// Aufgabe 12.11: Schreibtischtest
// Abschnitt im Skript: Zählen

package kapitel12.aufgabe11;

public class Zaehlen {
	public static void main(String[] args) {
		int n = 6;

		int t = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				t++;
			}
		}
		System.out.println(t);
	}
}
