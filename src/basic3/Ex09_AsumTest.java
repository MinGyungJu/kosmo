package basic3;

public class Ex09_AsumTest {

	public static void main(String[] args) {
		
		int sum = sumFunc(3);
		System.out.println("총 합은 : " + sum);
		
	}
	
	static int sumFunc(int i) {
		// sum = 1+ 2+ 3.... sumFunc() 안에 들어간 숫자만큼, 처음은 3했기에 3까지
		if( i == 1)return 1;
		
		return i + sumFunc(i-1);
		
	}
}
