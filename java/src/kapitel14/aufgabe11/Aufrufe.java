// Kapitel 14: Java: Methoden
// Aufgabe 14.11: Was wird ausgegeben?

package kapitel14.aufgabe11;

public class Aufrufe {
	static int plus(int a, int b) { return a + b; }
	static double plus(double a, double b) { return a + b; }
	static String plus(String a, String b) { return a + b; }

	static int doppelt(int x) {
		x = x * 2;
		return x;
	}

	public static void main(String[] args) {
		int x = 4;
		System.out.println(plus(1, 2));
		System.out.println(plus(1, 2.0));
		System.out.println(plus("1", "2"));
		System.out.println(doppelt(x) + " " + x);
		System.out.println(doppelt(doppelt(x)));
		x = doppelt(x);
		System.out.println(x);
	}
}
