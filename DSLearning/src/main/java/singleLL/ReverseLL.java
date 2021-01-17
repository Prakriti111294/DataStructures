package singleLL;

public class ReverseLL {
	
		public LLNode root;
		
		public void insert (int val){
			
			if (root!=null) {
				LLNode newNode=new LLNode(val);
				int e=root.insert(root,newNode);
				//System.out.println(e);
			}
			else root=new LLNode(val);
				
		}
		
		public void display() {
			LLNode temp=root;
			while (temp!=null) {
				System.out.println(temp.data);
				temp=temp.next;
			}
			
		}
		
		public void reverse() {
			root=root.reverse(root);
			
		}
		
		//Reverse using  reccursion
		public void reverseRecursion() {
			if (root!=null)
			root=root.reverseRecursion(root);
			
		}
		
		//Using recursion
		public void printRev() {
			root.printRev(root);
		}
		
		//Using recursion
		public void printForward() {
			if (root!=null)
			root.printForward(root);
		}
		
		public void revUsingStack() {
			if (root!=null)
			System.out.println(root.revUsingStack(root).data);
			
		}
	


	public static void main(String[] args) {
		ReverseLL r=new ReverseLL();
		//ReverseLL.LLNode n=r.new LLNode(1);
		r.insert(1);
		r.insert(2);
		r.insert(3);
		r.insert(4);
		//r.reverse();
		//r.display();
		//r.printRev();
		//r.reverseRecursion();
		r.revUsingStack();
		r.printForward();
}

	
}