package chapter05.Ex01;

import java.util.Arrays;
import java.util.Scanner;

public class Using_Array08 {

	public static void main(String[] args) {
		// 스캐너로 인풋받아 임의의 정수 10개 등록후
		// 정수배열 방 10개를 생성하고 
		// 임의의 값을 10개의 방에 저장
		// 그 중 최대값을 뽑아서 출력하는 프로그램을 생성해 보세요
		// 출력 : 배열방 10개에서 최대값은 : 000
		
		Scanner sc = new Scanner(System.in);
		
		int []a = new int [10];
		int max = 0;		// 최대값을 저장하는 변수 선언
		int min = 0;		// 최소값을 저장하느 변수 선언
		
		
		System.out.println("원하는 정수를 입력하세요");
		//스캐너로 임의의 정수값 입력
		for(int i =0 ; i<10; i++) {
			a[i]=sc.nextInt();
			
		}
		
		
		//최대값을 뽑아서 max 변수에 저장후 출력
		for(int i=0; i<10; i++) {
			if(a[i]>max) {		//a의 i 번째 방의 값이 max 변수의 값보다 크면
				max=a[i];		// max 변수에 a[i] 번 방의 값을 max 변수에 대입
				
			}
		}
		System.out.println("배열방 10개에서 최대값은 : " + max);
		
		//최소값을 뽑아서 min 변수에 저장후 출력
		for(int i =0; i<10; i++) {
			if(a[i]<min) {
				min = a[i];
			}
		}
		System.out.println("배열방 10개에서 최소값은 : " + min);
		
		System.out.println("======2번쨰 방법은 Arrays.sort() 메소드====================");
		Arrays.sort(a); 	//배열 방의 값을 정렬을 한다. 0 (최소값), 1,2,3... a.length -1 (최대값)
		System.out.println("최대값 : " + a[a.length-1]);
		System.out.println("최소값 : " + a[0]);
		
		System.out.println("====== Stream 을 사용하는 경우 ==============");
		System.out.println("최대값 : " + Arrays.stream(a).max().getAsInt());
		System.out.println("최소값 : " + Arrays.stream(a).min().getAsInt());
		
	}

}
