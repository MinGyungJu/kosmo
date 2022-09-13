package chapter07.EX05;

class Aaa{
	int m1,m2,m3,m4;
	Aaa(){
		m1=1;m2=2;m3=3;m4=4;
	}
	Aaa(int a){
		m1=a;m2=2;m3=3;m4=4;
	}
	Aaa(int a , int b){
		m1=a;m2=b;m3=3;m4=4;
	}
	void print() {
		System.out.print(m1+" ");
		System.out.print(m2+" ");
		System.out.print(m3+" ");
		System.out.print(m4+" ");
		System.out.println();
	}

}
//Bbb 클래스 : 여러개의 생성자 사용시 this()를 사용한 경우 : 중복된 값을 제정
class Bbb{
	int m1,m2,m3,m4;
	Bbb(){		//기본생성자, 각 필드의 초기값을 할당
		m1=1;m2=2;m3=3;m4=4;
	}
	Bbb(int a){
		this();
		m1=a;
		
	}
	Bbb(int a, int b){
		this(a);
		m2=b;
	}
	void print() {
		System.out.print(m1+" ");
		System.out.print(m2+" ");
		System.out.print(m3+" ");
		System.out.print(m4+" ");
		System.out.println();
	}
}

public class ThisMethod02 {

	public static void main(String[] args) {
		//1. 3개의 객체 생성(this 미사용)
		System.out.println("===Aaa객체 생성(this 미사용)==");
		Aaa aaa1 = new Aaa();	//기본 생성자 호출
		aaa1.print();
		
		Aaa aaa2 =new Aaa(10);	//매개변수 1개인 생성자 호출
		aaa2.print();
		
		Aaa aaa3=new Aaa(10,20);	//매개변수 2개인 생성자 호출
		aaa3.print();
		
		//2. 3개 객체 생성(this() 사용)
		System.out.println("===Bbb객체 생성(this()미사용==");
		Bbb bbb1 = new Bbb();	//기본생성자 호출
		bbb1.print();
		
		Bbb bbb2 =new Bbb(10);		//매개변수 1개인 생성자호출
		bbb2.print();
		
		Bbb bbb3 = new Bbb(10,20);
		bbb3.print();

	}

}
