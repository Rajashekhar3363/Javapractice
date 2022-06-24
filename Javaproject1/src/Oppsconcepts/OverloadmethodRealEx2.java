package Oppsconcepts;

public class OverloadmethodRealEx2 
{
   void m2(Object obj)
   {
	   System.out.println("the value of object is"+obj);
   }
   void m2(Object obj,String s)
   {
	   System.out.println("In this we have object and sting this is overload method");
   }
   void m2(int a,int b)
   {
	   if(a>b)
	   {
		   System.out.println("In OVERLOAD methods we find a value is greater value "+a);
	   }
	   else
	   {
		   System.out.println("In OVERLOAD methods we find b value is greater value "+b);
	   }
   }
   
   void m2(int x)
   {
	   System.out.println("The table  "+x);
	   for(int i=1;i<=10;i++)
	   { 
		   System.out.println(x+"*"+i+"="+(x*i));
	   }
   }
	
	
}
