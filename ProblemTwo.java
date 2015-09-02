package lessonone_two;

public class ProblemTwo {
	/**
	 If a year is divisible by 4, there is a possibility to be a leap year
	 If first test pass, then try to divided by 100, if divisible, then check for 400
	 If second test pass, then check if it is divisible by 400,
	 If it is divisible by 400, then it is not a leap year	 
	 
	 */
	
	public static String giveMeYear(int year){
		String answer=(year%4==0 &&(year%100==0 && year%400!=0))?
				year+" is a common year":year+"is a leap year";
		return answer;
	}

}
