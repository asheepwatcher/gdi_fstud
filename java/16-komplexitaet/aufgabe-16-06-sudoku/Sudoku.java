// Kapitel 16: Algorithmenentwurf und Komplexität
// Aufgabe 16.6: Sudoku

public class Sudoku {
	private static int[][] sudoku = new int[9][9];      // sudoku[zeile][spalte]

	private static boolean spalteOk(int spalte) {
		throw new UnsupportedOperationException("noch nicht implementiert");
	}

	private static boolean quadratOk(int zeile, int spalte) {
		throw new UnsupportedOperationException("noch nicht implementiert");
	}

	public static void main(String[] args) {
		sudoku[0][0] = 5;
		sudoku[1][0] = 6;
		sudoku[4][0] = 5;      // die 5 steht doppelt in Spalte 0
		System.out.println(spalteOk(0));        // erwartet: false
		System.out.println(spalteOk(1));        // erwartet: true
	}
}
