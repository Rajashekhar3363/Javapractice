package Javaprograms;
public class PrintPattern_K 
{
public static void main(String[] args) 
{
 int n=11;
 for(int i=1;i<=n;i++)
{
 for(int j=1;j<=6;j++)
{
  if(j==1||i==7 && j==2||i==5 && j==2||i==8 && j==3||i==4 && j==3||i==9 && j==4||i==3 && j==4||
	      i==10 && j==5||i==11 && j==6||i==2 && j==5||i==1 && j==6)
 {
 System.out.print("A  ");
 }
else
{
	System.out.print("  ");
}
}
 System.out.println();
}
}
}
