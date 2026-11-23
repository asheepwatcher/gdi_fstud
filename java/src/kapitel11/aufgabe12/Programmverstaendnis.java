// Kapitel 11: Java: Ausdrücke und Operatoren
// Aufgabe 11.12: Programmverständnis III
// Zum Überprüfen der eigenen Lösung: Vor jeder Zeile werden x, y und z
// wieder auf die Ausgangswerte gesetzt.

package kapitel11.aufgabe12;

public class Programmverstaendnis {
	public static void main(String[] args) {
		int x, y, z;

		x = 1; y = 3; z = 2;
		x += ++y;
		System.out.println("x += ++y;   ->   x = " + x + ", y = " + y + ", z = " + z);

		x = 1; y = 3; z = 2;
		y = x++ * z--;
		System.out.println("y = x++ * z--;   ->   x = " + x + ", y = " + y + ", z = " + z);

		x = 1; y = 3; z = 2;
		z = (y > x) ? y - x : x - y;
		System.out.println("z = (y > x) ? y - x : x - y;   ->   x = " + x + ", y = " + y + ", z = " + z);

		x = 1; y = 3; z = 2;
		x = y-- - --y;
		System.out.println("x = y-- - --y;   ->   x = " + x + ", y = " + y + ", z = " + z);
	}
}
