package c_info2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class InfoModelImpl implements InfoModel {

	final static String DRIVER 	= "oracle.jdbc.driver.OracleDriver";
	final static String URL 	= "jdbc:oracle:thin:@192.168.0.69:1521:xe";
	final static String User 	= "scott";
	final static String Pass 	= "tiger";

	public InfoModelImpl() throws ClassNotFoundException {
		// 1. 드라이버 로딩
		Class.forName(DRIVER);
		System.out.println("드라이버로딩 성공");
	}

	/*
	 *  사용자 입력값을 받아서 DB에 저장하는 역할
	 */
	@Override
	public void insertInfo(InfoVO vo) throws SQLException {
		// 2. 연결객체 얻어오기
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DriverManager.getConnection(URL, User, Pass);

			// 3. sql 문장
			String sql = "INSERT Into info_tab(NAME, JUMIN,TEL, GENDER,AGE,HOME)  "
					+ "  VALUES(?,?,?,?,?,? )";

			// 4. 전송객체
			ps = con.prepareStatement(sql);
			// ? 세팅
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getId());
			ps.setString(3, vo.getTel());
			ps.setString(4, vo.getSex());
			ps.setString(5, Integer.toString(vo.getAge()));
			ps.setString(6, vo.getHome());

			//5. 전송
			ps.executeUpdate();

		}finally {
			//6. 닫기
			ps.close();
			con.close();
		}
	} //end of insertInfo()

	/*
	 * 전체 Info_tab의 레코드 검색
	 */
	@Override
	public ArrayList<InfoVO> selectAll() throws SQLException{
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(URL, User, Pass);

			// 3. sql 문장
			String sql = "SELECT * FROM info_tab";

			// 4. 전송객체
			ps = con.prepareStatement(sql);


			//5. 전송
			rs = ps.executeQuery();

			ArrayList<InfoVO> list = new ArrayList<InfoVO>();
			while(rs.next()) {
				InfoVO vo = new InfoVO();
				vo.setName(rs.getString("NAME"));
				vo.setId(rs.getString("JUMIN"));
				vo.setTel(rs.getString("TEL"));
				vo.setSex(rs.getString("GENDER"));
				vo.setAge(rs.getInt("AGE"));
				vo.setHome(rs.getString("HOME"));

				list.add(vo);
			}

			return list;
		}finally {
			//6. 닫기
			rs.close();
			ps.close();
			con.close();
		}
	}

	@Override
	public InfoVO selectByTel(String tel) throws SQLException {
		// 2. 연결객체 얻어오기
		Connection con = null;
		PreparedStatement ps = null;
		InfoVO vo = new InfoVO();
		try {
			con = DriverManager.getConnection(URL, User, Pass);
			//3. sql문장
			String sql = "SELECT * FROM INFO_TAB WHERE TEL = ?";
			//4. 전송객체 얻어오기
			ps = con.prepareStatement(sql);
			//? 셋팅
			ps.setString(1, tel);
			//5. 전송
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				vo.setName(rs.getString("NAME"));
				vo.setId(rs.getString("JUMIN"));
				vo.setTel(rs.getString("TEL"));
				vo.setSex(rs.getString("GENDER"));
				vo.setAge(Integer.parseInt(rs.getString("AGE")));
				vo.setHome(rs.getString("HOME"));
			}
		}finally {
			//6. 닫기
			ps.close();
			con.close();
		}	
		return vo;
	}// end of selectByTel()

	/*
	 * 메소드명 : delete
	 * 인자 : 전화번호
	 * 리턴값 : 삭제한 행 수
	 * 역할 : 전화번호를 넘겨받아 해당 전화번호의 레코드를 삭제
	 */
	public int delete(String tel) throws SQLException {
		// 2. 연결객체 얻어오기
		Connection con = null;
		PreparedStatement ps = null;
		InfoVO vo = new InfoVO();
		try {
			con = DriverManager.getConnection(URL, User, Pass);
			//3. sql문장
			String sql = "DELETE FROM INFO_TAB WHERE TEL = ?";
			//4. 전송객체 얻어오기
			ps = con.prepareStatement(sql);
			//? 셋팅
			ps.setString(1, tel);
			//5. 전송
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				vo.setName(rs.getString("NAME"));
				vo.setId(rs.getString("JUMIN"));
				vo.setTel(rs.getString("TEL"));
				vo.setSex(rs.getString("GENDER"));
				vo.setAge(Integer.parseInt(rs.getString("AGE")));
				vo.setHome(rs.getString("HOME"));
			}
		}finally {
			//6. 닫기
			ps.close();
			con.close();
		}	

		return 0;
	}
}
