// Kapitel 17: Objektorientierung I: Klassen und Objekte
// Aufgabe 17.9: Von Java nach UML

public class Spieler {
	private static int anzahl = 0;
	private String name;
	private int punkte;

	public Spieler(String name) { this.name = name; anzahl++; }
	public String getName() { return name; }
	public int getPunkte() { return punkte; }
	public void addPunkte(int p) { punkte += p; }
	public static int getAnzahl() { return anzahl; }
}
