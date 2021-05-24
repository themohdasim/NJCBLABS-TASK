import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main3 {

	public static void main(String[] args){
		try {
			System.out.println("Connecting to database.");
			String connectionUrl = "jdbc:derby:C:/Users/Asim/Desktop/DerbyDatabase";
			Connection connection = DriverManager.getConnection(connectionUrl);
			
			Statement getRowStatement = connection.createStatement();
			ResultSet resultSet = getRowStatement.executeQuery("select * from NJCLAB");
			while(resultSet.next()){   
                                
				String name = resultSet.getString("name");
				String dob = resultSet.getString("dob");
                                int id = rs.getInt("id");
				System.out.println(name + " was born in " + dob + ". Their id is " + id + ".");
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}