// Kapitel 15: Rekursion
// Beispiel 15.4: Türme von Hanoi
// Abschnitt im Skript: Hanoi

package kapitel15.beispiel04;

public class Hanoi {
	static void bewege(char a, char b, char z, int n) {
		if (n == 1) {
			System.out.println("Bewege Scheibe von " + a + " auf " + b);
		} else {
			bewege(a, z, b, n - 1);     // n-1 Scheiben von a nach z (über b)
			bewege(a, b, z, 1);         // die größte Scheibe von a nach b
			bewege(z, b, a, n - 1);     // n-1 Scheiben von z nach b (über a)
		}
	}

	public static void main(String[] args) {
		bewege('a', 'b', 'z', 3);
	}
}
