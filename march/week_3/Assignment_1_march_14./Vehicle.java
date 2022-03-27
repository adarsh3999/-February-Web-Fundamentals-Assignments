package Assignment_1_march_14;

class Vehicles 
{
	int tyres = 2;
	int horn;
	int model = 5;
	int chasisNo;

	Vehicles() 
	{

		System.out.println("I have " + tyres + "tyres");
		System.out.println("Model number is  " + model);
	}

	Vehicles(int tyres, int model) 
	{
		this.tyres = tyres;
		this.model = model;

		System.out.println("I have " + tyres + "tyres");
		System.out.println("Model number is " + model);
	}

	public int getChasisNo() 
	
	{
		return chasisNo;
	}

	public void setChasisNo(final int chasisNo) 
	{
		this.chasisNo = chasisNo;
		System.out.println("Chasis No is "+chasisNo);
	}

	public void speed() 
	{
		System.out.println("I am fast...");
	}

	public static void break1() 
	{
		System.out.println("I have break");
	}

	public static void passenger() 
	{
		System.out.println("I can carry passenger");
	}
}

public class Vehicle
{
	public static void main(String args[]) 
	{
		Vehicles bike = new Vehicles();
		bike.setChasisNo(123);
		bike.speed();
		Vehicles car = new Vehicles(4, 55);
		car.setChasisNo(567);
		Vehicles truck = new Vehicles(6, 555);
		truck.setChasisNo(987);
		

	}

}
