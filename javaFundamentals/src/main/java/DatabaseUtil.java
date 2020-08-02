import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
//oracle db settings
	private static final String ORACLE_USER = "hr";
	private static final String ORACLE_PASSWORD = "hr";
	private static final String ORACLE_CONNECTION_STRING = "jdbc:oracle:thin:@localhost:1521:xe";
//jdbc>protocol 
//oracle>sub-protocol 
//thin>driver type (type 4 driver) 
//@localhost> server name (local computer) 
//1521>port on which the oracle server is running
//xe>oracle instance (database)

//mysql db settings
	private static final String MYSQL_USER = "root";
	private static final String MYSQL_PASSWORD = "mysql";
	private static final String MYSQL_CONNECTION_STRING = "jdbc:mysql://localhost:3306/sakila";

	public static Connection getConnection(DatabaseType databaseType) {
		switch (databaseType) {
		case ORACLEDB: {
			// A connection (session) with a specific database.
			// SQL statements are executed and results are returned within the context of a
			// connection.
			Connection connection = null;
			try {
				// Load the driver for Oracle
				Class.forName("oracle.jdbc.driver.OracleDriver");
				// Establish the connection
				connection = DriverManager.getConnection(ORACLE_CONNECTION_STRING, ORACLE_USER, ORACLE_PASSWORD);
			} catch (ClassNotFoundException e) {
				System.out.println("EXCEPTION :>> " + e);
			} catch (SQLException e) {
				System.out.println("EXCEPTION :>> " + e);
			}
			return connection;
		}
		case MYSQLDB: {
			Connection connection = null;
			try {
				// Load the driver for Oracle
				//Legacy driver
//				Class.forName("com.mysql.jdbc.Driver");
				Class.forName("com.mysql.cj.jdbc.Driver");
				// Establish the connection
				connection = DriverManager.getConnection(MYSQL_CONNECTION_STRING, MYSQL_USER, MYSQL_PASSWORD);
			} catch (ClassNotFoundException e) {
				System.out.println("EXCEPTION :>> " + e);
			} catch (SQLException e) {
				System.out.println("EXCEPTION :>> " + e);
			}
			return connection;
		}
		}
		return null;
	}
public static void testOracleConnection() {
	Connection connection = null;
	connection = DatabaseUtil.getConnection(DatabaseType.ORACLEDB);
	if(connection!= null) {
		System.out.println("Oracle Connected!");
	}
}
public static void testMySQLConnection() {
	Connection connection = null;
	connection = DatabaseUtil.getConnection(DatabaseType.MYSQLDB);
	if(connection!= null) {
		System.out.println("MySQL Connected!");
	}
	
}
}
