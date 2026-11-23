// Kapitel 14: Java: Methoden
// Beispiel 14.2: Call-by-value

package kapitel14.beispiel02;

public class ParamTest {
	static void aendere(int n) {
		n = 4711;                   // ändert nur die Kopie
	}

	static void aendere(int[] f) {  // überladen: gleicher Name, anderer Parametertyp
		f[0] = 4711;                // ändert das Array, auf das die kopierte Referenz zeigt
	}

	public static void main(String[] args) {
		int zahl = 10;
		int[] feld = {10, 20};
		aendere(zahl);
		aendere(feld);
		System.out.println(zahl);       // 10
		System.out.println(feld[0]);    // 4711
	}
}
