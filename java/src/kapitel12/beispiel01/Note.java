// Kapitel 12: Java: Kontrollstrukturen
// Beispiel 12.1: Mehrfachauswahl mit else if
// Abschnitt im Skript: Note

package kapitel12.beispiel01;

public class Note {
	public static void main(String[] args) {
		int punkte = 73;
		String note;
		if (punkte >= 90) {
			note = "sehr gut";
		} else if (punkte >= 75) {
			note = "gut";
		} else if (punkte >= 50) {
			note = "bestanden";
		} else {
			note = "nicht bestanden";
		}
		System.out.println(note);       // bestanden
	}
}
