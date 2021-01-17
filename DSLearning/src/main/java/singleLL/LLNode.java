package singleLL;

import java.util.Stack;

public class LLNode {
	int data ;
	LLNode next;
	
	LLNode (int data){
		this.data=data;
	}
	
	public int insert(LLNode root,LLNode newNode) {
		/*
		 * while(root.next!=null) { root=root.next; } root.next=newNode;
		 */
		if (root.next==null) {
			root.next=newNode;
		return root.next.data;
				}
		else insert (root.next,newNode);
		return root.next.data;
	}

	public LLNode reverse(LLNode root) {
		// TODO Auto-generated method stub
		LLNode curr=root;
		LLNode prev=null;
		LLNode next=null;
		 
		while (curr!=null) {
		next=curr.next;
		
		curr.next=prev;
		prev=curr;
		curr=next;
			
	}
		return  prev;
	
	}

	//Using recursion
	public void printRev(LLNode root) {
		// TODO Auto-generated method stub
		if (root.next==null) {
			System.out.println(root.data);
			return ;
		}
		else {
			printRev(root.next);
			System.out.println(root.data);
		}
	}

	//Using recursion
	public void printForward(LLNode root) {
		if(root==null) return;
		System.out.println(root.data);
		printForward(root.next);
		
	}
	

	//Tricky
	//Youtube : https://www.youtube.com/watch?v=S92RuTtt9EE
	public LLNode reverseRecursion(LLNode root) {
		if (root==null || root.next==null) {
			return root ;
		}
		else  {
			LLNode newroot=reverseRecursion(root.next);
			root.next.next=root;
			root.next=null;
			return newroot;
		}
		
	}

	//Not proper
	public LLNode revUsingStack(LLNode root) {
		LLNode temp=root;
		Stack<LLNode> s1=new Stack<LLNode>();
		while(temp!=null) {
			s1.push(temp);
			temp=temp.next;
		}
		
		LLNode top=s1.peek();
		LLNode newRoot=top;
		s1.pop();
		top.next=s1.peek();
		LLNode nextNode=s1.peek();
		
		while(nextNode!=null) {
			top=s1.peek();
			s1.pop();
			nextNode=s1.peek();
			top.next=s1.peek();
		}
		return newRoot;
		
	}

}
