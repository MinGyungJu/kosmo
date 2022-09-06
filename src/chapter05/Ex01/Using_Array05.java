package chapter05.Ex01;
import java.util.Arrays;
public class Using_Array05 {
	public static void main(String[] args) {
		// 1 ~ 500 까지 3의배수를 배열에 저장
				// 출력 : 1. 직접출력 2. for문출력 3. 향상된 for문출력 4. toString
				// 합계 : 	평균 :	
		int []a = new int [166];
		int sum = 0;
		a[0] = 3;
		a[1] = 6;
		a[2] = 9;
		a[3] = 12;
		a[4] = 15;
		a[5] = 18;
		System.out.println("===========1. 직접출력========================================================");
		System.out.println(a[5]);
		System.out.println("===========2.for문 출력====================================================");
		for(int i=0, j=3; i<a.length; i++, j+=3) {
			a[i]=j;
			sum+=a[i];
			if (j%3 ==0) {
				System.out.print(a[i] + " ");
			}
		}
		System.out.println();
		System.out.println("========3. 향상된 for문 출력=====================================================");
		for(int k : a) {
			System.out.print(k + " ");
		}
		System.out.println();
		System.out.println("========4. toString===========================================================");
		System.out.println(Arrays.toString(a));
		System.out.println("=======5. 합계와 평균==================================================================");
		System.out.println("합계는 : " +sum +" 이고, 평균은 : " + sum/(double)a.length);
	}
}
