package Codility;

import java.io.IOException;

public class Tester {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			throw new IOException() ;
		}
		catch(IOException | Exception e) {
			System.out.println(e+"caught");
		}
		
	}

}
