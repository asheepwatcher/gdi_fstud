// Kapitel 21: Klausurtraining
// Übungsklausur, Aufgabe 6: Rekursion
// Abschnitt im Skript: tuWas

public class TuWas {
	private static int tuWas(int a, int b) {
		if (b == 0)
			return 1;
		return a * tuWas(a, b - 1);
	}

	public static void main(String[] args) {
		System.out.println(tuWas(3, 4));
		System.out.println(tuWas(5, 0));
	}
}
