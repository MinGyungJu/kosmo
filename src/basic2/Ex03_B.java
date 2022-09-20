package basic2;

import java.util.Scanner;

public class Ex03_B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("수를 입력하시오");
		int count = 0;
		int w =sc.nextInt();

		for (int i=1; i<=w; i++){

			int su = i;
			boolean su369 = false;

			while(su != 0) {
				int na = su % 10;
				if(na ==3|| na==6||na==9) {
					su369=true;
				}
				su = su /10;
			}
			if(su369) {
				System.out.print("짝! ");
				count++;
			}else System.out.print(i +"/");

		}System.out.println();
		System.out.println("손뼉을 친 횟수는 "+ count);

	}

}
