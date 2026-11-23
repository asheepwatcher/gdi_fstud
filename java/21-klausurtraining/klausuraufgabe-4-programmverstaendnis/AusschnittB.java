// Kapitel 21: Klausurtraining
// Übungsklausur, Aufgabe 4: Programmverständnis
// Abschnitt im Skript: Ausschnitt b)

public class AusschnittB {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3 };
		int[] b = a;
		int[] c = { 1, 2, 3 };
		b[0] = c[2]++;
		a[1] += b[0];
		System.out.println(a[0] + " " + a[1] + " " + c[2] + " " + (a == b) + " " + (a == c));
	}
}
