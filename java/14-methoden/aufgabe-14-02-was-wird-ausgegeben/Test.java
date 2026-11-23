// Kapitel 14: Java: Methoden
// Aufgabe 14.2: Was wird ausgegeben?

public class Test {
	static void f(int a, int[] b, int[] c) {
		a = a * 2;
		b[0] = b[0] * 2;
		c = new int[] { 100, 200 };
		c[1] = a;
	}

	public static void main(String[] args) {
		int x = 5;
		int[] y = { 1, 2 };
		int[] z = { 3, 4 };
		f(x, y, z);
		System.out.println(x + " " + y[0] + " " + y[1] + " " + z[0] + " " + z[1]);
	}
}
