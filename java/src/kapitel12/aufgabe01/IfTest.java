// Kapitel 12: Java: Kontrollstrukturen
// Aufgabe 12.1: Welches else gehört wohin?
// Abschnitt im Skript: IfTest

package kapitel12.aufgabe01;

public class IfTest {
	public static void main(String[] args) {
		int n = 3, m, k = 0;
		if (n > 5) { m = 1; } else { m = 2; }
		if (m == 2)
			if (k > 0)
				System.out.println("A");
		else
			System.out.println("B");
		System.out.println("C");
	}
}
