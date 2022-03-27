package Assignment_2_march_15;

class Employees 
{
	int id;
	String name;
	String department;
	String worklocation = "Pune";

	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getname() 
	{
		return name;
	}

	public void setname(String name) 
	{
		this.name = name;
	}

	public String getdepartment() 
	{
		return department;
	}

	public void setdepartment(String department) 
	{
		this.department = department;
	}

	public String getworklocation() 
	{
		return worklocation;
	}

}

public class Employee 
{
	
	public static void main(String args[]) 
	{
		Employees E1 = new Employees();
		E1.setId(1818);
		E1.setname("Yash Mahalle");
		E1.setdepartment("Training");
		System.out.println(E1.getId());
		System.out.println(E1.getname());
		System.out.println(E1.getdepartment());
		System.out.println(E1.getworklocation());

	}

}
