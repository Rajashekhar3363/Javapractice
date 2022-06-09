package Javaprograms;

public class Print_trinagelDiff {

	public static void main(String[] args) 
	{
		int n=1,b=3;
		for(int i=b;i>=1;i--)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=n;k++)
			{
				System.out.print(n);
				
			}
			System.out
			.println();
			n=n+2;
		}

	}

}
