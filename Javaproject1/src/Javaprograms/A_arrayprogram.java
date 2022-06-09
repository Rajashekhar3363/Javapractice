package Javaprograms;

import java.util.Scanner;

public class A_arrayprogram {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array size:");
		int size=sc.nextInt();
		int a[]=new int[size];
		int b,c;
		System.out.println("Enter the Array values:");
		
		for(int i=0;i<size;i++) // this for loop for saving the 
		{
			b=sc.nextInt();
			a[i]=b;
				
		}
		/*System.out.println("Enter the Required Index are:");
		int id=sc.nextInt();
		System.out.println(a[id]);*/
		
		
		int max=a[0];
		int min=a[0];
		
		for(int i=0;i<size;i++)
		{
			if(a[i]>max)
			{
				
				a[i]=max;
			}
			else if(a[i]<=min)
			{
				
				a[i]=min;
			}
			
		}
		System.out.println("Max_1"+max);
		
		System.out.println("Min_1"+min);
	
	}

}
