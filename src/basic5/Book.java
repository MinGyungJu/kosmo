package basic5;

public  class Book {

	private static int count;
	
	public Book() {
		count++;
	}
	public static int getcount() {
		return count;
	}
}

/*
 * static
 * 
 *  - 객체의 공유
 *  - 객체 생성ㅂ돠 먼저 실행하기 떄문에 클래스명 접근
 */
