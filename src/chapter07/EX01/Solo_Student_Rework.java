package chapter07.EX01;
class Students{
	int kor;
	int eng;
	int met;
	String name ;
	
	Students(int kor, int eng, int met, String name){
		this.kor = kor;
		this.eng = eng;
		this.met = met;
		this.name =name;
	}
	
	void call() {
		int sum;
		sum = kor +eng + met;
		int avg;
		avg = sum/3;
		System.out.println(name + "의 합계는" +sum + "이고 평균은 "+avg);
	}
	
}

public class Solo_Student_Rework {

	public static void main(String[] args) {
		Students Lee = new Students(80, 70, 70, "Lee");
		Lee.call();
		Students Min = new Students(90, 90, 90, "Min");
		Min.call();
	}

}
