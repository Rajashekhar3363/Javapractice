package Test_coachit;

public class Sum_and_Average_ofarray {

	public static void main(String[] args) {
		/*Write a Java program to calculate the average of numbers or find the average of elements of the given array.
		Ex: array[] = {10, 20, 30, 40, 50};
		then sum of array elements = 10 + 20 + 30 + 40 + 50 = 150
		and the average of numbers = 150 / 5 = 30  */
		
		int a[]= {10,20,30,40,50};
		int c=0;
		int b;
		for(int i=0;i<a.length;i++)
		{
			 c=c+a[i];	 
		}
		 b=c/a.length;
		System.out.println("Sum of array Elements "+a[0]+"+"+a[1]+"+"+a[2]+"="+c);
		System.out.println("Tne Average of numbers "+c+"/"+a.length+"="+b);
	}
}
