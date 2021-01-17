package Codility;

public class Demo extends Book {
	
	int bookId = 4567;
	
	public int getValue() {
		return bookId ;
	}
	
	public void call() {
		System.out.println(super.getValue());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book();
		super.call();
		
	}

}
