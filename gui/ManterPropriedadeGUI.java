
package gui;
import dao.LoginDAO;
import modelo.Login;
import dao.ManterPropriedadeDAO;
import modelo.ManterPropriedade;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




public class ManterPropriedadeGUI extends javax.swing.JFrame {
 ArrayList<ManterPropriedade> lista2 = new ArrayList();
  MenuUsuGUI enviatexto1;
    
    public ManterPropriedadeGUI() {
        setExtendedState(ManterPropriedadeGUI.MAXIMIZED_BOTH);
        initComponents();
    }
    
    private int id;
    public void receber(int id){
    this.id = id;
   }
    
    private String tipo;
    public void receber4(String tipo){
    this.tipo = tipo;
  }
    

  
 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        SbuscaPropriedade = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabela2 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        salvar = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        limpar = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        Stelefone = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter telefone= new javax.swing.text.MaskFormatter("(**)**********");
            telefone.setValidCharacters(" 0123456789.-");
            Stelefone = new javax.swing.JFormattedTextField(telefone);
        }
        catch (Exception e){
        }
        jLabel9 = new javax.swing.JLabel();
        Slogradouro = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter logradouro= new javax.swing.text.MaskFormatter("******************************");
            logradouro.setValidCharacters(" aáàâãbcçdeéèêfghiíìjklmnoóòôõpqrstuúùvwxyzAÁÀÂÃBCÇDEÉÈFGHIÍÌJKLMNOÓÒÔÕPQRSTUÚÙVWXYZ.,:-0123456789");
            Slogradouro = new javax.swing.JFormattedTextField(logradouro);
        }
        catch (Exception e){
        }
        jLabel4 = new javax.swing.JLabel();
        Sestado = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        Smunicipio = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter municipio= new javax.swing.text.MaskFormatter("***************");
            municipio.setValidCharacters(" aáàâãbcçdeéèêfghiíìjklmnoóòôõpqrstuúùvwxyzAÁÀÂÃBCÇDEÉÈFGHIÍÌJKLMNOÓÒÔÕPQRSTUÚÙVWXYZ.,:-");
            Smunicipio = new javax.swing.JFormattedTextField(municipio);
        }
        catch (Exception e){
        }
        jLabel6 = new javax.swing.JLabel();
        Scep = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter cep= new javax.swing.text.MaskFormatter("#####-###");
            Scep = new javax.swing.JFormattedTextField(cep);
        }
        catch (Exception e){
        }
        jLabel7 = new javax.swing.JLabel();
        Satividade = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter atividade= new javax.swing.text.MaskFormatter("***************");
            atividade.setValidCharacters(" aáàâãbcçdeéèêfghiíìjklmnoóòôõpqrstuúùvwxyzAÁÀÂÃBCÇDEÉÈFGHIÍÌJKLMNOÓÒÔÕPQRSTUÚÙVWXYZ.,:-");
            Satividade = new javax.swing.JFormattedTextField(atividade);
        }
        catch (Exception e){
        }
        jLabel2 = new javax.swing.JLabel();
        Sapelido = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter apelido= new javax.swing.text.MaskFormatter("******************************");
            apelido.setValidCharacters(" aáàâãbcçdeéèêfghiíìjklmnoóòôõpqrstuúùvwxyzAÁÀÂÃBCÇDEÉÈFGHIÍÌJKLMNOÓÒÔÕPQRSTUÚÙVWXYZ.,:-0123456789");
            Sapelido = new javax.swing.JFormattedTextField(apelido);
            apelido.setOverwriteMode(true); 
        }
        catch (Exception e){
        }
        jLabel1 = new javax.swing.JLabel();
        Sarea = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter area= new javax.swing.text.MaskFormatter("***************");
            area.setValidCharacters(" 0123456789,.");
            Sarea = new javax.swing.JFormattedTextField(area);
        }
        catch (Exception e){
        }
        jLabel3 = new javax.swing.JLabel();
        Sccir = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter ccir= new javax.swing.text.MaskFormatter("###.###.###.###-#");
            Sccir = new javax.swing.JFormattedTextField(ccir);
        }
        catch (Exception e){
        }
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Cadatro de Propriedades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(945, 747));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Buscar Propriedade"));

        SbuscaPropriedade.setToolTipText("Digite o nome da propriedade");
        SbuscaPropriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SbuscaPropriedadeActionPerformed(evt);
            }
        });

        buscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Samsung\\Documents\\NetBeansProjects\\ProjetoAgro\\src\\imagens\\Search_24x24.png")); // NOI18N
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        Tabela2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Tabela2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Propriedade", "CCIR", "Data"
            }
        ));
        Tabela2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabela2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tabela2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(SbuscaPropriedade, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 234, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SbuscaPropriedade, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        salvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        salvar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Samsung\\Documents\\NetBeansProjects\\ProjetoAgro\\src\\imagens\\Save_24x24.png")); // NOI18N
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        alterar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        alterar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Samsung\\Documents\\NetBeansProjects\\ProjetoAgro\\src\\imagens\\Refresh_24x24.png")); // NOI18N
        alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarActionPerformed(evt);
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

        menu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        menu.setIcon(new javax.swing.ImageIcon("C:\\Users\\Samsung\\Documents\\NetBeansProjects\\ProjetoAgro\\src\\imagens\\Menu_24x24.png")); // NOI18N
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(alterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(excluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(limpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(salvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Telefone");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Logradouro");

        Sestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acre ", "Alagoas ", "Amapá ", "Amazonas ", "Bahia ", "Ceará ", "Distrito Federal ", "Espírito Santo ", "Goiás", "Maranhão", "Mato Grosso ", "Mato Grosso do Sul ", "Minas Gerais ", "Pará ", "Paraíba ", "Paraná", "Pernambuco ", "Piauí ", "Rio de Janeiro ", "Rio Grande do Norte ", "Rio Grande do Sul", "Rondônia ", "Roraima ", "Santa Catarina ", "São Paulo ", "Sergipe ", "Tocantins " }));
        Sestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SestadoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Estado");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Municipio");

        Scep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ScepActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Cep");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Atividade");

        Sapelido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SapelidoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Denominação da Propriedade");

        Sarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SareaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Área(ha)");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("CCIR");

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Samsung\\Documents\\NetBeansProjects\\ProjetoAgro\\src\\imagens\\01.png")); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Sestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Sapelido, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel5Layout.createSequentialGroup()
                                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Satividade, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(31, 31, 31)
                                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Sarea)
                                                .addComponent(Smunicipio)
                                                .addGroup(jPanel5Layout.createSequentialGroup()
                                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(0, 0, Short.MAX_VALUE)))))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Slogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Sccir, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Scep, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Stelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Sapelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Sccir, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Satividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Sarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Slogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Smunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Scep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Sestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Stelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(181, 181, 181)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 20, 746, 657);

        setBounds(0, 0, 795, 736);
    }// </editor-fold>//GEN-END:initComponents

    private void SareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SareaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SareaActionPerformed

    private void SapelidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SapelidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SapelidoActionPerformed

    private void ScepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ScepActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ScepActionPerformed

    private void SestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SestadoActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
        receber4(tipo);

        if (tipo.equals("Administrador")) {
            MenuAdmGUI janelaPrincipal = new  MenuAdmGUI();
            janelaPrincipal.setVisible(true);
            dispose();
        }else if(tipo.equals("Usuário")){
            enviatexto1 = new  MenuUsuGUI();
            enviatexto1.setVisible(true);
            enviatexto1.receber(id);
            dispose();
        }
    }//GEN-LAST:event_menuActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sairActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        Sapelido.setText(null);
        Sccir.setText(null);
        Satividade.setText(null);
        Sarea.setText(null);
        Slogradouro.setText(null);
        Sestado.setSelectedItem(null);
        Smunicipio.setText(null);
        Scep.setText(null);
        Stelefone.setText(null);
    }//GEN-LAST:event_limparActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        ManterPropriedade manterpropriedade = new ManterPropriedade();
        ManterPropriedadeDAO dao = new  ManterPropriedadeDAO();

        if((Sapelido.getText().equals("                              "))|| (Sccir.getText().equals("   .   .   .   - "))||(Satividade.getText().equals("               ")) || (Sarea.getText().equals("               "))|| (Slogradouro.getText().equals("                              "))|| (Sestado.getSelectedItem().equals(""))|| (Smunicipio.getText().equals("               "))|| (Scep.getText().equals("     -   "))|| (Stelefone.getText().equals("(  )     -    "))){
            JOptionPane.showMessageDialog(null, "os campos não podem retornar vazios!");
        }else{

            manterpropriedade.setId((int) Tabela2.getValueAt(Tabela2.getSelectedRow(), 0));
            dao.excluir (manterpropriedade);
             dao.excluir1 (manterpropriedade);
            ((DefaultTableModel)Tabela2.getModel()).removeRow(Tabela2.getSelectedRow());
            JOptionPane.showMessageDialog(null, "Propriedade "+Sapelido.getText()+" excluido com sucesso!");
        }

        Sapelido.setText("");
        Sccir.setText("");
        Satividade.setText("");
        Sarea.setText("");
        Slogradouro.setText("");
        Sestado.setSelectedItem("");
        Smunicipio.setText("");
        Scep.setText("");
        Stelefone.setText("");
    }//GEN-LAST:event_excluirActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        ManterPropriedade manterpropriedade = new ManterPropriedade();

        manterpropriedade.setApelido(Sapelido.getText());
        manterpropriedade.setCcir(Sccir.getText());
        manterpropriedade.setAtividade(Satividade.getText());
        manterpropriedade.setArea(Sarea.getText());
        manterpropriedade.setLogradouro(Slogradouro.getText());
        manterpropriedade.setEstado(Sestado.getSelectedItem().toString());
        manterpropriedade.setMunicipio(Smunicipio.getText());
        manterpropriedade.setCep(Scep.getText());
        manterpropriedade.setTelefone(Stelefone.getText());

        if((Sapelido.getText().equals("                              "))||(Satividade.getText().equals("               ")) || (Sarea.getText().equals("               "))|| (Slogradouro.getText().equals("                              "))|| (Sestado.getSelectedItem().equals(""))|| (Smunicipio.getText().equals("               "))|| (Stelefone.getText().equals("(  )     -    "))){
            JOptionPane.showMessageDialog(null, "os campos não podem retornar vazios!");

        }else if(Sccir.getText().equals("   .   .   .   - ")){
            JOptionPane.showMessageDialog(null, "Digite os 13 números do CCIR !");

        }else if(Scep.getText().equals("     -   ")){
            JOptionPane.showMessageDialog(null, "Digite os 8 números do CEP !");

        }else{

            manterpropriedade.setId((int) Tabela2.getValueAt(Tabela2.getSelectedRow(), 0));
            ManterPropriedadeDAO dao = new  ManterPropriedadeDAO();
            dao.alterar (manterpropriedade);

            ManterPropriedadeDAO  atualizar = new   ManterPropriedadeDAO();
            lista2 =  atualizar.ListaPropriedade(SbuscaPropriedade.getText(), 1);
            ((DefaultTableModel) Tabela2.getModel()).setNumRows(0);
            Tabela2.updateUI();
            DefaultTableModel modelo = (DefaultTableModel) Tabela2.getModel();
            for( ManterPropriedade st : lista2){
                modelo.addRow(new Object[]{st.getId(), st.getApelido(), st.getCcir(), st.getData()});

            }
        }

        Sapelido.setText("");
        Sccir.setText("");
        Satividade.setText("");
        Sarea.setText("");
        Slogradouro.setText("");
        Sestado.setSelectedItem("");
        Smunicipio.setText("");
        Scep.setText("");
        Stelefone.setText("");
    }//GEN-LAST:event_alterarActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        ManterPropriedade manterpropriedade = new ManterPropriedade();

        manterpropriedade.setApelido(Sapelido.getText());
        manterpropriedade.setCcir(Sccir.getText());
        manterpropriedade.setAtividade(Satividade.getText());
        manterpropriedade.setArea(Sarea.getText());
        manterpropriedade.setLogradouro(Slogradouro.getText());
        manterpropriedade.setEstado(Sestado.getSelectedItem().toString());
        manterpropriedade.setMunicipio(Smunicipio.getText());
        manterpropriedade.setCep(Scep.getText());
        manterpropriedade.setTelefone(Stelefone.getText());

        if((Sapelido.getText().equals("                              "))||(Satividade.getText().equals("               ")) || (Sarea.getText().equals("               "))|| (Slogradouro.getText().equals("                              "))|| (Sestado.getSelectedItem().equals(""))|| (Smunicipio.getText().equals("               "))|| (Stelefone.getText().equals("(  )     -    "))){
            JOptionPane.showMessageDialog(null, "os campos não podem retornar vazios!");

        }else if(Sccir.getText().equals("   .   .   .   - ")){
            JOptionPane.showMessageDialog(null, "Digite os 13 números do CCIR !");

        }else if(Scep.getText().equals("     -   ")){
            JOptionPane.showMessageDialog(null, "Digite os 8 números do CEP !");

        }else{

            ManterPropriedadeDAO dao = new  ManterPropriedadeDAO();
            dao.salvar(manterpropriedade);

            ManterPropriedadeDAO  atualizar = new   ManterPropriedadeDAO();
            lista2 =  atualizar.ListaPropriedade(SbuscaPropriedade.getText(), 1);
            ((DefaultTableModel) Tabela2.getModel()).setNumRows(0);
            Tabela2.updateUI();
            DefaultTableModel modelo = (DefaultTableModel) Tabela2.getModel();
            for( ManterPropriedade st : lista2){
                modelo.addRow(new Object[]{st.getId(), st.getApelido(), st.getCcir(), st.getData()});

            }
        }

        Sapelido.setText("");
        Sccir.setText("");
        Satividade.setText("");
        Sarea.setText("");
        Slogradouro.setText("");
        Sestado.setSelectedItem("");
        Smunicipio.setText("");
        Scep.setText("");
        Stelefone.setText("");
    }//GEN-LAST:event_salvarActionPerformed

    private void Tabela2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabela2MouseClicked

        String cod = Tabela2.getValueAt(Tabela2.getSelectedRow(),0).toString();
        ManterPropriedadeDAO  manterpropriedade = new ManterPropriedadeDAO();
        lista2 = manterpropriedade  .ListaPropriedade(cod, 2);

        for (ManterPropriedade st : lista2){

            Sapelido.setText(st.getApelido());
            Sccir.setText(st.getCcir());
            Satividade.setText(st.getAtividade());
            Sarea.setText(st.getArea());
            Slogradouro.setText(st.getLogradouro());
            Sestado.setSelectedItem(st.getEstado());
            Smunicipio.setText(st.getMunicipio());
            Scep.setText(st.getCep());
            Stelefone.setText(st.getTelefone());

        }
    }//GEN-LAST:event_Tabela2MouseClicked

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        ManterPropriedadeDAO  manterpropriedade = new  ManterPropriedadeDAO ();

        lista2 = manterpropriedade.ListaPropriedade(SbuscaPropriedade.getText(), 1);
        ((DefaultTableModel) Tabela2.getModel()).setNumRows(0);
        Tabela2.updateUI();
        DefaultTableModel modelo = (DefaultTableModel) Tabela2.getModel();
        for( ManterPropriedade st : lista2){
            modelo.addRow(new Object[]{st.getId(), st.getApelido(), st.getCcir(), st.getData()});

        }
    }//GEN-LAST:event_buscarActionPerformed

    private void SbuscaPropriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SbuscaPropriedadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SbuscaPropriedadeActionPerformed
  
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManterPropriedadeGUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Sapelido;
    private javax.swing.JTextField Sarea;
    private javax.swing.JTextField Satividade;
    private javax.swing.JTextField SbuscaPropriedade;
    private javax.swing.JTextField Sccir;
    private javax.swing.JTextField Scep;
    private javax.swing.JComboBox<String> Sestado;
    private javax.swing.JTextField Slogradouro;
    private javax.swing.JTextField Smunicipio;
    private javax.swing.JTextField Stelefone;
    private javax.swing.JTable Tabela2;
    private javax.swing.JButton alterar;
    private javax.swing.JButton buscar;
    private javax.swing.JButton excluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton limpar;
    private javax.swing.JButton menu;
    private javax.swing.JButton sair;
    private javax.swing.JButton salvar;
    // End of variables declaration//GEN-END:variables
}
