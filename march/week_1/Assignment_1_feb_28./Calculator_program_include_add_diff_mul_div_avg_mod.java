package Assignment_1_feb_28;

import java.util.Scanner;

public class Calculator_program_include_add_diff_mul_div_avg_mod 
{

		
		public static int add(int a, int b) 
		{
			int sum = a + b;
			return (sum);
		}

		public static int sub(int a, int b) 
		{
			int diff = a - b;
			return (diff);
		}

		public static int multiply(int a, int b) 
		{
			int product = a * b;
			return (product);
		}

		public static int divide(int a, int b) 
		{
			int qoutient = a / b;
			return (qoutient);
		}

		public static int modulo(int a, int b) 
		{
			int modulo = a % b;
			return (modulo);
		}

		public static int avg(int a, int b) 
		{
			int avg = add(a, b) / 2;
			return (avg);
		}

		public static void main(String[] args) 
		{
			Scanner ab = new Scanner(System.in);

			System.out.println("Enter choice 1 Add, 2 Sub, 3 Multiply, 4 Divide 5 Modulo, 6 Avg");
			int choice = ab.nextInt();
			if (choice >= 1 && choice <= 6) 
			{
				System.out.println("Enter num1");
				int num1 = ab.nextInt();
				System.out.println("Enter num2");
				int num2 = ab.nextInt();
				switch (choice) {
				case 1:
					int sum = add(num1, num2);
					System.out.println(sum);
					break;
				case 2:

					int diff = sub(num1, num2);
					System.out.println(diff);
					break;
				case 3:
					int product = multiply(num1, num2);
					System.out.println(product);
					break;

				case 4:
					int quotient = divide(num1, num2);
					System.out.println(quotient);
					break;
				case 5:
					int modulo = modulo(num1, num2);
					System.out.println(modulo);
					break;
				case 6:
					int avg = avg(num1, num2);
					System.out.println(avg);
					break;

				}

			} 
			else 
			{
				System.out.println("Invalid input");
			}
			
			ab.close();

		}

	}

