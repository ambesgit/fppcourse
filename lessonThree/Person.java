package lessonthree;

class Person {
private String lastName;
private String firstName;
private int age;
public Person(String lastName, String firstName,int age){
	this.lastName=lastName;
	this.firstName=firstName;
	this.age=age;	
}
public void displayPerson(){
	System.out.println("First name: "+getLastName()+"\n"+
						"Last name: "+this.firstName+"\n"+
						"Age: "+this.age+"\n");
	}

public String getLastName() {
	return lastName;
}
public int getAge() {
	return age;
}

}

//class Person array starts here
class PersonArrayOpe{
	private Person[] a;
	private int nElems;
	//decide the maximum number of people you want to store in the "a" array 
	public PersonArrayOpe(int max){
		if(max>0){
		a=new Person[max];
		
		}
	}
	public Person find(String lastName){
		for(int i=0; i<nElems;i++){
			if(a[i].getLastName().equals(lastName)){
				return a[i];
			}
		}
		return null;
	}
	public void insert(String lastName, String firstName, int age){
		if(nElems<a.length-1){
		a[nElems]=new Person(lastName,firstName,age);		
		nElems++;
		}
	}
	public boolean delete(String lastName){
		for(int i=0; i<nElems;i++){
			if(a[i].getLastName().equals(lastName)){
				for(int j=i;j<nElems+1;j++){
					a[j]=a[j+1];
				}
				nElems--;
				return true;
			}
			
		}
		return false;
	}
	public void displayAll(){
		for(int i=0;i<nElems;i++){
			a[i].displayPerson();
		}
	}
	public int size(){
		return nElems;
	}
}
