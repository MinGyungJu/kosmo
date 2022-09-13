package chapter07.EX05;

class Car{
	
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
