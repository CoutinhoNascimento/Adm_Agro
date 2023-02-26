package dao;
import factory.ConnectionFactory;
import modelo.ManterUsuario;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.Date;

public class ManterUsuarioDAO {
    private Connection connection;
    private int id;
    private String nome;
    private String senha;
    private String cpf;
    private String telefone;
    private String tipo;
    private Date data;
    
    public ManterUsuarioDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adiciona(ManterUsuario manterusuario){
       
        
       
            String sql = "INSERT INTO usuario (nome,senha,cpf,telefone,tipo,data) VALUES(?,?,?,?,?,now())";
             
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, manterusuario.getNome());
            stmt.setString(2,manterusuario.getSenha());
            stmt.setString(3,manterusuario.getCpf());
            stmt.setString(4,manterusuario.getTelefone());
            stmt.setString(5,manterusuario.getTipo());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null,manterusuario.getNome()+" inserido com sucesso!");
            
        }catch(SQLException ex){
             JOptionPane.showMessageDialog(null,"Cpf Existente");      
        }
    }
    
    public ArrayList<ManterUsuario> ListaUsuario(String nome, int x){
        ArrayList<ManterUsuario> lista1 = new ArrayList();
        String sql = "";
        String busca = "";
        if(x == 1){
        sql = "SELECT * FROM usuario WHERE nome LIKE ?";
        busca = "%"+nome+"%";
        }else if(x == 2){
           sql = "SELECT * FROM usuario WHERE id = ?"; 
           busca = nome;
        }
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, busca);
            ResultSet rset = stmt.executeQuery();
            while(rset.next()){
               ManterUsuario manterusuario = new ManterUsuario();
                
               manterusuario.setId(rset.getInt("id"));
               manterusuario.setNome(rset.getString("nome"));
               manterusuario.setSenha(rset.getString("senha"));
               manterusuario.setCpf(rset.getString("cpf"));
               manterusuario.setTelefone(rset.getString("telefone"));
               manterusuario.setTipo(rset.getString("tipo"));
               manterusuario.setData(rset.getDate("data"));
               
               lista1.add(manterusuario);
            }
            stmt.close();
        }catch(SQLException ex){
            throw new RuntimeException(ex);
        }
        return lista1;
    }
    
    public void delete (ManterUsuario manterusuario){
       String sql = "DELETE FROM usuario WHERE id = ?";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, manterusuario.getId());
            stmt.execute();
                  
        }catch(SQLException ex)
        {JOptionPane.showMessageDialog(null,"Erro ao excluir"+ex);}
        
        }
    
     public void altera(ManterUsuario manterusuario){
        String sql ="update usuario  set nome=? ,senha=?, cpf=?, telefone=?, tipo=? where id=?";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setString(1, manterusuario.getNome());
            stmt.setString(2, manterusuario.getSenha());
            stmt.setString(3, manterusuario.getCpf());
            stmt.setString(4, manterusuario.getTelefone());
            stmt.setString(5,manterusuario.getTipo());
            stmt.setInt(6, manterusuario.getId());
            stmt.execute();
            stmt.close();
           JOptionPane.showMessageDialog(null,manterusuario.getNome()+" Atualizado com sucesso!");
            
        }catch(SQLException ex){
           JOptionPane.showMessageDialog(null,"Cpf Existente");
        }
    }      
}

