// Kapitel 19: Strings und Wrapper-Klassen
// Beispiel 19.1: Gleich und doch nicht dasselbe
// Abschnitt im Skript: Vergleich

public class Vergleich {
	public static void main(String[] args) {
		String s1 = "Harry Hurtig";
		String s2 = "Harry ";
		s2 += "Hurtig";                         // erzeugt ein neues String-Objekt
		System.out.println(s1 == s2);           // false: zwei verschiedene Objekte
		System.out.println(s1.equals(s2));      // true:  gleicher Inhalt
	}
}
