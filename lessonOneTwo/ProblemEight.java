package lessonone_two;

public class ProblemEight {
	public static double getWeightOnEarth(int planet,double weight){
		double weightAfter=weight;
		switch(planet){
		case 1:
			weightAfter=weight*0.78;//Venus
			break;
		case 2:
			weightAfter=weight*0.39;//Mars
			break;
		case 3:
			weightAfter=weight*2.65;//Jupiter
			break;
		case 4:
			weightAfter=weight*1.17;//Saturn
			break;
		case 5:
			weightAfter=weight*1.05;//Uranus
			break;
		case 6:
			weightAfter=weight*1.23;//Neptune
			break;
		default:
			weightAfter=weight;
		}
		System.out.println(weightAfter);
		return weightAfter;
	}

}
