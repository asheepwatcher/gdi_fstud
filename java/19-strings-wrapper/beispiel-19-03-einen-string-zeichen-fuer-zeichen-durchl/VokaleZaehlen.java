// Kapitel 19: Strings und Wrapper-Klassen
// Beispiel 19.3: Einen String Zeichen für Zeichen durchlaufen
// Abschnitt im Skript: Vokale zählen

public class VokaleZaehlen {
	static int zaehleVokale(String s) {
		int anzahl = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				anzahl++;
			}
		}
		return anzahl;
	}

	public static void main(String[] args) {
		System.out.println(zaehleVokale("informatik"));
	}
}
