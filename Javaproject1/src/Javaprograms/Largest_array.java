package Javaprograms;

import java.util.Scanner;

public class Largest_array {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int a[]= {56,16,3,0,27};
		int max=0;
		int min=1;
		 System.out.println(" The values of Arrayas are");
		   for(int j=0;j<5;j++)
		   {
			   if(a[j]>max)
			  {
			   max=a[j];
			  }
			   else if(a[j]<min)
			   {
				  min=a[j]; 
			   }  
			   System.out.println(a[j]);
	}  
			   System.out.println("Largest value is: "+max);
			   System.out.println("Largest value is: "+min);
	}	
	}
