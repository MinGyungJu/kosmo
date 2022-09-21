package basic3;

public class Test1 {

	void method() throws MyException{
		
		// 일부로 예외발생
		throw new MyException();
		
	}
}

// 사용자 예외클래스
class MyException extends Exception{
	
}
