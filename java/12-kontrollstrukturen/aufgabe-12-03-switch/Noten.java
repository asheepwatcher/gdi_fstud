// Kapitel 12: Java: Kontrollstrukturen
// Aufgabe 12.3: switch
// Abschnitt im Skript: Noten

public class Noten {
	public static void main(String[] args) {
		int note = 2;
		switch (note) {
			case 1: System.out.println("sehr gut");
			case 2: System.out.println("gut");
			case 3: System.out.println("befriedigend");
				break;
			case 4: System.out.println("ausreichend");
			default: System.out.println("nicht bestanden");
		}
	}
}
