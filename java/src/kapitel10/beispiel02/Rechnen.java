// Kapitel 10: Java: Variablen, Datentypen, Ein- und Ausgabe
// Beispiel 10.2: Ganzzahldivision, Rest und Textverkettung
// Abschnitt im Skript: Rechnen

package kapitel10.beispiel02;

public class Rechnen {
	public static void main(String[] args) {
		int a = 9, b = 4;
		System.out.println(a / b);              // 2      (ganzzahlige Division)
		System.out.println(a % b);              // 1      (Rest der Division)
		System.out.println((double) a / b);     // 2.25   (a wird zuerst umgewandelt)
		System.out.println("Erg: " + a + b);    // Erg: 94   (von links: erst Text + 9, dann + 4)
		System.out.println("Erg: " + (a + b));  // Erg: 13
		System.out.println(a + b + " Erg");     // 13 Erg    (von links: erst 9 + 4)
	}
}
