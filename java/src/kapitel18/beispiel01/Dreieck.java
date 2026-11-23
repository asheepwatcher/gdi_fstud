// Kapitel 18: Objektorientierung II: Vererbung, Polymorphie, Interfaces
// Beispiel 18.1: Abstrakte Klasse, Vererbung und Polymorphie

package kapitel18.beispiel01;

public class Dreieck extends Figur {
	private double grund, hoehe;

	public Dreieck(double grund, double hoehe) {
		super("Dreieck");
		this.grund = grund;
		this.hoehe = hoehe;
	}

	@Override
	public double getFlaeche() {
		return grund * hoehe / 2;
	}
}
