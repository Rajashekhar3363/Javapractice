package Test_coachit;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayListFindBymultiplyby3 
{
	public static void main(String[] args) 
	{
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enthe Elimnts Size:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the Elements ");
		for(int i=0;i<n;i++)
		{
		    a[i]=sc.nextInt();	
		}*/
		int a[]= {1,2,3,4,6,7,8,9};
             for(int i=1;i<=a.length;i++)
             {
            	 if(i%3==0)
            	 {
            		 System.out.print(a[i]);
            	 }
             }
}

}
