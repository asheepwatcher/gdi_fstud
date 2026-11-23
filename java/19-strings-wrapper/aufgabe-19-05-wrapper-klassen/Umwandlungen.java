// Kapitel 19: Strings und Wrapper-Klassen
// Aufgabe 19.5: Wrapper-Klassen
// Abschnitt im Skript: Umwandlungen

public class Umwandlungen {
	public static void main(String[] args) {
		String s = "5";
		int n = 5;
		Integer w = 5;
		System.out.println(s + n);
		System.out.println(Integer.parseInt(s) + n);
		System.out.println(w == n);
		System.out.println(w.equals(n));
		System.out.println(Integer.toString(n) + n);
	}
}
