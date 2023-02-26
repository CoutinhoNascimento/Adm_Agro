
package gui;
import modelo.ManterUsuario;
import dao.ManterUsuarioDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

public class ManterUsuarioGUI extends javax.swing.JFrame {
    ArrayList<ManterUsuario> lista1 = new ArrayList();
  
 MenuAdmGUI enviatexto1;
   
    public ManterUsuarioGUI() {
        setExtendedState(ManterUsuarioGUI.MAXIMIZED_BOTH);
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Tnome = new javax.swing.JTextField();
        Tsenha = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        Tcpf = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter cpf= new javax.swing.text.MaskFormatter("###.###.###-##");
            Tcpf = new javax.swing.JFormattedTextField(cpf);
        }
        catch (Exception e){
        }
        Ttelefone = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter telefone= new javax.swing.text.MaskFormatter("(**)**********");
            telefone.setValidCharacters(" 0123456789.-");
            Ttelefone = new javax.swing.JFormattedTextField(telefone);
        }
        catch (Exception e){
        }
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Ttipo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        TbuscaUsuario = new javax.swing.JTextField();
        ok = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabela1 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        menu = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        cadastrar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        limpar = new javax.swing.JButton();
        sair = new javax.swing.JButton();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jMenu5.setText("jMenu5");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cadastro de Usuários", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Senha");

        try{
            javax.swing.text.MaskFormatter login= new javax.swing.text.MaskFormatter("******************************");
            login.setValidCharacters(" aáàbcdeéèfghiíìjklmnoóòpqrstuúùvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
            Tnome = new javax.swing.JFormattedTextField(login);         
        }
        catch (Exception e){
        }
        Tnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TnomeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Cpf");

        Tcpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TcpfActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Telefone");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Tipo");

        Ttipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuário", "Administrador", " " }));
        Ttipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TtipoActionPerformed(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Samsung\\Documents\\NetBeansProjects\\ProjetoAgro\\src\\imagens\\01.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tnome, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(109, 109, 109)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(19, 19, 19))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(Ttelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ttipo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(292, 292, 292))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tnome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tcpf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tsenha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ttelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ttipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Buscar Usuário"));

        TbuscaUsuario.setToolTipText("Digite o nome do usuário");
        TbuscaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TbuscaUsuarioActionPerformed(evt);
            }
        });

        ok.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ok.setIcon(new javax.swing.ImageIcon("C:\\Users\\Samsung\\Documents\\NetBeansProjects\\ProjetoAgro\\src\\imagens\\Search_24x24.png")); // NOI18N
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        Tabela1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Tabela1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Nome", "Data"
            }
        ));
        Tabela1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabela1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabela1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(TbuscaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(247, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TbuscaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        menu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menu.setIcon(new javax.swing.ImageIcon("C:\\Users\\Samsung\\Documents\\NetBeansProjects\\ProjetoAgro\\src\\imagens\\Menu_24x24.png")); // NOI18N
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        alterar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        alterar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Samsung\\Documents\\NetBeansProjects\\ProjetoAgro\\src\\imagens\\Refresh_24x24.png")); // NOI18N
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
            }
        });

        cadastrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cadastrar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Samsung\\Documents\\NetBeansProjects\\ProjetoAgro\\src\\imagens\\Save_24x24.png")); // NOI18N
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        excluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        excluir.setIcon(new javax.swing.ImageIcon("C:\\Users\\Samsung\\Documents\\NetBeansProjects\\ProjetoAgro\\src\\imagens\\Delete_24x24.png")); // NOI18N
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        limpar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        limpar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Samsung\\Documents\\NetBeansProjects\\ProjetoAgro\\src\\imagens\\iconfinder_Clear_131912.png")); // NOI18N
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });

        sair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sair.setIcon(new javax.swing.ImageIcon("C:\\Users\\Samsung\\Documents\\NetBeansProjects\\ProjetoAgro\\src\\imagens\\Exit_24x24.png")); // NOI18N
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(menu))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 20, 770, 540);

        setBounds(0, 0, 831, 628);
    }// </editor-fold>//GEN-END:initComponents

    private void Tabela1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabela1MouseClicked
        String cod = Tabela1.getValueAt(Tabela1.getSelectedRow(),0).toString();
        ManterUsuarioDAO  manterusuario = new ManterUsuarioDAO();
        lista1 =  manterusuario.ListaUsuario(cod, 2);
        for(ManterUsuario st : lista1){
            Tnome.setText(st.getNome());
            Tsenha.setText(st.getSenha());
            Tcpf.setText(st.getCpf());
            Ttelefone.setText(st.getTelefone());
            Ttipo.setSelectedItem(st.getTipo());
        }
    }//GEN-LAST:event_Tabela1MouseClicked

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        ManterUsuarioDAO  manterusuario = new ManterUsuarioDAO();

        lista1 =  manterusuario.ListaUsuario(TbuscaUsuario.getText(), 1);
        ((DefaultTableModel) Tabela1.getModel()).setNumRows(0);
        Tabela1.updateUI();
        DefaultTableModel modelo = (DefaultTableModel) Tabela1.getModel();
        for(ManterUsuario st : lista1){
            modelo.addRow(new Object[]{st.getId(), st.getNome(), st.getData() });
            }
    }//GEN-LAST:event_okActionPerformed

    private void TbuscaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TbuscaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TbuscaUsuarioActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
       System.exit(0);
    }//GEN-LAST:event_sairActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
         receber4(tipo);
               
               if (tipo.equals("Administrador")) {
                   
                   enviatexto1 = new  MenuAdmGUI();
                   enviatexto1.setVisible(true);
                   enviatexto1.receber1(nome);
                   dispose();
                   
               }else if(tipo.equals("Usuário")){
                   MenuUsuGUI janelaPrincipal = new  MenuUsuGUI();
                   janelaPrincipal.setVisible(true);
                dispose();
                  
                  
         }
    }//GEN-LAST:event_menuActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        Tnome.setText(null);
        Tsenha.setText(null);
        Tcpf.setText(null);
        Ttelefone.setText(null);
    }//GEN-LAST:event_limparActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        ManterUsuario  manterusuario = new ManterUsuario();
        ManterUsuarioDAO dao = new ManterUsuarioDAO();
       
         if((Tnome.getText().equals("                              ")) || (Tsenha.getText().isEmpty())|| (Tcpf.getText().equals("   .   .   -  ")) || (Ttelefone.getText().equals("(  )     -    ")) || (Ttipo.getSelectedItem().equals(""))){            JOptionPane.showMessageDialog(null, "os campos não podem retornar vazios!");
        }else{

            manterusuario.setId((int) Tabela1.getValueAt(Tabela1.getSelectedRow(), 0));
            dao.delete( manterusuario);
            ((DefaultTableModel)Tabela1.getModel()).removeRow(Tabela1.getSelectedRow());
            JOptionPane.showMessageDialog(null, "Usuário "+Tnome.getText()+" deletado com sucesso!");
            
        }

        Tnome.setText("");
        Tsenha.setText("");
        Tcpf.setText("");
        Ttelefone.setText("");
        Ttipo.setSelectedItem("");
    }//GEN-LAST:event_excluirActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        ManterUsuario  manterusuario = new ManterUsuario();

        manterusuario .setNome(Tnome.getText());
        manterusuario .setSenha(Tsenha.getText());
        manterusuario.setCpf(Tcpf.getText());
        manterusuario.setTelefone(Ttelefone.getText());
        manterusuario.setTipo(Ttipo.getSelectedItem().toString());

         if((Tnome.getText().equals("                              ")) ||  (Ttelefone.getText().equals("(  )     -    ")) || (Ttipo.getSelectedItem().equals(""))){
           JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios!");
           
         }else if(Tsenha.getText().length() <8 ){  
         JOptionPane.showMessageDialog(null, "A senha são 8 digitos !");
         
          }else if(Tsenha.getText().length() >8 ){  
         JOptionPane.showMessageDialog(null, "A senha são no máximo 8 digitos !");
        
        }else if(Tcpf.getText().equals("   .   .   -  ")){  
           JOptionPane.showMessageDialog(null, "Digite os 11 números do CPF !");
        
      
        }else{
            manterusuario .setId((int) Tabela1.getValueAt(Tabela1.getSelectedRow(), 0));
            ManterUsuarioDAO dao = new ManterUsuarioDAO();
            dao.altera( manterusuario );
            
             ManterUsuarioDAO  atualizar = new    ManterUsuarioDAO();
            lista1 =  atualizar.ListaUsuario(TbuscaUsuario.getText(), 1);
            ((DefaultTableModel) Tabela1.getModel()).setNumRows(0);
             Tabela1.updateUI();
             DefaultTableModel modelo = (DefaultTableModel) Tabela1.getModel();
             for( ManterUsuario st : lista1){
            modelo.addRow(new Object[]{st.getId(), st.getNome(), st.getData() });
         
           }
        }

        Tnome.setText("");
        Tsenha.setText("");
        Tcpf.setText("");
        Ttelefone.setText("");
        Ttipo.setSelectedItem("");
    }//GEN-LAST:event_alterarActionPerformed

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed
        ManterUsuario  manterusuario = new ManterUsuario();

        manterusuario.setNome(Tnome.getText());
        manterusuario.setSenha(Tsenha.getText());
        manterusuario.setCpf(Tcpf.getText());
        manterusuario.setTelefone(Ttelefone.getText());
        manterusuario.setTipo(Ttipo.getSelectedItem().toString());
         
        if((Tnome.getText().equals("                              ")) ||  (Ttelefone.getText().equals("(  )     -    ")) || (Ttipo.getSelectedItem().equals(""))){
           JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios!");
           
         }else if(Tsenha.getText().length() <8 ){  
         JOptionPane.showMessageDialog(null, "A senha são 8 digitos !");
         
          }else if(Tsenha.getText().length() >8 ){  
         JOptionPane.showMessageDialog(null, "A senha são no máximo 8 digitos !");
        
        }else if(Tcpf.getText().equals("   .   .   -  ")){  
           JOptionPane.showMessageDialog(null, "Digite os 11 números do CPF !"); 
           
        }else{
             ManterUsuarioDAO dao = new ManterUsuarioDAO();
            dao.adiciona( manterusuario);
           
             ManterUsuarioDAO  atualizar = new    ManterUsuarioDAO();
            lista1 =  atualizar.ListaUsuario(TbuscaUsuario.getText(), 1);
            ((DefaultTableModel) Tabela1.getModel()).setNumRows(0);
             Tabela1.updateUI();
             DefaultTableModel modelo = (DefaultTableModel) Tabela1.getModel();
             for( ManterUsuario st : lista1){
            modelo.addRow(new Object[]{st.getId(), st.getNome(), st.getData() });
           }  
        }

        Tnome.setText("");
        Tsenha.setText("");
        Tcpf.setText("");
        Ttelefone.setText("");
        Ttipo.setSelectedItem("");
    }//GEN-LAST:event_cadastrarActionPerformed

    private void TnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TnomeActionPerformed
       
    }//GEN-LAST:event_TnomeActionPerformed

    private void TtipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TtipoActionPerformed
       
    }//GEN-LAST:event_TtipoActionPerformed

    private void TcpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TcpfActionPerformed
        
    }//GEN-LAST:event_TcpfActionPerformed

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
            java.util.logging.Logger.getLogger(ManterUsuarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManterUsuarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManterUsuarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManterUsuarioGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManterUsuarioGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela1;
    private javax.swing.JTextField TbuscaUsuario;
    private javax.swing.JTextField Tcpf;
    private javax.swing.JTextField Tnome;
    private javax.swing.JPasswordField Tsenha;
    private javax.swing.JTextField Ttelefone;
    private javax.swing.JComboBox<String> Ttipo;
    private javax.swing.JButton alterar;
    private javax.swing.JButton cadastrar;
    private javax.swing.JButton excluir;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton limpar;
    private javax.swing.JButton menu;
    private javax.swing.JButton ok;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables
}
