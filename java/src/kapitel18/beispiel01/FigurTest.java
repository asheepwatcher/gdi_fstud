// Kapitel 18: Objektorientierung II: Vererbung, Polymorphie, Interfaces
// Beispiel 18.1: Abstrakte Klasse, Vererbung und Polymorphie
// Abschnitt im Skript: FigurTest

package kapitel18.beispiel01;

public class FigurTest {
	public static void main(String[] args) {
		Figur[] figuren = { new Rechteck(4, 2.5), new Dreieck(6, 3), new Quadrat(3) };
		for (Figur f : figuren) {
			System.out.println(f);          // welches toString() und getFlaeche() läuft, entscheidet das Objekt
		}
	}
}
