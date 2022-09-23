package poly;

public class Book extends Item{
	
	private String author;
	private String publisher ;
	
	public Book () {
		this("000", "제목없음","무명", "출판사");
		System.out.println("Book 기본생성자");
	}
	
	
	public Book(String num,String name,String author,String publisher){
		super.num =num;
		super.name = name;
		
		this.publisher = publisher;
		this.author = author;
		System.out.println("Book 인자 생성자");
	}
	
	public void output() {
		System.out.println(num);
		System.out.println(name);
		System.out.println(author);
		System.out.println(publisher);
	}
}
