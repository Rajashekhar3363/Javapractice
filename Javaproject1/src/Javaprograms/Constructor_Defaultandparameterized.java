package Javaprograms;

public class Constructor_Defaultandparameterized {

	/*String name;
	int rno;
	Constructor_Defaultandparameterized()  // this is Default constractor
	{
		name="RAMANA ";
		rno=100;
		
	}
	Constructor_Defaultandparameterized(int n,String s)
	{
		name=s;
		rno=n;
		
	}
	public static void main(String[] args)
	{
		
		Constructor_Defaultandparameterized cdp=new Constructor_Defaultandparameterized();// this is default object 
		Constructor_Defaultandparameterized cdp1=new Constructor_Defaultandparameterized(150,"Pawana");     
		System.out.println("CDP:"+cdp.name);
		System.out.println(cdp.rno);
		
		System.out.println("CDP1:" +cdp1.name);
		System.out.println(cdp1.rno);*/
		
		
	int a;
	float b;
	char c;
	String d;
	
	Constructor_Defaultandparameterized()     // Default contructor
	{
		a=20;
		b=20.5f;
		c='H';
		d="ABCD";
	}
	
	Constructor_Defaultandparameterized(String z,char y,float x,int w)     // Default contructor
	{
		a=w;
		b=x;
		c=y;
		d=z;
	}

	public static void main(String[] args)  
	{
		
		Constructor_Defaultandparameterized cd=new Constructor_Defaultandparameterized();
		Constructor_Defaultandparameterized cd1=new Constructor_Defaultandparameterized("Balu",'J',25.5f,55);
		System.out.println("Object 1 is cd ");
		System.out.println(cd.a);
		System.out.println(cd.b);
		System.out.println(cd.c);
		System.out.println(cd.d);
		
		System.out.println("Object 2 is cd1 ");
		System.out.println(cd1.a);
		System.out.println(cd1.b);
		System.out.println(cd1.c);
		System.out.println(cd1.d);
	
	}	
	}

	


