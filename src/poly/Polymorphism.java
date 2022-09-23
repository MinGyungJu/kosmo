package poly;

import java.util.Scanner;

public class Polymorphism {
	//다형성은 오버라이딩이되ㅏ어있어야가능
	public static void main(String[] args) {
		
		Item i = null;
		
		System.out.println("해당하는 물품번호 (1. 책, 2. DVD, 3.CD)");
		Scanner sc = new Scanner(System.in);
		int sel = sc.nextInt();
		
		switch(sel) {
		case 1 : i =new Book("001", "총균쇠", "제러드", "코스모"); break;
		case 2 : i =new Dvd();break;
		case 3 : i = new Cd(); break;
		}
		
		i.output();
	
	}
}
