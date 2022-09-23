package zffinal;

class Parent{ // 클래스 앞에 final 을 붙이면 부모클래스 불가
	final String field = "부모님";
	final public void jib() {
		System.out.println("부모님이 만드신거");
	}
}
class Child extends Parent{
	Child(){
		//field = "내꺼";
	}
//	public void jib() {
//		System.out.println("내가 탕진함");
//	}
}

public class Test {

	public static void main(String[] args) {
		Parent p = new Child();
		System.out.println(p.field);
		p.jib();
		
		
	}
}
