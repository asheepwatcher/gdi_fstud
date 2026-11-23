// Kopie aus beispiel-18-01-abstrakte-klasse-vererbung-und-polymorph, damit dieser Ordner für sich übersetzbar ist

package kapitel18.beispiel02;

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
