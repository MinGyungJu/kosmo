package chapter04.Ex04;

import java.util.Scanner;

public class Using_For05 {

	public static void main(String[] args) {
		// 이중 for 문을 사용해서 1단 ~ 9단까지 출력
		/* 	\n : enter , \t : tab
		 	1*1=1	1*2=2	1*3=3	.............1*9=9
		 	2*1=2	2*2=4	.....................2*9=18
		 	.....
		 	9*1=9
		 */

		for (int a = 1; a<10 ; a++) {	
			for(int b=1; b<10; b++) {	
				System.out.print(a+ "*"+ b + "=" + a*b );
				System.out.print("\t");
		}
			System.out.println();
		}
		
		System.out.println("=======================================");
		
		// 1단 ~19단까지 3의 배수 값만 출력
		
		for (int c =1; c<=19; c++) {
			for (int d=2; d<=19; d++) {
			 if ( c % 3 == 0) {
				System.out.print(c+ "*"+ d + "=" + c*d);
				System.out.print(" \t");
			}
		}
		if ( c % 3 == 0) {
			System.out.println();
		}
	}
		
		// 스캐너에서 입력 받은 단만 출력 (1~9단)
		//출력할 단을 입력하세요 ( 1~9단)>>>
		//	====================
		// 1*1 = 1
		// 1*2 = 2
		
		Scanner sc= new Scanner(System.in);
		System.out.println("출력할 단을 입력하세요 (1~9단)>>>>>>>>>>>>");
		System.out.println("=================================");
		
		int e =sc.nextInt();
		
		for(int f =1; f<10; f++) {
			System.out.println(e+ "*"+ f + "=" + e*f);
		}
		sc.close();		
			}

		
 }


