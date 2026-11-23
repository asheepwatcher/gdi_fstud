// Kapitel 18: Objektorientierung II: Vererbung, Polymorphie, Interfaces
// Aufgabe 18.3: Erlaubt oder nicht?
// Abschnitt im Skript: Zuweisungen
// Achtung: Dieser Code enthält absichtlich Fehler bzw. lässt sich nicht
// (vollständig) übersetzen. Das herauszufinden ist Teil der Aufgabe.

public class Zuweisungen {
	public static void main(String[] args) {
		Figur f1 = new Figur("Kreis");
		Figur f2 = new Quadrat(2);
		Rechteck r1 = new Quadrat(2);
		Quadrat q1 = new Rechteck(2, 2);
		Quadrat q2 = (Quadrat) f2;
		Dreieck d1 = (Dreieck) f2;
		Object o = new Dreieck(1, 1);
		double a = o.getFlaeche();
	}
}
