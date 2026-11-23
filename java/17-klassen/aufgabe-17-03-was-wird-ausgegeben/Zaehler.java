// Kapitel 17: Objektorientierung I: Klassen und Objekte
// Aufgabe 17.3: Was wird ausgegeben?

public class Zaehler {
	private static int anzahl = 0;
	private int wert;

	public Zaehler(int wert) {
		this.wert = wert;
		anzahl++;
	}

	public void erhoehe() { wert++; }

	public String toString() { return wert + "/" + anzahl; }

	public static void main(String[] args) {
		Zaehler a = new Zaehler(5);
		Zaehler b = new Zaehler(5);
		Zaehler c = b;
		c.erhoehe();
		a.erhoehe();
		a = c;
		a.erhoehe();
		System.out.println(a + " " + b + " " + c);
		System.out.println(a == b);
		System.out.println(new Zaehler(1));
	}
}
