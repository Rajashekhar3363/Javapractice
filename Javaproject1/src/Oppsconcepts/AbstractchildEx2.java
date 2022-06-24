package Oppsconcepts;

abstract class Bike
{
	abstract void newbikemodel(String s);
}

 class car extends Bike
{
	void newbikemodel(String s)
	{
		System.out.println("the bike model is " + s);
	}
}
 class van extends Bike
{
	void  newbikemodel(String s)
	{
		System.out.println("the bike model is "+s);
	}
}

public class AbstractchildEx2  { 
	 
	public static void main(String[] args) {
		
		Bike b;
		b=new car();
	b.newbikemodel("Pawan");
	b=new van();
	b.newbikemodel("kalyan");
}
}