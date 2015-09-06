package lessonfour;

public class ProblemFive {
	public static char getMinCharacter(String st){
		if(st!=null && st!=""){
			if(st.length()==1){
				return st.charAt(0);
			}
			else {
				if(st.charAt(0)>st.charAt(1)){
					return getMinCharacter(st.substring(1));
				}
				else{
					return getMinCharacter(st.substring(0,1)+st.substring(2));
				}
			}
			
		}
		return ' ';
	}
}