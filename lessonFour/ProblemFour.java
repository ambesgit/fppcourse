package lessonfour;

public class ProblemFour {
	public static double sumMembers(double[] obj,int sPosition){
		//double sum=0.0;		
			if(sPosition>obj.length-1){
				
				return 0;
			}
			
			return obj[sPosition]+sumMembers(obj,sPosition+1);//recursive call
				
			}	
	}
