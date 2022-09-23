package inherit;

public class MainTest {

	public static void main(String[] args) {
//		
//		Umma u = new Umma();
//		u.job();
//		u.gene();
		
//		System.out.println("====================================");
//		
//		Ddal d = new Ddal();
//		d.study();
//		d.job();	// 기능이 부모클래스와 안맞아서  오버라이딩을해서 바꿈
//		d.gene();  
//		
		//Ddal d = new Umma();
		
		// * 부모변수에 자식객체 생성이 가능
//		Umma u = new Ddal();
//		u.job();
//		u.gene();
//		
		// * 형변환 : (casting)
		// 1. 기본형끼리만 가능
		// 2. 참조형에서 상속관계에 있는 경우만 가능
		
		//	String s = new String();
		//  StringBuffer sb = (Stringbuffer)s; --> x
//		
//		Umma u = new Umma();
//		Ddal d = (Ddal)u;
		
		Ddal d = new Ddal();
		Umma u = (Umma)d;	//업캐스팅 up casting
	
		Ddal d2 = (Ddal)u; // 다운캐스팅 down casting
		
	
	}
}
