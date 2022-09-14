package chapter09.EX04;
		
class Student{
	
	static int serialNum = 1000;	//모든 객체에서 공유하는 필드, 객체를 생성할때마다 1씩 증가시킴
	int studentID;					//학생 공유ID
	String studentName;				//학생 이름
	int grade;						//학년 : 기본값으로 4
	String address;					//주소 : "서울"
	
	//기본생성자
	Student(){
		serialNum++;	//객체를 생성할시 1씩 증가, 모든 객체에서 공유해서 사용
		studentID = serialNum;
		grade=4;
		address = "서울";
	}
	Student(String studentName){
		this();		//기본생성자 호출 후 아래 내용 실행
		this.studentName = studentName;
	}
	
	void print () {
		System.out.println("studentId : "+ studentID);
		System.out.println("studentName : " + studentName);
		System.out.println("학년 : "+ grade);
		System.out.println("주소 : " + address);
		System.out.println();
	}
	
}
public class Student_Test {

	public static void main(String[] args) {
		// 객체를 생성시 자동으로 학번이 1000번부터 1씩 증가되도록
		// studentID : 1000부터 학생객체를 생성할때 마다 고유한 값으로 적용 되어 있어야한다.
		
		Student Lee = new Student("이지원"); //1001
		Lee.print();
		Student Hong = new Student("홍지원"); //1002
		Hong.print();
		Student Jung = new Student("정지원"); //1003
		Jung.print();
		Student Park = new Student("박지원"); //1004
		Park.print();
	}

}
