// Kapitel 12: Java: Kontrollstrukturen
// Aufgabe 12.4: Was wird ausgegeben?
// Abschnitt im Skript: e)

public class TeilE {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) continue;
			if (i > 7) break;
			System.out.print(i + " ");
		}
		System.out.println("Fertig");
	}
}
