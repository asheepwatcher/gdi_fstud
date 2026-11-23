// Kapitel 18: Objektorientierung II: Vererbung, Polymorphie, Interfaces
// Beispiel 18.3: Interface

public class Dreieck extends Figur implements Skalierbar {
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

	@Override
	public void skaliere(double faktor) {
		grund *= faktor;
		hoehe *= faktor;
	}
}
