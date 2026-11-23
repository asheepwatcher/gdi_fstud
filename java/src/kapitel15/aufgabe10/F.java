// Kapitel 15: Rekursion
// Aufgabe 15.10: Wie viele Aufrufe?
// Abschnitt im Skript: f

package kapitel15.aufgabe10;

public class F {
	static int f(int n) {
		if (n == 0) return 1;
		return f(n - 1) + f(n - 1);
	}

	public static void main(String[] args) {
		System.out.println(f(4));
	}
}
