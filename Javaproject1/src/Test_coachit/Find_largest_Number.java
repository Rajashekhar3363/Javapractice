package Test_coachit;
import java.util.Scanner;

public class Find_largest_Number {

	public static void main(String[] args) {
		
		/*
		 Write a Java program to find the largest number in the array.
		Ex. Array: {10, 5, -15, 20, -30}
		*/
		
	int a[]= {10,5,-15,20,-30};
	int large=0;
	 
	   for(int j=0;j<a.length;j++)
	   {
		   if(a[j]>large)
		  {
		   large=a[j];
		  }
	   }
	   System.out.println("the largest value is "+large);  
}
}