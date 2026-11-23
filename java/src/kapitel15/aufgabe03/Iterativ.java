// Kapitel 15: Rekursion
// Aufgabe 15.3: Rekursive Methoden schreiben
// Abschnitt im Skript: iterativ

package kapitel15.aufgabe03;

public class Iterativ {
	public static String dualIter(int n) {
		String dual = "";
		while (n > 0) {
			dual = n % 2 + dual;
			n = n / 2;
		}
		return dual;
	}
}
