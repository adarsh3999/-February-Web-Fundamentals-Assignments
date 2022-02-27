package assignment_3_feb_23;

import java.util.Scanner;

public class Different_cources_years_and_branch {

	public static void main(String[] args) {
		Scanner ab = new Scanner (System.in);
		
		System.out.print("Enter year : ");
		int year = ab.nextInt();
		
		
		
		switch(year)
		{
			case 1:
				System.out.println("All subjects are same");
				break;
			case 2:
			case 3:
			case 4:
				
				System.out.print("Enter the branch : ");
				String branch = ab.next();
				
				switch(branch)
				{
					case "IT":
					case "CSE":
						System.out.println("you have opted for computer branch");
						System.out.println("and you have most of computer related subjects");
						break;
						
					case "ECE":
					case "EE":
						System.out.println("you have opted for electrical branch");
						System.out.println("and you have most of electronics related subjects");
						break;
						
					case "Mech":
						System.out.println("you have opted for mechanical branch");
						System.out.println("and you have most of mechanical related subjects");
						break;
					default :
						System.out.println("Invalid branch input");
						break;
				}
		
		
			break;
			
			default:
				System.out.println("Invalid year input");
			}
		ab.close();

	}

}
