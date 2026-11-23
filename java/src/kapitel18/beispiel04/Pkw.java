// Kapitel 18: Objektorientierung II: Vererbung, Polymorphie, Interfaces
// Beispiel 18.4: Vom Text zum Modell

package kapitel18.beispiel04;

public class Pkw extends Fahrzeug {
	private int sitze;

	public Pkw(String kennzeichen, int sitze) {
		super(kennzeichen);
		this.sitze = sitze;
	}
}
