package chapter04.Ex02;

import java.util.Scanner;

public class Using_Scanner_if {

	public static void main(String[] args) {
		// 문제 : Scanner로 정수값을 인풋 받아서
		// 국어점수(aa), 영어(bb), 수학(cc), 과학(dd), 음악(ee) 점수를
		// 인풋 받습니다.
		// if 문을 사용해서 평균이 90점이넘으면 "A 학점", 80점이상 "B 학점"
		// 70점이상 "C학점", 60점 이상 "D학점" , 나머지 : "F학점"

		
		Scanner sc = new Scanner (System.in);
		
		int aa = sc.nextInt();
		int bb = sc.nextInt();
		int cc = sc.nextInt();
		int dd = sc.nextInt();
		int ee = sc.nextInt();
		
		double avg = (aa + bb +cc + dd + ee) / 5.0;
		
		
		System.out.printf("각 과목의 평균 값은 : %4.2f \n", avg);
		
		if (avg >=90) {
			System.out.println("A학점입니다");
		}else if (avg >=80) {
			System.out.println("B학점입니다");
		}else if (avg >=70) {
			System.out.println("C학점입니다");
		}else if (avg >=60) {
			System.out.println("D학점입니다");
		}else
			System.out.println("과락입니다");
		
		sc.close();
		


		

		
		
		
		

	}

}
