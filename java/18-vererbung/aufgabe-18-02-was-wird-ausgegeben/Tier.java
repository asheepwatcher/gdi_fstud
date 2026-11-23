// Kapitel 18: Objektorientierung II: Vererbung, Polymorphie, Interfaces
// Aufgabe 18.2: Was wird ausgegeben?

class Tier {
	public Tier() { System.out.println("Tier erzeugt"); }
	public String laut() { return "..."; }
	public String vorstellen() { return "Ich mache " + laut(); }
}
