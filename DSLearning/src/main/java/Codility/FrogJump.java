package Codility;

public class FrogJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test (1 , 5 , 2) ;

	}
	
	public static int test(int X , int Y , int D) {
		
		int ini = X + D ;
		int steps = (Y/D) - 1 ;
		//int rem = Y % D ;
		
		if ((steps*D + ini)>=Y) {
			//System.out.println(steps +1 );
			steps = (steps+1) ;
		}
		else if ((steps*D + ini)<Y) {
			//System.out.println(steps +2 );
			steps = (steps + 2) ;
		}
		return steps;
	
	}

}
