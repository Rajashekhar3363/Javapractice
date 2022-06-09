package Javaprograms;



public class Switch {

	public static void main(String[] args) {
		
		/*int num=5;
		char name='a';
		 switch(num)
		{
		 case 1:
		System.out.println("Monday");
		break;
		 case 2:
		 System.out.println("Thusday");
		 break;
		 case 3:
			 System.out.println("Weesday");
			 break;
		 case 4:
			 System.out.println("Thusday");
			 break;
		 case 5:
			 System.out.println("friday");
			 break;
		 case 6:
			 System.out.println("saturday");
			 break;
		 case 7:
			 System.out.println("Sunday");
		}*/
		
	
		
		
		
		int a=50,b=2,c;
		
		int num=4;
		
		switch(num)
		{
		case 1: c=a+b;
		System.out.println(" Addition of two operands is "+c);
		break;
		case 2: c=a-b;
		System.out.println(" Subtraction of two operands is "+c);
		break;
		case 3: c=a*b;
		System.out.println(" Multiplication of two operands is "+c);
		break;
		case 4: c=a/b;
		System.out.println("Division of two operands is "+c);
		break;
		case 5: c=a%b;
		System.out.println("modulus of two operands is "+c);
		break;
		
		default:
			System.out.println("please enter number between 1-5 numbers");
		}

	}

}
