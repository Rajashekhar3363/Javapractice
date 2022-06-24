package Oppsconcepts;

public class Polymorpisumchild22_06_22 extends PolymorpisumParent22_06_22
{
	public void Overload(int a, int b)
	{
		System.out.println("This is the the override method 4 :"+a);
		System.out.println("This is the the override method 4 :"+b);
	}
	public static void main(String[] args) 
	{
		Polymorpisumchild22_06_22 p=new Polymorpisumchild22_06_22();
		p.Overload(20, 50);
		p.Overload(40, 55.5f);
		p.Overload(550, 500, 600);
		p.Overload(55, 70); 
		p.Overload(50,"RAM");
		p.Ex1(3, 3, 3);
		
	}

}
