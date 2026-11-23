// Kapitel 12: Java: Kontrollstrukturen
// Beispiel 12.3: Dieselbe Aufgabe mit drei Schleifen
// Abschnitt im Skript: for

public class For {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}

		// Ausgabe zur Kontrolle (steht nicht im Skript)
		System.out.println("sum = " + sum);
	}
}
