package AVLTree;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode {

	int data;
	TreeNode left;
	TreeNode right; 
	int height;
	
	public TreeNode(int data) {
		this.data = data;
	}
	
	public int bf(TreeNode root) {
		if (root==null) return 0;
		int bf=findHeight(root.left) - findHeight(root.right);
		return bf;
		
	}
	//https://www.youtube.com/watch?v=a96JFhw5Ee4
	public TreeNode insert(TreeNode root ,int val) {
		TreeNode newNode=new TreeNode(val);
		if (root==null) {
			return newNode;
			} 
		//if (root.data==val) return null ;
		if (val<root.data) {
			root.left=insert(root.left,val);
		}
		if (val>root.data) {
			root.right=insert(root.right, val);
		}
		int bf = bf(root);
		
		if (bf<-1 && val>root.right.data) {
			root=leftRotate(root);
		}
		
		if (bf<-1 && val<root.right.data) {
			TreeNode l=rightRotate(root.right);
			root=leftRotate(root);
		}
		if (bf>1 && val>root.right.data) {
			TreeNode l=leftRotate(root.left);
			root=rightRotate(root);
		}
		
		if (bf>1 && val<root.right.data) {
			TreeNode l=rightRotate(root.right);
			root=leftRotate(root);
		}
		return root;
		
	}
	
	public void levelOrder(TreeNode root) {
	      
	      if (root!=null){
	          Queue<TreeNode> q=new LinkedList<>();
	          TreeNode temp=root;
	          q.add(temp);

	          while(!q.isEmpty()){
	              if(temp.left!=null) q.add(temp.left) ;
	              if (temp.right!=null) q.add(temp.right);

	              System.out.print (q.remove().data + " ");
	              temp=q.peek();
	          }

	      }
	    }

	
	public TreeNode leftRotate(TreeNode root) {
		
		//Given
		TreeNode c=root;
		TreeNode b=c.right;
		TreeNode t3=b.left;
		
		//Rotate/Replace
		root=b;
		b.left=c;
		c.right=t3;
		
		//Update height
		c.height=findHeight(c);
		b.height=findHeight(b);
		
		return root;
	}
	
	public TreeNode rightRotate(TreeNode root) {
		
		//Given(nodes needed for rotation)
		TreeNode c=root;
		TreeNode b=c.left;
		TreeNode t3=b.right;
		
		//Rotate/Replace
		root=b;
		b.right=c;
		c.left=t3;
		
		//Update height
		c.height=findHeight(c);
		b.height=findHeight(b);
		
		return root;
	}

	public void inOrder(TreeNode root) {
		if (root==null) return ;
		else {
			inOrder(root.left);
			System.out.print(root.data + ", ");
			inOrder(root.right);
		}
		
	}
	
	/*
	 * public void inOrderAVL(TreeNode root) { String str=""; if (root==null) return
	 * ; else { if (root.left==null) str+="."; else str+=root.left.data;
	 * 
	 * str+=root.data;
	 * 
	 * if (root.right==null) str+="."; else str+=root.right.data;
	 * 
	 * System.out.print(str + "   "); inOrderAVL(root.left); inOrderAVL(root.right);
	 * } }
	 */
	
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
	
	//Very imp
	public int findHeight(TreeNode root) {
		if (root==null) return 0;
		else {
			int leftHt = findHeight(root.left);
			int rightHt= findHeight(root.right);
			
			root.height=Math.max(leftHt,rightHt)+1;
			return Math.max(leftHt,rightHt)+1;
		}
		//return -1;
	}
	
	public boolean isBinaryTree(TreeNode root) {
		if (root==null) return true;
		return ((root.left==null) || (root.data>root.left.data) && (isBinaryTree(root.left))) &&
				((root.right==null) || (root.data<root.right.data) && (isBinaryTree(root.right))) ;
	}
	
	
	//Not proper (read from net
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
			// 1. Copyy the min val from right subtree to the root and delete the other min value node
			else if (root.left!=null && root.right!=null) {
				//Min value on right subtree of node
				int minVal = min(root.right);
				root.data=minVal;
				deleteNode(root.right, minVal);
				return root;
				
			}
			
			int bf = bf(root);
			
			if (bf<-1 && val>root.right.data) {
				root=leftRotate(root);
			}
			
			if (bf<-1 && val<root.right.data) {
				TreeNode l=rightRotate(root.right);
				root=leftRotate(root);
			}
			if (bf>1 && val>root.right.data) {
				TreeNode l=leftRotate(root.left);
				root=rightRotate(root);
			}
			
			if (bf>1 && val<root.right.data) {
				TreeNode l=rightRotate(root.right);
				root=leftRotate(root);
			}
			return root;
			
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
