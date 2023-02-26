
package factory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {
     public static void closeConnection(Connection connection, PreparedStatement stmt, ResultSet rs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public Connection getConnection(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost/adm_agro", "root", "");
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
    }
}
