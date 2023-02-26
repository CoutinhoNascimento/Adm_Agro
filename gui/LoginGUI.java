
package gui;

import dao.LoginDAO;
import factory.ConnectionFactory;
import modelo.Login;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.ManterUsuario;
import java.awt.event.KeyEvent;

public class LoginGUI extends javax.swing.JFrame {
ArrayList<Login> lista = new ArrayList();


MenuAdmGUI enviatexto1;
MenuUsuGUI enviatexto2;

    
    public LoginGUI() {
        setExtendedState(LoginGUI.MAXIMIZED_BOTH);
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Entrar = new javax.swing.JButton();
        Tsenha = new javax.swing.JPasswordField();
        Tnome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        Entrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Entrar.setText("ENTRAR");
        Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarActionPerformed(evt);
            }
        });

        Tsenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TsenhaActionPerformed(evt);
            }
        });
        Tsenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                LoginGUI.this.keyPressed(evt);
            }
        });

        Tnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TnomeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Senha");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Nome");

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Samsung\\Documents\\NetBeansProjects\\ProjetoAgro\\src\\imagens\\horizontal_on_white_by_logaster.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(39, 39, 39)
                                .addComponent(Tsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(Tnome, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tsenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(Entrar)
                .addGap(23, 23, 23))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(100, 30, 390, 300);

        setBounds(0, 0, 759, 443);
    }// </editor-fold>//GEN-END:initComponents

    private void EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarActionPerformed
         LoginDAO dao = new LoginDAO();
       
         
           if((Tnome.getText().isEmpty()) || (Tsenha.getText().isEmpty())){
            JOptionPane.showMessageDialog(null, "os campos não podem retornar vazios!");
            
             }else if(Tsenha.getText().length() <8 ){  
         JOptionPane.showMessageDialog(null, "A senha são 8 digitos !");
         
          }else if(Tsenha.getText().length() >8 ){  
         JOptionPane.showMessageDialog(null, "A senha são no máximo 8 digitos !");

        }else{
             
            lista = dao.listaLogin(Tnome.getText(),Tsenha.getText());
            if(lista.isEmpty()){
                JOptionPane.showMessageDialog(null, "Administrador ou Usuário não cadastrado !");
                
          }else{
          
                
        for (Login  st : lista){
           
                  
                String x = (st.getTipo());
                
                
               if (x.equals("Administrador")) {
                   dispose();
                   
                    
                    String nome = (st.getNome());;
                    String tipo = ("Administrador");
                    enviatexto1 = new MenuAdmGUI();
                    enviatexto1.setVisible(true);
                    enviatexto1.receber1(nome);
                    enviatexto1.receber4(tipo);
                  
                   
                   
                   
               }else if (x.equals("Usuário")){
                dispose();
                  
                int id = (st.getId());
                String tipo = ("Usuário");
                enviatexto2 = new MenuUsuGUI();
                enviatexto2.setVisible(true);
                enviatexto2.receber(id);
                enviatexto2.receber4(tipo);
                
                 
              }    
            }
         }

        }
        Tnome.setText("");
        Tsenha.setText("");
    }//GEN-LAST:event_EntrarActionPerformed

    private void TsenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TsenhaActionPerformed
        
    }//GEN-LAST:event_TsenhaActionPerformed

    private void TnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TnomeActionPerformed
        
    }//GEN-LAST:event_TnomeActionPerformed

    private void keyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_keyPressed
       if(evt.getKeyCode() == KeyEvent.VK_ENTER){ 
           
   LoginDAO dao = new LoginDAO();
       
         
           if((Tnome.getText().isEmpty()) || (Tsenha.getText().isEmpty())){
            JOptionPane.showMessageDialog(null, "os campos não podem retornar vazios!");
            
             }else if(Tsenha.getText().length() <8 ){  
         JOptionPane.showMessageDialog(null, "A senha são 8 digitos !");
         
          }else if(Tsenha.getText().length() >8 ){  
         JOptionPane.showMessageDialog(null, "A senha são no máximo 8 digitos !");

        }else{
             
            lista = dao.listaLogin(Tnome.getText(),Tsenha.getText());
            if(lista.isEmpty()){
                JOptionPane.showMessageDialog(null, "Administrador ou Usuário não cadastrado !");
                
          }else{
          
                
        for (Login  st : lista){
           
                  
                String x = (st.getTipo());
                
                
               if (x.equals("Administrador")) {
                   dispose();
                   
                    
                    String nome = (st.getNome());;
                    String tipo = ("Administrador");
                    enviatexto1 = new MenuAdmGUI();
                    enviatexto1.setVisible(true);
                    enviatexto1.receber1(nome);
                    enviatexto1.receber4(tipo);
                  
                   
                   
                   
               }else if (x.equals("Usuário")){
                dispose();
                  
                int id = (st.getId());
                String tipo = ("Usuário");
                enviatexto2 = new MenuUsuGUI();
                enviatexto2.setVisible(true);
                enviatexto2.receber(id);
                enviatexto2.receber4(tipo);
                
                 
              }    
            }
         }

        }
        Tnome.setText("");
        Tsenha.setText("");
    }//GEN-LAST:event_keyPressed
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Entrar;
    private javax.swing.JTextField Tnome;
    private javax.swing.JPasswordField Tsenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
