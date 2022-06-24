package Test_coachit;

import java.util.Arrays;

public class Sumof2arrays {

	public static void main(String[] args) {
		/*
		  array1[] = {10, 20, 30, 40, 50};
          array2[] = {9, 18, 27, 36, 45};
            The resultant array will be,
          array3[] = {19, 38, 57, 76, 95};

		 */
		
		int array1[] = {10, 20, 30, 40, 50};
        int array2[] = {9, 18, 27, 36, 45};
		int a=array1.length;
		int array3[]=new int[a];
		
		for(int i=0;i<array1.length;i++)
		{
			 array3[i]=array1[i]+array2[i];
				
		}
		System.out.println("array3" + Arrays.toString(array3));
		
	}

}
