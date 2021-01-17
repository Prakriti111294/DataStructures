package Codility;

public class TreeSolution {
	Tree root ;
	static int max, count ;
	
	public static int solution(Tree T) {
		// Base case 
	     if (T == null) { 
	         return -1; 
	     } 
	     
	     if (T.x >= max) { 
	         count++; 
	         max = Math.max(T.x, max); 
	     } 
	     solution(T.l);
	     max = T.x;
	     solution(T.r);
	     
		return count;
	}
	
	public static void main(String[] args) {
		
		TreeSolution tree = new TreeSolution();
		/*
		 * tree.root = new Tree(5); tree.root.l = new Tree(3); tree.root.r = new
		 * Tree(10);
		 * 
		 * tree.root.l.l = new Tree(20); tree.root.l.r = new Tree(21);
		 * 
		 * tree.root.r.l = new Tree(1);
		 */
		tree.root = new Tree(8); 
	    tree.root.l = new Tree(2); 
	    tree.root.r = new Tree(6); 

	    tree.root.l.l = new Tree(8); 
	    tree.root.l.r = new Tree(7); 

	   // tree.root.r.r = new Tree(6); 
	    
	    
			    /* 
		        5 
		       /  \ 
		     3     10 
		    /  \   / 
		   20   21 1  
			    */
	    
	    System.out.println(solution(tree.root));
		
		
	}
	
	

}
