package basic3;

public class EX01_함수1 {

	public static void main(String[] args) {
		int a = 10, b= 20;
		
		add(a,b);
	}
	
	static void add(int a, int b) {		//알규멘트 , 인자 , 파라맨트 
		// 여기에서 a, b 의 값을 합해서 출력
		int sum = a + b;
		System.out.println("합 : "+sum);
	}
}
