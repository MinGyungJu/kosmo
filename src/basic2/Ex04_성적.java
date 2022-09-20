package basic2;

import java.util.Scanner;

public class Ex04_성적 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int kor [] = new int [5];
		
		for (int i=0; i<kor.length; i++) {
			System.out.println(i +"번 학생의 국어점수를 입력");
			kor[i]=sc.nextInt();
		}
		
		//출력
		for(int i =0;i<kor.length; i++) {
			System.out.println(i+"번 학생의 점수 : "+kor[i]);
		}
		
		// 위학생들 점수의 총점과 평균을 출력
		int sum=0;
		int avg = 0;
		for(int i =0; i<kor.length; i++) {
			sum+=kor[i];
			avg = sum/kor.length;
		}
		System.out.println(sum);
		System.out.println(avg);
	
		
	}
}
