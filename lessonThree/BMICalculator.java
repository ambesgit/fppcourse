package lessonthree;
// one foot ==12 inch 
public class BMICalculator {	
	public static double calculateBMI(char unit,double weight, double height){
		if(height<=0){
			return 0.0;
		}
		if(unit=='m'){
			return weight/(height*height);
		}
		else if(unit=='i'){
			return (weight/(height*height))*703;
		}
		else if(unit=='f'){
		return (weight/((height*12)*(height*12)))*703;
		}
		else{
			return 0.0;
		}
	}
	
	
}
