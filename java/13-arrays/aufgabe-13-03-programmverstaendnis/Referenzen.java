// Kapitel 13: Java: Arrays und Aufzählungen
// Aufgabe 13.3: Programmverständnis
// Abschnitt im Skript: Referenzen

public class Referenzen {
	public static void main(String[] args) {
		int[] a = { 5, 6 };
		int[] b = { 7, 8, 9 };
		int[] c = a;

		a = b;
		a[2] = 1;
		c[0] += b[2];

		for (int i = 0; i < c.length; i++) {
			System.out.println("a[" + i + "]=" + a[i] + " b[" + i + "]=" + b[i] + " c[" + i + "]=" + c[i]);
		}
	}
}
