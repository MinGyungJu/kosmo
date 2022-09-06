package chapter02.Ex02;

public class NamingVirableAndConstant {
	public static void main(String[] args) {
		
		/* 변수의 이름 부여 : 변수 : 값을 변경 가능
		    - 변수이름은 영문, 한글 사용가능 (권장사항 아니다)
		 	- 첫자는 소문자 사용
		 	- 특수문자는 _ , $
		 	- 첫자에 숫자는 올수 없다.
		 	- JAVA의 Keyword(예약어) 는 올수 없다. (int, double, String...)
		  */
		
		boolean aBcD;       // aBcD 변수에 true, false 
		aBcD = true;
		System.out.println(aBcD);    //true
		aBcD = false;
		System.out.println(aBcD);    //false
		byte 가나다;                   //사용은 가능하나 권장사항이 아님
		short _aBcD;                 //특수문자는 _ , $ 
	    char $aB_cD;
	    double main;                 //메소드이름을 변수이름으로 사용 가능,
	    							 //사용방법이 달라서 사용가능 
	    //float int;                 //예약어를 변수명으로 사용하면 오류 발생
	                                 //class, int, double, char, byte.....
	    String myClassName ;         //첫단어는 소문자, 여러단어가 묶여져있을때 첫단어는 대문자
	    
		/*
		  상수의 이름 부여 : 상수 : 값을 변경 불가능
		 	- 대문자로 처리
		 	- 변수 선언문 앞에 final 키워드를 사용. 
		 */
	    
	   final double PI ;
	   PI = 3.141592;
	   
	   System.out.println(PI);
	   
	   //PI = 1234.00;              //상수는 값을 수정할 수 없다.
	   System.out.println(PI);
	   
	   final int MY_DATA ;          //상수 (규칙)
	   int myData ;                 //변수 
	   
	   
	   
	   
		
		
		
		

	}

}
