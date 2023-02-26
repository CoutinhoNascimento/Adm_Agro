
package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.ManterPropriedade;
import java.sql.Date;

public class ManterPropriedadeDAO {
    private Connection connection;
    private int id;
    private String apelido;
    private String ccir;
    private String atividade;
    private String area;
    private String logradouro;
    private String estado;
    private String municipio;
    private String cep;
    private String telefone; 
    private Date data;
    
  
   
    
      public ManterPropriedadeDAO(){
        connection= new ConnectionFactory().getConnection();
    }
    
    public void salvar(ManterPropriedade manterpropriedade){
      
        String sql = "INSERT INTO propriedade (apelido,ccir,atividade,area,logradouro,estado,municipio,cep,telefone,data) VALUES(?,?,?,?,?,?,?,?,?,now())";
        try{
        PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setString(1,manterpropriedade.getApelido());
            stmt.setString(2, manterpropriedade.getCcir());
            stmt.setString(3, manterpropriedade.getAtividade());
            stmt.setString(4, manterpropriedade.getArea());
            stmt.setString(5,manterpropriedade.getLogradouro());
            stmt.setString(6, manterpropriedade.getEstado());
            stmt.setString(7, manterpropriedade.getMunicipio());
            stmt.setString(8, manterpropriedade.getCep());
            stmt.setString(9, manterpropriedade.getTelefone());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null,manterpropriedade.getApelido()+" inserido com sucesso!");
            
        }catch(SQLException ex){
           JOptionPane.showMessageDialog(null,"CCIR Existente");  
        }
    }
    
     public void alterar(ManterPropriedade manterpropriedade){
      
        
       String sql = "update propriedade  set apelido=?, ccir=?, atividade=?, area=?, logradouro=?, estado=?, municipio=?, cep=?, telefone=? where id=?";
       
        try{
        PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setString(1,manterpropriedade.getApelido());
            stmt.setString(2, manterpropriedade.getCcir());
            stmt.setString(3, manterpropriedade.getAtividade());
            stmt.setString(4, manterpropriedade.getArea());
            stmt.setString(5,manterpropriedade.getLogradouro());
            stmt.setString(6, manterpropriedade.getEstado());
            stmt.setString(7, manterpropriedade.getMunicipio());
            stmt.setString(8, manterpropriedade.getCep());
            stmt.setString(9, manterpropriedade.getTelefone());
            stmt.setInt(10, manterpropriedade.getId());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null,manterpropriedade.getApelido()+" atualizado com sucesso!");
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"CCIR Existente");  
        }
    }
    
    public void excluir(ManterPropriedade manterpropriedade){
      
        
       String sql = "DELETE FROM propriedade WHERE id = ?";
       
        try{
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setInt(1, manterpropriedade.getId());
        stmt.executeUpdate();   
           
        stmt.close();
        }catch(SQLException ex){
            {JOptionPane.showMessageDialog(null,"Erro ao excluir"+ex);}
        }
    }
    
    public void excluir1(ManterPropriedade manterpropriedade){
      
        
       String sql = "DELETE FROM pagar_receber WHERE cod_propriedade = ?";
       
        try{
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setInt(1, manterpropriedade.getId());
        stmt.executeUpdate();   
           
        stmt.close();
        }catch(SQLException ex){
            {JOptionPane.showMessageDialog(null,"Erro ao excluir"+ex);}
        }
    }
    
     public ArrayList<ManterPropriedade> ListaPropriedade(String apelido, int x){
        ArrayList<ManterPropriedade> lista2 = new ArrayList();
        String sql = "";
        String busca = "";
        
         if(x == 1){
         sql = "SELECT * FROM propriedade WHERE apelido LIKE ?";
         busca =  apelido+"%";
         }else if(x == 2){
         sql = "SELECT * FROM propriedade WHERE id = ?"; 
         busca = apelido ;
         }
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, busca);
            ResultSet rset = stmt.executeQuery();
            while(rset.next()){
               ManterPropriedade manterpropriedade = new ManterPropriedade();
               
               
               manterpropriedade.setId(rset.getInt("id"));
               manterpropriedade.setApelido(rset.getString("apelido"));
               manterpropriedade.setCcir(rset.getString("ccir"));
               manterpropriedade.setAtividade(rset.getString("atividade"));
               manterpropriedade.setArea(rset.getString("area"));
               manterpropriedade.setLogradouro(rset.getString("logradouro"));
               manterpropriedade.setEstado(rset.getString("estado"));
               manterpropriedade.setMunicipio(rset.getString("municipio"));
               manterpropriedade.setCep(rset.getString("cep"));
               manterpropriedade.setTelefone(rset.getString("telefone"));
               manterpropriedade.setData(rset.getDate("data"));
                
                lista2.add(manterpropriedade);
            }
            stmt.close();
        }catch(SQLException ex){
            throw new RuntimeException(ex);
        }
        return lista2;
    }
     
     
}
