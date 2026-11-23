// Kopie aus beispiel-18-01-abstrakte-klasse-vererbung-und-polymorph, damit dieser Ordner für sich übersetzbar ist

public abstract class Figur {
	private String name;

	public Figur(String name) {
		this.name = name;
	}

	public abstract double getFlaeche();    // ohne Rumpf

	public String toString() {
		return name + " mit Flaeche " + getFlaeche();
	}
}
