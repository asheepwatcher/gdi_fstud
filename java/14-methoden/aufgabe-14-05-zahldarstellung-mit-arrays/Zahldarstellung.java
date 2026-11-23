// Kapitel 14: Java: Methoden
// Aufgabe 14.5: Zahldarstellung mit Arrays

public class Zahldarstellung {
	public static String toString(int[] num) {
		throw new UnsupportedOperationException("noch nicht implementiert");
	}

	public static boolean istGueltig(int[] num, int base) {
		throw new UnsupportedOperationException("noch nicht implementiert");
	}

	public static int toInt(int[] num, int base) {
		throw new UnsupportedOperationException("noch nicht implementiert");
	}

	public static int[] plusEins(int[] num) {
		throw new UnsupportedOperationException("noch nicht implementiert");
	}

	public static void main(String[] args) {
		int[] dual = {1, 1, 0, 1};      // 8 + 4 + 1 = 13
		int[] fuenf = {2, 0, 4, 3};     // 2*125 + 4*5 + 3 = 273
		System.out.println("Dualzahl: " + toString(dual));
		System.out.println("Gueltig zur Basis 5: " + istGueltig(fuenf, 5));
		System.out.println("Gueltig zur Basis 4: " + istGueltig(fuenf, 4));
		System.out.println("Wert: " + toInt(fuenf, 5));
		System.out.println("Um 1 erhoeht: " + toString(plusEins(dual)));
	}
}
