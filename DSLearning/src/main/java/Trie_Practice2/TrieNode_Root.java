package Trie_Practice2;

import java.util.Iterator;

public class TrieNode_Root {

	TrieNode root;
	
	public TrieNode_Root() {
		this.root=new TrieNode(' ');
	}
	
	public void insert (String word) {
		TrieNode current=root;
		if (search(word)==true) return ;
		
		else {
			for(char ch : word.toCharArray()) {
				TrieNode child=current.getChild(ch);
				if (child!=null) {
					current=child;
				}
				
				else {
					TrieNode newChild=new TrieNode(ch);
					current.childList.add(newChild);
					current=current.getChild(ch);
				}
			current.count++;
			}
			current.isEnd=true ;
		
		}
	}

	public boolean search(String word) {
		TrieNode current= root ;
		for(char ch : word.toCharArray()) {
			if (current.getChild(ch)==null) return false;
			else current=current.getChild(ch);
		}
		if (current.isEnd=true) return true;
		else return false;
	}
	
	public void remove (String word) {
		TrieNode current=root;
		if (search(word)==false) System.out.println(word + " is not present in  the trie ");
		else {
			for(char ch : word.toCharArray()) {
				TrieNode child=current.getChild(ch);
				
				if (child.count==1) {
					current.childList.remove(child);
					return;
				}
				else {
					child.count--;
					current=child;
				}
			}
			current.isEnd=false;
		}
	}
	
	 public void printAllWordsInTrie(TrieNode root,String s)
	    {
	      TrieNode current = root;
	      if(root.childList==null || root.childList.size()==0)
	       return;
	      Iterator<TrieNode> iter=current.childList.iterator();
	     while(iter.hasNext())
	     {
	      TrieNode node= iter.next();
	      s+=node.data;
	      printAllWordsInTrie(node,s);
	      if(node.isEnd==true)
	      { 
	       System.out.print(" "+s);
	       s=s.substring(0,s.length()-1);
	      }
	      else
	      {
	       s=s.substring(0,s.length()-1);
	      }
	     }
	      
	    }
}
