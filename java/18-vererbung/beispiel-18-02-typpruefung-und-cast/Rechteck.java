// Kopie aus beispiel-18-01-abstrakte-klasse-vererbung-und-polymorph, damit dieser Ordner für sich übersetzbar ist

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
