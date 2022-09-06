package chapter05.Ex02;

public class Using_Read_Array_2D {

	public static void main(String[] args) {
		// 2차원 배열의 값을 읽기
			// 1차원 배열 일떄 : arr.lenght 	<== 열의 갯수
			// 2차원 배열 일때 : arr.lenght 	<== 행의 갯수
				//			 arr[i].lenght	<== 열의 갯수 , i : 행의 번호.
		
		int [] arr0 = new int[100];			//1차원 배열 , 
		System.out.println(arr0.length);	//100 <== 열의갯수
		
		
		//1. 2차원 배열의 길이 (정방형 배열)
		int[][]arr1 = new int [2][3];
		System.out.println(arr1.length);	//2 <== 행의 갯수
		System.out.println(arr1[0].length); //3 <== 0행의 열의 갯수
		System.out.println(arr1[1].length); //3 <== 1행의 열의 갯수
		System.out.println("=======================================");
		
		//2. 2차원 배열의 길이 (비정방형 배열)
		int[][] arr2 = new int [][] {{1,2},{3,4,5}};
		System.out.println(arr2.length);	//2 <==행의갯수
		System.out.println(arr2[0].length); //2 <==0행의 열의 갯수
		System.out.println(arr2[1].length);	//3 <==1행의 열의 갯수
		System.out.println("============================================");
		
		// 2차원 배열 출력 방법
		// 1. 방법 1 - 방번호를 직접 출력
		System.out.print(arr2[0][0]+" "+arr2[0][1]);
		System.out.println();
		System.out.print(arr2[1][0]+" "+arr2[1][1]+" "+ arr2[1][2]);
		System.out.println();
		
		// 2. 방법2 - for문을 통해서 출력
			// 바깥쪽 for 문 : arr.lenght  : 행의갯수
			// 안쪽 for 	  : arr[i].lengh  : 행의 열의갯수
		System.out.println("=======이중 for문을 사용해서 이차원 배열 값 출력=================");
		for (int i =0; i<arr2.length; i++) {	//행의 갯수를 1씩증가
			for(int j=0; j<arr2[i].length; j++ ) {
				System.out.print(arr2[i][j]+" ");	//i: 행의 방번호, j : 열의 방번호
			}
			System.out.println(); 	//한 행이 끝나면 enter
		}
		
		
		// 3. 방법3 - Enhanced for문을 통해서 출력 : 이중for문 사용
			// 바깥쪽 for문은 : 
		System.out.println("=====Enhanced For 문으로 출력 ================");
		for(int[] a : arr2) {	//arr2 이차원배열을 1차원 배열로 꺼낸다
			for(int b : a) {	//a 일차원 배열의 각방의 값을 b 변수로 꺼낸다.
				System.out.print(b+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		

	}

}
