package basic3;

public class Ex03_CallByValue {
//CallByValue =>
	public static void main(String[] args) {
		
		int a =10,b=20;
		add(a,b);
		System.out.println("A="+ a+", B="+b);	//2 a= 10 b =20
	}
	static void add(int a, int b) {
		a+=b;	//a = a+b => a=30, b=20;
		System.out.println("A1="+ a+", B1="+b);	//1 a= 30 , b=20
	}
}
