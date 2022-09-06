package chapter04.Ex02;

import java.util.Scanner;

public class Using_Scanner_if04 {

	public static void main(String[] args) {
		// 에스프레소, 카페라떼, 아보카도 주문할 경우 3,500원
		// 아메리카노 를 주문할 경우 : 2,500원
		// 그외의 메뉴를 출력 할 경우 : 우리메장에 없는 메뉴 입니다.

		// 출력 : 주문하신 <에스프레소>는 가격이 <3,500>입니다.
		//		 우리매장에 없는 메뉴 입니다.
		
		System.out.println("주문 하실 메뉴를 고르세요>>>>>");
		Scanner sc = new Scanner(System.in);
		
		String order = sc.next();
		int a = 3500;
		int b = 2500;
		
		if (order.equals("에스프레소") || order.equals("카페라떼") || order.equals("아보카도")){
			System.out.printf("주문하신 " + order + "는 가격이 %d원 입니다 ", a);	
		}else if (order.equals("아메리카노")){
			System.out.printf("주문하신 " + order + "는 가격이 %d원 입니다 ", b);
		}else {
			System.out.println("우리매장에 없는 메뉴입니다");
		}
				
		sc.close();
		
		
		
		
		
		
		
		
		
		
	}

}
