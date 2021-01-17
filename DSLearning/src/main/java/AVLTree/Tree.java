package AVLTree;

public class Tree {

	TreeNode root ;
	
	public void insert(int val) {
		TreeNode newNode=new TreeNode(val);
		if (root==null)
			root=newNode ;
		
		root=root.insert(root,val);
	}
	
	public void printRoot() {
		System.out.println(root.data);
	}
	
	public void inOrder() {
		if(root==null) return ;
		else root.inOrder(root);
	}
	
	/*
	 * public void inOrderAVL() { if(root==null) return ; else
	 * root.inOrderAVL(root); }
	 */
	
	public void preOrder() {
		if(root==null) return ;
		else root.preOrder(root);
	}
	
	public void levelOrder() {
		if(root==null) return ;
		else root.levelOrder(root);
	}
	
	public void max() {
		if(root==null) return ;
		else System.out.println(root.max(root));
	}
	
	public void min() {
		if(root==null) return ;
		else System.out.println(root.min(root));
	}
	
	public void getNode(int val) {
		if (root!=null) {
			System.out.println(root.getNode(root, val));
		}
	}
	
	public void findHeight() {
		if (root!=null) {
			System.out.println(root.findHeight(root));
		}
	}
	
	public void isBinaryTree() {
		if (root!=null) {
			System.out.println(root.isBinaryTree(root));
		}
	}
	
	public void deleteNode(int n) {
		if (root!=null) {
			System.out.println(root.deleteNode(root,n).data);
		}
	}
}
