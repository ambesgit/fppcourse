package lessonten;

public class MainApp {

	public static void main(String[] args) {
		ProblemOne tr=new ProblemOne();
		tr.insert(9);
		tr.insert(8);
		tr.insert(20);	
		tr.insert(45);
		tr.insert(2);
		tr.insert(1);
		tr.insert(3);
		tr.insert(19);
		tr.insert(10);
		tr.insert(10);
		System.out.println("this is the current size of the tree:  ");
		System.out.println(tr.size());
		System.out.println("this is the root of the tree:  ");
		System.out.println(tr.getRoot().toString());
		System.out.println("the number of leafnodes in the tree:  ");
		System.out.println(tr.leafNodes(tr.getRoot()));
		System.out.println("this is the result of inordertraverse:");		
		tr.inOrder(tr.getRoot());	
		System.out.println();
		System.out.println("this is the result of preordertraverse:");
		tr.preOrder(tr.getRoot());
		System.out.println();
		System.out.println("this is the result of postordertraverse:");		
		tr.postOrder(tr.getRoot());
		System.out.println();
		System.out.println("this checks if 19 is in the tree which is true:  ");
		System.out.println(tr.contains(19));
		System.out.println("this checks if 5 is in the tree which is false:  ");
		System.out.println(tr.contains(5));
		

	}

}
