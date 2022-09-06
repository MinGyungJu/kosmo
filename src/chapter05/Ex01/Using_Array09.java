package chapter05.Ex01;

import java.util.Scanner;

public class Using_Array09 {

	public static void main(String[] args) {
		// 	
		Scanner sc = new Scanner(System.in);
		
		//라인 전체를 통체로 인풋 받음 >>> 국어 영어 수학 과확
		// sc. next();		//국어	
		// sc. nextLine(); 	// 국어 영어 수학 과학
		System.out.println("문자열을 입력하세요(라인 전체) >>");  
		String s1 = sc.nextLine();
		System.out.println(s1);
		
		System.out.println("문자열을 입력하세요(한단어 : 문자열) >>");
		String s2 = sc.next();
		System.out.println(s2);
		
		//국어 80점 영어 50점 수학77 과학 88		
			//<== 전체 라인을 인풋받아서 공백을 기준으로 잘럿 배열에 저장
		
		

	}

}
