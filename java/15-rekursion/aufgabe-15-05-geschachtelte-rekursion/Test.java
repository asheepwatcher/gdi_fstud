// Kapitel 15: Rekursion
// Aufgabe 15.5: Geschachtelte Rekursion
// Abschnitt im Skript: test

public class Test {
	public static int test(int x) {
		return (x % 3 == 0) ? test(test(--x)) : x / 2 + 1;
	}

	public static void main(String[] args) {
		System.out.println(test(36));
	}
}
