
package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.ManterPagarReceber;
import modelo.ManterPropriedade;
import java.sql.Date;

public class ManterPagarReceberDAO {
    private Connection connection;
    private int id;
    private String quantidade;
    private String unidade;
    private String descricao;
    private String valor;
    private String tipo;
    private String apelido;
    private int cod_propriedade;
    private Date data;
    
     public ManterPagarReceberDAO(){
        connection= new ConnectionFactory().getConnection();
    }
     public void adiciona(ManterPagarReceber manterpagarreceber){
      
        String sql = "INSERT INTO pagar_receber (quantidade,unidade,descricao,valor,tipo,data,apelido,cod_propriedade) VALUES(?,?,?,?,?,now(),?,?)";
        try{
        PreparedStatement stmt = connection.prepareStatement(sql);
        
            stmt.setString(1, manterpagarreceber.getQuantidade());
            stmt.setString(2, manterpagarreceber.getUnidade());
            stmt.setString(3,manterpagarreceber.getDescricao());
            stmt.setString(4, manterpagarreceber.getValor());
            stmt.setString(5, manterpagarreceber.getTipo());
            stmt.setString(6, manterpagarreceber.getApelido());
            stmt.setInt(7, manterpagarreceber.getCod_propriedade());
             
           
           
            
            stmt.execute();
            stmt.close();
        }catch(SQLException ex){
           {JOptionPane.showMessageDialog(null,"Erro ao salvar"+ex);}
        }
    }
     public ArrayList<ManterPagarReceber> ListaPagarReceber(int cod_propriedade){
        ArrayList<ManterPagarReceber> lista4 = new ArrayList();
        
        String sql = "SELECT * FROM pagar_receber WHERE cod_propriedade LIKE ?";
        int busca = cod_propriedade;
        
          try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, busca);
            ResultSet rset = stmt.executeQuery();
            while(rset.next()){
               ManterPagarReceber manterpagarreceber = new ManterPagarReceber();
               
               
               manterpagarreceber.setId(rset.getInt("id"));
               manterpagarreceber.setQuantidade(rset.getString("quantidade"));
               manterpagarreceber.setUnidade(rset.getString("unidade"));
               manterpagarreceber.setDescricao(rset.getString("descricao"));
               manterpagarreceber.setValor(rset.getString("valor"));
               manterpagarreceber.setTipo(rset.getString("tipo"));
               manterpagarreceber.setData(rset.getDate("data"));
              
              
                
                lista4.add(manterpagarreceber);
            }
            stmt.close();
        }catch(SQLException ex){
            throw new RuntimeException(ex);
        }
        return lista4;
    }
     
      public void altera(ManterPagarReceber manterpagarreceber){
      
        String sql = "update pagar_receber set quantidade=?,unidade=?,descricao=?,valor=?,tipo=? where id=?";
        try{
        PreparedStatement stmt = connection.prepareStatement(sql);
        
            stmt.setString(1, manterpagarreceber.getQuantidade());
            stmt.setString(2, manterpagarreceber.getUnidade());
            stmt.setString(3,manterpagarreceber.getDescricao());
            stmt.setString(4, manterpagarreceber.getValor());
            stmt.setString(5, manterpagarreceber.getTipo());
            stmt.setInt(6, manterpagarreceber.getId());
           
            stmt.execute();
            stmt.close();
        }catch(SQLException ex){
           {JOptionPane.showMessageDialog(null,"Erro ao atualizar"+ex);}
        }
        
      }
      
       public void delete (ManterPagarReceber manterpagarreceber){
       String sql = "DELETE FROM pagar_receber WHERE id = ?";
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, manterpagarreceber.getId());
            stmt.executeUpdate();
            
            
                 
        }catch(SQLException ex)
        {JOptionPane.showMessageDialog(null,"Erro ao excluir"+ex);}
        
        }
      
     
    }   


        