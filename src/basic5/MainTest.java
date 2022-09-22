package basic5;

public class MainTest {

	public static void main(String[] args) {
		
		Book b1 = new Book();
		System.out.println("총갯수 : "+b1.getcount());
		
		Book b2 = new Book();
		System.out.println("총갯수 : "+b2.getcount());
	
		Book b3 = new Book();
		System.out.println("총갯수 : "+b3.getcount());


		System.out.println("총갯수 : "+ Book.getcount());
	}
	
}
