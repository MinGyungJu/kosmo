package review_Test;

public class CalculatorExpr {
	// num1, num2 선언
	private int num1;
	private int num2;
	
	// getter, setter선언
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public int getNum2() {
		return num2;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	// 내보낼거
	public int getAddition() {
		int add = num1+num2;
		return add;
	}
	public int getSubtraction() {
		int sub = num1 - num2;
		return sub;
	}
	public int getMultiplication() {
		int mul = num1 * num2;
		return mul;
	}
	public double getDivision() {
		double div = (double)num1/num2;
		return div;
	}
	public void input() {
		System.out.println("덧셈 : "+getAddition());
		System.out.println("뺼셈 : "+getSubtraction());
		System.out.println("곱셉 : "+getMultiplication());
		System.out.println("나눗셈 : "+getDivision());
	}
	
	
}
