// Kapitel 13: Java: Arrays und Aufzählungen
// Beispiel 13.4: Zählen mit einem Hilfsarray
// Abschnitt im Skript: Würfelstatistik

package kapitel13.beispiel04;

public class Wuerfelstatistik {
	public static void main(String[] args) {
		int[] anzahl = new int[7];                  // Index 1 bis 6 wird benutzt, Index 0 bleibt leer
		for (int i = 0; i < 600; i++) {
			int wurf = (int) (Math.random() * 6) + 1;   // Zufallszahl von 1 bis 6
			anzahl[wurf]++;
		}
		for (int augen = 1; augen <= 6; augen++) {
			System.out.println(augen + ": " + anzahl[augen]);
		}
	}
}
