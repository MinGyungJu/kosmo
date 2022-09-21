package basic3;

public class NewT {
	
	public static void method( int i, int j) {
		  i <<= j;
		  System.out.println(i);
		  System.out.println(j);
		}
		public static void main ( String  [] args ) {
		  int i = 4, j = 2;
		  method( i, j );
		  System.out.println( i );
		  System.out.println(j);
	}
}