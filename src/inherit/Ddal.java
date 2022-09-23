 package inherit;

public class Ddal extends Umma {

	public Ddal() {
	
		System.out.println("딸생성");
	}
	public void study(){
		System.out.println("딸은 공부중");
	}

	public void job() {  //오버라이딩
		System.out.println("직업없음");
	}
	public void gene() { //오버라이딩
		System.out.println("딸은 딸");
	}
}
