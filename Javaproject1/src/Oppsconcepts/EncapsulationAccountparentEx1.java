package Oppsconcepts;

 public class EncapsulationAccountparentEx1        // Encapsulation Example1
{
	private String act_no;
	private String name;
	private String Branch;
	private long balance;
	private String bank_name;
	
	public String getactno()
	{
		return act_no;
	}
	
	public String getname()
	{
		return name;
	}
	
	public String getBranch()
	{
		return Branch;
	}
	public long getbalance()
	{
		return balance;
	}
	public String gbankname()
	{
		return bank_name;
	}
	
	public void saccountno(String act_no)
	{
		this.act_no=act_no;
	}
	public void sname(String name)
	{
		this.name=name;
	}
	public void sbranch(String Branch)
	{
		this.Branch=Branch;
	}
	public void sbalance(long balance)
	{
		this.balance=balance;
	}
	public void sbankname(String  bank_name)
	{
		this.bank_name=bank_name;
	}

	/*public class EncapsulationAccountparentEx1   // EncapsulationAccountChildEx2 created child class for this parent class
	{
		public static void main(String[] args) 
		{
			Account acc=new Account();
			acc.saccountno(1555);
			acc.sname("Pawan");
			acc.sbranch("CHPDL");
			acc.sbalance(50000);
			System.out.println("the Bank Account no is"+acc.getClass());
			System.out.println("the Bank Account no is"+acc.getactno());
			System.out.println("the Bank Account no is"+acc.getname());
			System.out.println("the Bank Account no is"+acc.getBranch());
			System.out.println("the Bank Account no is"+acc.getbalance());
			
			
		}

	}*/
}
