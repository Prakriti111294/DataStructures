package Codility;

import java.util.Random;

public class Demo1 {

	private static String id;
	private Random random =new Random();
	
	public Demo1() {
		if(id==null) {
			
		}
		id="ACC1101" + Math.abs(random.nextInt());}
	public String getId() {
		return id ;

	}

}
