
package gui;

import dao.SenhaAdmDAO;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import modelo.SenhaAdm;

public class SenhaAdm1GUI extends javax.swing.JFrame {
 ArrayList<SenhaAdm> lista8 = new ArrayList();
    
   
    public SenhaAdm1GUI() {
        initComponents();
        JFC_Salvar_Backup.setVisible(false);
    }
    
     private String tipo;
    public void receber4(String tipo){
    this.tipo = "Administrador";
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
        Tsenha = new javax.swing.JPasswordField();
        Cancela = new javax.swing.JButton();
        JB_Backup = new javax.swing.JButton();
        JFC_Salvar_Backup = new javax.swing.JFileChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Confirme a sua senha!");

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

        JB_Backup.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JB_Backup.setText("OK");
        JB_Backup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JB_BackupActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JFC_Salvar_Backup, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JB_Backup, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cancela, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JFC_Salvar_Backup, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Tsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JB_Backup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Cancela)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JB_BackupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JB_BackupActionPerformed
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
        
         dispose();
         
        try {
String arquivo = null;

JFC_Salvar_Backup.setVisible(true);                        

int result = JFC_Salvar_Backup.showSaveDialog(null);

if(result == JFileChooser.APPROVE_OPTION){
arquivo = JFC_Salvar_Backup.getSelectedFile().toString().concat(".sql");

File file = new File(arquivo); 

if(file.exists()){
   Object[] options = { "Sim", "Não" };
                int opcao = JOptionPane.showOptionDialog(null,"Este arquivo já existe. Quer sobreescrever este arquivo?", "Atenção!!!",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,options, options[0]);
                    if (opcao == JOptionPane.YES_OPTION) {                
                        Runtime bck = Runtime.getRuntime();   
                        bck.exec("C:/xampp/mysql/bin/mysqldump -v -v -v --host=localhost --user=root  --port=3306 --protocol=tcp --force --allow-keywords --compress  --add-drop-table --default-character-set=latin1 --hex-blob  --result-file="+arquivo+" --databases  adm_agro");  
                        JOptionPane.showMessageDialog(null, "Backup realizado com sucesso. " + arquivo, "Tudo OK!", 1);
                    }else{
                        JB_BackupActionPerformed(evt);
                    }
}else{
 
                        Runtime bck = Runtime.getRuntime();   
                        bck.exec("C:/xampp/mysql/bin/mysqldump -v -v -v --host=localhost --user=root  --port=3306 --protocol=tcp --force --allow-keywords --compress  --add-drop-table --default-character-set=latin1 --hex-blob  --result-file="+arquivo+" --databases  adm_agro");  
                        JOptionPane.showMessageDialog(null, "Backup realizado com sucesso. " + arquivo, "Tudo OK!", 1);   
}

}
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e, "Erro!", 2);
        }
    }
   
    }
        Tsenha.setText("");
    }//GEN-LAST:event_JB_BackupActionPerformed

    private void CancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelaActionPerformed
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
        
         dispose();
         
        try {
String arquivo = null;

JFC_Salvar_Backup.setVisible(true);                        

int result = JFC_Salvar_Backup.showSaveDialog(null);

if(result == JFileChooser.APPROVE_OPTION){
arquivo = JFC_Salvar_Backup.getSelectedFile().toString().concat(".sql");

File file = new File(arquivo); 

if(file.exists()){
   Object[] options = { "Sim", "Não" };
                int opcao = JOptionPane.showOptionDialog(null,"Este arquivo já existe. Quer sobreescrever este arquivo?", "Atenção!!!",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null,options, options[0]);
                    if (opcao == JOptionPane.YES_OPTION) {                
                        Runtime bck = Runtime.getRuntime();   
                        bck.exec("C:/xampp/mysql/bin/mysqldump -v -v -v --host=localhost --user=root  --port=3306 --protocol=tcp --force --allow-keywords --compress  --add-drop-table --default-character-set=latin1 --hex-blob  --result-file="+arquivo+" --databases  adm_agro");  
                        JOptionPane.showMessageDialog(null, "Backup realizado com sucesso. " + arquivo, "Tudo OK!", 1);
                    }else{
                        TsenhaKeyPressed(evt);
                    }
}else{
 
                        Runtime bck = Runtime.getRuntime();   
                        bck.exec("C:/xampp/mysql/bin/mysqldump -v -v -v --host=localhost --user=root  --port=3306 --protocol=tcp --force --allow-keywords --compress  --add-drop-table --default-character-set=latin1 --hex-blob  --result-file="+arquivo+" --databases  adm_agro");  
                        JOptionPane.showMessageDialog(null, "Backup realizado com sucesso. " + arquivo, "Tudo OK!", 1);   
}

}
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e, "Erro!", 2);
        }
    }
   
    }
        Tsenha.setText("");
    }//GEN-LAST:event_TsenhaKeyPressed
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
            java.util.logging.Logger.getLogger(SenhaAdm1GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SenhaAdm1GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SenhaAdm1GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SenhaAdm1GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SenhaAdm1GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancela;
    private javax.swing.JButton JB_Backup;
    private javax.swing.JFileChooser JFC_Salvar_Backup;
    private javax.swing.JPasswordField Tsenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
