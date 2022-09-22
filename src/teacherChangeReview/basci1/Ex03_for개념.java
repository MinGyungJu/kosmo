package teacherChangeReview.basci1;

/*
 * 반복문 : for / while / do~while
 * 
 * (1) for (초기치; 조건문; 증가치){
 * 		 반복구문
 * 		}
 */
public class Ex03_for개념 {

	public static void main(String[] args) {
		
		//1) 1부터 10까지 숫자 출력
		for(int i=1; i<=5; i++) {
		System.out.print(i+" ");
		}
		System.out.println();
		//[2]
		int sum =0;
		for(int i =1; i<=10; i++) {
			sum+=i;
		}System.out.println(sum);
		//[3]
		int sum1=0;
		for(int i =1; i<=10; i+=2) {
			sum1+=i;
		}System.out.println(sum1);
		
		
		/*2) "A" 부터 "Z"까지 출력
		for(char i ='A'; i<='Z' ; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for(char i ='A'; i<='Z' ; i+=2) {
			System.out.print(i+" ");
		}
		System.out.println();
		// Z부터 A까지 출력
		for(char i = 'Z'; i>='A'; i--) {
			System.out.print(i+" ");
		}
		*/
		
	}

}
