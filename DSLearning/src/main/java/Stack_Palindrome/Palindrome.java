package Stack_Palindrome;

import java.util.Stack;

public class Palindrome {
	
	private String str;
	
	public Palindrome(String str) {
		
		this.str=str ;
		
	}
	
	
	public boolean checkPalindrome() {
		int i=0 ;
		boolean flag = false ;
		
		str.replaceAll("^a-zA-Z' '", "");
		String[] arr = str.split(" ");
		Stack<String> stack = new Stack<String>();
		//pushing items from array to stack
		for (String item : arr) {
			stack.push(item);
			System.out.print(item);
		}
		System.out.println();
		//Checking for palindrome
		while(!stack.isEmpty()) {
			if(stack.pop().equalsIgnoreCase(arr[i])) {
				flag = true ;
				i++;
			}
			else {
				flag = false ;
				break;
			}
		}
		
		return flag ;
		}
	}


