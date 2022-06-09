package Javaprograms;

import java.util.Scanner;

public class S_Array {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enthe the size : ");
		int num=sc.nextInt();
		int a[]=new int[num];
		System.out.println("Enter the values");
		
		for(int i=0;i<num;i++)
		{
			int b=sc.nextInt();
			a[i]=b;
		}
		for(int i=0;i<num;i++)
		{
			System.out.println("Array values "+"("+i +") : "+a[i]);
		}
	}
}

