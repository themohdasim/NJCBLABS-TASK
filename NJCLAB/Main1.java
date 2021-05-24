import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main1 {

	public static void main(String[] args){
		try {
			String connectionUrl = "jdbc:derby:C:/Users/Asim/Desktop/DerbyDatabase;create=true";
			Connection connection = DriverManager.getConnection(connectionUrl);
			
			Statement createPeopleTableStatement = connection.createStatement();
			createPeopleTableStatement.executeUpdate("create table NJCLAB(name varchar(20), dob varchar(20), id int,primary key(id))");
			System.out.println("NJCLAB table created.");
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}