package Oppsconcepts;

public class EncapsulationAccountchildEx1 
    {

	public static void main(String[] args)
	{
		
		EncapsulationAccountparentEx1  acc=new EncapsulationAccountparentEx1 ();
	    acc.saccountno("000801632537");
	    acc.sname("Pawan");
		acc.sbranch("Khirathabadh");
		acc.sbalance(50000);
		acc.sbankname("ICICI Bank");
				
		System.out.println("The bank name is "+acc.gbankname());
		System.out.println("the Bank Account no is "+acc.getClass());
		System.out.println("the Bank Account no is "+acc.getactno());
		System.out.println("the Bank Account no is "+acc.getname());
		System.out.println("the Bank Account no is "+acc.getBranch());
		System.out.println("the Bank Account no is "+acc.getbalance());
				
				
	}
}
