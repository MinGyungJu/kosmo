package chapter10.EX07;

class Animal{
	//자식클래스에서 2개메소드를 오버라이딩
	// Animal 타입으로 정의 , 배열에 저장후 오버라이딩 된 메소드 출력(for ,Enhanced for)
	void run() {
		System.out.println("모든 동물은 달립니다.");
	}
	void eat() {
		System.out.println("모든 동물은 먹습니다.");
	}
}

class Tiger extends Animal{
	int count;	//호랑이 수
	//생성자 : 정수를 인풋 받아서 count 필드에 값을 할당.
	Tiger(int count){
		this.count = count;
	}
	
	@Override
	void run() {
		System.out.println("발로 달림");
	}
	@Override
	void eat() {
		System.out.println("고기");
	}
	
}
class Eagle extends Animal{
	int count; //독수리 수
	Eagle(int count){
		this.count = count;
	}
	@Override
	void run() {
		System.out.println("날라다님");
	}
	@Override
	void eat() {
		System.out.println("쥐");
	}
	
}
class Fish extends Animal{
	int count;	//물고기 수
	Fish(int count){
		this.count = count;
	}
	@Override
	void run() {
		System.out.println("헤엄침");
	}
	@Override
	void eat() {
		System.out.println("이끼");
	}
	
}
class Dog extends Animal{
	int count;	//개 수
	Dog(int count){
		this.count = count;
	}
	@Override
	void run() {
		System.out.println("헥헥 달림");
	}
	@Override
	void eat() {
		System.out.println("개 사료를 먹음");
	}
	
}

public class Using_Method_Overriding04 {
	public static void main(String[] args) {
		//1. 객체생성
		// 1. 객체 생성(Animal 타입으로 생성)
			//생성자를 통해서 각각의 필드에 값을 할당.
		Animal a1 = new Animal();
		Animal t1 = new Tiger(10);	
		Animal e1 = new Eagle(5);	
		Animal f1 = new Fish(50);		
		Animal d1 = new Dog(70);		
		
		//객체를 배열에 저장
		Animal []arr1 = new Animal[] {a1,t1,e1,f1,d1};

		// for문을 사용해서 출력 : eat () , run() , 동물의 총 갯수
			//1. For문을 사용해서 객체를 Animal 객체로 뽑아서
		
			//2. 다운캐스팅을 해서 자식 필드의 count 읽어서 총 더한값을 출력
		
		//동물의 총 합을 구하는 변수 선언
		int sum=0;
		
		for(int i=0; i<arr1.length; i++) {
			
			//배열에 각 방에 저장된 객체를 Animal 객체에 저장
			Animal aa = arr1[i];
			aa.eat();		//Animal 의 eat() 메소드 : 오버라이딩 된 메소드가 출력
			aa.run();		//Animal 의 run() 메소드 : 오버라이딩 된 메소드가 출력
		
			if(aa instanceof Tiger) {
				Tiger t2 = (Tiger)aa;
				sum+= t2.count;		//sum = sum + t2.count
			}
			if(aa instanceof Eagle) {
				Eagle e2 =(Eagle)aa;
				sum+= e2.count;
			}
			if(aa instanceof Fish) {
				Fish f2 =(Fish)aa;
				sum+= f2.count;
			}
			if(aa instanceof Dog) {
				Dog d2 =(Dog)aa;
				sum+= d2.count;
			}
			
		}
		System.out.println(sum);
		
		
		
	}
}
