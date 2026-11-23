// Kapitel 18: Objektorientierung II: Vererbung, Polymorphie, Interfaces
// Beispiel 18.4: Vom Text zum Modell

package kapitel18.beispiel04;

public class Lkw extends Fahrzeug {
	private String fahrer;

	public Lkw(String kennzeichen) {
		super(kennzeichen);
	}

	public void setFahrer(String fahrer) {
		this.fahrer = fahrer;
	}
}
