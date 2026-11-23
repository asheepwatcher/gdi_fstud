// Kapitel 15: Rekursion
// Beispiel 15.3: Rekursiv, endrekursiv, iterativ
// Abschnitt im Skript: Drei Varianten

package kapitel15.beispiel03;

public class DreiVarianten {
	// rekursiv: nach dem Aufruf wird noch addiert, also nicht endrekursiv
	static int summe(int n) {
		return n == 0 ? 0 : n + summe(n - 1);
	}

	// endrekursiv: das Zwischenergebnis wird in einem zusätzlichen Parameter (Akkumulator) mitgeführt
	static int summe(int n, int akk) {
		return n == 0 ? akk : summe(n - 1, akk + n);       // erster Aufruf: summe(n, 0)
	}

	// iterativ
	static int summeIter(int n) {
		int akk = 0;
		for (int i = 1; i <= n; i++) {
			akk += i;
		}
		return akk;
	}

	public static void main(String[] args) {
		System.out.println(summe(100));
		System.out.println(summe(100, 0));
		System.out.println(summeIter(100));
	}
}
