// Kapitel 11: Java: Ausdrücke und Operatoren
// Beispiel 11.5: Logische Operatoren und kurze Auswertung
// Abschnitt im Skript: Logik

public class Logik {
	public static void main(String[] args) {
		int num1 = 2, num2 = 3;
		System.out.println(num1 == 2 && num2 < 8);          // true
		System.out.println(num1 != 2 || !(num2 < 2));       // true
		System.out.println(num1 == 2 ^ num2 > 0);           // false (beide Seiten sind wahr)

		int n = 0;
		System.out.println(n != 0 && 10 / n > 2);           // false, es wird nicht durch 0 geteilt
	}
}
