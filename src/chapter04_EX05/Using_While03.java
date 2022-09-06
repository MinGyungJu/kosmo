package chapter04_EX05;

import java.util.Scanner;

public class Using_While03 {

	public static void main(String[] args) {
		// "그만" 할때까지 정수값을 넣어서 합계와 평균을 구하시요
		// String 으로 인풋 값을 받아서 정수로 변환
		
		// 1. String s = sc.nextLine(); 인풋 받는다
		// 2. s.splite(" ") ; <== 공백을 기준으로 잘라서 배열에 저장
		// 3. 문자형 String  을 정수형으로 변환 , Iner.perseInt( )
		// 4 . 합계와 평균을 구하면 됩니다
		// 챔터 5- 유싱 어레이 11 참고
		
		Scanner sc = new Scanner(System.in);
		String s;
		
		do {
			System.out.println("정수값을 입력하세요");
			s=sc.nextLine();
			String arr[];
			arr=s.split(" ");
			
			int b;
			int sum=0;
			int count = 0;
			for(int i=0; i<arr.length; i++) {
				b = Integer.parseInt(arr[i]);
				sum+=b;
				count++;
			}
			if (s.equals("그만")) {
				break;
			}
			
			
			System.out.println("정수의 합은 : " + sum);
			System.out.println("정수의 평균은 : " + sum/(double)count);
		}while(true);
		System.out.println("프로그램 종료");
		sc.close();
		}

	}


