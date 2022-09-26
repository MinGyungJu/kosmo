package c_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class aArrayListEx3 {

	public static void main(String[] args) {
		ArrayList <Student> result =method();
		//학생정보를 여기서 출력
		for (Student s : result) {
			System.out.println(s);
		}
		// [참고] 전체요소를 순서대로 검색
		// Enumeration - > 1.5버전 부터 Iterator
		System.out.println("-----------------------------");
		Iterator<Student> it = result.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
	static ArrayList <Student> method() {
		ArrayList <Student>list = new ArrayList<Student>();
		list.add(new Student("홍길자",25));
		list.add(new Student("홍길이",33));
		list.add(new Student("홍삼이",44));
		return list;
	}
}

//----------------------------------------------------------
class Student extends Object{
	String name;
	int age;
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name +"학생은 " +  age + "세 입니다.";
	}
}
