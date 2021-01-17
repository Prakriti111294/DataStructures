package Trie_Practice3_HashMap;

public class TrieNode_Root {

	TrieNode root;
	
	public TrieNode_Root() {
		
		this.root=new TrieNode();
	}
	
	public void insert (String word) {
		if (word==null) return ;
		else {
			TrieNode current = root ;
			for (Character ch : word.toCharArray()) {
				TrieNode child= current.getChild(ch) ;
				if (child == null) {
					child=current.childList.put(ch, new TrieNode());
				}
				current=current.getChild(ch) ;
			}
			current.isEnd=true ;
			current.count++;
		}
	}

	public boolean search(String word) {
		
		TrieNode current = root ;
		for (Character ch : word.toCharArray()) {
			TrieNode child= current.getChild(ch) ;
			if (child == null) return false ;
			current=current.getChild(ch);
		}
		return true ;
	}
	
	public void remove (String word) {
		
		TrieNode current = root ;
		for (Character ch : word.toCharArray()) {
			TrieNode child=current.getChild(ch);
			if (child==null) {
				System.out.println(word + " is not present in the trie");
				return ;
			}
			else {
				if (child.count==1) {
					current.childList.remove(ch);
					return ;
				}
				else {
					child.count-- ;
					current=current.getChild(ch);
				}
			}
			
		}
		current.isEnd=false;
	}
	
	/* public void printAllWordsInTrie(TrieNode root,String s)
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
	      
	    } */
}
