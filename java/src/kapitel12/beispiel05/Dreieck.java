// Kapitel 12: Java: Kontrollstrukturen
// Beispiel 12.5: Geschachtelte Schleifen
// Abschnitt im Skript: Dreieck

package kapitel12.beispiel05;

public class Dreieck {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
