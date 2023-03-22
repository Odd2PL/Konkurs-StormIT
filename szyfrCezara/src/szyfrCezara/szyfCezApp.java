package szyfrCezara;

import java.util.*;

public class szyfCezApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Scanner key = new Scanner(System.in);

		System.out.println("Podaj tekst do zaszyfrowania");
		String textJawny = input.nextLine(); // pobranie tekstu do zaszyfrowania
		int dim = textJawny.length(); // utworzenie zmiennej długości tekstu
		char[] litery = textJawny.toCharArray(); // przerzucenie inputu do tabeli znaków
		System.out.println("Podaj klucz (liczbę) którym chcesz zaszyfrować tekst.");

		int klucz = key.nextInt();

		char[] zaszyfrowane = new char[dim];
		int szyfr;
		for (int i = 0; i < dim; i++) {
			int kodASCII = litery[i]; // zamiana znaku na jego kod ASCII

			if (kodASCII >= 97 && kodASCII <= 122) { // warunek dzięki któremu kodowane będą tylko litery od a do z
				szyfr = kodASCII + klucz; // implementacja szyfr Cezara
				if (szyfr > 122) { // warunek zapętlający zakres znaków, żeby np. z zmieniło się na m
					int diff = szyfr - 123;
					szyfr = 97 + diff;
				}
				zaszyfrowane[i] = (char) szyfr; // przypisanie kodu ASCII do znaku
				System.out.print(zaszyfrowane[i]); // Wyświetlenie wyniku
			}

			else if (kodASCII >= 65 && kodASCII <= 90) { // warunek dla znaków od A do Z
				szyfr = kodASCII + klucz; // szyrf Cezara
				if (szyfr > 90) { // zapętlenie zakresu znaków
					int diff = szyfr - 91;
					szyfr = 65 + diff;
				}
				zaszyfrowane[i] = (char) szyfr; // zamiana na znaki
				System.out.print(zaszyfrowane[i]); // wyświetlenie
			} else {
				System.out.print(litery[i]); // wyświetlenie znaków nie będących literami od A do Z i od a do z
			}

		}

	}
}