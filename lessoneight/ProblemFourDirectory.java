package lessoneight;

public class ProblemFourDirectory {
	private Directory first;
	private Directory last;
	private int size=0;
	
	//check if the directory which is a singly linked list is empty or not
	public boolean isEmpty(){
		if(first==null){
			return true;
		}
		else{
			return false;
		}
	}
	
	//this will put any input at the first of the singlylinked list
	public void insertFirst(String name, long phonNumber){
		if(first==null){
			first=new Directory(name,phonNumber);
			size++;
			
		}
		else {			
			
			Directory temp=first;
			first=new Directory(name,phonNumber);
			first.next=temp;
			size++;
		}
		
	}
	
	//this method will append entry at the last of the list
	public void insertLast(String name,long phonNumber){
		Directory current;
		if(first==null){
			first=new Directory(name, phonNumber);				
			size++;
		}
		else if(first.next==null){
			first.next=new Directory(name, phonNumber);
			size++;
		}
		else{
			current=first;
			while(current.next!=null){
				current=current.next;
				if(current.next==null){
					current.next=new Directory(name, phonNumber);
					size++;
					break;
				}
			}
		}
	}
	
	//this method will delete the first element from the list
	public Directory deleteFirst(){
		Directory deleted;
		if(first==null){
			return null;
		}
		else{
			Directory temp=first.next;
			deleted=first;
			first=null;
			first=temp;
			size--;
			return deleted;
		}
	}
	
	//returns the size counter of the linked nodes
	public int size(){
		return size;
	}
public String displayList(){
	if(this.first!=null){
	StringBuilder st=new StringBuilder();
	Directory current=this.first;
	if(first.next==null){
		return " "+first.name+" "+first.phonNumber+"\n";
	}
	while(current.next!=null){
		st.append(" "+current.name+" "+current.phonNumber+"\n");
		current=current.next;
		if(current.next==null){
			st.append(" "+current.name+" "+current.phonNumber+"\n");
			return " "+st;
		}
		
		}
		return " "+st;
		}
	return null;
	}
//this will return the first match of name or phonNumber
public Directory find(long key){
	Directory current;
	if(first!=null){
		current=first;
		if(first.next==null){
			if(first.phonNumber==key){
				return first;
			}
			else{
				return null;
			}
		}
		else{
			while(current.next!=null){
				current=current.next;
				if(current.phonNumber==key){
					return current;					
					}
				}
			return null;
			}
	}
	else{
		return null;
	}
}
}
class Directory{
	String name;
	long phonNumber; //i am this string because long can't accommodate all the ten digit number
	Directory next;
	public Directory(String name,long phonNumber){
		this.name=name;
		this.phonNumber=phonNumber;
	}
	//this will display single entry 
	public void displayDirectory(){
		System.out.println(toString());
	}
	public String toString(){
		return this.name+" "+this.phonNumber;
	}
}
