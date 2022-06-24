package Oppsconcepts;


public class InheritanceParent21_06_22 
{
	public void ex1(int n)
	{
		
	  for (int i=1;i<=n;i++)
	  {
		for(int j=1;j<=i;j++)
		{
			System.out.print("* ");
				
			}
		System.out.println();
		    }
		
		  }
	

	public void ex2(int n)
	{
		
	  for (int i=1;i<=n;i++)
	  {
		for(int j=1;j<=i;j++)
		{
			System.out.print("A ");
				
			}
		System.out.println();
		    }
		
		  }

	public void ex3(int n)
	{
	 for(int i=1;i<=n;i++)
	 {
	  for(int j=n;j>=i;j--)
	  {
				System.out.print(" ");
	   }
	  
	  for(int k=1;k<=i;k++)
	  {
		  System.out.print(k+" ");
	  }
	  System.out.println();
	}
}

	public void ex4(int a,int b,double c)

	{
	 System.out.println("Arithametic operation");
	 
	 if(a>=b)
	 {
		 if(a>=c)
		 {
			 System.out.println("A value is greater value :"+a);
		 }
		 else
		 {
			 System.out.println("c value is greater value:"+c);
		 }
	 }
	 else
	 {
		 if(b>=c)
		 {
			 System.out.println("B value is the greater value :"+b);
		 }
		 else 
		 {
			 System.out.println("c value is greater value :"+c);
		 }
	 }
	 
	 
	}
	
	public void ex5()
	{
		int arr[]= {50,40,50,80,70};
		for(int i=0;i<arr.length;i++)
		{	
			System.out.println("the index of arr"+"["+i+"]"+arr[i]);
		}
				
	}

}
