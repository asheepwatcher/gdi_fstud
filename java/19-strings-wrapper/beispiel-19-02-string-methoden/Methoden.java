// Kapitel 19: Strings und Wrapper-Klassen
// Beispiel 19.2: String-Methoden
// Abschnitt im Skript: Methoden

public class Methoden {
	public static void main(String[] args) {
		String s = "Informatik";
		System.out.println(s.length());             // 10
		System.out.println(s.charAt(0));            // I
		System.out.println(s.indexOf("form"));      // 2
		System.out.println(s.substring(2, 6));      // form   (Positionen 2 bis 5)
		System.out.println(s.endsWith("tik"));      // true
		System.out.println(s.replace('i', 'y'));    // Informatyk
		System.out.println(s);                      // Informatik  (s selbst bleibt unverändert)
	}
}
