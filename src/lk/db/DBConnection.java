/*
 * *
 *  * @author : Ishara Dinusanka <isharapesonal@gmail.com>
 *  * @since : 08/07/2021
 *  *
 */



package lk;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static DBConnection dBConnection;
    private Connection connection;

    private DBConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demoFx", "root", "ijse");
    }


    public static DBConnection getInstance() throws ClassNotFoundException, SQLException{
        return (null==dBConnection)?
                (dBConnection= new DBConnection()):
                (dBConnection);
    }

    public Connection getConnection(){
        return connection;
    }
}





