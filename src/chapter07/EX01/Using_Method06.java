package chapter07.EX01;

public class Using_Method06 {

	static int add(int[] a) {
		//들어온 배열의 모든값을 더해서 더한값을 리턴
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}
	
	static int div(int[] a) {
		//들어온 배열의 모든값을 뺴서 뺸값을 리턴
		int min=7;			
		for(int i=0; i<a.length; i++) {
			if(i==0) {
				continue;		//i==0 일때는 아래 내용 실행하지 않고
			}
			min-=a[i];
		}
		return min;
	}
	
	static long mul(int[] a) {
		//들어온 배열의 모든값을 곱해서 곱한값을 리턴
		long c=1;			//곱할때는 초기값을 1로 설정
		for(int i=0; i<a.length; i++) {
			c*=a[i];
		}
		return c;
	}
	
	static double avg(int[] a) {
		//들어온 배열의 모든값의 평균값을 리턴
		double d=0;
		double sum=0;
		int count = 0;
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
			count++;
		}
		d=sum/count;
		return d;
	}
	
	
	public static void main(String[] args) {
		// 1. 1~100까지 7의 배수만 저장 후 각 메소드 호출
		int []arr = new int[14];
		for(int i=0,j=7; i<arr.length; i++,j+=7) {
			arr[i]=j;	
		}
		System.out.println("==1번=========");
		int sum =add (arr);
		System.out.println(sum);
		System.out.println("==2번=========");
		int min = div (arr);
		System.out.println(min);
		System.out.println("==3번===========");
		long c = mul (arr);
		System.out.println(c);
		System.out.println("==4번===========");
		double d = avg(arr);
		System.out.println(d);
		
	}

}
