
package dao;
import factory.ConnectionFactory;
import static java.lang.Math.log;
import static java.lang.StrictMath.log;
import modelo.SenhaAdm;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SenhaAdmDAO {
   private Connection connection;
    private int id;
     private String nome;
    private String senha;
    
     public SenhaAdmDAO(){
        connection= new ConnectionFactory().getConnection();
    }
     
      public ArrayList<SenhaAdm> listaSenha(String nome, String senha){
        ArrayList<SenhaAdm> lista8 = new ArrayList();
        
       String sql = "Select * from usuario where ((nome = ?) and (senha = ?))";
        
    try{
         PreparedStatement stmt = connection.prepareStatement(sql);
           stmt.setString(1, nome);
            stmt.setString(2, senha);
         
           ResultSet rset = stmt.executeQuery();
          
          while(rset.next()){
                SenhaAdm templog = new SenhaAdm();
                
                templog.setNome(rset.getString("nome"));
                templog.setSenha(rset.getString("senha"));
                
                
                
                lista8.add(templog);
               
        }
            stmt.close();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        return lista8;
    }
     
    
}
