// Kapitel 18: Objektorientierung II: Vererbung, Polymorphie, Interfaces
// Aufgabe 18.2: Was wird ausgegeben?

package kapitel18.aufgabe02;

class Hund extends Tier {
	public Hund() { System.out.println("Hund erzeugt"); }
	@Override
	public String laut() { return "Wuff"; }
}
