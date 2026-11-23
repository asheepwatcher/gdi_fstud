// Kapitel 15: Rekursion
// Aufgabe 15.1: Rekursion auswerten
// Abschnitt im Skript: c) h(3)

package kapitel15.aufgabe01;

public class TeilC {
	static void h(int n) {
		if (n > 0) {
			System.out.print(n + " ");
			h(n - 1);
			System.out.print(n + " ");
		}
	}

	public static void main(String[] args) {
		h(3);
	}
}
