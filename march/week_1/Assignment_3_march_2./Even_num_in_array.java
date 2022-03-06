package Assignment_3_march_2;

import java.util.Scanner;

public class Even_num_in_array {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the element");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println("Even num in an array is : " + arr[i]);
			}

		}

	}

}
