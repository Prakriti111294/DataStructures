package Trie;

import java.util.HashMap;

public class TrieNode {

	HashMap<Character, TrieNode> trieMap;
	boolean isEnd;
	
	TrieNode() {
		//Key is ch which will point to next TriNode(linked through key-value pair thus used HAshMap)
		this.trieMap=new HashMap<Character, TrieNode>();
		this.isEnd=false;
	}
	
	//Taking global variable flag - to create root
	int flag=1;
	
	public void insert(TrieNode root, String word , int index) {
		
		//When the full word is inserted 
		if (word.length()==index+1) {
			root.isEnd = true;
			return ;
		}
		
		Character ch=word.charAt(index);
		
		//Inserting root
		//Not needed - already done in Trie class thus never executed here
		if (flag==0) {
			TrieNode child=new TrieNode();
			//ch key pointing to child(child is the value of ch key)
			root.trieMap.put(ch, child);
			root=root.trieMap.get(ch);
			flag=1;
			root.insert(root, word, index+1);
		}
		
		else {
			if (root.trieMap.containsKey(ch)) {
				root=root.trieMap.get(ch);
				System.out.println(ch);
				root.insert(root, word, index+1);
			}
			
			else {
				TrieNode child=new TrieNode();
				root.trieMap.put(ch, child);
				System.out.println(ch);
				root=root.trieMap.get(ch);
				root.insert(root, word, index+1);
			}
		}
	}
}
