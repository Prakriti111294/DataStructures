package AVLTree;

public class Main {

	public static void main(String[] args) {
		
		//Insert
		//Delete
		//Traversal
		// min, maxNum
		// find max height of tree
		
		//Balance factor should be -1 or 0 or 1
		///BF = ht(left subtree)-ht(right subtree)
		//4 types of rotation : LL , RR , LR, RL
		//LL problem- rotate the node into right
		//RR problem -rotate the node into left
		//LR problem - rotate the lower node in right and then upper node in left (LR is the solution)
		// RL problem - vice versa of above
		
		//AVL tree is  strictly balances bst
		
		//Its time complexity : O(log n) (avg case and worse case)
		//Its space complexity : O(log n)
		
		//Its better than red black tree for 
		
		
		Tree t = new Tree();
		
		t.insert(20);
		
		 t.insert(25);
		  
		  
		  t.insert(30) ;
		  t.insert(32) ;t.insert(35) ;
		  
		  //t.printRoot();
		 t.levelOrder();
		
		//t.findHeight();
		
		/*
		 * t.insert(5); t.insert(15); t.insert(27); t.insert(19); t.insert(16);
		 */
		//t.inOrder();
		//t.preOrder();
		/*
		 * System.out.println(" "); t.inOrderAVL();
		 */
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
