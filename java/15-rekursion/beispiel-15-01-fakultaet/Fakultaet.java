// Kapitel 15: Rekursion
// Beispiel 15.1: Fakultät
// Abschnitt im Skript: rekursiv

public class Fakultaet {
	static long fak(int n) {
		if (n == 0) {
			return 1;               // Basisfall
		}
		return n * fak(n - 1);      // Rekursionsschritt
	}

	public static void main(String[] args) {
		System.out.println(fak(3));
		System.out.println(fak(10));
	}
}
