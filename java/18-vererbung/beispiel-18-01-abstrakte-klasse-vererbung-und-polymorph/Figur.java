// Kapitel 18: Objektorientierung II: Vererbung, Polymorphie, Interfaces
// Beispiel 18.1: Abstrakte Klasse, Vererbung und Polymorphie

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
