package Trie_practise;

public class Main {

	public static void main(String[] args) {
		{    
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        /** Accept words **/        
	        System.out.println("Trie Test\n");
	        System.out.println ("Enter words to be entered into trie");
	        String input = br.readLine();
	        String[] s = input.split(" ");
	        /** Create Trie with accepted words **/
	        HashTrie t = new HashTrie(s);
	        /** Trie Test **/
	        char ch = 'n';
	        do
	        { 
	            System.out.println("\nEnter word to search ");
	            String key = br.readLine();
	            System.out.println("Search status : "+ t.contains(key));
	 
	            System.out.println("\nDo you want to continue (Type y or n) \n");
	            ch = br.readLine().charAt(0);                        
	        } while (ch == 'Y'|| ch == 'y');         
	    }

	}

}
