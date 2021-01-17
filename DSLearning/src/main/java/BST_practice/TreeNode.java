package BST_practice;

import java.util.LinkedList;
import java.util.Queue;


public class TreeNode {

	int data;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int data) {
		this.data = data;
	}
	
	public void insert(TreeNode root ,int val) {
		TreeNode newNode=new TreeNode(val);
		if (root.data==val) return ;
		if (val<root.data) {
			if (root.left==null) root.left=newNode;
			else insert(root.left,val) ;
		}
		if (val>root.data) {
			if (root.right==null) root.right=newNode;
			else insert(root.right, val);
		}
	}
	
	public void levelOrder(TreeNode root) {
	      
		
		  if (root!=null){ Queue<TreeNode> q=new LinkedList<TreeNode>(); 
		  TreeNode temp=root;
		  q.add(temp);
		 // System.out.println("before while"); 
		  while(!q.isEmpty()){
		  TreeNode r=q.remove(); 
		  System.out.print (r.data + " ");
		  //System.out.println("inside while"); 
		  if(r.left!=null) q.add(r.left) ;
		  if (r.right!=null) q.add(r.right);
		  }
		  
		  
		  }
		  }
		 
		
	/*
	 * Queue<TreeNode> queue=new LinkedList<TreeNode>(); queue.add(root);
	 * while(!queue.isEmpty()) { TreeNode tempNode=queue.remove();
	 * System.out.printf("%d ",tempNode.data); if(tempNode.left!=null)
	 * queue.add(tempNode.left); if(tempNode.right!=null) queue.add(tempNode.right);
	 * } }
	 */
	
	public void inOrder(TreeNode root) {
		if (root==null) return ;
		else {
			inOrder(root.left);
			System.out.print(root.data + ", ");
			inOrder(root.right);
		}
		
	}
	
	public void inOrderAVL(TreeNode root) {
		String str="";
		if (root==null) return ;
		else {
			if (root.left==null) str+=".";
			else str+=root.left.data;
			
			str+=root.data;
			
			if (root.right==null) str+=".";
			else str+=root.right.data;
			
			System.out.println(str);
			inOrderAVL(root.left);
			inOrderAVL(root.right);
		}
	}
	
	public void preOrder(TreeNode root) {
		if (root==null) return ;
		else {
			System.out.print(root.data + ", ");
			preOrder(root.left);
			preOrder(root.right); 
		}
		
	}
	
	public int max(TreeNode root) {
		if (root==null) return -1 ;
		while (root.right!=null) {
			root=root.right;}
		return root.data;
		
	}
	
	public int min(TreeNode root) {
		if (root==null) return -1 ;
		while (root.left!=null) {
			root=root.left;}
		return root.data;	
	}
	
	public int getNode (TreeNode root, int val) {
		//if(root==null) return -1 ;
		if (root.data==val) return root.data;
		else {
		if (val<root.data && root.left!=null) return getNode(root.left, val);
		else if (val > root.data && root.right!=null) return getNode(root.right,val);
		}
		//If element not found
		return -1 ;
	}
	
	public int findHeight(TreeNode root) {
		if (root==null) return -1;
		else {
			int leftHt = findHeight(root.left);
			int rightHt= findHeight(root.right);
			
			return Math.max(leftHt,rightHt)+1;
		}
		//return -1;
	}
	
	public boolean isBinaryTree(TreeNode root) {
		if (root==null) return true;
		return ((root.left==null) || (root.data>root.left.data) && (isBinaryTree(root.left))) &&
				((root.right==null) || (root.data<root.right.data) && (isBinaryTree(root.right))) ;
	}
	
	public TreeNode deleteNode (TreeNode root, int val) {
		if (root==null) return root;
		
		if (root.data>val) {
			root.left=deleteNode(root.left, val) ;
		}
		if (root.data<val) {
			root.right=deleteNode(root.right, val);
		}
		// the root returned is the modified root after deletion 
		if (val==root.data) {
			//Node to be deleted has no child
			if (root.left==null && root.right==null) {
				root=null;
				return root;
			}
			//Node to be deleted has one child
			else if (root.left==null) {
				root=root.right;
				return root;
			}
			else if (root.right==null) {
				root=root.left;
				return root;
			}
			//Node to be deleted has 2 children
			else if (root.left!=null && root.right!=null) {
				//Min value on right subtree of node 
				int minVal = min(root.right);
				root.data=minVal;
				deleteNode(root.right, minVal);
				return root;
				
			}
		}
		return root;
	}


	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}
	
}
