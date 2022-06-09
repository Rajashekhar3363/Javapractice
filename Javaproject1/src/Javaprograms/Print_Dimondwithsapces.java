package Javaprograms;

public class Print_Dimondwithsapces {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++)
			{
				if(k==1||k==i)
				System.out.print("* ");
			else
				System.out.print("  ");
			}
			System.out.println();
		}
		
		for(int a=1;a<=n;a++)
		{
			for(int b=1;b<=a;b++)
			{
				System.out.print(" ");
			}
			
			for(int c=n;c>=a;c--)
			{
				if(c==n||c==a)
				System.out.print("* ");
			else
				System.out.print("  ");
			}
			System.out.println();
		}


	}

}
