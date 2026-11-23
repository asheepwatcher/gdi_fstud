// Kapitel 18: Objektorientierung II: Vererbung, Polymorphie, Interfaces
// Beispiel 18.1: Abstrakte Klasse, Vererbung und Polymorphie

public class Quadrat extends Rechteck {
	public Quadrat(double seite) {
		super(seite, seite);                            // Konstruktor von Rechteck
	}

	@Override
	public String toString() {
		return "Quadrat! " + super.toString();          // nutzt die geerbte Version mit
	}
}
