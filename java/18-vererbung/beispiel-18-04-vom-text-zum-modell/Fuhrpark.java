// Kapitel 18: Objektorientierung II: Vererbung, Polymorphie, Interfaces
// Beispiel 18.4: Vom Text zum Modell

public class Fuhrpark {
	private Fahrzeug[] fahrzeuge = new Fahrzeug[50];    // max. 50 Fahrzeuge
	private int anzahl = 0;

	public void fahrzeugHinzufuegen(Fahrzeug f) {
		if (anzahl < fahrzeuge.length) {
			fahrzeuge[anzahl++] = f;
		}
	}
}
