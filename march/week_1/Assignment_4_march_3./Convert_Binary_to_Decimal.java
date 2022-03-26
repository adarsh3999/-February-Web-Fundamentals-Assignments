package Assignment_4_march_3;

import java.util.Scanner;

public class Convert_Binary_to_Decimal 
{

	public static void main(String[] args) 
	{
		
		Scanner ab = new Scanner(System.in);
		long num = ab.nextLong();

		// call method by passing the binary number
		int decimal = convertBinaryToDecimal(num);

		System.out.println("Binary to Decimal");
		System.out.println(num + " = " + decimal);
		
		
		ab.close();

	}

	public static int convertBinaryToDecimal(long num) 
	{
		int decimalNumber = 0, i = 0;
		long remainder;

		while (num != 0) {
			remainder = num % 10;
			num /= 10;
			decimalNumber += remainder * Math.pow(2, i);
			++i;
		}

		return decimalNumber;
	}

}
