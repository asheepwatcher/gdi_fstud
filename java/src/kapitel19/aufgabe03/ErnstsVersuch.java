// Kapitel 19: Strings und Wrapper-Klassen
// Aufgabe 19.3: Unveränderlich
// Abschnitt im Skript: Ernsts Versuch

package kapitel19.aufgabe03;

public class ErnstsVersuch {
	public static void main(String[] args) {
		String text = "Grundlagen der Informatik";
		text.replace(' ', '_');
		System.out.println(text);
	}
}
