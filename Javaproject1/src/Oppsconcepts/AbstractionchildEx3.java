package Oppsconcepts;

public class AbstractionchildEx3 extends AbtractionparentEx3 {

   int  Armyeligibulity()
   {
	 return 5;
    }
	
   int ploliceeligibulity()
	{
		return 1;
	}
   void Navieligibulity(String s)
	{
		
	  System.out.println(" Selected for Navi  The eligible running Km for Navi is"+s);
     }
	public static void main(String[] args)
	{
		AbstractionchildEx3 abs=new AbstractionchildEx3();
		System.out.println("The eligible running Km for Army is "+abs.Armyeligibulity());
		System.out.println("The eligible running Km for Army is "+abs.ploliceeligibulity());
		abs.Navieligibulity("4 km");

	}

}
