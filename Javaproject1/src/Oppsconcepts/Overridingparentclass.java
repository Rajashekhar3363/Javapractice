package Oppsconcepts;
lkpackage Arrayspractics;

public class Overridingparentclass 
{
// this is the overriding parent class 
	void m1()// no arguments method
	{
		System.out.println("No arguments method");
	}
	void m1(int x)//
	{
		System.out.println("single argument that is int type method x="+x);
	}
	void m1(int x,int y)// overridng the method
	{
		System.out.println("2 arguments and similar type x:"+x+", y:"+y);
	}
	void m1(int y,float x)
	{
		System.out.println("2 arguments and diffrent datatypes used:x,y"+x+","+y);
	}
	
	
	void m1(float x)
	{
		System.out.println("The flot value is "+x);
	}
	
	void m1(long x)
	{
		System.out.println("The Long value is "+x);
	}
	

}
