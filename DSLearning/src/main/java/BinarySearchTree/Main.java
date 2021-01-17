package BinarySearchTree;

public class Main {

	public static void main(String[] args) {
		
		//Insert
		//Delete
		//Traversal
		// min, max
		
		Tree t = new Tree();
		
		t.insert(25);
		t.insert(20);
		
		
		  t.insert(15); t.insert(27); t.insert(30); t.insert(29); t.insert(26);
		  t.insert(22); t.insert(32);
		 
		  t.traversePostOrder();
		  //t.traversePreOrder();
		
		//t.traverseInOrder();
		//System.out.println(" "); 
		
		//System.out.println(t.get(29));
		/*
		 * int maxNum = t.max(); System.out.println(maxNum);
		 */
	}

}
