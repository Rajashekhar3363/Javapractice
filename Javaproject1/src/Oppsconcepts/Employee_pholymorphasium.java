package Oppsconcepts;

public class Employee_pholymorphasium {

	String name;
	String id;
    double salary;
    String address;
    String man;
	public Employee_pholymorphasium(String name,String id,double salary,String address)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
		this.address=address;
	}
	
	public void mailcheck()
	{
		System.out.println("check the mail :"+this.name+" "+this.id);
	}
	
	public String tostring()
	{
		return this.name;
	}
	
	
	

	public void display(int x,int y)
	{
		
				int z=x+y;
				System.out.println(z);
	}
	
	public void display(int x,int y,int z)// (polymorphisum overload above method)
	{
		
				int b=x+y+z;
				System.out.println("addition int="+b);
	}
	public void display(double x,int y,int z)// (polymorphisum overload method above method )
	{
		
				double b=x+y+z;
				System.out.println("Addition double="+b);
	}
	

}
