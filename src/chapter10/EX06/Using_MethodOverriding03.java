package chapter10.EX06;

import java.util.Arrays;

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
	@Override
	void run() {
		System.out.println("발로 달림");
	}
	void eat() {
		System.out.println("고기");
	}
	
}
class Eagle extends Animal{
	@Override
	void run() {
		System.out.println("날라다님");
	}
	void eat() {
		System.out.println("쥐");
	}
	
}
class Fish extends Animal{
	@Override
	void run() {
		System.out.println("헤엄침");
	}
	void eat() {
		System.out.println("이끼");
	}
	
}
class Dog extends Animal{
	@Override
	void run() {
		System.out.println("헥헥 달림");
	}
	void eat() {
		System.out.println("개 사료를 먹음");
	}
	
}



public class Using_MethodOverriding03 {
	public static void main(String[] args) {
		Animal a1 = new Animal();
		Animal t1 = new Tiger();
		Animal e1 = new Eagle();
		Animal f1 = new Fish();
		Animal d1 = new Dog();
		
		System.out.println("==for문==");
		Animal[] arr1 = new Animal[] {a1,t1,e1,f1,d1};
		for(int i=0; i<arr1.length; i++) {
			arr1[i].run();
			arr1[i].eat();
		}
		
		System.out.println("==강화된 for문==");
		for(Animal k : arr1) {
			k.run();
			k.eat();
		}
		
		
		
	}

}
