// Kapitel 15: Rekursion
// Aufgabe 15.2: Rekursion verstehen

public class Test {
	private static int tuWas(int a, int b) {
		if (b == 0)
			return 0;
		if (b % 2 == 0)
			return tuWas(a + a, b / 2);
		return tuWas(a + a, b / 2) + a;
	}

	public static void main(String[] args) {
		System.out.println(tuWas(7, 5));
		System.out.println(tuWas(3, 8));
		System.out.println(tuWas(10, 0));
	}
}
