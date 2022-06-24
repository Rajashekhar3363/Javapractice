package Oppsconcepts;

class calculation
{
	int z;
public void addition(int x,int y)  //method
{
	 z=x+y;
	System.out.println("Addition="+z);
}
public void subtraction(int x,int y)  //method
{
	 z=x-y;
	System.out.println("Subtraction="+z);
}
public void multiplication(int x,int y)  //method
{
	 z=x*y;
	System.out.println("Multiplication="+z);
}
}


public class oprator_arthematic extends calculation 
{
     void division(int x, int y) 
     {
    	 z=x/y;
    	 System.out.println("Division="+z);
     }
	
      public static void main(String[] args) 
	{
    	  int x=50,y=5;
    	  oprator_arthematic op=new oprator_arthematic();
    	      
        op.addition(50, 10);
        op.subtraction(x, y);
        op.multiplication(10, 20);
        op.division(x, y);

	}

}
