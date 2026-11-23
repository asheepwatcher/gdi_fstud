// Kapitel 17: Objektorientierung I: Klassen und Objekte
// Beispiel 17.3: Objekte in einem Array verwalten

public class Bank {
	private Konto[] konten = new Konto[100];    // max. 100 Konten
	private int anzahl = 0;

	public void kontoHinzufuegen(Konto k) {
		if (anzahl < konten.length) {
			konten[anzahl++] = k;
		} else {
			System.out.println("Fehler: Die Bank ist voll.");
		}
	}

	public void alleAusgeben() {
		for (int i = 0; i < anzahl; i++) {
			System.out.println(konten[i]);      // ruft toString() auf
		}
	}
}
