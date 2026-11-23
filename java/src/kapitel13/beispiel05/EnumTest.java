// Kapitel 13: Java: Arrays und Aufzählungen
// Beispiel 13.5: Aufzählungstyp mit switch

package kapitel13.beispiel05;

public class EnumTest {
	enum AmpelFarbe { ROT, GELB, GRUEN }

	public static void main(String[] args) {
		AmpelFarbe ampel = AmpelFarbe.GELB;
		switch (ampel) {
			case ROT:   System.out.println("Stehen bleiben"); break;
			case GELB:  System.out.println("Achtung"); break;
			case GRUEN: System.out.println("Gehen"); break;
		}
	}
}
