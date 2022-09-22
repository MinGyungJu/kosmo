package basic4;

public class MainTest {

	public static void main(String[] args) {
		
		// 값을 지정하는 첫번쨰 방법 : setter
		Student s = new Student();	//메모리확보
					//객체
/*		s.setName("홍길동"); 
		s.setKor(100); 
		s.setEng(30);
		s.setMath(55);
	*/		
		//값을 지정하는 두번째 방법 : 생성자
		//Student s = new Student("홍길자", 99 ,88,66);
		
		s.calTotal();
		s.calAvg();
		//s.total = 0;
		s.output();
		
	}
}
