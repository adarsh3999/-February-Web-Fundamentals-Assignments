package assignment_2_feb_22;

import java.util.Scanner;

public class Do_while_loop_to_calculate_factorial {

	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		
		System.out.println("Enter number : ");
		int num = ab.nextInt();
		
		int fact = 1;
		int i = num;
		while (i >= 1 ) {
			fact = fact * i;
			i--;
		}
		System.out.println(fact);
		
	}

}
