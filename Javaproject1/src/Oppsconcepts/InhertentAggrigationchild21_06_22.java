package Oppsconcepts;

public class InhertentAggrigationchild21_06_22 {

	String sname;
	String cname;
	int id;
	InheritenceAggrigationparent21_06_22 c;
	InhertentAggrigationchild21_06_22(String sname,String cname,int id,InheritenceAggrigationparent21_06_22 c)
	{
		this.sname=sname;
		this.cname=cname;
		this.id=id;
		this.c=c;
	}
	public static void main(String[] args) {
		
		InheritenceAggrigationparent21_06_22 x=new InheritenceAggrigationparent21_06_22(143,"Kali","In Delhi");
		InhertentAggrigationchild21_06_22  in=new InhertentAggrigationchild21_06_22("pawan","intance",150,x);
                  System.out.println(in.sname);
                  System.out.println(in.id);
                  System.out.println(in.cname);
                  System.out.println(in.c.a);
                  System.out.println(in.c.b);
                  System.out.println(in.c.c);        
	}

}
