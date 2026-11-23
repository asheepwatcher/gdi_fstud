// Kopie aus beispiel-17-01-eine-klasse-in-uml-und-in-java, damit dieser Ordner für sich übersetzbar ist

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
