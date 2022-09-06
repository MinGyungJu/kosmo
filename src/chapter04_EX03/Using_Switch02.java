package chapter04_EX03;

import java.util.Scanner;

public class Using_Switch02 {

	public static void main(String[] args) {
		// 에스프레소, 카페라떼, 아보카도 주문할 경우 3,500원
				// 아메리카노 를 주문할 경우 : 2,500원
				// 그외의 메뉴를 출력 할 경우 : 우리메장에 없는 메뉴 입니다.

				// 출력 : 주문하신 <에스프레소>는 가격이 <3,500>입니다.
				//		 우리매장에 없는 메뉴 입니다.
		
		Scanner sc = new Scanner(System.in);
		String order = sc.next();
		int a = 3500;
		int b = 2500;
		
		switch (order) {
		case "에스프레소": case "카페라떼" : case "아보카도": 
			System.out.printf("주문하신 " + order + "는 가격이 %d원 입니다", a);
			break;
		case "아메리카노" :
			System.out.printf("주문하신 " + order + "는 가격이 %d원 입니다", b);
			break;
		default :
			System.out.println("우리매장에 없는 메뉴입니다.");
			
		}
		sc.close();
			

	}

}
