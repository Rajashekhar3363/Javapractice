package Oppsconcepts;

public class PolymorpisumParent22_06_22 {
   //   Overload 
  //    Override
	
	public void Overload1(int a,int b)
	{
		System.out.println("Overlaod method a 4:"+a);
		System.out.println("Overlaod method b 4:"+b);
	}
	
    public void Overload(int a,long b)    // overload method
	{
		System.out.println("Overlaod method a 1:"+a);
		System.out.println("Overlaod method b 1:"+b);
	}
	public void Overload(int b,float a)   // 
	{
		System.out.println("Overlaod method a 2:"+a);
		System.out.println("Overlaod method b 2:"+b);
	}
	public void Overload(double a,int b,int c)   
	{
		System.out.println("Overlaod method a 3:"+a);
		System.out.println("Overlaod method b 3:"+b);
		System.out.println("Overlaod method c 3:"+c);
	}
	public void Overload(double a, String c)
	{
		System.out.println("Overload method a 5:"+a);
		System.out.println("Overload method a 5:"+c);
	}

	public void Ex1(int n)

	{
		int num=0;
	
			for(int i=1;i<=n;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(num+" ");
				num=num+1;
			}
			System.out.println();
		    }
		  
		
			/*for(int i=a;i>=1;i--)
			{
				for(int j=c;j>=1;j--)
				
			    {
				System.out.print(" ");
			     }
			
				for(int k=a;k>=i;k--)
				{
					System.out.print(num+" ");
					num=num-1;
				}*/
				
				
				System.out.println();
			}

	
	
	
	
}
		

	
	
	

