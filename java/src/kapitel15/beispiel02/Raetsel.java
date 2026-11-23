// Kapitel 15: Rekursion
// Beispiel 15.2: Eine unbekannte rekursive Methode nachvollziehen
// Abschnitt im Skript: Was macht diese Methode?

package kapitel15.beispiel02;

public class Raetsel {
	static String raetsel(int n) {
		if (n < 10) {
			return "" + n;
		}
		return n % 10 + raetsel(n / 10);
	}

	public static void main(String[] args) {
		System.out.println(raetsel(472));
	}
}
