package basic3;

public class Ex01_함수3 {
	
	public static void main(String[] args) {
		
		int [] result = add();
		// a 와 b 값을 받아서 합한 결과를 여기서 출력
		int sum=0;
		for(int i=0; i<result.length; i++) {
			sum+=result[i];
		}System.out.println("합계는" +sum);
		
	}
	
	
	static int[] add() {
		int a =10, b= 20;
		int []arr = {a,b};
		
		return arr;
	}
}
