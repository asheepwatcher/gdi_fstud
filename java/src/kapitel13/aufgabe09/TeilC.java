// Kapitel 13: Java: Arrays und Aufzählungen
// Aufgabe 13.9: Was wird ausgegeben?
// Abschnitt im Skript: c)

package kapitel13.aufgabe09;

public class TeilC {
	public static void main(String[] args) {
		int[] f = {1, 2, 3};
		for (int w : f) {
			w = w * 2;
		}
		System.out.println(f[0] + f[1] + f[2]);
	}
}
