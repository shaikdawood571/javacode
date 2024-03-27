package com.kn.Strings;

import java.util.Scanner;

public class Char {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Take the user String input
		System.out.println("Enter the String to count get character occurences = ");
		String str = scan.next();

		// Create count Array
		int[] count = new int[256];

		// Create Array of Character
		char[] ch = new char[str.length()];

		// for loop for count characters
		for (int i = 0; i < str.length(); i++) {
			count[str.charAt(i)]++;
		}

		// Nested for loop count similar characters
		for (int i = 0; i < str.length(); i++) {
			int find = 0;
			ch[i] = str.charAt(i);
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == ch[j]) {
					find++;
				}
			}
			// If condition to print character
			if (find == 1) {
				System.out.println(str.charAt(i) + " : " + count[str.charAt(i)]);
			}
		}

		// Close the Scanner
		scan.close();
	}

}
