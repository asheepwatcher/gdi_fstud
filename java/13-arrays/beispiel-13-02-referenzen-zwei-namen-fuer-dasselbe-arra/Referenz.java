// Kapitel 13: Java: Arrays und Aufzählungen
// Beispiel 13.2: Referenzen: zwei Namen für dasselbe Array
// Abschnitt im Skript: Referenz

public class Referenz {
	public static void main(String[] args) {
		int[] a = {1, 2, 3};
		int[] b = a;          // kopiert nur die Referenz
		b[0] = 99;
		System.out.println(a[0]);     // 99
	}
}
