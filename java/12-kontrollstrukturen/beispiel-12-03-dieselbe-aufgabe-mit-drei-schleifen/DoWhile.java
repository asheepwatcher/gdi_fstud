// Kapitel 12: Java: Kontrollstrukturen
// Beispiel 12.3: Dieselbe Aufgabe mit drei Schleifen
// Abschnitt im Skript: do-while

public class DoWhile {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		do {
			sum += i;
			i++;
		} while (i <= 100);

		// Ausgabe zur Kontrolle (steht nicht im Skript)
		System.out.println("sum = " + sum + ", i = " + i);
	}
}
