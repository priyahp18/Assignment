package Assignment2;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Database {

	public static void main(String[] args) {
		// URL
		String URL = "jdbc:mysql://localhost/Testdata";
		
		try (Connection connection = DriverManager.getConnection(URL)) {
            // Execute SQL query
         Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Test");

            while (resultSet.next()) {
                int TestId = resultSet.getInt("TestId");
                String Title = resultSet.getString("Title");
                int Name = resultSet.getInt("Name");

                System.out.println(TestId+" "  + Title +" " + Name);
	}

    } catch (SQLException e)

}
}
