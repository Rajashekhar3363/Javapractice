package Oppsconcepts;

public class OverridemethodchildEx2 extends OverloadmethodRealEx2{
	 void m2(int a,int b)
	   {
		   if(a>b)
		   {
			   System.out.println("In OVERRIDDERD  methods we find a value is greater value "+a);
		   }
		   else
		   {
			   System.out.println("In OVERRIDED methods we find b value is greater value "+b);
		   }
	   }
	public static void main(String[] args) {
		OverridemethodchildEx2 ov2=new OverridemethodchildEx2();
		ov2.m2(50, 30);
		ov2.m2(7);
		

	}

}
