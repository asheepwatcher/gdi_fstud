// Kapitel 18: Objektorientierung II: Vererbung, Polymorphie, Interfaces
// Aufgabe 18.10: Konstruktoren und super

package kapitel18.aufgabe10;

class A {
	public A() { System.out.println("A()"); }
	public A(int x) { System.out.println("A(" + x + ")"); }
	public String wer() { return "A"; }
}
