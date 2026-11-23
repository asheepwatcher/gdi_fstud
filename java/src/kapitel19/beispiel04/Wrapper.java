// Kapitel 19: Strings und Wrapper-Klassen
// Beispiel 19.4: Wrapper-Klassen
// Abschnitt im Skript: Wrapper

package kapitel19.beispiel04;

public class Wrapper {
	public static void main(String[] args) {
		Integer obj = 42;                               // Autoboxing
		int i = obj + 1;                                // Autounboxing, i ist 43

		System.out.println("12" + 3);                   // 123  (Textverkettung)
		System.out.println(Integer.parseInt("12") + 3); // 15   (Rechnung)

		Integer a = 1000, b = 1000;
		System.out.println(a == b);                     // false: Vergleich der Referenzen
		System.out.println(a.equals(b));                // true:  Vergleich der Werte
	}
}
