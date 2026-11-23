// Kapitel 17: Objektorientierung I: Klassen und Objekte
// Beispiel 17.1: Eine Klasse in UML und in Java

package kapitel17.beispiel01;

public class Konto {
	private int kontoNr;
	private double saldo;
	private static int maxKontoNr = 10000;

	public Konto() {
		this(0);                    // ruft den anderen Konstruktor auf
	}

	public Konto(double saldo) {
		this.kontoNr = maxKontoNr++;        // eindeutige Nummer
		this.saldo = saldo;
	}

	public int getKontoNr() { return kontoNr; }

	public double getSaldo() { return saldo; }

	public void einzahlen(double betrag) {
		saldo += betrag;
	}

	public void auszahlen(double betrag) {
		if (betrag <= saldo) {
			saldo -= betrag;
		}
	}

	public String toString() {
		return "Konto " + kontoNr + ": " + saldo;
	}
}
