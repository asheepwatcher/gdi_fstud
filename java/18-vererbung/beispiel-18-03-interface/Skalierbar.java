// Kapitel 18: Objektorientierung II: Vererbung, Polymorphie, Interfaces
// Beispiel 18.3: Interface

public interface Skalierbar {
	double MAX_FAKTOR = 10;                     // automatisch public static final
	void skaliere(double faktor);               // automatisch public abstract
}
