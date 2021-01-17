package BST_practice;

public class Main {

	public static void main(String[] args) {
		
		//Insert
		//Delete
		//Traversal
		// min, maxNum
		//is tree a binary tree
		// find max height of tree
		//Unival
		
		Tree t = new Tree();
		
		t.insert(25);
		t.insert(20);
		
		
		t.insert(15);
		t.insert(27);
		t.insert(30); t.insert(29); t.insert(26); t.insert(22); t.insert(32);
						 
		 t.levelOrder();
		//t.inOrder();
		//t.preOrder();
		System.out.println(" ");
		//t.inOrderAVL();
		/*
		 * t.max(); System.out.println(" ");
		 * 
		 * t.min();
		 */
		  
		  //t.getNode(20);
		  //t.findHeight();
		  
		  //t.isBinaryTree();
		  //t.deleteNode(20);
		  
		 
		  //t.traversePostOrder();
		  //t.traversePreOrder();
		
		//t.traverseInOrder();
		//System.out.println(" "); 
		
		//System.out.println(t.get(29));
		/*
		 * int maxNum = t.max(); System.out.println(maxNum);
		 */
	}

}
