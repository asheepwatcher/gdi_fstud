// Kapitel 18: Objektorientierung II: Vererbung, Polymorphie, Interfaces
// Aufgabe 18.2: Was wird ausgegeben?

public class Tiere {
	public static void main(String[] args) {
		Tier t = new Welpe();
		System.out.println(t.vorstellen());
		Tier u = new Tier();
		System.out.println(u.vorstellen());
		System.out.println(t instanceof Hund);
		System.out.println(u instanceof Hund);
	}
}
