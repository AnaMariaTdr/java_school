package palindrom;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner scr = new Scanner(System.in);
		System.out.println("Please insert a number to be checked : ..... ");

		int x = scr.nextInt();

		int checkIfPalindrom = 0;

		int x2 = x;

		while (x > 0) {

			checkIfPalindrom = (checkIfPalindrom * 10) + x % 10;

			x = x / 10;

		}

		if (checkIfPalindrom == x2) {

			System.out.println("Numbered entered is palindrom ");
		} else {
			System.out.println("Numbered entered is not a palindrom ");
		}

		scr.close();

	}
}
