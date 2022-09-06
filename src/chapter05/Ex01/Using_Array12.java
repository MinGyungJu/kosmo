package chapter05.Ex01;

import java.util.Arrays;

public class Using_Array12 {

	public static void main(String[] args) {
		
		// 1~1000까지 배열(arr)에 저장하고
		
		// 1. 배열 선언
		
		// 2. [입력]for 문을 사용해서 arr 배열 변수에 값을 할당
		
		// 3. [출력]for 문을 사용해서 arr 배열 변수의 값을 출력
		
		// 4. [출력] Enhanced for 문을 사용해서 값을 출력
		
		// 5. [출력] Arrays.toString(arr) 출력
		
		int []arr = new int [1000];
		
		for(int i =0, j=1; i<arr.length; i++, j+=1) {
			arr[i]=j;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("==============================================");
		
		for(int k : arr) {
			System.out.print(k+" ");
		}
		System.out.println();
		System.out.println("==============================================");
		
		System.out.println(Arrays.toString(arr));
	}
}
