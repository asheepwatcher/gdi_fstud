// Kapitel 14: Java: Methoden
// Aufgabe 14.3: Überladen
// Abschnitt im Skript: Kandidaten
// Achtung: Dieser Code enthält absichtlich Fehler bzw. lässt sich nicht
// (vollständig) übersetzen. Das herauszufinden ist Teil der Aufgabe.

package kapitel14.aufgabe03;

public class Kandidaten {
	static int berechne(int n) { return n; }
	static int berechne(int n, int m) { return n + m; }
	static double berechne(double n) { return n; }
	static double berechne(int zahl) { return zahl; }
	static void berechne(String s) { }
}
