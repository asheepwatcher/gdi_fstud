// Kapitel 13: Java: Arrays und Aufzählungen
// Beispiel 13.3: Zweidimensionales Array
// Abschnitt im Skript: Matrix

package kapitel13.beispiel03;

public class Matrix {
	public static void main(String[] args) {
		int[][] m = { {1, 2, 3}, {4, 5, 6} };       // 2 Zeilen, 3 Spalten
		System.out.println(m[1][2]);                // 6 (Zeile 1, Spalte 2)

		for (int i = 0; i < m.length; i++) {        // alle Zeilen
			int zeilensumme = 0;
			for (int j = 0; j < m[i].length; j++) { // alle Spalten der Zeile i
				zeilensumme += m[i][j];
			}
			System.out.println("Zeile " + i + ": " + zeilensumme);      // 6 und 15
		}
	}
}
