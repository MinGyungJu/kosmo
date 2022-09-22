package basic4;

public class Student {
	
	private String hakbun;
	private String name;
	private int kor,eng,math;
	private int total;
	private double avg;
	
	public Student() {
		//this.name = "이름없음";
		//this.kor = 50;
		//this.eng = 50;
		//this.math = 50;
		this("이름없음",50,50,50); 	// this함수는 무조건 첫번쨰라인에
		System.out.println("기본생성자");
	} //기본생성자는 꼭 쓰기
	
	public Student(String name, int kor, int eng , int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		System.out.println("인자있는생성자");
	}
	
	public void calTotal() {
		total = kor + eng+ math;
	}
	public void calAvg() {
		avg = total / 3;
	}
	public void output() {
		System.out.println(name +"님 성적 : "+total + "/"+avg);
	}
}
/*
 * 캡슐화 
 * 	    - 멤버변수(field) : private
 * 	    - 멤버메소드 : public
*/

