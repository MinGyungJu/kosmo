package chapter05.Ex02;

import java.util.Arrays;

public class Using_Array_2D {

	public static void main(String[] args) {
		// 2차원 배열을 출력
		
		int [][] arr1 = new int [][] {{1,2,3,4,5},{6,7},{8,9,10},{11,12}};
		// 직접출력
		System.out.println(arr1[0][0] + " " +arr1[0][1]+" "+arr1[0][2]+" "+arr1[0][3]+" "+arr1[0][4]);
		System.out.println(arr1[1][0] + " " +arr1[1][1]);
		System.out.println(arr1[2][0] + " " +arr1[2][1]+" "+arr1[2][2]);
		System.out.println(arr1[3][0] + " " +arr1[3][1]);
		System.out.println("====================================================");
		System.out.println(arr1.length);
		System.out.println(arr1[0].length);
		System.out.println(arr1[1].length);
		System.out.println(arr1[2].length);
		System.out.println(arr1[3].length);
		System.out.println("=====================================================");
		//for 문으로 출력
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				
				System.out.print(arr1[i][j]+" ");
			}
				System.out.println();
	}
		System.out.println("======================================================");
		//Enhanced for문
		for(int[] a : arr1) {
			for(int b : a) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
		
		//4. Arrays.toString() <== 1차원 배열의 값을 출력
		System.out.println("==Arrays.toString(arr1[0])");
		for(int i=0; i<arr1.length; i++) {			//4번 루프
			System.out.println(Arrays.toString(arr1[i]));
		}
		

		
		
}
}
