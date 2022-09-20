package basic2;

import java.util.Scanner;

/*
 * for : 반복 횟수가 정해진 경우
 * while : 횟수를 모르는 경우
 * do~ while : 횟수를 모르는 경우 (조건을 나중에 비교)
 */

public class Ex02_반복문구분 {

	public static void main(String[] args) {
		// 구구단 단수를 입력받아서 해당 단의 구구단을 출력
		Scanner sc = new Scanner(System.in);
		/*
		// 1. for 문
		System.out.println("몇 번 반복을 할까요?");
		int su = sc.nextInt();
		
		for(int n = 0; n<su ; n++) {
			System.out.println("=======구구단중 원하는 단수를 입력=========");
			int i = sc.nextInt();
			for(int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
		}
		*/
		
		
		// 2. while 문
		/*
		while(true) {
			System.out.println("=======구구단중 원하는 단수를 입력=========");
			int i = sc.nextInt();
			for(int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
			
			System.out.println("반복을 끝낼까요(Y)?");
			sc.nextLine();
			String answer = sc.nextLine();
			if (answer.equalsIgnoreCase("Y"))break;			//.equals = String이기에 == 이 아니라 .equals 사용
															//.equalsIgnoreCase = 대소문자 구분 안하고 쓸수있게 만드는 함수
		}
		*/
		//3. do ~while
		
		boolean run = true;
		do {
			System.out.println("=======구구단중 원하는 단수를 입력=========");
			int i = sc.nextInt();
			for(int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
		}while(run);
		System.out.println("반복을 끝낼까요(Y)?");
		sc.nextLine();
		String answer = sc.nextLine();
		if (answer.equalsIgnoreCase("Y"));
		
		
			
		
			
		
		
		
	
		


}
}
