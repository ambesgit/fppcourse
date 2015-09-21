package lessoneight;

public class ProblemTwo {
int capacity=10;
int size=0;
int[] array=new int[capacity];

//add value to the last of the arrayList
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

//this method will remove any duplicate records to make the arrayList free of duplicates
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
//this method will empty out the arrayList 
//actually it is dereferencing the existing array so the 
//JVM will reclaim the memory during garbage collection
public void removeAll(){
	capacity=10;
	size=0;
	array=new int[capacity];	
}
//returns the size of the array
public int size(){
	return this.size;
}
//get value from the arrayList using index
public int get(int index){
	if(index>=0 && index<this.size){
		return this.array[index];
	}
	else{
		return -1;
	}
}
//get subset of the arrayList
public int[] getRange(int start,int end){
	int [] sub=null;
	if(start>=0 && end<size && start<end){
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

//this method removes the element identified by the index
public void remove(int index){
	if(index>=0 && index<this.size()){
		for(int x=index; x<this.size();x++){
			this.array[x]=this.array[x+1];
		}
		this.size--;
	}
}
public void addAll(ProblemTwo ls){
	if(ls!=null && ls.size()>0)
	for(int x=0; x<ls.size(); x++){
		this.add(ls.get(x));
	}
}
//sort the list using the minSort procedure

public void minSort(){
	ProblemTwo ls=new ProblemTwo();
	int min=0;
	int minIndex=0;
	for(int x=0; x<this.size();x++){
		min=(int)this.get(x);
		minIndex=x;		
		for(int y=0;y<this.size();y++){			
			if(min>(int)this.get(y)){				
				min=(int)this.get(y);
				minIndex=y;				
			}
		}	
		
		ls.add(min);		
		this.remove(minIndex);
		x=0;
		//the maximum value will remain in the old list 
		//so this case will add it to the new list and remove it from the old
		if(this.size()==1){
			ls.add(this.get(0));
			this.remove(0);
		}
		
	}
	//this method will put back all the list to the old list
	this.addAll(ls);
	
}

//this method will display all the content of the list 
public String displayAll(){
	if(this.size()>0){
	StringBuilder st=new StringBuilder();
	for(int x=0; x<this.size(); x++){
		st.append(" "+(int)this.get(x));
	}
	return " "+st;
	}
	else{
		return null;
	}
}
}
