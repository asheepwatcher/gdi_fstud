// Kapitel 15: Rekursion
// Aufgabe 15.9: Noch mehr auswerten
// Abschnitt im Skript: b) b(2, 5)

public class TeilB {
	static int b(int x, int n) {
		if (n == 0) return 1;
		return x * b(x, n - 1);
	}

	public static void main(String[] args) {
		System.out.println(b(2, 5));
	}
}
