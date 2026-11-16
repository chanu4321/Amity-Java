import java.sql.*;

public class Q9A {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb", user = "root", pass = "123456789";
        String query = "SELECT * FROM Emp";

        try (Connection con = DriverManager.getConnection(url, user, pass);
             Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
             ResultSet rs = st.executeQuery(query)) {

            rs.last();
            System.out.println("Last: " + rs.getString("First_Name"));

            rs.first();
            System.out.println("First: " + rs.getString("First_Name"));

            rs.absolute(2);
            System.out.println("Second: " + rs.getString("First_Name"));
        } catch (SQLException e) { e.printStackTrace(); }
    }
}
