package lessonnine;

public class ProblemTwo {
	int top=-1;
	int capacity=10;
	int size=0;
	private Object[] arrStack=new Object[capacity];
	//push object to the stack;
	public void push(Object obj){
		if(top<arrStack.length){			
			arrStack[++top]=obj;
			size++;			
			}
		else{
			resize();			
			arrStack[++top]=obj;
			size++;	
		}
		}
	//pop up the top element from the stack
	public Object pop(){
		if(top>=0){
			size--;
			return arrStack[top--];
			
		}
		else{
			return null;
		}
	}
	//give me the top element but don't remove it from the stack
	public Object peek(){
		if(top>=0)return arrStack[top];
		else{return null;}
	}
	//check if the stack is empty
	public boolean isEmpty(){
		if(top<0)return true;		
		else return false;
	}
	public String displayAll(){
		StringBuilder st=new StringBuilder();
		for(int x=0; x<size;x++){
			st.append(arrStack[x].toString());
		}
		return " "+st;
	}
	public int size(){
		return size;
	}
	//resize the stack size
	private void resize(){
		capacity=capacity*2;
		Object[] temp=arrStack;
		arrStack=new Object[capacity];
		for(int x=0; x<temp.length;x++){
			arrStack[x]=temp[x];
		}
	}
	public String reverseNumber(int x){
		if(x<=0 &&x<10){
			push(x);
			return displayAll();
		}
		while(x>10){
			push(x%10);
			x=x/10;
		}
		push(x);//this will grape the number when x is less than 10 
		return displayAll();
	}
}
