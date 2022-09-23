package Test;
//가. 속성으로 예금주,계좌번호,잔액을 갖는다.
//예금주는 String,계좌번호 String,잔액은 int로 정의하여라
//
//나. 메소드로 인출 및 입금 메소드를 갖는다.

// 1. 인출 메소드는 인자로 인출할 금액을 받고 
// 잔액이 부족시에는 “잔액이 부족합니다”라는 메시지를 
// 잔액이 충분할때는 인출한 금액을 출력하는 메소드이다

// 2. 입금 메소드는 인자로 입금할 금액을 받고 입금액을 잔액에 더하고
// 입금한 금액을 출력하는 메소드이다

//다. toString()메소드를 오버라이딩하여 계좌정보 즉 얘금주,계좌번호,잔액을
//출력하는 메소드를 정의하여라
//
//예 예금주:자바맨, 계좌번호:123-456, 잔액:1000원

public class Bank {
	
	String name; //예금주
	String num; // 계좌번호
	int count =0;  // 잔액
	int cash; // 금액
	
	public int in (int cash) {
		this.cash = cash;
		count+=cash;
		System.out.println("입금하고 남은 잔액은 : "+count+"원");
		return cash;
	}
	
	public int out(int cash) {
		this.cash = cash;
		count-=cash;
		if(count<0) {
			System.out.println("잔액이 부족합니다");
		}else System.out.println("출금하고 남은 잔액은 : "+count+"원");
			
		return cash;
	}
	

	@Override
	public String toString() {
		return "[예금주=" + name + ", 계좌=" + num + ", 잔액=" + count + "]";

	}
	

	public static void main(String[] args) {
		Bank b = new Bank();
		
		b.name = "자바맨";
		b.num = "123-456";
		b.count = 1000;
		
		b.in(5000);
		b.out(3000);
		
		System.out.println(b.toString());
		
		
		
		
		
}
}
