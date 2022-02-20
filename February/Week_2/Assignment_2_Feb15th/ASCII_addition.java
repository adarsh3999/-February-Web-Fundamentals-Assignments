package assignment2_Feb15;

import java.util.Scanner;

public class ASCII_addition {

	public static void main(String[] args) {

		Scanner ab = new Scanner(System.in);

		char chr1 = ab.next().charAt(0);
		char chr2 = ab.next().charAt(0);
		char chr3 = ab.next().charAt(0);

		int add = chr1 + chr2 + chr3;

		System.out.println(add);

		System.out.println("The ascii value of " +add +" is " + (char) add );

		ab.close();

	}

}
