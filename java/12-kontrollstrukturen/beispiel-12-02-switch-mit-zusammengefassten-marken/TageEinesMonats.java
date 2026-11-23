// Kapitel 12: Java: Kontrollstrukturen
// Beispiel 12.2: switch mit zusammengefassten Marken
// Abschnitt im Skript: Tage eines Monats

public class TageEinesMonats {
	public static void main(String[] args) {
		int monat = 4;
		int tage;
		switch (monat) {
			case 4: case 6: case 9: case 11:
				tage = 30;
				break;
			case 2:
				tage = 28;
				break;
			default:
				tage = 31;
		}
		System.out.println(tage);       // 30
	}
}
