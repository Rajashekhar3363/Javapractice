package Oppsconcepts;

public class Overrideonchildclass extends Overridingparentclass
{
	// This is the child class of overring the method of parents class with extends keyword then excute main method by creating object class.
	
	void m1(int x)//override the method of parent class
	{
		System.out.println("this is child class Override of parent class"+x);
	}
	void m1(long x)//override the method of parent class
	{
		System.out.println("this is Override of parent class The Long value is "+x);
	}
	void m1(String name)  // method child class
	{
		System.out.println("String name is :"+name);
	}

	public static void main(String[] args) {
		Overrideonchildclass ov=new Overrideonchildclass();
		ov.m1(10);
		ov.m1(20l);
		ov.m1(50, 20);
		ov.m1(30, 40f);
		ov.m1("pawan kalayan");

	}

}
