import java.sql.*;

public class Q8A {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb", user = "root", pass = "123456789";
        String sql = "INSERT INTO Emp VALUES (?,?,?,?)";

        try (Connection con = DriverManager.getConnection(url, user, pass);
             PreparedStatement ps = con.prepareStatement(sql)) {

            Object[][] data = {
                {6, "Alice", "Smith", 62000.0},
                {7, "Bob", "Lee", 70000.0}
            };

            for (Object[] row : data) {
                ps.setInt(1, (Integer) row[0]);
                ps.setString(2, (String) row[1]);
                ps.setString(3, (String) row[2]);
                ps.setDouble(4, (Double) row[3]);
                ps.addBatch();
            }

            ps.executeBatch();
            System.out.println("Multiple records inserted successfully.");
        } catch (SQLException e) { e.printStackTrace(); }
    }
}
