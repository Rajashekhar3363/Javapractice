package Test_coachit;

import java.util.Arrays;

public class Assending_array 
{
	public static void main(String[] args) {
		/*int a[]= {3,1,7,8,4,9};
		int b[]=new int[a.length];
		int temp=0;
		System.out.println("the Elents order in the array is");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;	
			}
			}
			
		}
		System.out.println();
		System.out.println("The Assending order of the Array list:");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}*/
		
		
		int a[]= {3,1,7,8,4,9};
		
		Arrays.sort(a);
		
		System.out.println("b"+Arrays.toString(a));
		}

	}


