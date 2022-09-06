package chapter02.Ex11;

public class Char_Type {
	public static void main(String[] args) {
		// char 데이터 타입 : 하나의 문자만 저장,
		// 		- 문자, 숫자, 유니코드로 저장 할 수 있다.
		// 		- ' ' 를 사용해서 저장
		//		- 2문자 이상 넣을 수 없다. String 으로 여러 문자를 저장할 수 있다.
		
		// 유니코드(2byte) : 전 세계의 모든 문자를 16진수
		
		// 1. 문자로 저장하는 방법 : ' '
		char value1 = 'A';
		char value2 = '가';
		char value3 = '3';    // 숫자 3이 아니고 3의 문자
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println("==============================");
		
		// 2. 정수로 저장하는 방법 
		char value4 = 65;			//A  <== 65
		char value5 = 0xac00 ;      //0x 는 16진수 , 가 <== 0xac00
		char value6 = 51;			// 3 <== 51
			
		System.out.println(value4);
		System.out.println(value5);
		System.out.println(value6);
		System.out.println("==========================");
		
		// 3. 유니코드 형식으로 저장  ( \\u유니코드) : ' ' 를 사용해서 넣는다.
		char value7 = '\u0041';
		char value8 = '\uac00';
		char value9 = '\u0033';
		
		char value100 = 35; 			// # <== 35
		char value101 = '\uAC11';		// 갑 <== ac11
		
		System.out.println(value7);
		System.out.println(value100);
		System.out.println(value101);
		System.out.println(value8);
		System.out.println(value9);
		
		//구글 검색을 사용해서 자신의 이름 유니코드
		
		char name1 = '\ubbfc';
		char name2 = '\uacbd';
		char name3 = '\uc8fc';
		
		System.out.print(name1);
		System.out.print(name2);
		System.out.println(name3);
		
				
		
		//문자 A를 저장하는 다양한방법
		char a = 'A';		// A <== 65
		char b = 65;   		// 정수로 저장 (10진수)
		char c = 0b10000001;	//0b 뒤에 오는 값이 2진수 이다.
		char d = 00101;		//0 뒤에 오는 값이 8진수
		char e = 0x0041;		//0x 뒤에 오늘 값은 16진수
		char f = '\u0041';	//유니코드 로 값 할당
		
		System.out.println(a);	
		System.out.println(b);	
		System.out.println(c);	
		System.out.println(d);	
		System.out.println(e);	
		System.out.println(f);	

		
				
		
	}

}
