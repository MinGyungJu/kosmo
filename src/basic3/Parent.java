package basic3;

public class Parent {
	int com(int num) {
		if (num <=1) return num;
		return com(num -1)+com(num -2);
	}
}

class Child extends Parent{
	int com(int num) {
		if (num <=1) return num;
		return com(num -1 )+com(num-3);
		
	}
}
 
