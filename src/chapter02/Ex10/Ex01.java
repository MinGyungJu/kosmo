package chapter02.Ex10;

public class Ex01 {

	public static void main(String[] args) {
		
		// 각 변수의 평균값을 계산하세요.
		
		int aa = 80;
		int bb = 90;
		int cc = 100;
		double dd = 75.5;
		double ee = 60.3;
		
		
		double value1 = (aa+ bb+ cc + dd + ee)/5.0;
		System.out.println(value1);
		
		System.out.println("각 과목의 평균 값은 : " + value1);
		System.out.printf("각 과목의 평균 값은 : %f \n", 81.16);
		
		//답
		
		double avg = (aa + bb +cc + dd + ee) / 5.0;
		
		System.out.println("각 과목의 평균 값은 : " + avg);
		System.out.printf("각 과목의 평균 값은 : %4.2f ",avg);
		
		

	}

}
