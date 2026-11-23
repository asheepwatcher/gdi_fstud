// Kapitel 12: Java: Kontrollstrukturen
// Beispiel 12.3: Dieselbe Aufgabe mit drei Schleifen
// Abschnitt im Skript: while

package kapitel12.beispiel03;

public class While {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while (i <= 100) {
			sum += i;
			i++;
		}

		// Ausgabe zur Kontrolle (steht nicht im Skript)
		System.out.println("sum = " + sum + ", i = " + i);
	}
}
