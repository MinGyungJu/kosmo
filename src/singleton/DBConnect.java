package singleton;

/**** Singleton pattern */

public class DBConnect {

	private  DBConnect() {
		System.out.println("실제 디비 연결");
	}
	
	private static DBConnect con=null;
		
	public static DBConnect getInstance() {
		if(con == null) {
			con = new DBConnect();
		}
		return con;
	}
	
}
