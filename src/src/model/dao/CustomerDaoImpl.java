package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.CustomerDao;
import model.vo.CustomerVO;

public class CustomerDaoImpl implements CustomerDao{

	final static String DRIVER = "oracle.jdbc.driver.OracleDriver";
	final static String URL = "jdbc:oracle:thin:@192.168.0.77:1521:xe"; // 지선님 ip
	final static String USER = "scott"; //스콧계정
	final static String PASS = "tiger"; // 비번 타이거


	public CustomerDaoImpl() throws Exception{
		// 1. 드라이버로딩
		Class.forName(DRIVER);
		System.out.println("드라이버로딩 성공");


	}


	public void insertCustomer(CustomerVO vo) throws Exception{
		// 2. Connection 연결객체 얻어오기
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = DriverManager.getConnection(URL, USER, PASS);
			// 3. sql 문장 만들기
			String sql = "INSERT INTO CUSTOMER(TEL,NAME,ADDR, EMAIL,TEL2) VALUES(?,?,?,?,?)";
			// 스트링형 sql 문장에 인서트 구문 

			// 4. sql 전송객체 (PreparedStatement)	
			ps = con.prepareStatement(sql);
			
			// ?세팅 -# (? 순서대로 1부터 ~)
			ps.setString(1, vo.getTel());
			ps.setString(2, vo.getName());
			ps.setString(3, vo.getAddr());
			ps.setString(4, vo.getEmail());
			ps.setString(5, vo.getTel2());

			// 5. sql 전송(인서트 -> executeupdate)
			ps.executeUpdate();

			// 6. 닫기 
		} finally {
			// 6. 닫기
			ps.close();
			con.close();

		}
	}
	/*
	 * 메소드명 : selectByTel
	 * 인자 : 검색할 전화번호
	 * 리턴값 : 전화번호 검색에 따른 고객정보
	 * 역할 : 사용자가 입력한 전화번호를 받아서 해당하는 고객정보를 리턴하는 역할
	 */

	public CustomerVO selectByTel(String tel) throws Exception{
		// 2. 연결객체 얻어오기
		Connection con = null;
		PreparedStatement ps = null;
		CustomerVO dao = new CustomerVO();

		try {
			con = DriverManager.getConnection(URL, USER, PASS);
			//3. sql문장
			String sql = "SELECT * FROM Customer WHERE TEL = ?";
			//4. 전송객체 얻어오기
			ps = con.prepareStatement(sql);
			//? 셋팅
			ps.setString(1, tel);

			//5. 전송( select이기에 executeQuery를 쓰고 ResultSet rs = 문장형태)
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {		//rs.next 는 다음줄 이라는 뜻
				dao.setTel(rs.getString("TEL"));  	// 오른쪽엔 칼럼명입력  
				dao.setName(rs.getString("NAME"));	
				dao.setAddr(rs.getString("ADDR"));
				dao.setEmail(rs.getString("EMAIL"));
				dao.setTel2(rs.getString("TEL2"));
			}
			rs.close(); //rs 닫기
		}finally {
			//6. 닫기
			ps.close(); // ps닫기
			con.close(); // con닫기
		}	
		return dao;

	}

	public int updateCustomer(CustomerVO vo) throws Exception{
		// 2. 연결객체 얻어오기
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = DriverManager.getConnection(URL, USER, PASS);      
			// 3. sql 문장
			String sql = "UPDATE Customer SET  NAME = ?, ADDR = ?, EMAIL = ?, TEL2 = ? WHERE TEL =?"; // tel 이 프라이머리키이기에 tel 로 찾아야함
			// 4. 전송객체 얻어오기
			ps = con.prepareStatement(sql); 
			
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getAddr());
			ps.setString(3, vo.getEmail());
			ps.setString(4, vo.getTel2());
			ps.setString(5, vo.getTel());
			
			int result = ps.executeUpdate();
			return result;

		}finally {
			// 6. 닫기
			ps.close();
			con.close();
		}
		
	}
}
