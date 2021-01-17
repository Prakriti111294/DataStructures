package Trie;

public class Trie {

	TrieNode root ;
	
	void insert (String word) {
		if (root==null) {
			Character ch = word.charAt(0);
			TrieNode child=new TrieNode();
			root.trieMap.put(ch, child);
			root=root.trieMap.get(ch);
			root.insert(root, word, 1);
		}
		
		else
			root.insert(root, word, 0);
	}
	
}
