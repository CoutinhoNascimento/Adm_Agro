

package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    static Connection con=null;


 public static Connection conectar(){
    try {

        con = DriverManager.getConnection("jdbc:mysql://localhost/adm_agro","root"," ");
    }
    catch (SQLException e) {
        System.out.println(e.getMessage());
    }
    return con;
    }
}
