// Kapitel 21: Klausurtraining
// Übungsklausur, Aufgabe 4: Programmverständnis
// Abschnitt im Skript: Ausschnitt d)

package kapitel21.klausuraufgabe4;

public class AusschnittD {
	public static int f(int n) {
		return (n < 3) ? n : f(n - 1) + f(n - 3);
	}

	public static void main(String[] args) {
		System.out.println(f(6));
	}
}
