//1.JDBC 드라이버 로딩
//2. Connection 맺기
//3. SQL 실행
//4. [SQL문이 select문이었다면 ResultSet을 이용한 실행결과 처리]
//5. 자원 반환

package jdbc;

//STEP 1. Import required packages
import java.sql.*;

public class FirstExample {
	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:oracle:thin:@127.0.0.1:1521:myoracle";
	//SELECT instance FROM v$thread; // SID확인방법
	//SELECT * FROM PRODUCT_COMPONENT_VERSION; // 전체 버전확인

	// Database credentials
	static final String USER = "ora_user";
	static final String PASS = "yeo";

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null; //sql 문

		try {
			// STEP 2: Register JDBC driver
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// STEP 3: Open a connection
			System.out.println("Connecting to database...");
			conn = DriverManager.getConnection(DB_URL, USER, PASS);

			// STEP 4: Execute a query
			System.out.println("Creating statement...");
			stmt = conn.createStatement();
			String sql;
			sql = "SELECT empno, ename, job FROM emp";
			ResultSet rs = stmt.executeQuery(sql);

			// STEP 5: Extract data from result set
			while (rs.next()) {
				// Retrieve by column name
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");

				// Display values
				System.out.print("EMPNO: " + empno);
				System.out.print(", ENAME: " + ename);
				System.out.print(", JOB: " + job);
			}

			// STEP 6: Clean-up environment
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			se.printStackTrace(); 	// Handle errors for JDBC
		} catch (Exception e) {
			e.printStackTrace(); // Handle errors for Class.forName
		} finally { // finally block used to close resources
			try {
				if (stmt != null) {
					stmt.close();
				}
			} catch (SQLException se2) {
			} // nothing we can do
			
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException se) {
				se.printStackTrace();
			} // end finally try
		} // end try
		System.out.println("Goodbye!");
	}// end main
}// end FirstExample
