package chapter07.EX01;
//원의 지름을 넣었을때 전체 넓이를 구하는 객체를 생성 후 출력
		//		피자 : 10 (반지름)
		// 		도넛 : 5 (반지름)
		//	3.14 X 반지름제곱
		// 	피자의 넓이는 00 입니다. 
		//	도넛의 넓이는 00 입니다.
class Circle1{
	int a;
	String name;
	
	Circle1(int a, String name){
		this.a = a;
		this.name = name;
	}
	
	void call() {
		double b;
		b= 3.14 * a * a;
		System.out.println(name + "의 넓이는" + b+" 입니다");
	}	
}

public class Solo_donut_Rework {

	public static void main(String[] args) {
		Circle1 pizza = new Circle1 (10, "피자");
		pizza.call();
		Circle1 donut = new Circle1 (5, "도넛");
		donut.call();

	}

}
