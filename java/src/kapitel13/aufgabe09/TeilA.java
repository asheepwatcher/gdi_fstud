// Kapitel 13: Java: Arrays und Aufzählungen
// Aufgabe 13.9: Was wird ausgegeben?
// Abschnitt im Skript: a)

package kapitel13.aufgabe09;

public class TeilA {
	public static void main(String[] args) {
		int[] f = {3, 1, 4, 1, 5};
		int s = 0;
		for (int i = 0; i < f.length; i += 2) {
			s += f[i];
		}
		System.out.println(s);
	}
}
