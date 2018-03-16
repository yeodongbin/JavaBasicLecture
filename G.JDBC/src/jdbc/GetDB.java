package jdbc;

import java.sql.*;

public class GetDB {

	public static void main(String[] args) {
		String DB_URL = "jdbc:oracle:thin@localhost:1521:myoracle";
		String DB_USER = "ora_user";
		String DB_PASSWORD = "yeo";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		String query = "SELECT * FROM NAMECARD";

		try {
			// 드라이버를 로딩한다.
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			// 데이터베이스의 연결을 설정한다.
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

			// Statement를 가져온다.
			stmt = conn.createStatement();

			rs = stmt.executeQuery(query); // query

			while (rs.next()) {
				String no = rs.getString(1);

				// 결과를 출력한다.
				System.out.println(no);
				/*
				 * String ename = rs.getString(2); String job = rs.getString(3); String mgr =
				 * rs.getString(4); String hiredate = rs.getString(5); String sal =
				 * rs.getString(6); String comm = rs.getString(7); String depno =
				 * rs.getString(8);
				 * 
				 * // 결과를 출력한다. System.out.println( empno + " : " + ename + " : " + job + " : "
				 * + mgr + " : " + hiredate + " : " + sal + " : " + comm + " : " + depno);
				 */
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// ResultSet를 닫는다.
				rs.close();
				// Statement를 닫는다.
				stmt.close();
				// Connection를 닫는다.
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	} // main()

}
