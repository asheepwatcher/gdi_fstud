// Kapitel 13: Java: Arrays und Aufzählungen
// Aufgabe 13.2: Lässt sich das ausführen?
// Abschnitt im Skript: f)
// Achtung: Dieser Code enthält absichtlich Fehler bzw. lässt sich nicht
// (vollständig) übersetzen. Das herauszufinden ist Teil der Aufgabe.

package kapitel13.aufgabe02;

public class TeilF {
	public static void main(String[] args) {
		int[][] m = new int[2][];
		m[0] = new int[3];
		m[1] = new int[4];
		System.out.println(m.length + m[1].length);
	}
}
