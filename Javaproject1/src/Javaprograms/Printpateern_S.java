package Javaprograms;

public class Printpateern_S {

public static void main(String[] args) 
{
 int n=5;
 for(int i=1;i<=n;i++)
{
 for(int j=1;j<=n;j++)
 {
	if(i==1||i==5||i==3||i==2&&j==1||i==4 && j==5)
	{
  System.out.print("5 ");
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
