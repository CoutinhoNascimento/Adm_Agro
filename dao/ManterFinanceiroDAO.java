
package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ManterFinanceiro;


public class ManterFinanceiroDAO {
    private Connection connection;
    private int id;
    private String apelido;
    private String ccir;
    
     public ManterFinanceiroDAO(){
        connection= new ConnectionFactory().getConnection();
    }
    
    
    
     public ArrayList<ManterFinanceiro> ListaPropriedade1(String apelido, int x){
        ArrayList<ManterFinanceiro> lista3 = new ArrayList();
        String sql = " ";
        String busca = " ";
        
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
               ManterFinanceiro manterfinanceiro = new ManterFinanceiro();
               
               
               manterfinanceiro.setId(rset.getInt("id"));
               manterfinanceiro.setApelido(rset.getString("apelido"));
               manterfinanceiro.setCcir(rset.getString("ccir"));
              
                
                lista3.add(manterfinanceiro);
            }
            stmt.close();
        }catch(SQLException ex){
            throw new RuntimeException(ex);
        }
        return lista3;
    }
}
