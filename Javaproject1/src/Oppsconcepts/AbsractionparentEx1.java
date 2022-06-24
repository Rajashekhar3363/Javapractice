package Oppsconcepts;

 abstract class Bank
	   {    
		abstract int balance();    
		}  
	  
		class SBI extends Bank
		{    
		int balance()
		   {
			  return 70000;
			}    
		}   
		
		class PNB extends Bank
		{    
		int balance()
		   {
			 return 14000;
			}    
		}    
		    
		public class AbsractionparentEx1{    
		public static void main(String args[]){    
		Bank b;  
		b=new SBI();  
		System.out.println("SBI Bank Total Banalnce is : "+b.balance()+" Rs");    
		b=new PNB();  
		System.out.println("PNB Bank Total Banalnce is : "+b.balance()+" Rs");    
		}
		}    

