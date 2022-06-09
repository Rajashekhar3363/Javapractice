package Javaprograms;

import java.util.Scanner;

public class A_arrayprogram 
{
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
	System.out.println("Enter the Required Index are:");
	int id=sc.nextInt();
	System.out.println("The value of index is:"+a[id]);		
	
	
	}
	}


