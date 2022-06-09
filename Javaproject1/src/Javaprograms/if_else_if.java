package Javaprograms;

public class if_else_if {

	public static void main(String[] args) {
		int a=50,b=80,c=190, d=120;
		if(a>b && a>c && a>d)
		{
			System.out.println("A value is High");
		}
		else if(b>c && b>a && b>d)
		{
			System.out.println("B value is High");
			
		}
		else if(c>a && c>b && c>d)
		{
			System.out.println("C value is High");
			
		}
		else 
		{
				System.out.println("D value is High");
				
			}
		}

	}

