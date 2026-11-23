// Kapitel 14: Java: Methoden
// Aufgabe 14.9: Sichtbar oder nicht?
// Achtung: Dieser Code enthält absichtlich Fehler bzw. lässt sich nicht
// (vollständig) übersetzen. Das herauszufinden ist Teil der Aufgabe.

package kapitel14.aufgabe09;

public class Sichtbar {
	static int a = 1;

	static void tuWas(int b) {
		int c = a + b;
		a = c;
		System.out.println(d);
	}

	public static void main(String[] args) {
		int d = 5;
		{
			int e = d * 2;
			tuWas(e);
		}
		tuWas(a);
		System.out.println(a + " " + d);
		System.out.println(c + e);
	}
}
