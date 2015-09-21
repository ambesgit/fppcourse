package lessoneight;

import java.util.Comparator;
import java.util.Iterator;
//this class is a container for Marketing type objects
//also it has methods to add, remove, set,size,displayAll...
public class MarketingArrayList implements Iterable{
	int capacity=10;
	int size=0;	
	Marketing[] arrayList=new Marketing[capacity];//Initial array implementation of the arrayList
	
	//to add object at the end of the arrayList 
public boolean add(Marketing m){
			if(size>=0 && size<capacity){
				arrayList[size]=m;
				size++;
				return true;
			}
			else if(size>=capacity){
				resize();
				arrayList[size]=m;
				size++;
				return true;
			}
			else{
				return false;
			}
		}
		//to add an object at the specified index of the arrayList 
public boolean add(int index,Marketing m){
					if(index>=0 && index<size){						
							if(size<capacity){
								int x=size;								
								while(index<x){
									arrayList[x]=arrayList[x-1];
									x--;
									
								}
								arrayList[index]=m;
								size++;
								return true;
							}
							else if(size>=capacity){
								resize();
								int x=size;								
								while(index<x){
									arrayList[x]=arrayList[x-1];
									x--;
									
								}
								arrayList[index]=m;
								size++;
								return true;
							}
							else{
								return false;
							}
					}
					else{
						return false;
					}
				}
		
		//to resize the arrayList capacity and it is only called internally 
private void resize(){
			capacity=capacity*2;
			Marketing[] temp=arrayList;
			arrayList=new Marketing[capacity];
			for(int x=0;x<size;x++){
				arrayList[x]=temp[x];
			}
		}
		//to delete a record from the arrayList using the object reference variable
public boolean remove(Marketing m){
			
			for(int x=0;x<size;x++){
				if(arrayList[x]==m){
					size--;
					while(x<size){
						arrayList[x]=arrayList[x+1];
						x++;
					}
					
					return true;
				}
			}
			return false;
			
			}
		
public boolean remove(int index){		
			int x=index;
			if(index>=0 && index<size){
					while(x<size){
						arrayList[x]=arrayList[x+1];
						x++;
					}
					
					return true;
				
			}
			return false;
			
			}
		
		//this will return the number of elements in the arraylist
public int size(){
			return size;
		}
		
		//this will return the object in the specified index, 
		//if the index is out of range, null will be returned
public Marketing get(int index){
			if(index>=0 && index<size){
				return arrayList[index];
			}
			return null;
		}
		
//this will return the index of the object passed to the method, 
//if the object is not in the list, -1 will be return
public int find(Marketing k){
	for(int x=0;x<size;x++){
		if(arrayList[x]==k){			
			return x;
		}
	}
	return -1;	
	
}

public boolean set(Marketing k,Marketing n){
	int index=find(k);
	if(index!=-1){
		arrayList[index]=n;
		return true;
	}
	return false;
}
		//this will display the current status of all objects in the
		//MarktingArrayList(wrapper/container object for Marketing type objects)
public String displayAll(){
			StringBuilder st=new StringBuilder();
			for(int x=0;x<size(); x++){
				if(get(x)!=null){
					st.append(get(x).toString());
				}
			}
			return " "+st;
		}
		
		//if time allows i i don't forget, i will implement this , 
		//if not it will be empty body 
		@Override
public Iterator iterator() {
			
			return null;
		}
		//This Comparator object Constant holds pointer to anonymous class with compare method
public final Comparator<Marketing> EMPLOYEENAME=new Comparator<Marketing>(){		
		
		public int compare(Marketing ob1, Marketing ob2) {
			if(((Marketing)ob1).getClass()==((Marketing)ob2).getClass()){
				
				return (ob1.getEmployeeName()).compareTo(ob2.getEmployeeName());
			}
			return -3;//if this comparator is used to compare fields of different type objects
		}
};	

public final Comparator<Marketing> SALESAMOUNT=new Comparator<Marketing>(){		
	@Override
	public int compare(Marketing ob1, Marketing ob2) {
		if(((Marketing)ob1).getClass()==((Marketing)ob2).getClass()){	
			
			return ((Double)ob1.getSalesAmount()).compareTo((Double)ob2.getSalesAmount());
		}
		return -3;//if this comparator is used to compare fields of different type objects
	}
};
//this sorting algorithm is sorting in place using swap approach
public void sort(){
	if(this.size()>0){
		if(this.size()>1){
			int minIndex=0;			
			Marketing min;
			for(int i=0;i<this.size();i++){
				min=this.get(i);
				minIndex=i;
				for(int j=i;j<this.size();j++){						
				if(EMPLOYEENAME.compare(min,this.get(j))>=1){
					System.out.println("xxx "+(this.get(j)).toString()+(int)EMPLOYEENAME.compare(min,this.get(j)));
					min=this.get(j);
					minIndex=j;
				}
				else if(EMPLOYEENAME.compare(min,this.get(j))==0){
					if(this.SALESAMOUNT.compare(min, this.get(j))>=1){
						min=this.get(j);
						minIndex=j;
					}
				}
				}
				//after every element is compare with element i, swap the element i with the min
					if(minIndex!=i){
					this.set(this.get(minIndex), this.get(i));
					this.set(this.get(i), min);
					}
				
			}
		}
		else{
			//do nothing
		}
	}
}
}
