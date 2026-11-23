// Kapitel 15: Rekursion
// Aufgabe 15.1: Rekursion auswerten
// Abschnitt im Skript: b) g(84, 36)

public class TeilB {
	static int g(int a, int b) {
		return b == 0 ? a : g(b, a % b);
	}

	public static void main(String[] args) {
		System.out.println(g(84, 36));
	}
}
