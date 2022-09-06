package chapter05.Ex01;

import java.util.Arrays;

public class Using_Array03 {

	public static void main(String[] args) {
		// 한국을 빛낸 5명의 위인들만 s String 배열에 저장 후 4가지로 출력
		
		String []s = new String[5];
		
		s[0]= "이순신";
		s[1]= "세종대왕";
		s[2]= "강감찬";
		s[3]= "을지문덕";
		s[4]= "김유신";
		
		System.out.println(s[0]);
		
		for (int i=0; i<s.length; i++) {
			System.out.println(s[i]);
		}
		
		for (String k : s) {
			System.out.println(k);
			
		}
		
		System.out.println(Arrays.toString(s));
		
		
		
		

	}

}
