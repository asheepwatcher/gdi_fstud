// Kapitel 15: Rekursion
// Aufgabe 15.1: Rekursion auswerten
// Abschnitt im Skript: a) f(7)

package kapitel15.aufgabe01;

public class TeilA {
	static int f(int n) {
		return n <= 1 ? 1 : n * f(n - 2);
	}

	public static void main(String[] args) {
		System.out.println(f(7));
	}
}
