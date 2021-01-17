package Codility;


//Java implementation to count the 
//number of visible nodes in 
//the binary tree 

//Class containing the left and right 
//child of current node and the 
//key value 
class Node { 
 int data; 
 Node left, right; 

 // Constructor of the class 
 public Node(int item) 
 { 
     data = item; 
     left = right = null; 
 } 
} 

public class GFG { 
 Node root; 

 // Variable to keep the track 
 // of visible nodes 
 static int count; 

 // Function to perform the preorder traversal 
 // for the given tree 
 static void preOrder(Node node, int max) 
 { 

     // Base case 
     if (node == null) { 
         return; 
     } 

     // If the current node value is greater 
     // or equal to the max value, 
     // then update count variable 
     // and also update max variable 
     if (node.data >= max) { 
         count++; 
         max = Math.max(node.data, max); 
     } 

     // Traverse to the left 
     preOrder(node.left, max); 

     // Traverse to the right 
     preOrder(node.right, max); 
 } 

 // Driver code 
 public static void main(String[] args) 
 { 
     GFG tree = new GFG(); 

     /* 
             5 
            /  \ 
          3     10 
         /  \   / 
        20   21 1  
*/

     tree.root = new Node(5); 
     tree.root.left = new Node(3); 
     tree.root.right = new Node(10); 

     tree.root.left.left = new Node(20); 
     tree.root.left.right = new Node(21); 

     tree.root.right.left = new Node(1); 

     count = 0; 
     preOrder(tree.root, Integer.MIN_VALUE); 

     System.out.println(count); 
 } 
} 