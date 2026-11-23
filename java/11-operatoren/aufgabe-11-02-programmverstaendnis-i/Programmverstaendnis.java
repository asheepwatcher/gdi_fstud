// Kapitel 11: Java: Ausdrücke und Operatoren
// Aufgabe 11.2: Programmverständnis I
// Zum Überprüfen der eigenen Lösung: Vor jeder Zeile werden x, y und z
// wieder auf die Ausgangswerte gesetzt.

public class Programmverstaendnis {
	public static void main(String[] args) {
		int x, y, z;

		x = 2; y = 5; z = 3;
		z *= ++z;
		System.out.println("z *= ++z;   ->   x = " + x + ", y = " + y + ", z = " + z);

		x = 2; y = 5; z = 3;
		x = y-- - ++z;
		System.out.println("x = y-- - ++z;   ->   x = " + x + ", y = " + y + ", z = " + z);

		x = 2; y = 5; z = 3;
		y -= (x < z) ? x : 2 * x;
		System.out.println("y -= (x < z) ? x : 2 * x;   ->   x = " + x + ", y = " + y + ", z = " + z);

		x = 2; y = 5; z = 3;
		x = (y++ > 5) ? y : 3 * y;
		System.out.println("x = (y++ > 5) ? y : 3 * y;   ->   x = " + x + ", y = " + y + ", z = " + z);
	}
}
