package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.VideoDao;
import model.vo.VideoVO;

public class VideoDaoImpl implements VideoDao{

	final static String DRIVER = "oracle.jdbc.driver.OracleDriver";
	final static String URL = "jdbc:oracle:thin:@192.168.0.77:1521:xe"; // 127.0.0.1
	final static String USER = "scott";
	final static String PASS = "tiger";
	Connection con = null;
	PreparedStatement ps = null;

	public VideoDaoImpl() throws Exception{
		// 1. 드라이버로딩
		Class.forName(DRIVER);
		System.out.println("드라이버로딩 성공");
	}


	public void insertVideo(VideoVO vo, int count) throws Exception{
		// 2. Connection 연결객체 얻어오기
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DriverManager.getConnection(URL, USER, PASS);

			// 3. sql 문장 만들기
			String sql = "INSERT INTO VIDEO(VNO,GENRE,TITLE,DIRECTOR,ACTOR,V_DESC)   "
					+ "   VALUES(seq_video_no.nextval,?,?,?,?,?)";
			// 4. sql 전송객체 (PreparedStatement)	
			ps = con.prepareStatement(sql);
			// ?세팅 -#
			ps.setString(1, vo.getGenre());
			ps.setString(2, vo.getVideoName());
			ps.setString(3, vo.getDirector());
			ps.setString(4, vo.getActor());
			ps.setString(5, vo.getExp());
			// 5. sql 전송
			for(int i=0; i<count; i++) {
				ps.executeUpdate();
			}
			// 6. 닫기
		} finally {
			// 6. 닫기
			ps.close();
			con.close();

		}

	}
	
	// 비디오검색
	public ArrayList selectVideo(int idx, String word) throws Exception{
		ArrayList data = new ArrayList();
		// 2. 연결객체 얻어오기
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DriverManager.getConnection(URL, USER, PASS); 
			
			// 3. sql문장
			String []colNames = {"TITLE", "DIRECTOR"};  //colNames를 배열로 하여 제목과 감독 넣음
			String sql = "Select VNO,TITLE,DIRECTOR,ACTOR FROM VIDEO    "
					+ "  WHERE " +colNames[idx]+" LIKE '%"+word+"%'"; // ?를 쓰지않은이유는 : where절에 이어쓰면 ' '가 표시되기에 
			System.out.println(sql);
			//4 전송객체
			ps = con.prepareStatement(sql);

			//5. 전송
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				ArrayList temp = new ArrayList();
				temp.add(rs.getInt("VNO"));
				temp.add(rs.getString("TITLE"));
				temp.add(rs.getString("DIRECTOR"));
				temp.add(rs.getString("ACTOR"));
				data.add(temp);

			}
			return data;

			//6. 닫기
		}finally {
			// 6. 닫기
			ps.close();
			con.close();
		}
	}
	
	/*
	 * 메소드명 : selectByVnum
	 * 인자	: 비디오번호
	 * 리턴값 : 비디오정보
	 * 역할 : 비디오번호를 넘겨받아 해당 비디오번호의 비디오정보를 리턴
	 */
	public VideoVO 	selectByVnum(int vnum) throws Exception
	{
		VideoVO vo = new VideoVO();

		// 2. 연결객체 얻어오기
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DriverManager.getConnection(URL, USER, PASS); 

			String sql = "SELECT * FROM VIDEO WHERE VNO =?";
			//4 전송객체
			ps = con.prepareStatement(sql);
			// ? 
			ps.setInt(1, vnum);


			//5. 전송
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				vo.setVideoNo(rs.getInt("vno"));
				vo.setVideoName(rs.getString("title"));
				vo.setGenre(rs.getString("genre"));
				vo.setDirector(rs.getString("director"));
				vo.setActor(rs.getString("actor"));
				vo.setExp(rs.getString("V_DESC"));
			}
			return vo;

		}finally {
			// 6. 닫기
			ps.close();
			con.close();
		}


	}


	// 수정버튼
	public int modifyVideo(VideoVO vo) throws Exception {
		// 2. 연결객체 얻어오기
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = DriverManager.getConnection(URL, USER, PASS); 

			String sql = "UPDATE VIDEO SET GENRE = ?, TITLE =?,   "
					+ "   DIRECTOR=?, ACTOR =?, V_DESC =? WHERE VNO =?";
			// 4. 전송객체 얻어오기
			ps = con.prepareStatement(sql);
			ps.setString(1, vo.getGenre());
			ps.setString(2, vo.getVideoName());
			ps.setString(3, vo.getDirector());
			ps.setString(4, vo.getActor());
			ps.setString(5, vo.getExp());
			ps.setInt(6, vo.getVideoNo());

			int result = ps.executeUpdate();
			return result;

		}finally {
			// 6. 닫기
			ps.close();
			con.close();
		}
	}


	//딜리트 버튼
	public int deleteVideo(int vnum) throws Exception {
		// 2. 연결객체 얻어오기
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = DriverManager.getConnection(URL, USER, PASS); 

			String sql = "DELETE FROM VIDEO WHERE VNO = ?";
			// 4. 전송객체 얻어오기
			ps = con.prepareStatement(sql);
			ps.setInt(1, vnum);
			
			int result = ps.executeUpdate();
			return result;

		}finally {
			// 6. 닫기
			ps.close();
			con.close();
		}
	}
}