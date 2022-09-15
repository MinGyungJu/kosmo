package chapter09.EX05;

	//메서드 이름앞에 static 가 없는 메서드 : 인스턴스 메서드 : 객체 생성 후 호출이 가능
	//메서드 이름앞에 static 가 있는 메서드 : 정적 메서드	: 객체 생성 후 호출, 객체 생성 없이도 호출 가능

class A{
	
	void abc() {
		System.out.println("인스턴스 매서드");
	}
	static void bcd() {
		System.out.println("정적 메서드");
	}
	
}

public class Using_StaticMethod01 {

	public static void main(String[] args) {
		// 객체 생성 없이 바로 호출 : 정적 메서드 (클래스명.메소드명())
//		A.abc();		//인스턴 스메서드 : 객체 생성후 객체 명으로 호출
		A.bcd();
		
		//객체 생성후 호출
		System.out.println("=========");
		A a = new A();
		
		a.abc();		// 인스턴스 메소드
		a.bcd();		// 정적 메소드

	}

}
