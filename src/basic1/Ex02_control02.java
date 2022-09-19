package basic1;

import java.util.Scanner;

public class Ex02_control02 {

	public static void main(String[] args) {
		// 학번 10자리
		// 맨앞 4자리 입학년도 , 다섯번쨰 문자 단과대번호(1 공대, 2사회대)
		// 그뒤 두자리는 각 학과번호
		
		/*공과대학인 경우는
	     11 : 컴퓨터학과       12 : 소프트웨어학과          13 : 모바일학과
	     22 : 자바학과         33 : 서버학과
		사회대학인 경우는

	 	11 : 사회학과         12 : 경영학과          13 : 경제학과
	 	공과대학인 경우는

     	
     	ex) 2017 1 11 001 는 2017년도에 입학한 공대 컴퓨터학과 학생입니다

 		ex) 2019 2 11 001 는 2019년도에 입학한 사회대 사회학과 학생입니다

 		ex) 2018 1 33 001 는 2018년도에 입학한 공대 서버학과 학생입니다        
		*/
		System.out.println("학번 입력하세요");
		Scanner input = new Scanner(System.in);
		String id =input.nextLine();
		
		String year = id.substring(0, 4);
		
		String hak = id.substring(5, 7);
		
		String hak1 = null;
		String college = null;
		char Lee = id.charAt(4);
		
		if (Lee =='1') {
			college= "공대";
			switch(hak){
			case "11" :
					hak1 = "컴퓨터학과";
					break;
			case "12" :
					hak1 = "소프트웨어학과";
					break;
			case "13" :
					hak1 = "모바일학과";
					break;
			case "22" :
					hak1 = "자바학과";
					break;
			case "33" :
					hak1 = "서버학과";
					break;
					}
		}
		else if (Lee == '2') {
			college= "사회대";
			switch(hak) {
				case "11":
					hak1 = "사회학과";
					break;
				case "12":
					hak1 = "경영학과";
					break;
				case "13":
					hak1 = "경제학과";
					break;
			}
		}System.out.println(id +"는 "+year+"에 입학한 "+college+" "+hak1+"입니다");
		
		
		
		
		
		
	}

}
