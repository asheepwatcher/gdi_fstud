// Kapitel 12: Java: Kontrollstrukturen
// Aufgabe 12.10: Was wird ausgegeben?
// Abschnitt im Skript: b)

public class TeilB {
	public static void main(String[] args) {
		int n = 100;
		while (n > 1) {
			n = n / 3;
			System.out.print(n + " ");
		}
	}
}
