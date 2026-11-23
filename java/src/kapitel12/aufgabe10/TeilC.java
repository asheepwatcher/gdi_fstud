// Kapitel 12: Java: Kontrollstrukturen
// Aufgabe 12.10: Was wird ausgegeben?
// Abschnitt im Skript: c)

package kapitel12.aufgabe10;

public class TeilC {
	public static void main(String[] args) {
		for (int i = 3; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}
