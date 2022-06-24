package Oppsconcepts;

public class A_arrayspractice {

	/*public static void main(String[] args)
	{
		
		int a[]=new int[4];
		a[1]= 50;
		a[0]=10;
		a[3]=20;
		a[2]=30;
		System.out.println(a[2]);
		//System.out.println(sum(new int[] {10,50,30,20});
	}*/
	public static int sum()
	{
		int a[]=new int[4];
		a[1]= 50;
		a[0]=10;
		a[3]=20;
		a[2]=30;
	int total=0;
	for(int x1:a)
	{
	total=total+x1;
	}
	return total;
	}
	}
	

	

