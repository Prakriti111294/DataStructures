package Codility;


public class StringReduce {


	    // Complete the superReducedString function below.
	    static void superReducedString(String s) {
	    	for(int i=1; i<s.length(); i++) {
	    		if(s.charAt(i) == s.charAt(i-1)) {
	    			s = s.substring(0,i-1) + s.substring(i+1);
	    			i = 0;
	    		}
	    	}
	    	if(s.length() == 0) {
	    		System.out.println("Empty");
	    	}else {
	    		System.out.println(s);
	    	}
	    
	    }
	    
	    public static void main(String[] args) {
			String s="aaabccddd";
			superReducedString(s);
		}

	    
	}


