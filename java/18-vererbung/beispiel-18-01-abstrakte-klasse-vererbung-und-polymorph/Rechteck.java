// Kapitel 18: Objektorientierung II: Vererbung, Polymorphie, Interfaces
// Beispiel 18.1: Abstrakte Klasse, Vererbung und Polymorphie

public class Rechteck extends Figur {
	private double breite, hoehe;

	public Rechteck(double breite, double hoehe) {
		super("Rechteck");      // Konstruktor von Figur
		this.breite = breite;
		this.hoehe = hoehe;
	}

	@Override
	public double getFlaeche() {
		return breite * hoehe;
	}
}
