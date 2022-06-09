package Javaprograms;

public class Print_H {
public static void main(String[] args)
{
 int n=11;
 for(int i=0;i<n;i++)
{
 for(int j=1;j<=n;j++)
{
 if(i==5||j==1||j==11) 
{
 System.out.print("A ");
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
