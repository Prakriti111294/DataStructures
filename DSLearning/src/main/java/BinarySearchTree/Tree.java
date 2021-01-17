package BinarySearchTree;

public class Tree {
	
	TreeNode root ;
	
	public void insert(int data) {
		
		if (root == null) {
			root = new TreeNode(data) ;
		}
		else {
			//Calling insert method of TreeNode class (on the node root)
			root.insert(data);
		}
	}
	
	public int get(int value) {
		if (root!=null) {
			return root.get(value);
		}
		return -1;
	}
	
	public void delete (int value) {
		
		root = delete (root , value);	
	}
	
	//It will also provide replacement of the deleted node 
	private TreeNode delete(TreeNode subTreeRoot , int value ) {
		if (subTreeRoot==null) {
			return subTreeRoot;
		}
		else { // traversing to get the nodeToBeDEleted
			if (value < subTreeRoot.getData()) {
				subTreeRoot.setLeftChild(delete(subTreeRoot.getLeftChild(), value));
			}
			else if (value > subTreeRoot.getData()) {
				subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), value));
			}//Case 1 and 2 : node having 0 or 1 children
			else if (value == subTreeRoot.getData()) {
				if (subTreeRoot.getLeftChild()==null) {
					return subTreeRoot.getRightChild();
				}
				else if (subTreeRoot.getRightChild()==null) {
					return subTreeRoot.getLeftChild();
				}
				else {
					//Case 3 : Node having 2 children
					
					//Replace the value in subtreeRoot node with the smallest value from right subTree
					subTreeRoot.setData(subTreeRoot.getRightChild().min());
					//Delete the node that has smallest value in right subtree 	                 
					subTreeRoot.setRightChild(delete(subTreeRoot.getRightChild(), subTreeRoot.getData()));
				}
			}
		}
		return subTreeRoot;
	}
	
	public int min() {
		if (root!=null) {
			return root.min();
		}
		return -1;
	}
	
	public int max() {
		if (root!=null) {
			return root.max();
		}
		return -1;
	}
	
	public void traverseInOrder() {
		if (root!=null) {
			root.traverseInOrder();
		}
	}
	
	public void traversePreOrder () {
		if (root!=null) {
			root.traversePreOrder();
		}
	}
	
	public void traversePostOrder () {
		if (root!=null) {
			root.traversePostOrder();
		}
	}

}
