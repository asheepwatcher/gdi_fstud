// Kapitel 14: Java: Methoden
// Beispiel 14.1: Funktion und Prozedur

package kapitel14.beispiel01;

public class Methoden {
	// Funktion: liefert einen Wert zurück
	static int maximum(int a, int b) {          // a und b sind formale Parameter
		if (a > b) {
			return a;
		}
		return b;
	}

	// Prozedur: kein Rückgabewert
	static void ausgabe(int wert) {
		System.out.println("Das Maximum ist " + wert);
	}

	public static void main(String[] args) {
		int x = 30, y = 42;
		int m = maximum(x, y);                  // x und y sind aktuelle Parameter
		ausgabe(m);                             // Das Maximum ist 42
		ausgabe(maximum(7, 3));                 // Das Maximum ist 7
	}
}
