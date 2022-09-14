package chapter07.EX05;

class Car{
	
	/* this 키워드 : 필드나 메서드 선언시 사용 불가.
	 				- 생성자, 메서드 내부에서 필드나 메서드를 사용할때 자신의 객체 필드나 메서드를 지칭
	 				- 자신의 객체의 필드, 메서드를 가르킨다. 기본적으로 생략해서 많이사용.
	 				- 반드시 사용해야 할 경우 : 메소드, 생성자에서 입력 매개변수 이름, 필드 이름이 동일 할 경우
	   this ()  	- 생성자 내부에서만 사용 , 반드시 첫 라인에 위치
	   				- 자신의 객체의 다른 생성자를 호출
	   				- 생성을 오버라이딩 할 때 , 코드를 간략 하게 사용
	
	*/
	String companyName;		//현대자동차
	String color;			//검은색
	double maxSpeed;		//200.0 km/h
	
	Car(){
		companyName = "없음";
		color = "없음";
		maxSpeed = 0;
	}
	Car(String companyName){
		this();
		this.companyName= companyName;
	}
	Car(String companyName, String color){
		this(companyName);
		this.color= color;
	}
	Car(String companyName, String color, double maxSpeed){
		this(companyName, color);
		this.maxSpeed= maxSpeed;
	}
	void print() {
		System.out.println("차의 회사이름은 : "+companyName);
		System.out.println("차의 색깔은 : "+color);
		System.out.println("최대속력은 : "+maxSpeed+"km/h");
		System.out.println();
	}
	
}

public class ThisMethod04 {

	public static void main(String[] args) {
		System.out.println("====매개변수가 0개일때=====");
		Car car1= new Car();
		car1.print();
		System.out.println("====매개변수가 1개일때=====");
		Car car2 = new Car("현대자동차");
		car2.print();
		System.out.println("====매개변수가 2개일때=====");
		Car car3 = new Car("현대자동차","검은색");
		car3.print();
		System.out.println("====매개변수가 3개일때=====");
		Car car4 = new Car("현대자동차","검은색",200.0);
		car4.print();

	}

}
