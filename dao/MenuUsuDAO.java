
package dao;

import java.util.ArrayList;
import java.sql.*;
import factory.ConnectionFactory;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.MenuUsu;

public class MenuUsuDAO {
    
private final Connection connection;
private int id;
private String senha;   

public  MenuUsuDAO(){
 this.connection = new ConnectionFactory().getConnection();
}  

    
    public ArrayList<MenuUsu> listaBuscar(int id){
          ArrayList<MenuUsu> lista7 = new ArrayList();
        
        
        String sql = "SELECT * FROM usuario WHERE id LIKE ?";
        
        
        try{
           PreparedStatement stmt = connection.prepareStatement(sql);
           stmt.setInt(1, id);
          
           
           ResultSet rset = stmt.executeQuery();
           
             while(rset.next()){
               MenuUsu buscarsenha = new MenuUsu();
                
                buscarsenha .setId(rset.getInt("id"));
                buscarsenha .setSenha(rset.getString("senha"));
                lista7.add(buscarsenha );
           }   
            stmt.close(); 
        }catch(SQLException e){
            throw new RuntimeException(e);    
        }
        return lista7; 
   }
}
