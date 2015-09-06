package lessonfour;

public class ProblemSix {
	private static String[] numbersInWords={"zero","one","two","three","four","five","six","seven","eight","nine"};
	public static String getNumber(int number){		
		if(number>=0){
			if(number<10){
				return numbersInWords[number];
			}
			else{
				return getNumber(number/10)+" "+numbersInWords[number%10];				
				
			}		
		}
		else{
			return null;
		}
	}
}
