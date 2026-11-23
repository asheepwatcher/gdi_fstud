// Kapitel 12: Java: Kontrollstrukturen
// Beispiel 12.4: Schreibtischtest einer Schleife
// Abschnitt im Skript: ggT

public class GgT {
	public static void main(String[] args) {
		int a = 48, b = 18;
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		System.out.println("ggT = " + a);
	}
}
