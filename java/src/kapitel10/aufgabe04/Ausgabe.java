// Kapitel 10: Java: Variablen, Datentypen, Ein- und Ausgabe
// Aufgabe 10.4: Was gibt das Programm aus?

package kapitel10.aufgabe04;

public class Ausgabe {
	public static void main(String[] args) {
		int a = 17;
		int b = 5;
		double c = 5;
		System.out.println(a / b);
		System.out.println(a % b);
		System.out.println(a / c);
		System.out.println("a+b=" + a + b);
		System.out.println(a + b + "=a+b");
		System.out.println((double) (a / b));
		System.out.println((char) ('a' + b));
	}
}
