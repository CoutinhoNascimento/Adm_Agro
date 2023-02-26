package dao;
import factory.ConnectionFactory;
import static java.lang.Math.log;
import static java.lang.StrictMath.log;
import modelo.Login;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;




public class LoginDAO {
    private Connection connection;
    private int id;
    private String nome;
    private String senha;
    private String tipo;
   
    
    public LoginDAO(){
        connection= new ConnectionFactory().getConnection();
    }
    
   
    
    public ArrayList<Login> listaLogin(String nome, String senha){
        ArrayList<Login> lista = new ArrayList();
       

        String sql = "Select * from usuario where ((nome = ?) and (senha = ?))";
        
    try{
         PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, nome);
            stmt.setString(2, senha);
            
            
            ResultSet rset = stmt.executeQuery();
          
          while(rset.next()){
                Login templog = new Login();
                
                templog.setId(rset.getInt("id"));
                templog.setNome(rset.getString("nome"));
                templog.setSenha(rset.getString("senha"));
                templog.setTipo(rset.getString("tipo"));
                
                lista.add(templog);
               
        }
            stmt.close();
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        return lista;
    }
    

}       
    

