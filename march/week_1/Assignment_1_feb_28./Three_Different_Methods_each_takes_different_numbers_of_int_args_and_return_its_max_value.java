package Assignment_1_feb_28;

import java.util.Scanner;

public class Three_Different_Methods_each_takes_different_numbers_of_int_args_and_return_its_max_value {
	public static int firstMethod(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public static int secondMethod(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public static int thirdMethod(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);

		System.out.println("Enter values for first method");

		System.out.println("Enter value for num1 : ");
		int num1 = ab.nextInt();

		System.out.println("Enter value for num2 : ");
		int num2 = ab.nextInt();

		int max_1 = firstMethod(num1, num2);
		System.out.println("max number in first method : " + max_1);

		System.out.println("Enter values for second method");

		System.out.println("Enter value for num3 : ");
		int num3 = ab.nextInt();

		System.out.println("Enter value for num4 : ");
		int num4 = ab.nextInt();

		int max_2 = secondMethod(num3, num4);
		System.out.println("max number in second method : " + max_2);

		System.out.println("Enter values for third method");

		System.out.println("Enter value for num5 : ");
		int num5 = ab.nextInt();

		System.out.println("Enter value for num6 : ");
		int num6 = ab.nextInt();

		int max_3 = thirdMethod(num5, num6);
		System.out.println("max number in third method : " + max_3);

		ab.close();

	}

}
