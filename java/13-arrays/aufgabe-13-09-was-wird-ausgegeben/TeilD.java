// Kapitel 13: Java: Arrays und Aufzählungen
// Aufgabe 13.9: Was wird ausgegeben?
// Abschnitt im Skript: d)

public class TeilD {
	public static void main(String[] args) {
		int[] a = {1, 2};
		int[] b = {1, 2};
		int[] c = a;
		System.out.println(a == b);
		System.out.println(a == c);
	}
}
