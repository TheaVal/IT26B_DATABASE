
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL = "";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database Connected Succesfully");

        } catch (Exception e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
        }
        return conn;
    }

}
