// Kapitel 4: Dualzahlen mit Nachkommastellen und Gleitkommazahlen
// Beispiel 4.3: Eine Zahl, die nicht aufgeht
// Abschnitt im Skript: Rundungsfehler

public class Rundungsfehler {
	public static void main(String[] args) {
		double d = 0.1 + 0.2;
		System.out.println(d);                            // 0.30000000000000004
		System.out.println(d == 0.3);                     // false
		System.out.println(Math.abs(d - 0.3) < 1e-9);     // true: Vergleich mit Toleranz
	}
}
