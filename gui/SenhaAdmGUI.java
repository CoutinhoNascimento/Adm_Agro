
package gui;

import dao.SenhaAdmDAO;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Login;
import modelo.SenhaAdm;


public class SenhaAdmGUI extends javax.swing.JFrame {
 ArrayList<SenhaAdm> lista8 = new ArrayList();
  
 ManterUsuarioGUI enviatexto1;
 MenuAdmGUI enviatexto2;
 
 
    public SenhaAdmGUI() {
        initComponents();
    }
    private String tipo;
    public void receber4(String tipo){
    this.tipo = tipo;
  }
 
    private String nome;
    public void receber1(String nome){
    this.nome = nome;
 }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        OK = new javax.swing.JButton();
        Tsenha = new javax.swing.JPasswordField();
        Cancela = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Confirme a sua Senha !");

        OK.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        OK.setText("OK");
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });

        Tsenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TsenhaActionPerformed(evt);
            }
        });
        Tsenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TsenhaKeyPressed(evt);
            }
        });

        Cancela.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Cancela.setText("Cancela");
        Cancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Cancela, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OK, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Tsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cancela)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKActionPerformed
             SenhaAdmDAO dao = new SenhaAdmDAO();
       
      
          
           if(Tsenha.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios!");
            
             }else if(Tsenha.getText().length() <8 ){  
         JOptionPane.showMessageDialog(null, "A senha são 8 digitos !");
         
          }else if(Tsenha.getText().length() >8 ){  
         JOptionPane.showMessageDialog(null, "A senha são no máximo 8 digitos !");
         
          }else{
             
           lista8 = dao.listaSenha(nome, Tsenha.getText());
                     
            if(lista8.isEmpty()){
            JOptionPane.showMessageDialog(null, "Senha Errada !");  
            
           
 
            }else{
          
                    enviatexto1 = new ManterUsuarioGUI();
                    enviatexto1.setVisible(true);
                    enviatexto1.receber4(tipo);
                    enviatexto1.receber1(nome);
                    dispose();
                    
            }
          Tsenha.setText(""); 
          }   
         
    }//GEN-LAST:event_OKActionPerformed

    private void CancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelaActionPerformed
                   enviatexto2= new MenuAdmGUI();
                   enviatexto2.setVisible(true);
                   enviatexto2.receber1(nome);
                   enviatexto2.receber4("Administrador");
                   dispose();
    }//GEN-LAST:event_CancelaActionPerformed

    private void TsenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TsenhaKeyPressed
           if(evt.getKeyCode() == KeyEvent.VK_ENTER){ 
        
        SenhaAdmDAO dao = new SenhaAdmDAO();
       
           if(Tsenha.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios!");
            
             }else if(Tsenha.getText().length() <8 ){  
         JOptionPane.showMessageDialog(null, "A senha são 8 digitos !");
         
          }else if(Tsenha.getText().length() >8 ){  
         JOptionPane.showMessageDialog(null, "A senha são no máximo 8 digitos !");
         
          }else{
             
           lista8 = dao.listaSenha(nome, Tsenha.getText());
                     
            if(lista8.isEmpty()){
            JOptionPane.showMessageDialog(null, "Senha Errada !");  
            
           
 
            }else{
          
                    enviatexto1 = new ManterUsuarioGUI();
                    enviatexto1.setVisible(true);
                    enviatexto1.receber4(tipo);
                    enviatexto1.receber1(nome);
                    dispose();
                      
            }
         
          }
            Tsenha.setText("");
         }
       
    }//GEN-LAST:event_TsenhaKeyPressed

    private void TsenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TsenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TsenhaActionPerformed

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
            java.util.logging.Logger.getLogger(SenhaAdmGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SenhaAdmGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SenhaAdmGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SenhaAdmGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SenhaAdmGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancela;
    private javax.swing.JButton OK;
    private javax.swing.JPasswordField Tsenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
