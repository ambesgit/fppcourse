package lessonseven;

public class ProblemOne {
	int even=0;
	int odd=0;
public String evenOddOrientation(int [] a){	
	class EvenOrOdd{		
		int [] b=a;
		EvenOrOdd(){
			for(int i=0; i<b.length;i++){
				if(b[i]%2==0){
					even+=Math.abs(b[i]);
				}
				else{
					odd+=Math.abs(b[i]);
				}
			}
		
		}	
}
	new EvenOrOdd();

	if(even>0&& even>odd){
		return "Even oriented#"+even;
	}
	if(odd>0&& odd>even){
		return "Odd oriented#"+odd;
	}
	else if(even==0&& odd==0){
		return "check your input";
	}
	return null;
	
}
}
