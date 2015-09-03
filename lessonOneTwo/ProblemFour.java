package lessonone_two;

public class ProblemFour {
	static int currentPopulation=312132486;
	static long population2016;
	public static long populationOfNextYear(){
		
		int birthRate=60/20*60*24*365;
		int deathRate=60/10*60*24*365;
		int immigrationRate=60/60*60*24*365;
		population2016=(currentPopulation+birthRate+immigrationRate)-(deathRate);
		return population2016;
		
	}

}
