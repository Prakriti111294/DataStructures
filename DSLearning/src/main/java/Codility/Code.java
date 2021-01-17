package Codility;

public class Code {
	
	public void callMe() throws Exception{
		try {
			int value=3/0;
		}
		catch(ArithmeticException ae){
			System.out.println(ae);
		}
	}
	
	public void calling() {
		callMe();
	}
}
