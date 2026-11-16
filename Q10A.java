import java.sql.*;

public class Q10A {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb", user = "root", pass = "123456789";

        try (Connection con = DriverManager.getConnection(url, user, pass);
             CallableStatement cs = con.prepareCall("{CALL factorial(?, ?)}")) {

            cs.setInt(1, 5);
            cs.registerOutParameter(2, Types.BIGINT);
            cs.execute();

            System.out.println("Factorial = " + cs.getLong(2));
        } catch (SQLException e) { e.printStackTrace(); }
    }
}
