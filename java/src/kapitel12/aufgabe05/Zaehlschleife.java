// Kapitel 12: Java: Kontrollstrukturen
// Aufgabe 12.5: Schleifen umformen
// Abschnitt im Skript: Zählschleife

package kapitel12.aufgabe05;

public class Zaehlschleife {
	public static void main(String[] args) {
		int n = 5;

		int produkt = 1;
		for (int i = 1; i <= n; i++) {
			produkt *= i;
		}
		System.out.println(produkt);
	}
}
