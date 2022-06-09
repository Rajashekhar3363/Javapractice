package Javaprograms;

public class Pattern_ABC {

public static void main(String[] args) {
		
 int alphabt=65, n=5;		
 for(int i=1;i<=n;i++)
{
 for(int j=0;j<i;j++)
 {
	 int b=alphabt+j;
	 System.out.print((char)b+" ");	 
 }
 System.out.println();		 	
}
}
}
