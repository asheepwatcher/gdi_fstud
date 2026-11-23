// Kapitel 10: Java: Variablen, Datentypen, Ein- und Ausgabe
// Beispiel 10.1: Ein vollständiges Programm mit Ein- und Ausgabe

package kapitel10.beispiel01;

import java.util.Scanner;

public class Temperatur {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Temperatur in Grad Celsius eingeben:");
		int celsius = sc.nextInt();                    // ganze Zahl einlesen
		double fahrenheit = celsius * 9 / 5.0 + 32;
		fahrenheit = Math.round(fahrenheit * 10) / 10.0;   // auf eine Stelle runden
		System.out.println(celsius + " Grad Celsius = " + fahrenheit + " Grad Fahrenheit");
		sc.close();
	}
}
