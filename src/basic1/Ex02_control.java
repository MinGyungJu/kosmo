package basic1;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 제어문 : 프로그램 흐름을 변경하기 위해
 * 
 * 		1) if
 * 		2) swith
 * 		3) for
 * 		4) while / dowhile
 * 		
 * 		5) break / continue
 */

public class Ex02_control {

	public static void main(String[] args) {
		
		String id = null;
		
		Scanner input = new Scanner(System.in);
		System.out.println("주민입력 ->");
		id = input.nextLine();
		
		
		char sung = id.charAt(7);
		System.out.println(sung);
		//sung변수에 문자가 1이거나 3이거나 9이라면 남자
		// 그렇지 않고 문자가 2이거나 4이거나 0이라면 여자 출력
		// char 이기떄문에 if 제어문에 ' ' 써야함
		
		if(sung =='1'|| sung == '3' ||sung=='9') {
			System.out.println("남자입니다");
		}else if( sung == '2'||sung=='4'||sung=='0') {
			System.out.println("여자입니다");
		}
		
		char chul = id.charAt(8);
		System.out.println(chul);
		// chul 변수가 0이라면 서울
		// chul 변수가 1이라면 인천,부산
		// chul 변수가 2이라면 경기
		// chul 변수가 9이라면 제주
		String home = null;
				
		switch (chul) {
		case '0' :
			home = "서울";
			break;
		case '1' :
			home = "인천  / 부산";
			break;
		case '2' :
			home = "경기";
			break;
		//
		case '9' : 
			System.out.println("제주");
			break;
		default:
			home = "입력된 값이 잘못되었습니다.";
			
		}
		System.out.println(home);
		
		//String id = "940622-1234567";
		String nai = id.substring(0, 2);	//nai= "80"
		//문자열 => 정수 변환
		//int sunai = (int)nai;
		int sunai = Integer.parseInt(nai);	//sunai = 80
		
		int age = 0;
		
		Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
		
		if(sung == '1'||sung == '2') {
			age = year-(1900 + sunai) +1;
		}else if (sung =='3'|| sung=='4') {
			age = year-(2000 + sunai) +1;
		}
		
		System.out.println(age);
		
		
	}

}
