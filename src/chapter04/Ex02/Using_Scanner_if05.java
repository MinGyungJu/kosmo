package chapter04.Ex02;

import java.util.Scanner;

public class Using_Scanner_if05 {

	public static void main(String[] args) {
		/* 
		 나이(age)가 8세 미만이면 : "취학 전 아동입니다"
		 						"입장료는 <1,000>원 입니다.
		 나이가 14세 미만이면 : "초등학생입니다."
		 					  "입장료는 <2,000>원 입니다.
		 나이가 20세 미만이면 : "중, 고등학생입니다"
		 					"입장료는 <2,500>원 입니다.
		 나이가 20세 이상이면 : "일반인 입니다"
		 					"입장료는 <3,000>원 입니다.
		 */
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		

		if (age < 8) {
			System.out.printf("취학전 아동입니다 " + "입장료는 %d원 입니다.", 1000);
			}else if (age <14) {
			System.out.printf("초등학생입니다. " + "입장료는 %d원 입니다.", 2000);
			}else if (age <20) {
			System.out.printf("중, 고등학생입니다. " + "입장료는 %d원 입니다.", 2500);
			}else {
			System.out.printf("일반인 입니다"+ "입장료는 %d원 입니다.", 3000);
			}
		
			
		sc.close();
		
		
		
		
	}

}
