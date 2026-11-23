// Kapitel 15: Rekursion
// Aufgabe 15.11: Was geht hier schief?
// Abschnitt im Skript: h

public class H {
	static int h(int n) {
		if (n == 0) return 0;
		return n + h(n - 2);
	}

	public static void main(String[] args) {
		System.out.println(h(5));
	}
}
