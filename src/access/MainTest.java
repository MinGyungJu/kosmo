package access;

import accother.Access;

public class MainTest extends Access{

	public static void main(String[] args) {
		
		MainTest acc =new MainTest();
		//프로텍티드를 하며 자식클래스로 상속하면서
		// Access acc = new Access(); 를 
		// => MainTest acc = new Access();로 변경
		
	//	acc.a = "프라이빗 변경"; //=>private(그 클래스에서 접근가능)
		acc.b = "퍼블릭 변경";
		acc.c = "프로텍티드 변경"; //=> 디폴트와같이 동일패키지에서만 가능한데	
								//  다른 패키지인경우 자식클래스에만 가능
		//acc.d = "디폴트 변경";	=> 같은 패키지에서만 가능
		
		acc.output();
		
	}
	
}
