import java.sql.*;

public class Db {
    private Connection con;

    public Db() {
        try {
            // 🔹 Проверь базу и пароль
            String url = "jdbc:mysql://localhost:3306/myGame?useSSL=false";
            String user = "root";
            String pass = "Lolka13371337"; // ← поставь свой пароль

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("✅ Підключення до бази даних встановлено!");
        } catch (Exception e) {
            System.out.println("❌ Помилка підключення до бази даних:");
            e.printStackTrace();
        }
    }

    // 🔹 Перевірка логіну та паролю
    public boolean authenticate(String username, String password) {
        String sql = "SELECT COUNT(*) FROM users WHERE username=? AND password=?";
        try (PreparedStatement pst = con.prepareStatement(sql)) {
            pst.setString(1, username);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) == 1;
            }
        } catch (SQLException e) {
            System.out.println("Помилка при виконанні SQL-запиту:");
            e.printStackTrace();
        }
        return false;
    }

    public void close() {
        try {
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
