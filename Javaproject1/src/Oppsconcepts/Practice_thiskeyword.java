package Oppsconcepts;

public class Practice_thiskeyword {

	
	//1. Using ‘this’ keyword to refer current class instance variables
	/* 1
	 int a;
	int b;
	
	Practice_thiskeyword(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void display()
	{
		System.out.println("b="+b);
		System.out.println("a="+a);
	}
	
	
	public static void main(String[] args) 
	{
		Practice_thiskeyword Pt=new Practice_thiskeyword(20,50);
		//System.out.println(Pt.b);
		//System.out.println(Pt.a);
		Pt.display();
	}
	1*/
	
	
	//2. Using this() to invoke current class constructor
	
	/* 2
	int a;
	int b;
	
	
	Practice_thiskeyword(int a, int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("parameter constractor");
	}
	Practice_thiskeyword()
	{
		this(10 ,20);
		System.out.println("Default constractor");
		
	}
	void display()
	{
		System.out.println(a);
		System.out.println(b);
		
	}
	public static void main(String[] args) 
	{
		Practice_thiskeyword Pt=new Practice_thiskeyword();
		Pt.display();
	}
	2*/
	
	//3. Using ‘this’ keyword to return the current class instance 
	
	/* 3
	    int a;
	    int b;
	 
	    //Default constructor
	    Practice_thiskeyword()
	    {
	        a = 10;
	        b = 20;
	    }
	     
	    //Method that returns current class instance
	    Practice_thiskeyword get()
	    {
	        return this;
	    }
	    void display()
	    {
	    	System.out.println(a);
	    	System.out.println(b);
	    }
	     
	public static void main(String[] args)
	{   
		Practice_thiskeyword Pt = new Practice_thiskeyword();
		Pt.get().display();
		
	}
	
	3 */
	
	//4 Using ‘this’ keyword as method parameter
	
	/*4
	 int a;
	int b;
	//Default constactor
	Practice_thiskeyword()
	{
		a=50 ;
		b=100;
	}
	void display(Practice_thiskeyword obj)
	{
		System.out.println("a="+obj.a+"  "+ "b="+obj.b);
	}
	void get()
	{
		display(this);
	}
	
	public static void main(String[] args)
	{
		Practice_thiskeyword Pt=new Practice_thiskeyword();
		Pt.get();
	}
	4*/
	
	
	//5. Using ‘this’ keyword to invoke current class method
	
	//6. Using ‘this’ keyword as an argument in the constructor call
	
	
	
	
	
	
	
	
	
	
}
