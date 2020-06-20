
import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBWorker {

    private static final String USERNAME = "root";
    private static final String PASSWORD = "123qwe";
    private static final String URL = "jdbc:mysql://localhost:3306/mysql?useSSL=false";

    private Connection connection;

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public DBWorker() throws SQLException {
            DriverManager.registerDriver(new FabricMySQLDriver());
        }



        public Connection getConnection() throws SQLException {

            return connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
}
