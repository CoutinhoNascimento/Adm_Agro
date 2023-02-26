
package dao;

import java.sql.*;
import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ManterUsuario;
import modelo.TrocarSenhaUsuario;


public class TrocarSenhaUsuarioDAO {
private final Connection connection;
private int id;
private String senha; 


  public  TrocarSenhaUsuarioDAO(){
 this.connection = new ConnectionFactory().getConnection();
}  
  
   public void atualiza (TrocarSenhaUsuario trocarsenhausuario){
        String sql ="update usuario  set senha=? where id=?";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            
           stmt.setString(1, trocarsenhausuario.getSenha());
           stmt.setInt(2, trocarsenhausuario.getId());
            
            stmt.execute();
            stmt.close();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
   }
    
}


