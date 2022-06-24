package Test_coachit;

public class Find_Even_Odd {

	public static void main(String[] args) 
	{
		int a[]={1,2,5,6,3,2};  
		
		System.out.println("Find the Even or odd in in this list  a[]={1,2,5,6,3,2};");
		System.out.println("Even numbers are");  
		for(int i=0;i<a.length;i++)
		{  
		if(a[i]%2==0)
		{  
		System.out.print(a[i]+",");  
		}  
		}
		System.out.println();
		
		System.out.println("Odd Numbers are");  
		for(int i=0;i<a.length;i++)
		{  
		if(a[i]%2!=0){  
		System.out.print(a[i]+",");  
		}  
		}  
	}

	}

