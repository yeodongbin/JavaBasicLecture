package jdbc;

import java.sql.*;

public class GetDB {

	public static void main(String[] args) {
		String DB_URL = "jdbc:oracle:thin:@localhost:1521:myoracle";
		String DB_USER = "ora_user";
		String DB_PASSWORD = "yeo";

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		String query = "SELECT * FROM NAMECARD";

		try {
			// �뱶�씪�씠踰꾨�� 濡쒕뵫�븳�떎.
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			// �뜲�씠�꽣踰좎씠�뒪�쓽 �뿰寃곗쓣 �꽕�젙�븳�떎.
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

			// Statement瑜� 媛��졇�삩�떎.
			stmt = conn.createStatement();

			rs = stmt.executeQuery(query); // query

			while (rs.next()) {
				String no = rs.getString(1);

				// 寃곌낵瑜� 異쒕젰�븳�떎.
				System.out.println(no);
				/*
				 * String ename = rs.getString(2); 
				 * String job = rs.getString(3); 
				 * String mgr = rs.getString(4); 
				 * String hiredate = rs.getString(5); 
				 * String sal = rs.getString(6); 
				 * String comm = rs.getString(7); 
				 * String depno = rs.getString(8);
				 * 
				 * // 寃곌낵瑜� 異쒕젰�븳�떎. 
				 * System.out.println( empno + " : " + ename + " : " + job + " : "
				 * + mgr + " : " + hiredate + " : " + sal + " : " + comm + " : " + depno);
				 */
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// ResultSet瑜� �떕�뒗�떎.
				rs.close();
				// Statement瑜� �떕�뒗�떎.
				stmt.close();
				// Connection瑜� �떕�뒗�떎.
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	} // main()
}
