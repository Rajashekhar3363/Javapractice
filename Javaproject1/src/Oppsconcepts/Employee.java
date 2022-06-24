package Oppsconcepts;
public class Employee
{
	String name;
	int id;
	
	Bike1 bike;
	
	Employee(String name,int id,Bike1 b)
	{
		this.name=name;
		this.id=id;
		
		this.bike=b;
	}
public static void main(String[] args)
{
		
		Bike1 b=new Bike1("Enfield","S45877g55",350,300000);
		Employee e=new Employee("Sundar",14562,b);
		
	    System.out.println("Employee Details");
		System.out.println("Empoyee name:"+e.name);
		System.out.println(e.id);
		System.out.println("Car related Details");
		
		System.out.println("Bike related Details");
		System.out.println(e.bike.name);
		System.out.println(e.bike.eno);
		System.out.println(e.bike.cost);
		System.out.println(e.bike.cc);		
 }

}
