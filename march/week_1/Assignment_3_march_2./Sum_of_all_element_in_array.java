package Assignment_3_march_2;

import java.util.Scanner;

public class Sum_of_all_element_in_array {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = sc.nextInt();
		int arr[] = new int[n];

		int sum = 0;
		System.out.println("Enter the element");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("Sum of all element in array is : " + sum);

	}

}
