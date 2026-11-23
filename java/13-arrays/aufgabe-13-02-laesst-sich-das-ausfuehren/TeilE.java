// Kapitel 13: Java: Arrays und Aufzählungen
// Aufgabe 13.2: Lässt sich das ausführen?
// Abschnitt im Skript: e)
// Achtung: Dieser Code enthält absichtlich Fehler bzw. lässt sich nicht
// (vollständig) übersetzen. Das herauszufinden ist Teil der Aufgabe.

public class TeilE {
	public static void main(String[] args) {
		int[] f = {4, 5, 6};
		f[f.length - 1] = f[0];
		System.out.println(f[2] + f.length);
	}
}
