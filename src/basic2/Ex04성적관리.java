package basic2;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex04성적관리 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int student[][] = new int[2][3];
		System.out.println("학생점수입력");
		
		String inputData = input.nextLine();
		StringTokenizer st = new StringTokenizer(inputData, "/");
		for(int i = 0; st.hasMoreElements(); i++) {
			
				String str = st.nextToken();
				//student[i]=Integer.parseInt(str);
			}
			//
		
		
		for(int i =0; i<student.length; i++) {
			for(int j=0; j<student[i].length; j++) {
				
				System.out.println(i+1 +"번째 학생의 성적을 입력"+student[i][j]);
			}
			
		}
		
	}
}
