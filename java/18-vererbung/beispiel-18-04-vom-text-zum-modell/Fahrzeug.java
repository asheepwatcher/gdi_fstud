// Kapitel 18: Objektorientierung II: Vererbung, Polymorphie, Interfaces
// Beispiel 18.4: Vom Text zum Modell

public abstract class Fahrzeug {
	private static int naechsteNr = 1;
	private int nr;
	private String kennzeichen;

	public Fahrzeug(String kennzeichen) {
		this.nr = naechsteNr++;
		this.kennzeichen = kennzeichen;
	}
}
