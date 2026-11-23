// Kapitel 18: Objektorientierung II: Vererbung, Polymorphie, Interfaces
// Aufgabe 18.10: Konstruktoren und super

class B extends A {
	public B() { System.out.println("B()"); }
	public B(int x) { super(x); System.out.println("B(" + x + ")"); }
	@Override
	public String wer() { return "B" + super.wer(); }
}
