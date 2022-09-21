package basic3;

import java.util.Scanner;

public class Ex09_Test1 {

	public static void main(String[] args) {
		System.out.println("입력칸");
		
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		boolean result = checkLower(ch);

	}
	static boolean checkLower(char ch) {
		if(ch>='a'&& ch <= 'z') {
			System.out.println("true");
			return true;
		}else if (ch>='A'&&ch<='Z') {
			System.out.println("false");
			return false;
		}else {
			System.out.println("영문만입력");
			return false;
		}
	}
}
