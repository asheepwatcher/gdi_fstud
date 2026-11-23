// Kapitel 15: Rekursion
// Aufgabe 15.12: Rekursiv und iterativ
// Abschnitt im Skript: iterativ

public class Produkt {
	static int produkt(int[] f) {
		int p = 1;
		for (int i = 0; i < f.length; i++) {
			p *= f[i];
		}
		return p;
	}

	public static void main(String[] args) {
		System.out.println(produkt(new int[] {2, 3, 4}));
	}
}
