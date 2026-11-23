// Kapitel 5: Codierung von Texten
// Beispiel 5.1: Rechnen im ASCII-Code
// Abschnitt im Skript: Rechnen mit Zeichen

public class RechnenMitZeichen {
	public static void main(String[] args) {
		char gross = 'E';
		char klein = (char) (gross + 32);     // 'e'
		int wert = '7' - '0';                 // 7

		// Ausgabe zur Kontrolle (steht nicht im Skript)
		System.out.println("gross = " + gross + ", klein = " + klein + ", wert = " + wert);
	}
}
