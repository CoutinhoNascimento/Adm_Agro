
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
import modelo.ManterRelatorio;


public class ManterRelatorioDAO {
    
    private Connection connection;
    private int id;
    private int quantidade;
    private String unidade;
    private String descricao;
    private double valor;
    private String tipo;
    private int cod_propriedade;
    private Date data;
    
   public ManterRelatorioDAO(){
        connection= new ConnectionFactory().getConnection();
    }
   public ArrayList<ManterRelatorio> ListaRelatorio(String apelido, int x){
        ArrayList<ManterRelatorio> lista5 = new ArrayList();
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
               ManterRelatorio manterrelatorio = new ManterRelatorio();
               
               
               manterrelatorio .setId(rset.getInt("id"));
               manterrelatorio .setApelido(rset.getString("apelido"));
               manterrelatorio .setCcir(rset.getString("ccir"));
              
                
                lista5.add(manterrelatorio );
            }
            stmt.close();
        }catch(SQLException ex){
            throw new RuntimeException(ex);
        }
        return lista5;
    }
   
   public ArrayList<ManterRelatorio> ListaRelatorio1(String apelido){
          ArrayList<ManterRelatorio> lista6 = new ArrayList();
        
         try {  
            connection= new ConnectionFactory().getConnection(); 
            String Sql = "select * from pagar_receber where apelido like ?";
            String busca = "%"+apelido+"%";  
            PreparedStatement statement = connection.prepareStatement(Sql); 
            statement.setString(1, busca);
            ResultSet rset = statement.executeQuery();  
            while (rset.next()) {
                
               ManterRelatorio manterrelatorio1 = new ManterRelatorio();
               
               
               manterrelatorio1.setId(rset.getInt("id"));
               manterrelatorio1.setQuantidade(rset.getInt("quantidade"));
               manterrelatorio1.setUnidade(rset.getString("unidade"));
               manterrelatorio1.setDescricao(rset.getString("descricao"));
               manterrelatorio1.setValor(rset.getDouble("valor"));
               manterrelatorio1.setTipo(rset.getString("tipo"));
               manterrelatorio1.setData(rset.getDate("data"));
              
              
                
                lista6.add(manterrelatorio1);
            }
            connection.close();
        }catch(SQLException ex){
            throw new RuntimeException(ex);
        }
        return lista6;
    }
}
