package accother;

public class Access {

	private String a = "프라이빗데이타";
	public String b = "퍼블릭데이타";
	protected String c = "프로텍티드 데이타";
 /* default*/String d = "디폴트데이타";

	public void output() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
