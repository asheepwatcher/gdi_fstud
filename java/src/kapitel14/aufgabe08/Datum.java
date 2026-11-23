// Kapitel 14: Java: Methoden
// Aufgabe 14.8: Datum mit Aufzählungstyp
// Abschnitt im Skript: Signatur

package kapitel14.aufgabe08;

public class Datum {
	enum Datumsformat { DE, US, ISO }

	public static void datumsausgabe(int tag, int monat, int jahr, Datumsformat format) {
		throw new UnsupportedOperationException("noch nicht implementiert");
	}

	public static void main(String[] args) {
		datumsausgabe(2, 12, 2026, Datumsformat.DE);
		datumsausgabe(2, 12, 2026, Datumsformat.US);
		datumsausgabe(2, 12, 2026, Datumsformat.ISO);
	}
}
