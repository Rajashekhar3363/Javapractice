package Oppsconcepts;

public class Overloading_method {
// overload is nothing but similar method name but different arguments and size of arguments 
	
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
	public static void main(String[] args) {
		

		Overloading_method ovl=new Overloading_method();
		ovl.m1();
		ovl.m1(10f);
		ovl.m1(10);
		ovl.m1(22, 55);
		ovl.m1(50l);
		
	}

}
