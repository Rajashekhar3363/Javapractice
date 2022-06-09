package Javaprograms;

public class Pattern_Sandglasstriangle
{
 public static void main(String[] args) {
 int n=10;
 for(int i=1;i<=n;i++)
{
 for(int j=1;j<=i;j++)
{
 System.out.print(" ");
}
 for(int k=n;k>=i;k--)
{
 if(k==n||k==i||i==1)
{
 System.out.print("* ");
}
 else if(k==n-1||k==i+1||i==2)
{
 System.out.print("1 ");
}
 else if(k==n-2||k==i+2||i==3)
{
 System.out.print("@ ");
}
 else
{
 System.out.print("R ");
}
}
 System.out.println();
}
		
 for(int a=1;a<=n;a++) 
{
 for(int b=n;b>=a;b--)
{
 System.out.print(" ");
}
 for(int c=1;c<=a;c++)
{
 if(c==1||c==a||a==10)
{
 System.out.print("* ");
}
 else if(c==2||c==a-1||a==9) 
{
 System.out.print("1 ");
}
 else if(c==3||c==a-2||a==8)
{
 System.out.print("@ ");	
}
 else
{
 System.out.print("R ");	
}
}
 System.out.println();
}
}
}
