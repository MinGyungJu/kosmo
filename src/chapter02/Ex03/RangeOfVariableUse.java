package chapter02.Ex03;

public class RangeOfVariableUse {

	public static void main(String[] args) {
		// 변수의 생존 기간 : {} 블락 내에서만 생존가능
		
		int value1 = 3;
		
		{   //if, for, while, do while
			int value2 = 5;             //{} : 내에서만 선언, 생존 
			System.out.println(value1);
			System.out.println(value2);
			
	    }

		System.out.println(value1);
		//System.out.println(value2);    //오류 발생
		
	}
	
}
