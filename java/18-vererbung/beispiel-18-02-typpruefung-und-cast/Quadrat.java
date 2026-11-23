// Kopie aus beispiel-18-01-abstrakte-klasse-vererbung-und-polymorph, damit dieser Ordner für sich übersetzbar ist

public class Quadrat extends Rechteck {
	public Quadrat(double seite) {
		super(seite, seite);                            // Konstruktor von Rechteck
	}

	@Override
	public String toString() {
		return "Quadrat! " + super.toString();          // nutzt die geerbte Version mit
	}
}
