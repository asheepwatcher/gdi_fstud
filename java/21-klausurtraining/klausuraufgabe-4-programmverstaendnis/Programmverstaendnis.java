// Kapitel 21: Klausurtraining
// Übungsklausur, Aufgabe 4 a): Programmverständnis
// Zum Überprüfen der eigenen Lösung: Vor jeder Zeile werden x, y und z
// wieder auf die Ausgangswerte gesetzt.

public class Programmverstaendnis {
	public static void main(String[] args) {
		int x, y, z;

		x = 5; y = 2; z = 4;
		x -= y++;
		System.out.println("x -= y++;   ->   x = " + x + ", y = " + y + ", z = " + z);

		x = 5; y = 2; z = 4;
		z = x-- + --x;
		System.out.println("z = x-- + --x;   ->   x = " + x + ", y = " + y + ", z = " + z);

		x = 5; y = 2; z = 4;
		y *= (x > z) ? y : z;
		System.out.println("y *= (x > z) ? y : z;   ->   x = " + x + ", y = " + y + ", z = " + z);

		x = 5; y = 2; z = 4;
		z = (--y == 1) ? x++ : z++;
		System.out.println("z = (--y == 1) ? x++ : z++;   ->   x = " + x + ", y = " + y + ", z = " + z);
	}
}
