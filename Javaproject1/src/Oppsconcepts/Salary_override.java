package Oppsconcepts;

public class Salary_override extends Employee_pholymorphasium
{


	public Salary_override(String name, String id, double salary, String address) {
		super(name, id, salary, address);
		// TODO Auto-generated constructor stub
	}


	public void mailcheck()
	{
		System.out.println("mail check override is doneon this method ");// overrideing the method in this class
		System.out.println("check the mail :"+this.name+" "+this.id);
	}
	
	
	public static void main(String[] args)
	{
		Salary_override so=new Salary_override("harish","150",15000,"Hanamkonda");
		
		   so.display(10, 10);
	      so.display(10, 20, 30);
	       so.display(20, 10, 100);
	      so.mailcheck();    
	   
	}

}
