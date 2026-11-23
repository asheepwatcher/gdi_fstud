// Kapitel 15: Rekursion
// Aufgabe 15.9: Noch mehr auswerten
// Abschnitt im Skript: c) c(1000)

public class TeilC {
	static int c(int n) {
		if (n < 10) return 1;
		return 1 + c(n / 10);
	}

	public static void main(String[] args) {
		System.out.println(c(1000));
	}
}
