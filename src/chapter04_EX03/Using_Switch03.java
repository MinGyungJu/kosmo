package chapter04_EX03;

import java.util.Scanner;

public class Using_Switch03 {

	public static void main(String[] args) {
		/* 1.문제
		 	스캐너로 "Gold" 를 넣으면 "금메달 입니다" 를 출력
		 	스캐너로 "Silver" 를 넣으면 "은메달 입니다" 를 출력
			스캐너로 "Bronze" 를 넣으면 "동메달 입니다" 를 출력
			그 외는 "메달이 없습니다
			
		    2.문제
		     스캐너로 월을 인풋받아서 해당월의 총 날짜
		     	"<월>은 <며칠> 일까지 있습니다."
			
		 */
		System.out.println("당신의 메달은 무엇입니까>>>>>>>");
		
		Scanner sc = new Scanner(System.in);
		String medal = sc.next();
		
		
		
		switch (medal) {
		case "Gold"  :
			System.out.println("금메달 입니다");
			break;
		case "Silver" :
			System.out.println("은메달 입니다");
			break;
		case "Bronze" :
			System.out.println("동메달 입니다");
			break;
		default :
			System.out.println("메달이 없습니다");
		}
		sc.close();
		
		System.out.println("================");
		
		System.out.println("몇일이 궁굼한가요>>>>>>>" );
		
		
		int month = 13;
		
		switch (month) {
		case 1 : case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.printf(month +"월은 %d일까지 있습니다", 31);
			break;
		case 2 :
			System.out.printf(month +"월은 %d일까지 있습니다", 29);
			break;
		case 4: case 6: case 9: case 11: 
			System.out.printf(month +"월은 %d일까지 있습니다", 30);
			break;
		default :
			System.out.println("존재하지 않는 달입니다");
		}
		
		
	
	}

}
