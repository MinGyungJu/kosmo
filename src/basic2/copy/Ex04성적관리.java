package basic2.copy;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex04성적관리 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int Score[] = new int[3]; // 학생 총점 저장 배열 생성
		int Kor[] = new int[100]; // 국어 점수들 저장 배열 생성
		int Eng[] = new int[100]; // 영어 점수들 저장 배열 생성
		int Mth[] = new int [100]; // 수학 점수들 저장 배열 생성
		int sum[] = new int[100]; // 총 점수 합산 저장 배열 생성
		int sumK = 0; // 국어 합산 변수 생성
		int sumE= 0; // 영어 합산 변수 생성
		int sumM= 0; // 수학 합산 변수 생성
		int count = 0;


		// 입력문
		System.out.println("입력할 학생 수를 입력하세요");
		int n = sc.nextInt();
		sc.nextLine(); // 엔터키 오류 방지


		for(int i = 0; i<n; i++) {
		System.out.println("국어, 영어, 수학 점수를 입력하세요 (" + (i+1)+"번)");
		String sco = sc.nextLine();
		StringTokenizer score = new StringTokenizer(sco,"/"); // /로 입력받은 값 구분
		for(int j=0; score.hasMoreTokens();j++) {
		String str = score.nextToken();
		Score[j] = Integer.parseInt(str); // 입력 받은 값들 score에 저장
		sum[i] += Score[j]; // sum 배열에 학생 별 점수 저장

		Kor[count] = Score[0]; // 국어 점수 Kor 배열에 저장
		Eng[count] = Score[1]; // 영어 점수 Eng 배열에 저장
		Mth[count] = Score[2]; // 수학 점수 Mth 배열에 저장

		}
		count++;
		sumK += Kor[i]; // 국어 점수 저장
		sumE += Eng[i]; // 영어 점수 저장
		sumM += Mth[i]; // 수학 점수 저장
		}

		for(int i =0; i<n; i++) {

		System.out.printf("%d번째 학생의 총점은 %d이고, 평균은 %.2f입니다. \n",i+1,sum[i],(double)sum[i]/count);
		}
		System.out.printf("국어과목 총점은 %d이고, 평균은 %.2f입니다. \n",sumK,(double)sumK/count);
		System.out.printf("영어과목 총점은 %d이고, 평균은 %.2f입니다. \n",sumE,(double)sumE/count);
		System.out.printf("수학과목 총점은 %d이고, 평균은 %.2f입니다. \n",sumM,(double)sumM/count);

		sc.close();
		
	}
}
