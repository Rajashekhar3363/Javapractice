package Javaprograms;

public class For_loop {

	public static void main(String[] args) 
	{
		For_loop fl= new For_loop();
		fl.Ml(9);
		System.out.println(" another table");
		fl.Ml(15);
	}
		
		
		public void Ml(int n)
		{	
		for(int i=1; i<=10; i++)
		{
			int m=n*i;
            System.out.println(n+"*"+i+"="+m);
		}
	}

}
