package ro.teamnet.zth.api.em;

import ro.teamnet.zth.api.database.DBManager;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by user on 7/8/2016.
 */
public class EntityManagerImpl {
    public long getNextIdVal(String tableName, String columnIdName) {
        long returned = 0;
        try(Connection cn = DBManager.getConnection();
            Statement st = cn.createStatement() ){
            ResultSet rs = st.executeQuery("SELECT " + "max(" + columnIdName + ") from " + tableName );//select mx(id_column) + 1 from tableNme
            rs.next();
            returned = rs.getInt(1);
        } catch (SQLException e) {
            return -1;
        }
        return returned + 1;
    }
}
