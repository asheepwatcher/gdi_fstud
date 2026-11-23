// Kapitel 15: Rekursion
// Aufgabe 15.11: Was geht hier schief?
// Abschnitt im Skript: g

package kapitel15.aufgabe11;

public class G {
	static int g(int n) {
		return n * g(n - 1);
	}

	public static void main(String[] args) {
		System.out.println(g(5));
	}
}
