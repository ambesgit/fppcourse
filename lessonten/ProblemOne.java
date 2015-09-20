package lessonten;

public class ProblemOne {
		private BSTNode root;
		private int size;
		
		public boolean insert(int data){
			if(root==null){
				root=new BSTNode(null,data,null);
				size++;
				return true;
			}
			else {
				BSTNode current;
				if(data==root.data){
						return true;			
				}
				//traverse the right subtree					
					current=root;				
					while(current!=null){						
						if(current.data>data){							
							if(current.left==null){
								current.left=new BSTNode(null,data,null);
								size++;
								return true;
							}
							current=current.left;//assign new node to current then check its left value
						}
						else if(current.data<data){
							//assign new node to current from the right of the parent node 
							
							if(current.right==null){
								current.right=new BSTNode(null,data,null);
								size++;
								return true;
								}
							current=current.right;
						}
						else if(current.data==data){							
							return true;
						}					
					
					}
				}			
			
			return false;
		}
		public void inOrder(BSTNode root){
			if(this.root==null){
				System.out.print("empty tree");
				
			}
			else{
				helpInOrder(this.root);
			}
		}
	public void helpInOrder(BSTNode t){
			if(t!=null){
				helpInOrder(t.left);
				System.out.print(t.data+" ");
				helpInOrder(t.right);
			}
		}
	public int leafNodes(BSTNode root){		
		int count=0;
		if(root==null){
			return 0;
		}
		else{
			if(root.right==null && root.left==null){				
				return ++count;
				}
			else {
				if(root.right!=null){					
					count=count+leafNodes(root.right);
				}
				if(root.left!=null){
					count=count+leafNodes(root.left);
				}
			}
		}
		return count;
	}
	public void preOrder(BSTNode root){
		if(root==null){
			System.out.print("Empty root");
		}
		else{		
			helpPreOrder(root);
			
		}
	}
	public void helpPreOrder(BSTNode root){
			if(root!=null){
				System.out.print(" "+root.data);
				helpPreOrder(root.left);
				helpPreOrder(root.right);
				
			}
	}
	public void postOrder(BSTNode root){
		if(root==null){
			System.out.print("Empty root");
		}
		else{		
			helpPostOrder(root);
			
		}
	}
	public void helpPostOrder(BSTNode root){
			if(root!=null){				
				helpPostOrder(root.left);
				helpPostOrder(root.right);
				System.out.print(" "+root.data);
				
			}
	}
	public boolean contains(int key){		
		if(root==null){
			return false;
		}	
		else{
			while(root!=null){
				if(root.data==key){
					return true;
				}
				else if(root.data>key){
					if(root.left==null){
						return false;
					}
					root=root.left;				
					
				}
				else{
					if(root.right==null){
						return false;
					}
					root=root.right;
				}
			}
		}
		return false;
	}

	public int size(){
			return this.size;
		}
	public BSTNode getRoot(){
		return this.root;
	}
}
class BSTNode{
	BSTNode left;
	BSTNode right;
	int data;
	BSTNode(BSTNode left,int data,BSTNode right){
		this.left=left;
		this.right=right;
		this.data =data;
	}
	public String toString(){
		return " "+this.data;
	}
	
}
