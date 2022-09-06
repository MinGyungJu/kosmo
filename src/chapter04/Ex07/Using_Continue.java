package chapter04.Ex07;

public class Using_Continue {

	public static void main(String[] args) {
		//continue : continue 를 만나면 continue 아래의 코드를 실행하지 않고 반복
		// 	- if문과 같이 사용됨.
		
		//1. 단일 loop에서 continue
		for(int i = 0; i<10; i++) {
			System.out.print("A");
			 continue;						// 구문을 빠져나가지 않고 
			//System.out.println("B");		//도달 할 수 없는 코드
		}
		
		for(int i = 0; i<10; i++) {
			System.out.println("A");
			if (i % 2 ==0) {continue;}		// i : 0 2 4 6 8
			System.out.println("B");
		}
		
		System.out.println("===================================");
		for (int i = 0; i< 10; i++) {
			if (i == 5 || i==7) {continue;}
			System.out.println(i +" ");
			
		}
		System.out.println("=================================");
		// 1. for 문을 사용해서 1에서 1000까지 1씩 증가하고 continue를 사용해서
		//	3의 배수만 출력하세요
		
		// 2. for 문을 사용해서 1에서 1000까지 1씩 증가하고 continue를 사용해서
		//	5의 배수만 출력하세요
		
		// 3. for 문을 사용해서 1에서 1000까지 1씩 증가하고 continue를 사용해서
		//  3,5,7의 배수만 출력하세요
		
		for (int i =1 ; i <=1000; i++) {
			if (i %3 !=0) {continue;}
			System.out.print(i +" ");
		}
		System.out.println();
		for (int i =1; i<=1000; i++) {
			if (i %5 !=0) {continue;}
			System.out.print(i+" ");
		}
		System.out.println();
		for (int i =1; i<=1000; i++) {
			if (i %3 !=0 & i%5 != 0 & i%7 !=0) {continue;}
			System.out.print(i+" ");
		}
		System.out.println();
		
		//2. 다중 Loop에서 continue
		for (int i =0 ; i<5 ; i++) {			//5번루프
			for(int j=0; j<5 ; j++) {			//5번루프
				if (j==3) {continue;}
				System.out.println(i+" , "+j);
			}
		}
		
		
		System.out.println("=======lable을 사용해서 점프함.======");
		
		out:for (int i =0 ; i<5 ; i++) {			//5번루프
			for(int j=0; j<5 ; j++) {			//5번루프
				if (j==3) {continue out;}
				System.out.println(i+" , "+j);
			}
		}
		
		System.out.println("============================");
		
		out:for (int i =0 ; i<5 ; i++) {			//5번루프
			for(int j=0; j<5 ; j++) {			//5번루프
				if (j==3) {
					i=100;				//바깥쪽 for 문의 변수값을 증대 시켜서 false 빠져나옴
					continue out;}
				System.out.println(i+" , "+j);
			}
		}
		
		
	
		
		
		
		
		
	}

}
