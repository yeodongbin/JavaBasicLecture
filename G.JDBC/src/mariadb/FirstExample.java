/*
=====================================================
- 2021.01.27
Reference Site : https://downloads.mariadb.org/connector-java/
File Name : mariadb-java-client-2.0.3.jar




=====================================================
*/
package mariadb;

//STEP 1. Import required packages
import java.sql.*;

public class FirstExample {


		// JDBC driver name and database URL
		static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		static final String DB_URL = "jdbc:mariadb://localhost:3306/test";

		// Database credentials
		static final String USER = "root";
		static final String PASS = "kitri";

		public static void main(String[] args) {
			Connection conn = null;
			Statement stmt = null; 

			try {
				// STEP 2: Register JDBC driver
				Class.forName("org.mariadb.jdbc.Driver");

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
					System.out.println();
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
