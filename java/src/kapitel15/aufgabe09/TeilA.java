// Kapitel 15: Rekursion
// Aufgabe 15.9: Noch mehr auswerten
// Abschnitt im Skript: a) a(5)

package kapitel15.aufgabe09;

public class TeilA {
	static int a(int n) {
		if (n == 0) return 0;
		return n + a(n - 1);
	}

	public static void main(String[] args) {
		System.out.println(a(5));
	}
}
