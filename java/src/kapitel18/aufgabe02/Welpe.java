// Kapitel 18: Objektorientierung II: Vererbung, Polymorphie, Interfaces
// Aufgabe 18.2: Was wird ausgegeben?

package kapitel18.aufgabe02;

class Welpe extends Hund {
	@Override
	public String laut() { return super.laut() + " (leise)"; }
}
