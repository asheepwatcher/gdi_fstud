// Kapitel 11: Java: Ausdrücke und Operatoren
// Aufgabe 11.5: Bedingungsoperator
// Abschnitt im Skript: Verzweigung

public class Verzweigung {
	public static void main(String[] args) {
		int punkte = 73;
		String ergebnis;

		if (punkte >= 50) {
			ergebnis = "bestanden";
		} else {
			ergebnis = "nicht bestanden";
		}
		System.out.println(ergebnis);
	}
}
