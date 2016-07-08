package ro.teamnet.zth.api.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by user on 7/8/2016.
 */
public class DBManager implements DBProperties{

    public static final String CONNECTION_STRING = "jdbc:oracle:thin:@" + DBProperties.IP + ":" + DBProperties.PORT  ;

    private DBManager() throws  UnsupportedOperationException{
    }
    private static void registerDriver() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection() {
        Connection cn = null;
        registerDriver();
        try {
            cn = DriverManager.getConnection(CONNECTION_STRING, USER, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cn;
    }

    public static boolean checkConnection(Connection cn) {
        try(Statement st = cn.createStatement()){
            st.execute("SELECT 1 from DUAL");
        } catch (SQLException e) {
            return false;
        }
        return true;
    }
}
