package Trie_Practice3_HashMap;

import java.util.HashMap;
import java.util.LinkedList;

//https://java2blog.com/trie-data-structure-in-java/
public class TrieNode {
	
	HashMap<Character, TrieNode> childList;
	int count;
	boolean isEnd;
	
	 /* Constructor */
	TrieNode(){
		this.childList=new HashMap<Character, TrieNode>();
		this.isEnd= false ;
		this.count=0;
	}
	
	public TrieNode getChild(char ch) {
		
		if (childList!=null) 
			if (childList.containsKey(ch)) return childList.get(ch) ;
		return null ;
	}
	
}
