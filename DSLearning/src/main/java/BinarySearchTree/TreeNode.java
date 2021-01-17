package BinarySearchTree;

public class TreeNode {
	
	private int data;
	private TreeNode leftChild ;
	private TreeNode rightChild ;
	
	public TreeNode(int data) {
		this.data=data;
	}

	public void insert (int value) {
		
		if (data == value) return ;
		else if (value < data) {
			if (leftChild==null) {
				leftChild = new TreeNode(value) ;
			}
			else {
				//recursive function
				//Calling the same insert method (of TreeNode class) for the leftChild , i.e. the data used will be of left child for comparison with value
				leftChild.insert(value);
			}
		}
		
		else if (value > data) {
			if (rightChild == null) {
				rightChild = new TreeNode(value) ;
			}
			else {
				rightChild.insert(value);
			}
		}
	}
	
	public int get (int value) {
		if (value == data) {
			return this.getData() ;
		}
		else if (value < data) {
			if (leftChild!=null) {
				leftChild.get(value);
			}
		}
		else if (value > data) {
			if (rightChild!=null) {
				rightChild.get(value);
			}
		}
		return -1 ;
	}
	
	//code correct but not working properly
	public int min() {
		if (leftChild==null) {
			return data;
		}
		else {
			leftChild.min();
		}
		return Integer.MIN_VALUE;
	}
	
	//code correct but not working properly
	public int max() {
		if (rightChild==null) {
			return this.getData();
		}
		else {
			rightChild.max();
		}
		
		return 0;
	}
	
	public void traverseInOrder () {
		
		if (leftChild!=null) {
			leftChild.traverseInOrder();
		}
		System.out.print( data + " ,");
		
		if (rightChild!=null) {
			rightChild.traverseInOrder();
		}
	}
	
	public void traversePreOrder() {
		
		System.out.print(data + " ,");
		
		if (leftChild!=null) {
			leftChild.traversePreOrder();
		}
		
		if(rightChild!=null) {
			rightChild.traversePreOrder();
		}
		
	}
	
public void traversePostOrder() {
		
		
		if (leftChild!=null) {
			leftChild.traversePreOrder();
		}
		
		if(rightChild!=null) {
			rightChild.traversePreOrder();
		}
		
		System.out.print(data + " ,");
		
		
	}

	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}

	
	

}
