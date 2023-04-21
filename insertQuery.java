package jdbc_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import com.mysql.cj.jdbc.Driver;

public class connectionDB {

 public static void main(String[]args) {

	 // step-1  load/register  driver

	 Connection connection =null;

	 try {

		 Driver driver = new Driver();

		 DriverManager.registerDriver(driver);
     
		 // step-2 create connection 

		 String url=("jdbc:mysql://localhost:3306/view");

		 String user= "root";

		 String pass= "root";

		  connection = DriverManager.getConnection(url, user, pass);

		 // step -3 create statement

		 Statement statement= connection.createStatement();

		 //step-4 execute query

		 String insertQuery="insert into student values(1335,'shivam kumar','shivamku10@gmail.com')";

     //String insertQuery="insert into student values(1235,'prashant kumar','prashant12@gmail.com')";

		 statement.execute(insertQuery);

		 System.out.println("Data stored");

	 } 

	 catch(SQLException e) {

		 e.printStackTrace();

	 } finally {

		 try {

			connection.close();

		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();
		}
	 }
 }
}
