package AAAAAAAA;
//자식클래스에서 2개메소드를 오버라이딩
// Animal 타입으로 정의 , 배열에 저장후 오버라이딩 된 메소드 출력(for ,Enhanced for)
//2번문제 자식클래스에 int count( 숫자)
// 숫자입력 = 10 5 50 70

class Animal{
	void run() {
		System.out.println("모든 동물은 달립니다.");
	}
	void eat() {
		System.out.println("모든 동물은 먹습니다.");
	}
}
class Tiger extends Animal{
	int count;
	Tiger(int count){
		this.count = count;
	}
	@Override
	void run() {
		System.out.println("호랑이가 달린다");
	}
	@Override
	void eat() {
		System.out.println("호랑이는 고기를 먹는다");
	}
}
class Eagle extends Animal{
	int count;
	Eagle(int count){
		this.count =count;
	}
	@Override
	void run() {
		System.out.println("독수리는 난다");
	}
	@Override
	void eat() {
		System.out.println("독수리도 고기를 먹는다");
	}
	
}
class Fish extends Animal{
	int count;
	Fish(int count){
		this.count= count;
	}
	@Override
	void run() {
		System.out.println("물고기는 헤엄친다");
	}
	@Override
	void eat() {
		System.out.println("물고기는 이끼를 먹는다");
	}
	
}
class Dog extends Animal{
	int count;
	Dog(int count){
		this.count=count;
	}
	@Override
	void run() {
		System.out.println("개는 네발로 뛴다");
	}
	@Override
	void eat() {
		System.out.println("개는 사료를 먹는다");
	}
	
}

public class asd {

	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		Animal t1 = new Tiger(10);
		Animal e1 = new Eagle(5);
		Animal f1 = new Fish(50);
		Animal d1 = new Dog(70);
	
		Animal []arr1 = new Animal[] {a1,t1,e1,f1,d1};
		System.out.println("==for구문==");
		for(int i=0; i<arr1.length; i++) {
			arr1[i].run();
			arr1[i].eat();
		}
		System.out.println("==강화된 for구문==");
		for(Animal k : arr1) {
			k.run();
			k.eat();
		}
		
		int sum = 0;
		for(int i=0; i<arr1.length; i++) {
			Animal aa= arr1[i];
			if(aa instanceof Tiger) {
				Tiger t2 = (Tiger)aa;
				sum+=t2.count;
			}
			if(aa instanceof Eagle) {
				Eagle e2 = (Eagle)aa;
				sum+=e2.count;
			}
			if(aa instanceof Fish) {
				Fish f2 =(Fish)aa;
				sum+=f2.count;
			}
			if(aa instanceof Dog) {
				Dog d2 = (Dog)aa;
				sum+=d2.count;
			}	
		}
		System.out.println(sum);
		

}
}
