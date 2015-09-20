package lessoneleven;

import java.util.Arrays;

public class HashTable {
	PersonItem[] myContacts;
	int arraySize;
	PersonItem removedContect;
	HashTable(String size){
		myContacts=new PersonItem[hashFun(size)];
	}
	public int hashFun(String key){
		int sum='@';	
			if(key.length()==1){
			return sum+=key.charAt(0);
			}
			return Math.abs(sum+hashFun(key.substring(1)));	
		
	}
	//add key value pairs to the hashtable array
	public boolean insert(String key, String name){
		int hashKey=hashFun(key);			
		if(myContacts.length>hashKey){
			if(myContacts[hashKey]==null){
				myContacts[hashKey]=new PersonItem(key,name);
				return true;
			}
			else{
				while(myContacts[hashKey]!=null){//if collision, check the next cell and insert there
					++hashKey;
					if(myContacts.length>hashKey&&myContacts[hashKey]==null){
						myContacts[hashKey]=new PersonItem(key,name);
						return true;
					}
					if(myContacts.length<=hashKey){
						//to be resize
						return false;
					}
				}
			}
		}
		return false;
	}
	public String find(String key){
		int hashedValue=hashFun(key);
		if(hashedValue<myContacts.length && hashedValue>=0){
			if(myContacts[hashedValue]==null){
				return null;
			}
			else if(myContacts[hashedValue].email_id==key){
				return " "+myContacts[hashedValue];
			}
			else{
				while(myContacts[hashedValue]!=null){
					++hashedValue;
					if(hashedValue<myContacts.length){
						if(myContacts[hashedValue].email_id==key){
							return " "+myContacts[hashedValue];
						}
					}
					else{
						return null;
					}
				}
			}
			
		}
		return null;
	}
	public boolean delete(String key){
		int hashedValue=hashFun(key);
		if(hashedValue<myContacts.length && hashedValue>=0){
			if(myContacts[hashedValue]==null){
				return false;
			}
			else if(myContacts[hashedValue].email_id==key){
				removedContect=myContacts[hashedValue];
				myContacts[hashedValue]=null;
				return true;
			}
			else{
				while(myContacts[hashedValue]!=null){
					++hashedValue;
					if(hashedValue<myContacts.length){
						if(myContacts[hashedValue].email_id==key){							
								removedContect=myContacts[hashedValue];
								myContacts[hashedValue]=null;
								return true;
							}
						}
					else{
						return false;
					}
				}
			}
			
		}
		
		return false;
	}
	
	public int size(){
		return arraySize;
	}
	//shows the whole record
	public String show(){
		StringBuilder st=new StringBuilder();
		for(int x=0; x<myContacts.length;x++){
			if(myContacts[x]!=null){
				st.append(" "+x+myContacts[x]);
			}
		}
		return " "+st;
	}
	
	
}
class PersonItem{
	String name;
	String email_id;
	PersonItem(String email_id,String name){
		this.name=name;
		this.email_id=email_id;
	}
	@Override
	public String toString() {
		return "PersonItem [name=" + name + ", email_id=" + email_id + "]";
	}
	
}