// Kapitel 18: Objektorientierung II: Vererbung, Polymorphie, Interfaces
// Beispiel 18.2: Typprüfung und Cast
// Abschnitt im Skript: Casts

public class Casts {
	public static void main(String[] args) {
		Figur f = new Quadrat(3);                       // Up-Cast, implizit
		System.out.println(f instanceof Rechteck);      // true: ein Quadrat ist auch ein Rechteck
		System.out.println(f instanceof Dreieck);       // false
		Rechteck r = (Rechteck) f;                      // Down-Cast, explizit
		// Rechteck r2 = f;                             // Fehler beim Übersetzen: Cast fehlt
		// Dreieck d = (Dreieck) f;                     // Fehler zur Laufzeit: ClassCastException
	}
}
