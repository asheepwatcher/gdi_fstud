// Kapitel 3: Rechnen mit Dualzahlen und Zweierkomplement
// Beispiel 3.4: Überlauf
// Abschnitt im Skript: Überlauf in Java

package kapitel03.beispiel04;

public class UeberlaufInJava {
	public static void main(String[] args) {
		int s = 1200000000 + 1500000000 + 1000000000;
		System.out.println(s);      // -594967296 statt 3700000000
	}
}
