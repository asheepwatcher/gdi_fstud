// Kapitel 10: Java: Variablen, Datentypen, Ein- und Ausgabe
// Aufgabe 10.3: Lässt sich das ausführen?
// Abschnitt im Skript: g)
// Achtung: Dieser Code enthält absichtlich Fehler bzw. lässt sich nicht
// (vollständig) übersetzen. Das herauszufinden ist Teil der Aufgabe.

package kapitel10.aufgabe03;

public class TeilG {
	public static void main(String[] args) {
		final int MAX = 10;
		MAX = 11;
		System.out.println(MAX);
	}
}
