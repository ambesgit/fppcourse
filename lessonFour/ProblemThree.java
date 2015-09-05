package lessonfour;

public class ProblemThree {
	//this binary search method works only
public static double binarySearch( double [] obj,double target,int index){
	//check the inputs are logically correct
	if(obj.length>0&& (index>=0 && index<obj.length)){
		//if the target is found right at the middle of the collection, stop the search and return me 1
		if(obj[index]==target){
			System.out.println(obj[index]+"found at index:"+index);
			return 1;
		}
		//if the target is not found at the middle, then check if the target is to the right of 
		//the middle, then drop half of the collection and get the new middle
		//the plus one is not to include the last times middle as a member of the new collection
		else if(target>obj[index]){
			return binarySearch(obj,target,((index+index/2)+1));
		}
		//if the target is to the left of the middle, then drop half of the collection plus the middle itself
		//and call recursively by passing the new middle element , repeat this until you find the target or 
		//you reach at the last index
		else if(target<obj[index]){
			return binarySearch(obj,target,(index-index/2)-1);
		}
		//if you reach at the last element on the left, then check the last element, this is one of the
		//base case for the recursion to stop
		else if((index-index/2)-1==0){
			if(obj[0]==target){
				System.out.println(obj[index-index/2-1]+"found at index:"+0);
				return 1;
			}	
			
		}
		//if you reach at the last element in the right side, check the last element
		//if this is not the target then return -1 and bring the recursive to its end
		else if((index+index/2)+1==obj.length){
			if(obj[obj.length-1]==target){
			System.out.println(obj[index+index/2]+"found at index:"+(obj.length-1));
			return 1;
			}
			
		}
		//if three is something wrong with logic of the inputs, then don't start the search
		else{
			return -1;
		}
	}
	//if you don't find any thing, just return -1;
	return -1;
	
}
}
