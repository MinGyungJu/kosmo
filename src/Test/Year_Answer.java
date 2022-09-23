package Test;

import java.util.Calendar;

//가. 자신이 태어난 년도인 숫자를 저장 할 수 있는 변수 year를 선언하고
//자신이 태어난 년도를 대입한다.     
//나. 자신의 나이를 저장할 수 있는 변수 age를 선언하고, 
//year 변수를 사용하여 자신의 나이를 계산하여 대입한다(공식:현재년도-태어난 년도)
//단, 현재 년도는 Calendar클래스를 사용하여 구해야한다
//그리고 age 와 year를 출력하여라

// 1. 변수 year = 자신이 태어난 년도인 숫자 저장할 수 있는 변수
// 2. 자신이 태어난 년도를 대입
// 3. 변수 age = 자신의 나이를 저장 할 수 있는 변수 age 선언
// 4. year 변수를 사용해서 자신의 나이를 계산하여 대입 ( 현재년도 - 태어난년도)
// 현재년도는 Caledner 함수사용
// 그리고 age 와 year 출력

public class Year_Answer {
	public static void main(String[] args) {
		
		int year= 1994;
		Calendar c = Calendar.getInstance();
		
		int age =c.get(Calendar.YEAR)-year+1;
		
		System.out.println("나이는" +age);
		System.out.println("태어난 연도는 " +year);
		
		
		
		
	}
	
	
}
