package lessonnine;

import java.util.Comparator;
public class PriorityQueue{
	Node head;	
	int size=0;
	//add element to the priority queue
	public final Comparator<Object> STRING=new Comparator<Object>(){

		@Override
		public int compare(Object obj1, Object obj2) {
					
			return ((String)obj1).compareTo((String)obj2);
		}
		
	};
	public final Comparator<Object> NUMBER=new Comparator<Object>(){

		@Override
		public int compare(Object obj1, Object obj2) {
					
			return ((Double)obj1).compareTo((Double)obj2);
		}
		
	};
	public void insert(Object ob){
		Node current;
		if(head==null){
			head=new Node(null,ob,null);			
			size++;
			
		}
		else {	
			//if head is not null, atleast i have one node so i will shift it to the right
			current=head;
			if(head.n==null){				
				if(STRING.compare(ob,current.value)<0) {
									
					current.p=new Node(current,ob,null);
					current.p.n=current;
					head=current.p;
					size++;
				}
				else{
					
					current.n=new Node(null,ob,current);
					size++;
				}
			}
			else{
				while(current.n!=null){				
				if(STRING.compare(ob,current.value)<0) {	
					
					current.p=new Node(current,ob,current.p);
					if(current.p.p==null){
						head=current.p;
					}
					else{
						current.p.p.n=current.p;
					}
				
					size++;
					break;
				} 
				current=current.n;
				if(current.n==null){
					if(STRING.compare(ob,current.value)<0){
						current.p=new Node(current,ob,current.p);
						current.p.p.n=current.p;
						size++;
						break;
					}
					else{
						current.n=new Node(null,ob,current);
						size++;
						break;
					}
					
				}
				
				}
			}
		}
		
	}
	public void remove(){
		if(head==null){
			//do nothing
		}
		else{
			head=head.n;
			head.p=null;
			size--;
		}
	}
	//check if the queue is empty
	public boolean isEmpty(){
		if(head==null) return true;
		else return false;
	}
	
	//how many elements are in the queue
	public int size(){
		return size;
	}
	
	//give me the top element in the queue but don't remove it from the queue
	public Object peek(){
		if(head!=null){
		return head.value;
		}
		else{
			return null;
		}
	}
	
	//returns all elements in the queue as a string
	public String displayAll(){
		if(head==null){
			return "No element in the queue";
		}
		else if(head.n==null){
			return head.value.toString();
		}
		else{
		StringBuilder st=new StringBuilder();
		Node current=head;
		st.append(current.value.toString());
		//traverse across the queue from rear to the front and concatenate all values
		while(current.n!=null){
			current=current.n;			
			st.append(" "+current.value.toString());			
			
			
		}		
		return " "+st;
		}
	}
	
	}
	
//this is a wrapper class or template to create user defined linkedlist
class Node{
	Node n;
	Node p;
	Object value;
	Node(Node n , Object value, Node p){
		this.n=n;
		this.p=p;
		this.value=value;
		
	}
}