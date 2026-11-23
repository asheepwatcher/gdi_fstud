// Kapitel 17: Objektorientierung I: Klassen und Objekte
// Aufgabe 17.4: Fehler finden
// Achtung: Dieser Code enthält absichtlich Fehler bzw. lässt sich nicht
// (vollständig) übersetzen. Das herauszufinden ist Teil der Aufgabe.

class ArtikelTest {
	public static void main(String[] args) {
		Artikel a = new Artikel();
		Artikel b = new Artikel("Stift", 1.5);
		b.preis = 2.0;
		System.out.println(b);
	}
}
