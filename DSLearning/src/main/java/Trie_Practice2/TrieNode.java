package Trie_Practice2;

import java.util.Iterator;
import java.util.LinkedList;

public class TrieNode {
	
	Character data;
	LinkedList<TrieNode> childList;
	boolean isEnd;
	int count;
	
	 /* Constructor */
	TrieNode(char c){
		this.data=c;
		childList=new LinkedList<TrieNode>();
		count=0;
		isEnd=false;
	}
	
	public TrieNode getChild(char ch) {
		if(childList!=null) {
			for (TrieNode child : childList) 
				if (child.data==ch) return child ;
				}
		return null;
	}
	
}
