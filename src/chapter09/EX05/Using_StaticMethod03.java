package chapter09.EX05;

//static 필드의 값 초기화 : 클래스 내부에서 static { 필드의 값을 초기화 }
// 클래스명.필드명, 호출될떄 static{} 이 제일 먼저 작동
class C{
	int a ;
	static int b;
	
	static {	//클래스가 클래스영역에 로드될때 제일 먼저 작동. 생성자와 같은 역할
//		a=10;	//인스턴스 필드는 초기화 할 수 없다.
		b=5;
		System.out.println("클래스 C 가 로딩되었습니다");
	}
	
	C() {		//생성자 : 객체를 생성시 필드의 초기값을 할당
		a=3;	// 인스턴스 필드 초기화
		b =55;	// 정적 필드 초기화
	}
}

public class Using_StaticMethod03 {
	
	int a;
	static int b;
	
	void abc() {
		System.out.println("abc() - 인스턴스 메소드");
	}
	static void bcd() {
		System.out.println("bcd() - 정적 메소드");
	}

	public static void main(String[] args) {
		// 객체 생성 없이 static 필드 호출
		
		System.out.println(C.b);
		
//		System.out.println(a);	//인스턴스 필드
		
		System.out.println( b); //정적 빌드
		
//		abc();	//인스턴스 메소드
		bcd();	// 정적메소드

	}

}
