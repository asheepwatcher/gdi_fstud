// Kapitel 15: Rekursion
// Aufgabe 15.4: Palindrome
// Abschnitt im Skript: Signaturen und Aufruf

package kapitel15.aufgabe04;

public class SignaturenUndAufruf {
	public static boolean isPalindrom(char[] array) {
		throw new UnsupportedOperationException("noch nicht implementiert");
	}

	public static boolean isPalindromRek(char[] array, int anfang, int ende) {
		throw new UnsupportedOperationException("noch nicht implementiert");
	}

	public static void umdrehen(char[] array, int anfang, int ende) {
		throw new UnsupportedOperationException("noch nicht implementiert");
	}


	public static void main(String[] args) {
		String wort = "anna";
		char[] array = wort.toCharArray();       // String in ein char-Array umwandeln
		System.out.println(wort + ": " + isPalindrom(array));
		System.out.println(wort + ": " + isPalindromRek(array, 0, array.length - 1));
	}
}
