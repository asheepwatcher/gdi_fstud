// Kapitel 14: Java: Methoden
// Beispiel 14.4: Arrays als Parameter und Rückgabewert
// Abschnitt im Skript: Array-Methoden

public class ArrayMethoden {
	static double summe(double[] z) {
		double erg = 0;
		for (int i = 0; i < z.length; i++) {
			erg += z[i];
		}
		return erg;
	}

	static int[] quadrate(int n) {          // erzeugt ein neues Array und gibt es zurück
		int[] erg = new int[n];
		for (int i = 0; i < n; i++) {
			erg[i] = (i + 1) * (i + 1);
		}
		return erg;
	}

	public static void main(String[] args) {
		System.out.println(summe(new double[] {1.5, 2.5, 3.0}));
		System.out.println(java.util.Arrays.toString(quadrate(5)));
	}
}
