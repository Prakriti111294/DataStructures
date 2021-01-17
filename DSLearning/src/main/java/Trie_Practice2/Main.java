package Trie_Practice2;

public class Main {

	public static void main(String[] args) {
		TrieNode_Root t = new TrieNode_Root ();       
        t.insert("dear");
        t.insert("deal");
        t.insert("do");
        t.insert("he");
        t.insert("hen");
        t.insert("heat");
        
        System.out.println("hen present in trie : "+t.search("hen"));
        System.out.println("hear present in trie : "+t.search("hear"));
        System.out.println("deal present in trie : "+t.search("deal"));
        System.out.println("========================");
        System.out.println("Printing all word present in trie : ");
        t.printAllWordsInTrie(t.root,"");              
    }
	}


