// Kapitel 19: Strings und Wrapper-Klassen
// Aufgabe 19.2: Vergleichen
// Abschnitt im Skript: Vergleiche

public class Vergleiche {
	public static void main(String[] args) {
		String a = "Hallo";
		String b = new String("Hallo");
		String c = b;
		System.out.println(a == b);
		System.out.println(b == c);
		System.out.println(a.equals(b));
		String d = a.replace('H', 'h');
		System.out.println(a);
		System.out.println(d.equals("hallo"));
	}
}
