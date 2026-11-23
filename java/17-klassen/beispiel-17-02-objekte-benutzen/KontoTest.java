// Kapitel 17: Objektorientierung I: Klassen und Objekte
// Beispiel 17.2: Objekte benutzen
// Abschnitt im Skript: KontoTest

public class KontoTest {
	public static void main(String[] args) {
		Konto k1 = new Konto(500);
		Konto k2 = new Konto();
		Konto k3 = k1;                      // k3 zeigt auf dasselbe Objekt wie k1

		k3.einzahlen(100);
		k2.auszahlen(50);                   // nicht gedeckt, es passiert nichts

		System.out.println(k1);             // Konto 10000: 600.0
		System.out.println(k2);             // Konto 10001: 0.0
		System.out.println(k1 == k3);       // true  (dieselbe Referenz)
		System.out.println(k1 == k2);       // false
	}
}
