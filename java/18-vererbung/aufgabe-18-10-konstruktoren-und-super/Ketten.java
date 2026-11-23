// Kapitel 18: Objektorientierung II: Vererbung, Polymorphie, Interfaces
// Aufgabe 18.10: Konstruktoren und super

public class Ketten {
	public static void main(String[] args) {
		A a = new B();
		A b = new B(7);
		System.out.println(a.wer() + " " + b.wer());
	}
}
