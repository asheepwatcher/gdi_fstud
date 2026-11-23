// Kapitel 12: Java: Kontrollstrukturen
// Aufgabe 12.4: Was wird ausgegeben?
// Abschnitt im Skript: d)

public class TeilD {
	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			for (int j = i; j <= 3; j++) {
				System.out.print(i * j + " ");
			}
		}
	}
}
