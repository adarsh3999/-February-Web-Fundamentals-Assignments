package Assignment_3_march_2;

import java.util.Scanner;

public class Count_of_even_num_in_array {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		int n = sc.nextInt();
		int arr[] = new int[n];

		
		System.out.println("Enter the element");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				count++;

			}

		}
		System.out.println(count);
	}

}
