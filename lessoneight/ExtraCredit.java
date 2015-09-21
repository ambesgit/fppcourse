package lessoneight;

public class ExtraCredit {
	MyNode head;
	int size;
	public void add(Object ob){
		if(head==null){
			head=new MyNode(null,ob,null);
			head.p=head;
			head.n=head;
			size++;
		}
		else{
			if(head.n==head){
				head.n=new MyNode(head,ob,head);
				head.p=head.n;
				size++;
			}
			else{
				head.n=new MyNode(head.n,ob,head);				
				head.n.n.p=head.n;
				size++;
			}
		}
	}
	public boolean remove(Object ob){
		if(head==null){
			return false;
		}
		else{
			MyNode current=head;
			if(current==current.n){
				if(current.data==ob){
					head=null;
					size--;
					return true;
				}
				
			}
			if(current.p==current.n){
				if(current.data==ob){
					head=current.n;
					head.p=head;
					head.n=head;
					return true;
				}
				else{
					if(current.n.data==ob){
					head.p=head;
					head.n=head;
					return true;
					}
				}
			}
			while(current.n!=head){
				if(current.data==ob){
					current.p.n=current.n;
					current.n.p=current.p;
					size--;
					return true;
				}
				current=current.n;	
				if(current.n==head){
					current.p.n=current.n;
					head.p=current.p;
					size--;
				}
				
				
			}
		}
		return false;
	}
	public MyNode get(Object data){
		if(head==null){
			return null;
		}
		else{
			MyNode current=head;
			if(current.p==current.n){
				if(current.data==data){				
					return current;
				}
				else{
					if(current.n.data==data){
						return current.n;
					}
				}
				
			}
			while(current.n!=head){
				if(current.data==data){					
					return current;
				}
				current=current.n;
				if(current.n==head){
					if(current.data==data){
					return current;
					}
				}
				
			}
		}
		return null;
	}
	public MyNode getLast(){
		if(head!=null){
			return head.p;
		}
		return null;		
	}
	public MyNode getFirst(){
		if(head!=null){
			return head;
		}
		return null;
	}
	public String displayAll(){
		StringBuilder st=new StringBuilder();
		MyNode current=head;
		if(current!=null){
			if(current.p==current.n){
				st.append(" "+current.data);
				if(current!=current.n){
					st.append(" "+current.n.data);
				}
			}
			else{
				while(current.n!=head){
					if(current!=null){
					st.append(" "+current.data);
					current=current.n;
					if(current.n==head){
						st.append(" "+current.data);
					}
					}
				}
			}
		}
		return " "+st;
	}
	public int size(){
		return size;
	}
}
class MyNode{
	MyNode p;
	MyNode n;
	Object data;
	MyNode(MyNode n,Object data, MyNode p){
		this.p=p;
		this.n=n;
		this.data=data;
	}
	@Override
	public String toString() {
		return "MyNode [ob=" + data + "]";
	}
	
}

