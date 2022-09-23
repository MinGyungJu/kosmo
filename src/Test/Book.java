package Test;
//2> 책 정보에 대한 정보를 관리하기 위해 Book 이라는 클래스를 만들고, 
//
//책제목, 저자, 출판사에 대한 정보를 저장하고,
//
//각각의 정보에 값을 지정하고 출력할 수 있도록 클래스를 설계하시오.

// 1 book 클래스 만들기
// 2. 책제목 저자 출판사에 대한 정보 저장
// 3. 각각의 정보에 값을 지정


public class Book {
	private String name = "홍길동전";
	private String author = "허균";
	private String publisher = "미상";
	
	public Book() {}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public Book(String name, String author, String publisher) {
		this.name=name;
		this.author=author;
		this.publisher=publisher;
	}
	
	
	
	
	
}

