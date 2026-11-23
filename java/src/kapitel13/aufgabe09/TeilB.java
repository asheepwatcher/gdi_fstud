// Kapitel 13: Java: Arrays und Aufzählungen
// Aufgabe 13.9: Was wird ausgegeben?
// Abschnitt im Skript: b)

package kapitel13.aufgabe09;

public class TeilB {
	public static void main(String[] args) {
		int[] f = {3, 1, 4, 1, 5};
		for (int i = 1; i < f.length; i++) {
			f[i] = f[i] + f[i - 1];
		}
		System.out.println(f[4]);
	}
}
