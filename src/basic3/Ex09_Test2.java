package basic3;

import java.util.Scanner;

//영문자를 입력하여 이 문자를 넘겨받아 이 문자가 소문자이면 대문자로 변환하여 반환하고 
//대문자라면 그대로 반환하는 메소드를 작성하시오. 
//함수명 : checkUpper
//인자 : char
//리턴(반환) : char

public class Ex09_Test2 {
	
	public static void main(String[] args) {
		System.out.println("입력칸");
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().charAt(0);
		char result = checkUpper(ch);
		System.out.println(result);
		
	}
	static char checkUpper(char ch) {
		if(ch>='a' && ch<='z') {
			return (char)(ch-32);
		}else if(ch>='A' && ch<='Z'){
			return ch;
		}else {
			System.out.println("잘못된부분");
			return ch;
		}
	}
}
