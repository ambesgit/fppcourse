package lessonone_two;

public class ProblemOne {
	/**
	 this class contains only one static method 
	 to manipulate user currency input 
	 in its smaller breakdowns :such as 
	 dollars, quarters, dimes, nickels and pennies 
	  Example input 11.56-->output will be 
	  11 dollars
	  2 quarters
	  0 dimes
	  1 nickels
	  1 pennies
	  */
	public static void giveMeDouble(double bill){
		double remainder=0;
		int dollars=(int)bill;
		remainder=bill%(double)dollars*100;
		int quarters=(int)remainder/25;
		remainder=remainder%25;
		int dimes=(int)remainder/10;
		remainder=remainder%10;
		int nickels=(int)remainder/5;
		remainder=remainder%5;
		int pennies=(int)remainder;
		System.out.println(	dollars+" dollars\n"+
							quarters+" quarters\n"+
							dimes+" dimes\n"+
							nickels+" nickels\n"+
							pennies+" pennies");
		
	}
	
}
