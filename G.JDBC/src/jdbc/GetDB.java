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
			// ����̹��� �ε��Ѵ�.
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			// �����ͺ��̽��� ������ �����Ѵ�.
			conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

			// Statement�� �����´�.
			stmt = conn.createStatement();

			rs = stmt.executeQuery(query); // query

			while (rs.next()) {
				String no = rs.getString(1);

				// ����� ����Ѵ�.
				System.out.println(no);
				/*
				 * String ename = rs.getString(2); String job = rs.getString(3); String mgr =
				 * rs.getString(4); String hiredate = rs.getString(5); String sal =
				 * rs.getString(6); String comm = rs.getString(7); String depno =
				 * rs.getString(8);
				 * 
				 * // ����� ����Ѵ�. System.out.println( empno + " : " + ename + " : " + job + " : "
				 * + mgr + " : " + hiredate + " : " + sal + " : " + comm + " : " + depno);
				 */
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// ResultSet�� �ݴ´�.
				rs.close();
				// Statement�� �ݴ´�.
				stmt.close();
				// Connection�� �ݴ´�.
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	} // main()

}
