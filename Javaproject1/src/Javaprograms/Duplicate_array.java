package Javaprograms;

public class Duplicate_array {

	public static void main(String[] args) {
		
		int a[]= {60,20,40,20,10,30,10};
			
		System.out.println("The duplicate value of Array :");
			for(int i=0;i<7;i++)
			{
				for(int j=i+1;j<7;j++)
				{
					if(a[i]==a[j])
					{
						System.out.print(a[j]);
					}
				}
				System.out.println();
			}		
	}
}


