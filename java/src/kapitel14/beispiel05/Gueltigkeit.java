// Kapitel 14: Java: Methoden
// Beispiel 14.5: Gültigkeit von Variablen

package kapitel14.beispiel05;

public class Gueltigkeit {
	static int zaehler = 0;                 // "global": in allen Methoden sichtbar

	static void zaehle() {
		int j = 10;                         // lokal: existiert nur während des Aufrufs
		zaehler++;
		System.out.println("j=" + j);
	}

	public static void main(String[] args) {
		int j = 20;                         // eine andere Variable als das j in zaehle()
		zaehle();                           // j=10
		zaehle();                           // j=10
		System.out.println("j=" + j + " zaehler=" + zaehler);       // j=20 zaehler=2
	}
}
