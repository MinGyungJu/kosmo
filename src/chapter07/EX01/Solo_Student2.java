package chapter07.EX01;
//국어 영어 수학 이름
// 합계 평균

class School{
	int kor;
	int eng;
	int met;
	String name;
	
	School(int kor, int eng, int met, String name){
		this.kor=kor;
		this.eng=eng;
		this.met=met;
		this.name=name;
	}
		
	void call() {
		int sum;
		sum = kor + eng + met;
		double avg;
		avg = sum/3;
		System.out.println(name+"의 점수의 합계는 "+sum+"이고 평균은 "+avg);
	}
		
}
public class Solo_Student2 {

	public static void main(String[] args) {
		School Lee = new School(80, 70, 80, "Lee");
		Lee.call();

	}

}
