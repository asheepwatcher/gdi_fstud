// Kapitel 16: Algorithmenentwurf und Komplexität
// Beispiel 16.5: Backtracking: das Vier-Damen-Problem
// Abschnitt im Skript: Backtracking

public class Backtracking {
	static int[] dame = new int[4];             // dame[z] = Spalte der Dame in Zeile z

	static boolean istSicher(int zeile, int spalte) {
		for (int z = 0; z < zeile; z++) {       // alle bereits gesetzten Damen prüfen
			if (dame[z] == spalte || Math.abs(dame[z] - spalte) == zeile - z) {
				return false;                   // gleiche Spalte oder gleiche Diagonale
			}
		}
		return true;
	}

	static boolean setze(int zeile) {
		if (zeile == 4) {
			return true;                        // alle Damen stehen: Lösung gefunden
		}
		for (int spalte = 0; spalte < 4; spalte++) {
			if (istSicher(zeile, spalte)) {
				dame[zeile] = spalte;           // Entscheidung treffen
				if (setze(zeile + 1)) {
					return true;
				}                               // sonst: nächste Spalte probieren
			}
		}
		return false;                           // Sackgasse: zurück zur vorigen Zeile
	}

	public static void main(String[] args) {
		System.out.println(setze(0));
		System.out.println(java.util.Arrays.toString(dame));
	}
}
