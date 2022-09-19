package basic1;

public class eX02_ShortCircuitLogic2 {
	
	public static void main(String[] args) {
		
		int a =3;
		
		if(a > 3 & ++a >3) {
			System.out.println("조건만족");
		}
		System.out.println("a ="+a);
		System.out.println();
		
		if(a > 1|	 ++a >3) {
			System.out.println("조건만족");
		}
		System.out.println("a ="+a);
		
	}
}
