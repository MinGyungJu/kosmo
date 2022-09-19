package basic1;

public class Ex03_for응용 {

	public static void main(String[] args) {
	/*	for(int j =0; j<26; j++) {
			for(char i='A'; i<='Z'; i++) {
				System.out.print(i);
		}System.out.println();
	}
	*/
		//1번
		for(int i =0; i<26; i++) {
			for(char j='A';j<='A'+i ;j++) {
				System.out.print(j);
			}System.out.println();
		}
		//2번
		for(int i =0; i<26; i++) {
			for(char j='A'; j<='Z'-i; j++) {
				System.out.print(j);
			}System.out.println();
		}
		//3번
		for(int i =0; i<26; i++) {
			for(char j=(char)('A'+i); j<='Z'; j++) {
				System.out.print(j);
			}System.out.println();
		}
		
		//4번
		for(int i =0; i<26; i++) {
			for (char j ='Z'; j>='Z'-i; j-- ) {
				System.out.print(j);
			}System.out.println();
		}
		System.out.println("=========");
		//5번
		for(int i =0; i<26; i++) {
			for(char j=1;j<=i ;j++) {
				System.out.print(" ");
			}
			for(char k=(char)('A'+i);k<='Z'; k++) {
				System.out.print(k);
			}System.out.println();
			
		}
	

	
	}
}

