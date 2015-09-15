package lessoneight;

public class ProblemTwo {
int capacity=10;
int size=0;
int[] array=new int[capacity];

//add value to the array
public boolean add(int n){
	if(size>=0 && size<capacity){
		array[size]=n;
		size++;
		return true;
	}
	else{
		reSize();
		array[size]=n;
		size++;
		return true;
	}
	
}

//removes if any duplicate records to make array with no duplicate
public void removeDuplicate(){
	int current;
	int flag=0;
	for(int x=0;x<size;x++){
		current=array[x];
		for(int y=0;y<size;y++){
			if(current==array[y]){
				flag++;
			}
			if(flag>1){
				for(int z=x; z<size;z++){
					array[x]=array[x+1];
				}
				size--;
				flag--;
			}
		}
	}
}
//empty out the array
public void removeAll(){
	capacity=10;
	size=0;
	array=new int[capacity];	
}
//returns the size of the array
public int size(){
	return size;
}
//get value from the arraylist using index
public int getValue(int index){
	if(index>=0 && index<size){
		return array[index];
	}
	else{
		return -1;
	}
}
//get subset of the arrayList
public int[] getRage(int start,int end){
	int [] sub=null;
	if(start>=0 && start<size && end>=0 && end<size && start<end){
		sub=new int[end-start];
		for(int x=0;x<sub.length;x++){
			sub[x]=array[start+x];
		}
	}
	return sub;
}
private void reSize(){
	capacity=capacity*2;
	int [] temp=array;
	array=new int[capacity];
	for(int x=0; x<size; x++){
		array[x]=temp[x];
	}
}

}
