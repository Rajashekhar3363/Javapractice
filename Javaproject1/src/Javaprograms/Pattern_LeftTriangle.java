package Javaprograms;

public class Pattern_LeftTriangle {

	public static void main(String[] args) {
		int n=10;
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(" ");
				
			}
			for(int k=1;k<=i;k++) 
			{
				System.out.print("A");
			}
			System.out.println();
		}
		for(int a=1;a<=n;a++)
		{
			for(int b=1;b<=a;b++)
			{
				System.out.print(" ");
				
			}
			for(int c=n;c>=a;c--) {
				System.out.print("A");
			}
			System.out.println();
		}
	}
}
