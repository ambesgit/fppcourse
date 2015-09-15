package lessoneight;
public class MainApp {
	int capacity=10;
	int size=0;	
	Marketing[] arrayList=new Marketing[capacity];//Initial array implementation of the arrayList 
		public static void main(String[] args) {
			//problem one 
			Marketing ambes=null;
			MainApp m=new MainApp();
		for(int y=0;y<20; y++){
			ambes=new Marketing();
			ambes.employeeName="ambes";
			ambes.productName="book";
			ambes.salesAmount=200;
			m.add(ambes);
		}
		m.set(ambes, 500);
		System.out.print(m.toString());
		
		//problemTwo
		ProblemTwo pt=new ProblemTwo();
		for(int x=0; x<20; x++){
			pt.add((int)(Math.random()*100));
		}
		System.out.println("size before duplicate is removed "+pt.size());
		pt.removeDuplicate();
		System.out.println("after duplicate is removed "+pt.size());
		System.out.print("size of the sublist "+pt.getRage(3,8).length);
	}
		//to add objects to the arrayList
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
				for(int y=x; y<size;y++){
					arrayList[y]=arrayList[y+1];
				}
				size--;
				return true;
			}
		}
		return false;
		
		}
	//to make some changes to property of the object in  this case the saleamount
	//of the object identified by the argument
	public boolean set(Marketing m,double saleamount){
		for(int x=0;x<size;x++){
			if(arrayList[x]==m){
				arrayList[x].salesAmount=saleamount;
				return true;
			}
		}
		return false;
	}
	//overriding the toString method to display the arrayList contents
	public String toString(){
		StringBuilder st=new StringBuilder();
		for(int x=0; x<size;x++){
			st.append(x+"."+arrayList[x].employeeName+" "+arrayList[x].productName+" "+arrayList[x].salesAmount+" \n");
		}
		return " "+st;
	}
	
}
