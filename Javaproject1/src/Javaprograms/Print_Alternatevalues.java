package Javaprograms;

public class Print_Alternatevalues {

	public static void main(String[] args) {
		
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
		for(int k=5;k>=i;k--)
		{   if(k==4) {
			System.out.print("1");
		}
		else if(k==2) {
			System.out.print("2");
		}
		else
		{
			System.out.print("*");
		}
		}
		System.out.println();
	}
}
}