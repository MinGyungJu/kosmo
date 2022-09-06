package chapter03.Ex04;

public class RelationOperator {

	public static void main(String[] args) {
		// 크기비교 : true, false 로 값을 반환
		System.out.println( 5 < 2);
		System.out.println(5 > 2);
		System.out.println(5 < 5);
		System.out.println(5 <= 5);
		System.out.println(5 >=5);
		System.out.println("=================");
		// 등가비교 :
		//	==	  : 같을때(true) , != : 같지않을때 (true)
		int a = 5;
		int b = 2;
		int c = 5;
				
		System.out.println(a==b);
		System.out.println(a != b);
		System.out.println(a == c);
		System.out.println(a != c);
		System.out.println(b==c);
		System.out.println(b != c);
		System.out.println("==============================");
		
		//참조 자료형일때 등가비교.
			// (객체의 참조주소를 비교하므로 //false)
		String str1 = new String ("앙녕");
		String str2 = new String ("앙녕");
		System.out.println(str1 == str2);
		

	}

}
