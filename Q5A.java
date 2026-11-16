import java.sql.*;

public class Q5A {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root", pass = "123456789";
        String query = "SELECT EmpId, First_Name, Last_Name, Salary FROM Emp";
        try (Connection con = DriverManager.getConnection(url, user, pass);
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)) {

            while (rs.next()) {
                System.out.printf("%d %s %s %.2f%n",
                        rs.getInt("EmpId"),
                        rs.getString("First_Name"),
                        rs.getString("Last_Name"),
                        rs.getDouble("Salary"));
            }
        } catch (SQLException e) { e.printStackTrace(); }
    }
}

