package basic2;

/*
 * (문제)
 * 
 * 1~50까지 숫자중에서 3 ,6 ,9 숫자가 포함되면
 * 그 갯수만큼 '짝' 글자를 출력하고
 * 그렇지 않으면 그 숫자를 출력
 * 
 * ex) 26			123
 * 		6 ->		->3
 * 		2 -> 		->2
 * 					->1
 */
public class Ex03_369 {
	public static void main(String[] args) {
		for(int i=1; i<=50; i++) {
			
			int su = i;
			boolean su369 = false;
			
			while(su !=0) {
				int na = su % 10;
				if(na ==3 || na ==6|| na==9) {
					System.out.print("짝");
					su369 = true;
				}
				su = su /10;
			}
			if(su369)System.out.println();
			else System.out.println(i);
		}
		
	}
}
