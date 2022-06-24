package Test_coachit;

public class CountofArray {

	public static void main(String[] args) {
		/*Write a Java program to count the even and odd numbers in the given
		Ex:-
		Array = {11, 12, 13, 14, 15}
		Count of the even number = 2
		Count of the odd number = 3*/


		int a[]={11, 12, 13, 14, 15};
		int even=0;
		int odd=0;
		for(int i=0;i<a.length;i++)
		{  
		if(a[i]%2==0)
		{  
		   even++;  
		}  
		}
		for(int i=0;i<a.length;i++)
		{  
		if(a[i]%2!=0)
		{  
		odd++; 
		}
		}
		System.out.println("Count of the even number= "+even);
		System.out.println("Count of the odd number ="+odd);
		
	}
	}

