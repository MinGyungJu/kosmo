package chapter10.EX03;

class Animal{		//최상위 부모 클래스
	
	String name;
	int age;
	String color;
	
	void eat() {
		System.out.println("모든 동물은 음식을 먹습니다.");
	}
	void sleep() {
		System.out.println("모든 동물은 잠을 잠니다.");
	}
}
class Tiger extends Animal{
	//Animal 클래스의 모든 필드와 메소드를 상속 받는다.
	int tiger;	//갯수
	void tigerEat() {
		System.out.println("호랑이는 다른 동물을 잡아 먹습니다");
	}
}
class Eagle extends Animal{
	//Animal 클래스의 모든 필드와 메소드를 상속 받는다.
	int eagle;	//갯수
	void eagleFly() {
		System.out.println("독수리는 하늘을 날라다닙니다");
	}
}
class Dog extends Animal{
	//Animal 클래스의 모든 필드와 메소드를 상속 받는다.
	int dog;	//갯수
	void dogCry() {
		System.out.println("개는 멍멍짖습니다다");
	}
}	
class Dog_sub extends Dog{
	//Animal 클래스의 모든 필드와 메소드를 상속 받는다.
	//Dog 클래스의 모든 필드와 메소드를 상속받는다
	int dog_sub;
	void dog_subCry(){
		System.out.println("새끼 강아지는 낑낑 거립니다");
	}
}

public class Using_Polymorphism02 {
	public static void main(String[] args) {
		
		//1. Animal 객체를 Animal 타입으로 생성
			//a1은 Animal 타입만 가지고있다
				//Animal 클래스의 필드와 메소드만 접근이 가능
		Animal a1 = new Animal();
//		System.out.println(a1.name, a1.color, a1.age, a1.eat(), a1.sleep());
		
		//2. Tiger 객체를 Tiger 타입으로 생성
			//t1 은 Animal,Tiger 타입을 가지고있다.
				//t1은 Animal 과 Tiger 클래스의 필드와 매소드만 접근이 가능
		Tiger t1 = new Tiger();
//		System.out.println(t1.name, t1.color, t1.age, t1.eat(), t1.sleep(), t1.tiger, t1.tigerEat());
		//3. Tiger 객체를 Animal 타입으로 생성	// 업캐스팅
			//a2는 Animal, Tiger 타입을 가지고있고 Animal 타입으로 지정
			// a2는 Animal의 필드와 메소드만
		Animal a2 =(Animal)new Tiger();
//		System.out.println(a2.name,a2.color,a2.age, a2.eat(), a2.sleep());
		
		//4. Dog 객체를 Dog 타입으로 생성
			//d1은 Animal, Dog를 내포하고 있고, Dog 타입으로 지정
			// d1은 Animal, Dog 의 필드와 메소드 모두 사용 가능
		Dog d1 = new Dog();
//		System.out.println(d1.name, d1.color, d1.age,d1.eat(),d1.sleep(),d1.dog,d1.dogCry());
		
		//5. Dog 객체를 Animal 타입으로 생성
			//a3는 Animal, Dog 를 내포하고있다 . Animal 타입으로 지정
			//a3 는 Animal 의 필드와 메소드만 접근
		Animal a3 = new Dog();
//		System.out.println(a3.name, a3.color,a3.age,a3.eat(),a3.sleep());
	
		//6. Dog_sub 객체를 Dog_sub 타입으로 생성
			//ds1 은 Animal, Dog , Dog_sub 타입을 내포하고있고 Dog_sub타입으로지정
			//ds1은 Animal, Dog, Dog_sub의 필드와 메소드로 접근가능
		Dog_sub ds1 = new Dog_sub();
//		System.out.println(ds1.name, ds1.color,ds1.age,ds1.eat(),ds1.sleep(),ds1.dog,ds1.dogCry(),ds1.dog_sub,ds1.dog_subCry());
	
		//7. Dog_sub 객체를 Dog 타입으로 생성
			//d2 는 Animal , Dog, Dog_sub 타입을 내포하고 있고 Dog 타입으로 지정
			//d2 는 Animal, Dog 의 필드와 메소드로 접근가능
		Dog d2 = new Dog_sub();
//		System.out.println(d2.name,d2.color,d2.age,d2.eat(),d2.sleep(),d2.dog,d2.dogCry());
		//8 Dog_sub 객체를 Animal 타입으로 생성
			//a4는 Animal, Dog, Dog_sub 타입을 내포하고 있고 Animal 타입으로 지정
			//a4는 Animal 의 필드와 메소드로만 접근 가능
		Animal a4 = new Dog_sub();
		a4.name="동물";
		a4.color="검정";
		a4.age = 4;
		a4.eat();
		a4.sleep();
//	System.out.println(a4.name, a4.color,a4.age);
		
	
	
	}

}
