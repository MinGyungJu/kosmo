package B_info;

public class PersonVO {
//extends object {
	//private 변수선언
	private String name;
	private String id;
	private String tel;
	private String sex;
	private int age;
	private String home;
	
	public PersonVO() {}
	
	//오른쪽 소스에 Generate consturt 뭐시기로 가능 -> 기본생성자는 직접  위에 쓰자!
	public PersonVO(String name, String id, String tel, String sex, int age, String home) {
		super();
		this.name = name;
		this.id = id;
		this.tel = tel;
		this.sex = sex;
		this.age = age;
		this.home = home;
	}
	
	// 게터세터 사용
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}

	public String toString() {
		return "PersonVO [name=" + name + ", id=" + id + ", tel=" + tel + ", sex=" + sex + ", age=" + age + ", home="
				+ home + "] \n";
	}
	
	
	
}
