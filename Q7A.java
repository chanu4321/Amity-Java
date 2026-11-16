import java.sql.*;

public class Q7A {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb", user = "root", pass = "123456789";
        String create = """
            CREATE TABLE IF NOT EXISTS Emp (
                EmpId INT PRIMARY KEY,
                First_Name VARCHAR(50),
                Last_Name VARCHAR(50),
                Salary DOUBLE
            )
            """;

        try (Connection con = DriverManager.getConnection(url, user, pass);
             Statement st = con.createStatement()) {

            st.executeUpdate(create);
            st.executeUpdate("INSERT INTO Emp VALUES (5,'John','Doe',55000)");
            System.out.println("Table created and record inserted successfully.");
        } catch (SQLException e) { e.printStackTrace(); }
    }
}
