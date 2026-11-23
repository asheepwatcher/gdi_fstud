// Kapitel 19: Strings und Wrapper-Klassen
// Aufgabe 19.8: Gleich oder nicht?
// Abschnitt im Skript: Vergleiche

package kapitel19.aufgabe08;

public class Vergleiche {
	public static void main(String[] args) {
		String a = "Java";
		String b = "Ja";
		String c = b + "va";
		String d = a;
		System.out.println(a == c);
		System.out.println(a.equals(c));
		System.out.println(a == d);
		System.out.println(a.equals("java"));
	}
}
