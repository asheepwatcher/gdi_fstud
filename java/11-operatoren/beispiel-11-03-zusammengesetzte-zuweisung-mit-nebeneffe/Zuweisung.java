// Kapitel 11: Java: Ausdrücke und Operatoren
// Beispiel 11.3: Zusammengesetzte Zuweisung mit Nebeneffekt
// Abschnitt im Skript: Zuweisung

public class Zuweisung {
	public static void main(String[] args) {
		int x = 4;
		x += x++;        // 4 + 4 = 8.   Die Erhöhung auf 5 wird von der Zuweisung überschrieben.

		int y = 3;
		y *= ++y;        // 3 * 4 = 12.  Links zählt der alte Wert 3, rechts der neue Wert 4.

		// Ausgabe zur Kontrolle (steht nicht im Skript)
		System.out.println("x = " + x + ", y = " + y);
	}
}
