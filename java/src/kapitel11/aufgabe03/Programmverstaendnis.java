// Kapitel 11: Java: Ausdrücke und Operatoren
// Aufgabe 11.3: Programmverständnis II
// Zum Überprüfen der eigenen Lösung: Vor jeder Zeile werden x, y und z
// wieder auf die Ausgangswerte gesetzt.

package kapitel11.aufgabe03;

public class Programmverstaendnis {
	public static void main(String[] args) {
		int x, y, z;

		x = 4; y = 1; z = 2;
		z = y++;
		System.out.println("z = y++;   ->   x = " + x + ", y = " + y + ", z = " + z);

		x = 4; y = 1; z = 2;
		y = y++ + ++y;
		System.out.println("y = y++ + ++y;   ->   x = " + x + ", y = " + y + ", z = " + z);

		x = 4; y = 1; z = 2;
		x += x *= z--;
		System.out.println("x += x *= z--;   ->   x = " + x + ", y = " + y + ", z = " + z);

		x = 4; y = 1; z = 2;
		z -= (x-- - --y);
		System.out.println("z -= (x-- - --y);   ->   x = " + x + ", y = " + y + ", z = " + z);
	}
}
