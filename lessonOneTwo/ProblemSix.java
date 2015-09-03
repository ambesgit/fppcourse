package lessonone_two;



public class ProblemSix {
	public static String[] removeDuplicate(String [] input){
		/*the three variables are used to track the 
		 * duplicate count and a flag to see if the inner loop 
		 * returns due to the break statement
		 * the index variable is used as index of insertion so contiguous memory is used
		 */
		int duplicateFlag=0,countDuplicate=0,index=1;
		String [] removeDup={};//this array will contain null values which is garbage 
		String [] temp={};//this array will hold elements with no null value
		if(input.length>0){
			removeDup=new String[input.length];
			removeDup[0]=input[0];
			for(int i=1;i<input.length; i++){				
				for(int j=0;j<i; j++){					
					if(input[i].equals(removeDup[j])){
						duplicateFlag=1;
						countDuplicate++;						
						break;
					}
					
				}
				if(duplicateFlag==0){
					removeDup[index]=input[i];
					index+=1;
				}
				else{
					
					duplicateFlag=0;
				}
			}
			if(countDuplicate>0){
				temp=new String[removeDup.length-countDuplicate];
				System.arraycopy(removeDup,0,temp,0,temp.length);
			}
		}
		System.out.println(temp.length);
		return temp;
	}

}
