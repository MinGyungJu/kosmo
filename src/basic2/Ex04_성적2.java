package basic2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex04_성적2 {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		int kor [] = new int [5];
		
		/*
		 * 3명의 국어점수를 입력하세요(ex. 10/20/30/40/50
		 */
		System.out.println(kor.length+"명의 국어점수를 입력하세요 (ex. 10/20/30/40/50)");
		String inputData= sc.nextLine();	//"10/20/30/40/50 "
		StringTokenizer st = new StringTokenizer(inputData, "/");
		for(int i =0; st.hasMoreTokens();i++) {
			String str = st.nextToken();
			kor[i]=Integer.parseInt(str);
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
