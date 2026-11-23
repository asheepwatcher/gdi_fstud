// Kapitel 12: Java: Kontrollstrukturen
// Aufgabe 12.10: Was wird ausgegeben?
// Abschnitt im Skript: d)

package kapitel12.aufgabe10;

public class TeilD {
	public static void main(String[] args) {
		int s = 0;
		for (int i = 1; i <= 5; i++) {
			if (i == 3) continue;
			s += i;
		}
		System.out.println(s);
	}
}
