package lessonone_two;
/**
 * This code is used to draw a Rhombus shape using an odd number below 10 and not 1
 * divided and concer method of problem solving was used to solve the problem
 * the solution has three parts
 * 1. the upper part which is corresponding to the external loop when the loop is less than half way
 * 2. the middle part when the loop is half way 
 * 3. the lower part if the external loop is beyond its half way
 * @author ambes
 *
 */
public class ProblemSeven {	
	public static void creatRhombusShape(int n){
		//check if the input is odd and less than 10
		if(n%2!=0 && n<10 && n>1){
			for(int i=0;i<n;i++){
				for(int j=0; j<n;j++){
					//the top part of the rhombus will be solved by this logic
					if(i<n/2){
						if(j<(n/2)-i || j>(n/2)+i){
							System.out.print(" ");
						}
						else{
							System.out.print(n);
						}
					}
					//if this condition is satisfied, then we know we are at the middle of the drawing
					else if(i==n/2){
						System.out.print(n);
						
					}
					//this condition is used to draw the lower part of the rhombus
					else{
					
						if(j<i-(n/2) || j>=n-(i-(n/2))){
							System.out.print(" ");
						}
						else{
							System.out.print(n);
						}
					}
				}
				System.out.println("\n");
				}
				
			}
			
		}
	
}
