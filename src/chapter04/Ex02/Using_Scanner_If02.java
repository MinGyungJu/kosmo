package chapter04.Ex02;

import java.util.Scanner;

public class Using_Scanner_If02 {

	public static void main(String[] args) {
		// 점수(score)와 학년(year)을 인풋 받아서 60점이상이면 합격, 미만이면 불합격
		//  4학년인 경우 70점이상이면 합격 , 중첩 if 문 사용( if 내에 if문)
		
		Scanner sc = new Scanner (System.in);
		int score = sc.nextInt();
		int year = sc.nextInt();
				
		if (score>=60 && year<4 ) {		
			System.out.println("합격");			 
		}else if (score<60 && year<4) {
			System.out.println("불합격");
		}else if (score>=70 && year>=3) {
			System.out.println("합격");
		}else 
			System.out.println("불합격");
		
	
		sc.close();
			
		
		

	}

}
