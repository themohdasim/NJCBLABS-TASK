import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main2 {

	public static void main(String[] args){
		try {
			System.out.println("Connecting to database.");
			String connectionUrl = "jdbc:derby:C:/Users/Asim/Desktop/DerbyDatabase";
			Connection connection = DriverManager.getConnection(connectionUrl);
			
			Statement insertRowStatement = connection.createStatement();
			
			insertRowStatement.executeUpdate("insert into NJCLAB (name, dob, id) values('XYZ', '2000-05-03',2001)");
			System.out.println("1 ROW EFFECTED");
			
			insertRowStatement.executeUpdate("insert into NJCLAB (name, dob, id) values('Asim', '1996-08-19',2002)");
			System.out.println("1 ROW EFFECTED");
			
			insertRowStatement.executeUpdate("insert into NJCLAB (name, dob, id) values('Wasif', '1995-04-25',2003)");
			System.out.println("1 ROW EFFECTED");

                        insertRowStatement.executeUpdate("insert into NJCLAB (name, dob, id) values('Shamroz', '1998-05-17',2004)");
			System.out.println("1 ROW EFFECTED");
        
                        insertRowStatement.executeUpdate("insert into NJCLAB (name, dob, id) values('Vinit', '1999-04-21',2005)");
			System.out.println("1 ROW EFFECTED");

		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
}