
package gui;

import dao.ManterFinanceiroDAO;
import dao.ManterPagarReceberDAO;
import dao.ManterPropriedadeDAO;
import dao.ManterUsuarioDAO;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ManterPagarReceber;
import modelo.ManterPropriedade;
import modelo.ManterUsuario;


/**
 *
 * @author Emilio
 */
public class ManterPagarReceberGUI extends javax.swing.JFrame {
ArrayList<ManterPagarReceber> lista4 = new ArrayList();


    public ManterPagarReceberGUI() {
        setExtendedState(ManterPagarReceberGUI.MAXIMIZED_BOTH);
        initComponents();
  }
   ManterFinanceiroGUI enviatexto1;  
   MenuUsuGUI enviatexto2;
   
   private int id;
   public void receber(int id){
   this.id = id;
   }
  public void receber1(String Y){
  Dcod_propriedade.setText(Y);
  Dcod_propriedade.setEditable(false);
  Dcod_propriedade.setEnabled(false);
  }
   public void receber2(String x){
  Dapelido.setText(x);
  Dapelido.setEditable(false);
  Dapelido.setEnabled(false);
  }
    public void receber3(String w){
  Dccir.setText(w);
  Dccir.setEditable(false);
  Dccir.setEnabled(false);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela4 = new javax.swing.JTable();
        Dcod_propriedade = new javax.swing.JTextField();
        Dapelido = new javax.swing.JTextField();
        Dccir = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Ddescricao = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter descricao= new javax.swing.text.MaskFormatter("***************");
            descricao.setValidCharacters(" aáàâãbcçdeéèêfghiíìjklmnoóòôõpqrstuúùvwxyzAÁÀÂÃBCÇDEÉÈFGHIÍÌJKLMNOÓÒÔÕPQRSTUÚÙVWXYZ.,:-");
            Ddescricao = new javax.swing.JFormattedTextField(descricao);
        }
        catch (Exception e){
        }
        jLabel2 = new javax.swing.JLabel();
        Dvalor = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter valor= new javax.swing.text.MaskFormatter("***************");
            valor.setValidCharacters(" 0123456789,.");
            Dvalor = new javax.swing.JFormattedTextField(valor);
        }
        catch (Exception e){
        }
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Dtipo = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Dquantidade = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter quantidade= new javax.swing.text.MaskFormatter("***************");
            quantidade.setValidCharacters(" 0123456789,.");
            Dquantidade = new javax.swing.JFormattedTextField(quantidade);
        }
        catch (Exception e){
        }
        jLabel5 = new javax.swing.JLabel();
        Dunidade = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        salvar = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        financeiro = new javax.swing.JButton();
        menu = new javax.swing.JButton();
        alterar = new javax.swing.JButton();
        limpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Pagar e Receber", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Crédos / Despesas"));

        Tabela4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Quantidade", "Unidade", "Decrição", "Valor", "Tipo", "Data"
            }
        ));
        Tabela4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabela4MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela4);

        Dcod_propriedade.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                Dcod_propriedadeAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        Dcod_propriedade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Dcod_propriedadeActionPerformed(evt);
            }
        });

        Dapelido.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                DapelidoAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        Dapelido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DapelidoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("ID");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Denominação da Propriedade");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("CCIR");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Dcod_propriedade, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Dapelido, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Dccir, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dcod_propriedade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dapelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dccir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Descrição");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Valor (R$)");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Tipo");

        Dtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Crédito", "Despesa" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Quantidade");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Unidade");

        Dunidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UN", "KG (s)", "LT(s)", "ARROBA (s)", "CM (S)", "M (s)" }));

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Samsung\\Documents\\NetBeansProjects\\ProjetoAgro\\src\\imagens\\01.png")); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Dquantidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Dunidade, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Dtipo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Ddescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Dvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Dquantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dunidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ddescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Dvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        salvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        salvar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Samsung\\Documents\\NetBeansProjects\\ProjetoAgro\\src\\imagens\\Save_24x24.png")); // NOI18N
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        excluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        excluir.setIcon(new javax.swing.ImageIcon("C:\\Users\\Samsung\\Documents\\NetBeansProjects\\ProjetoAgro\\src\\imagens\\Delete_24x24.png")); // NOI18N
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        sair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sair.setIcon(new javax.swing.ImageIcon("C:\\Users\\Samsung\\Documents\\NetBeansProjects\\ProjetoAgro\\src\\imagens\\Exit_24x24.png")); // NOI18N
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        financeiro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        financeiro.setIcon(new javax.swing.ImageIcon("C:\\Users\\Samsung\\Documents\\NetBeansProjects\\ProjetoAgro\\src\\imagens\\Coins_24x24.png")); // NOI18N
        financeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                financeiroActionPerformed(evt);
            }
        });

        menu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
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

        limpar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Samsung\\Documents\\NetBeansProjects\\ProjetoAgro\\src\\imagens\\iconfinder_Clear_131912.png")); // NOI18N
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(financeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(limpar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(financeiro, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(alterar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        setBounds(0, 0, 905, 678);
    }// </editor-fold>//GEN-END:initComponents

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
         ManterPagarReceber manterpagarreceber = new ManterPagarReceber();
         
         manterpagarreceber.setQuantidade(Dquantidade.getText());
         manterpagarreceber.setUnidade(Dunidade.getSelectedItem().toString());
         manterpagarreceber.setDescricao(Ddescricao.getText());
         manterpagarreceber.setValor(Dvalor.getText());
         manterpagarreceber.setTipo(Dtipo.getSelectedItem().toString());
         manterpagarreceber.setCod_propriedade(Integer.parseInt (Dcod_propriedade.getText()));
         manterpagarreceber.setApelido(Dapelido.getText());
         
    if((Dquantidade.getText().equals("               ")) || (Dunidade.getSelectedItem().equals("")) || (Ddescricao.getText().equals("               ")) ||  (Dvalor.getText().equals("               ")) || (Dtipo.getSelectedItem().equals(""))){ 
    JOptionPane.showMessageDialog(null, "os campos não podem retornar vazios!");
    
        }else{
            ManterPagarReceberDAO dao = new  ManterPagarReceberDAO();
            dao.adiciona( manterpagarreceber );
            
             ManterPagarReceberDAO  atualizar = new  ManterPagarReceberDAO();
             lista4 =   atualizar.ListaPagarReceber(Integer.parseInt (Dcod_propriedade.getText()));
            ((DefaultTableModel) Tabela4.getModel()).setNumRows(0);
             Tabela4.updateUI();
             DefaultTableModel modelo = (DefaultTableModel) Tabela4.getModel();
             for( ManterPagarReceber st : lista4){
            modelo.addRow(new Object[]{st.getId(), st.getQuantidade(),st.getUnidade(), st.getDescricao(), st.getValor(), st.getTipo(),st.getData()});
            
           }
           JOptionPane.showMessageDialog(null, Ddescricao.getText()+" inserido com sucesso!");  
        }
       Dquantidade.setText("");
       Dunidade.setSelectedItem("");
       Ddescricao.setText("");
       Dvalor.setText("");
       Dtipo.setSelectedItem("");
      
       
    }//GEN-LAST:event_salvarActionPerformed

    private void Dcod_propriedadeAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_Dcod_propriedadeAncestorAdded
         ManterPagarReceberDAO  manterpagarreceber = new  ManterPagarReceberDAO();
         
       lista4 =  manterpagarreceber.ListaPagarReceber(Integer.parseInt (Dcod_propriedade.getText()));
        ((DefaultTableModel) Tabela4.getModel()).setNumRows(0);
       Tabela4.updateUI();
        DefaultTableModel modelo = (DefaultTableModel) Tabela4.getModel();
       for( ManterPagarReceber st : lista4){
            modelo.addRow(new Object[]{st.getId(),st.getQuantidade(),st.getUnidade(), st.getDescricao(), st.getValor(), st.getTipo(), st.getData()});
            
       }
    }//GEN-LAST:event_Dcod_propriedadeAncestorAdded

    private void Dcod_propriedadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Dcod_propriedadeActionPerformed
         
                      
    }//GEN-LAST:event_Dcod_propriedadeActionPerformed

    private void alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarActionPerformed
        ManterPagarReceber manterpagarreceber = new ManterPagarReceber();
        
         manterpagarreceber.setQuantidade(Dquantidade.getText());
         manterpagarreceber.setUnidade(Dunidade.getSelectedItem().toString());
         manterpagarreceber.setDescricao(Ddescricao.getText());
         manterpagarreceber.setValor(Dvalor.getText());
         manterpagarreceber.setTipo(Dtipo.getSelectedItem().toString());
        
         
        
    if((Dquantidade.getText().equals("               ")) || (Dunidade.getSelectedItem().equals("")) || (Ddescricao.getText().equals("               ")) ||  (Dvalor.getText().equals("               ")) || (Dtipo.getSelectedItem().equals(""))){ 

        JOptionPane.showMessageDialog(null, "os campos não podem retornar vazios!");
        }else{
        
            manterpagarreceber.setId((int) Tabela4.getValueAt(Tabela4.getSelectedRow(), 0));
            
            ManterPagarReceberDAO dao = new  ManterPagarReceberDAO();
            dao.altera( manterpagarreceber );
            
             ManterPagarReceberDAO  atualizar = new  ManterPagarReceberDAO();
             lista4 =   atualizar.ListaPagarReceber(Integer.parseInt (Dcod_propriedade.getText()));
            ((DefaultTableModel) Tabela4.getModel()).setNumRows(0);
             Tabela4.updateUI();
             DefaultTableModel modelo = (DefaultTableModel) Tabela4.getModel();
             for( ManterPagarReceber st : lista4){
            modelo.addRow(new Object[]{st.getId(), st.getQuantidade(), st.getUnidade(),st.getDescricao(), st.getValor(), st.getTipo(), st.getData()});
            
           }
           JOptionPane.showMessageDialog(null, Ddescricao.getText()+" atualizado com sucesso!");  
        }
    
       Dquantidade.setText("");
       Dunidade.setSelectedItem("");
       Ddescricao.setText("");
       Dvalor.setText("");
       Dtipo.setSelectedItem("");
    }//GEN-LAST:event_alterarActionPerformed

    private void Tabela4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabela4MouseClicked
       int linha =  Tabela4.getSelectedRow();
       Dquantidade.setText(Tabela4.getValueAt(linha, 1).toString());
       Dunidade.setSelectedItem(Tabela4.getValueAt(linha, 2).toString());
       Ddescricao.setText(Tabela4.getValueAt(linha, 3).toString());
       Dvalor.setText(Tabela4.getValueAt(linha, 4).toString());  
       Dtipo.setSelectedItem(Tabela4.getValueAt(linha, 5).toString()); ;       
    }//GEN-LAST:event_Tabela4MouseClicked

    private void DapelidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DapelidoActionPerformed
       
    }//GEN-LAST:event_DapelidoActionPerformed

    private void DapelidoAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_DapelidoAncestorAdded
         
    }//GEN-LAST:event_DapelidoAncestorAdded

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed
        ManterPagarReceber manterpagarreceber = new ManterPagarReceber();
        ManterPagarReceberDAO dao = new  ManterPagarReceberDAO();
        
         manterpagarreceber.setQuantidade(Dquantidade.getText());
         manterpagarreceber.setUnidade(Dunidade.getSelectedItem().toString());
         manterpagarreceber.setDescricao(Ddescricao.getText());
         manterpagarreceber.setValor(Dvalor.getText());
         manterpagarreceber.setTipo(Dtipo.getSelectedItem().toString());
        
         
   if((Dquantidade.getText().equals("               ")) || (Dunidade.getSelectedItem().equals("")) || (Ddescricao.getText().equals("               ")) ||  (Dvalor.getText().equals("               ")) || (Dtipo.getSelectedItem().equals(""))){ 

        JOptionPane.showMessageDialog(null, "os campos não podem retornar vazios!");
        }else{
        
            manterpagarreceber.setId((int) Tabela4.getValueAt(Tabela4.getSelectedRow(), 0));
            
            dao.delete( manterpagarreceber );
            
            ((DefaultTableModel)Tabela4.getModel()).removeRow(Tabela4.getSelectedRow());
           JOptionPane.showMessageDialog(null, Ddescricao.getText()+" excluido com sucesso!");  
        }
    
       Dquantidade.setText("");
       Dunidade.setSelectedItem("");
       Ddescricao.setText("");
       Dvalor.setText("");
       Dtipo.setSelectedItem("");
    }//GEN-LAST:event_excluirActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
      System.exit(0);
        
    }//GEN-LAST:event_sairActionPerformed

    private void financeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_financeiroActionPerformed
       receber4(tipo);
               
               if (tipo.equals("Administrador")) {
                  enviatexto1 = new  ManterFinanceiroGUI();
                  enviatexto1.setVisible(true); 
                  enviatexto1.receber4("Administrador");
                  dispose();                     
               }else if(tipo.equals("Usuário")){
                   enviatexto1 = new  ManterFinanceiroGUI();
                   enviatexto1.setVisible(true); 
                   enviatexto1.receber4("Usuário");
                   enviatexto1.receber(id);
                   dispose();
                  
                  
         }
    }//GEN-LAST:event_financeiroActionPerformed

    private void menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActionPerformed
       receber4(tipo);
               
               if (tipo.equals("Administrador")) {
                   MenuAdmGUI janelaPrincipal = new  MenuAdmGUI();
                   janelaPrincipal.setVisible(true);
                   dispose();   
               }else if(tipo.equals("Usuário")){
                   enviatexto2 = new  MenuUsuGUI();
                   enviatexto2.setVisible(true);
                   enviatexto2.receber(id);
                dispose();
                  
                  
         }
    }//GEN-LAST:event_menuActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
       Dquantidade.setText(null);
       Dunidade.setSelectedItem(null);
       Ddescricao.setText(null);
       Dvalor.setText(null);
    }//GEN-LAST:event_limparActionPerformed
    
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
            java.util.logging.Logger.getLogger(ManterPagarReceberGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManterPagarReceberGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManterPagarReceberGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManterPagarReceberGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManterPagarReceberGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Dapelido;
    private javax.swing.JTextField Dccir;
    private javax.swing.JTextField Dcod_propriedade;
    private javax.swing.JTextField Ddescricao;
    private javax.swing.JTextField Dquantidade;
    private javax.swing.JComboBox<String> Dtipo;
    private javax.swing.JComboBox<String> Dunidade;
    private javax.swing.JTextField Dvalor;
    private javax.swing.JTable Tabela4;
    private javax.swing.JButton alterar;
    private javax.swing.JButton excluir;
    private javax.swing.JButton financeiro;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpar;
    private javax.swing.JButton menu;
    private javax.swing.JButton sair;
    private javax.swing.JButton salvar;
    // End of variables declaration//GEN-END:variables

    
}
