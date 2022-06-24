package Test_coachit;

public class SumofArryElements {

	public static void main(String[] args) {
		/* Write a Java program to find the sum of array elements in Java.
		Ex: 
		array[] = {10, 20, 30}
		Sum of array elements = 10+20+30 = 60*/

		int a[]= {10,20,30};
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			
			 c=c+a[i];
		}
		System.out.println("Sum of array Elements "+a[0]+"+"+a[1]+"+"+a[2]+"="+c);
	}
}
