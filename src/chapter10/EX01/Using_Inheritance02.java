package chapter10.EX01;

class Fruit {		//과일 <==부모 클래스
	String name;	//과일 이름
	String color;	//과일 색깔
	int large;		//과일의 크기
	
	void eat () {
		System.out.println("모든 과일은 맛이 있습니다.");
	}
	void print() {
		System.out.println(name +","+color+","+large);
	}
}
class Apple extends Fruit{		//사과 <== 자식클래스
	//자식 클래스만 가지는 필드1, 메소드1
	int appleID;
	void eatApple() {
		System.out.println("사과먹기"+appleID);
	}
	
}
class Orange extends Fruit{		//오렌지 <== 자식클래스
	//자식 클래스만 가지는 필드1, 메소드1
	int orangeID;
	void eatOrange() {
		System.out.println("오렌지먹기"+orangeID);
	}
}
class Banana extends Fruit{		//바나나 <== 자식클래스
	//자식 클래스만 가지는 필드1, 메소드1
	int bananaID;
	void eatBanana() {
		System.out.println("바나나먹기"+bananaID);
	}
}

public class Using_Inheritance02 {
	public static void main(String[] args) {
		Fruit f = new Fruit();

		f.name = "과일";
		f.color = "빨강";
		f.large = 10;
		
		f.eat();
		f.print();
		
		Apple a = new Apple();
		
		a.name =" 사과";
		a.color = "빨강";
		a.large = 30;
		a.appleID = 1000;
		
		a.eat();
		a.print();
		a.eatApple();
		
		Orange o = new Orange();
		
		o.name = "오렌지";
		o.color = "노랑";
		o.large = 20;
		o.orangeID = 10000;
		
		o.eat();
		o.print();
		o.eatOrange();
		
		Banana b = new Banana();
		
		b.name = "바나나";
		b.color = "노랑";
		b.large = 40;
		b.bananaID = 1212;
		
		b.eat();
		b.print();
		b.eatBanana();
		
		System.out.println("================");
		
	}
}
