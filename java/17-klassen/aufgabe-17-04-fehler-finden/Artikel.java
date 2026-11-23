// Kapitel 17: Objektorientierung I: Klassen und Objekte
// Aufgabe 17.4: Fehler finden
// Achtung: Dieser Code enthält absichtlich Fehler bzw. lässt sich nicht
// (vollständig) übersetzen. Das herauszufinden ist Teil der Aufgabe.

public class Artikel {
	private String name;
	private double preis;
	private static int anzahl = 0;

	public Artikel(String name, double preis) {
		name = name;
		this.preis = preis;
		anzahl++;
	}

	public static double getPreis() {
		return preis;
	}

	public void getName() {
		return name;
	}
}
