package model.vo;

// 내가 한거 맞춰서 다시 게터세터
public class CustomerVO {
	String Name;		// 고객명
	String Tel;			// 전화번호
	String Tel2;			// 보조 전화번호
	String Addr;		// 주소
	String Email;		// 이메일
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getTel() {
		return Tel;
	}
	public void setTel(String tel) {
		Tel = tel;
	}
	public String getTel2() {
		return Tel2;
	}
	public void setTel2(String tel2) {
		Tel2 = tel2;
	}
	public String getAddr() {
		return Addr;
	}
	public void setAddr(String addr) {
		Addr = addr;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}



}
