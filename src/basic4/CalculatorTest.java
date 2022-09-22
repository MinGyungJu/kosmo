package basic4;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		CalculatorExpr cal = new CalculatorExpr();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 두개를 입력하세요");
		int a = sc.nextInt();
		int b = sc.nextInt();
		cal.setNum1(a);
		cal.setNum2(b);
		
		cal.output();

		while(true) {
			System.out.println("계속 하실껍니까까 Y/N");
		if(sc.next().equalsIgnoreCase("N"))break; 
		
		System.out.println("숫자 두개를 입력하세요");

		a = sc.nextInt();
		b = sc.nextInt();
		cal.setNum1(a);
		cal.setNum2(b);
		System.out.println("추출된 숫자 : "+a+","+b);
		
		cal.output();
		}
		
		
		
//		cal.output();
		
		
		
	}
}

