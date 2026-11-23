// Kapitel 18: Objektorientierung II: Vererbung, Polymorphie, Interfaces
// Beispiel 18.3: Interface

public class InterfaceTest {
	public static void main(String[] args) {
		Dreieck d = new Dreieck(6, 3);
		Skalierbar s = d;               // ein Interface ist ein Typ wie eine Klasse
		System.out.println(d);
		s.skaliere(2);
		System.out.println(d);
	}
}
