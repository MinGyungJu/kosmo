package review_Test;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CalculatorExpr cal = new CalculatorExpr();
		System.out.println("숫자 두개를 입력하세요");
		int a = sc.nextInt();
		int b = sc.nextInt();
		cal.setNum1(a);
		cal.setNum2(b);
		
		cal.input();
		
		while(true) {
			System.out.println("종료하시겠습니까? Y/N");
			if(sc.next().equalsIgnoreCase("N"))break;
			System.out.println("숫자 두개를 입력하세요");
			
			
			a = sc.nextInt();
			b = sc.nextInt();
			cal.setNum1(a);
			cal.setNum2(b);
			
			System.out.println(a +","+b);
			cal.input();
			
		}
		
	}
}
