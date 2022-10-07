package b_preparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertEmp {

	public static void main(String[] args) {

		try {
			// 1. 드라이버로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버로딩 성공2");
			
			// 2. 연결객체 얻어오기
			String url = "jdbc:oracle:thin:@192.168.0.69:1521:xe";
			String user = "scott";
			String pass = "tiger";
			
			Connection con = DriverManager.getConnection(url,user,pass);
			System.out.println("디비 연결 성공2");
			
			//---- 입력값
			String bonmyeng = "민경주";
			int welgup = 10000;
			String jikup = "IT";
			
			// 3. SQL 문장
			
			String sql = "INSERT INTO EMP(EMPNO,ENAME,SAL,JOB) VALUES(5555, ?,?,?)";
			
			// 4. SQL 전송객체
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, bonmyeng);
			stmt.setInt(2, welgup);
			stmt.setString(3, jikup);
			
			// 5. SQL 전송
			/*		- ResultSet executeQuery() 	: SELECT
			 * 		- int executeUpdate()	: INSERT/DELETE/UPDATE
			 */
			int result =stmt.executeUpdate(); // 이미 SQL 연결했기때문에 괄호안에 sql 안씀
			
			System.out.println(result +"행을 실행");
			
			//6. 닫기
			stmt.close();
			con.close();
			
			
		} catch (Exception e) {
			System.out.println("DB 실패 : "+ e);
		}
		
		

	}

}
