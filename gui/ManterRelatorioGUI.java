
package gui;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import dao.ManterFinanceiroDAO;
import dao.ManterPagarReceberDAO;
import dao.ManterPropriedadeDAO;
import dao.ManterRelatorioDAO;
import dao.ManterUsuarioDAO;
import java.awt.Desktop;
import java.sql.Date;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import modelo.ManterPagarReceber;
import modelo.ManterPropriedade;
import modelo.ManterRelatorio;
import modelo.ManterUsuario;


import java.awt.BorderLayout;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.io.FileOutputStream;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;




public class ManterRelatorioGUI extends javax.swing.JFrame {

   ArrayList<ManterRelatorio> lista5 = new ArrayList();
   ArrayList<ManterRelatorio> lista6 = new ArrayList();
    
   MenuUsuGUI enviatexto1;
   
   
    public ManterRelatorioGUI() {
        setExtendedState(ManterRelatorioGUI.MAXIMIZED_BOTH);
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
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tabela6 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabela7 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Ydespesa = new javax.swing.JLabel();
        Ycredito = new javax.swing.JLabel();
        Yapelido = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela5 = new javax.swing.JTable();
        YbuscaPropriedade = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        menu = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        pdf = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Relatório", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Apresentação do Relatório"));

        Tabela6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Quantidade ", "Unidade", "Descrição", "Despesa", "Data"
            }
        ));
        jScrollPane3.setViewportView(Tabela6);

        Tabela7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Quantidade", "Unidade", "Descrição", "Crédito ", "Data"
            }
        ));
        jScrollPane2.setViewportView(Tabela7);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Despesas");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Créditos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Yapelido, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Ydespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addComponent(Ycredito, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(20, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(Yapelido, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ydespesa, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ycredito, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Buscar Propriedade"));

        Tabela5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Propriedade", "CCIR"
            }
        ));
        Tabela5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabela5MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabela5);

        YbuscaPropriedade.setToolTipText("Digite o nome da propriedade");

        buscar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Samsung\\Documents\\NetBeansProjects\\ProjetoAgro\\src\\imagens\\Search_24x24.png")); // NOI18N
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(YbuscaPropriedade, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(YbuscaPropriedade, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        menu.setIcon(new javax.swing.ImageIcon("C:\\Users\\Samsung\\Documents\\NetBeansProjects\\ProjetoAgro\\src\\imagens\\Menu_24x24.png")); // NOI18N
        menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActionPerformed(evt);
            }
        });

        sair.setIcon(new javax.swing.ImageIcon("C:\\Users\\Samsung\\Documents\\NetBeansProjects\\ProjetoAgro\\src\\imagens\\Exit_24x24.png")); // NOI18N
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        pdf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pdf.setText("PDF");
        pdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdfActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Samsung\\Documents\\NetBeansProjects\\ProjetoAgro\\src\\imagens\\01.png")); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(124, 124, 124)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pdf, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(menu, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pdf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1064, 740);
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
       ManterRelatorioDAO  manterrelatorio = new  ManterRelatorioDAO ();  
       
        lista5 = manterrelatorio.ListaRelatorio(YbuscaPropriedade.getText(), 1);
        ((DefaultTableModel) Tabela5.getModel()).setNumRows(0);
        DefaultTableModel modelo = (DefaultTableModel) Tabela5.getModel();
       for( ManterRelatorio st : lista5){
        modelo.addRow(new Object[]{st.getId(), st.getApelido(), st.getCcir()});
       }
    }//GEN-LAST:event_buscarActionPerformed

    private void Tabela5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabela5MouseClicked
        ManterRelatorioDAO  manterrelatorio1 = new  ManterRelatorioDAO ();
      
    
         
      String T =  Tabela5.getValueAt(Tabela5.getSelectedRow(),1).toString();  
      String cod = Tabela5.getValueAt(Tabela5.getSelectedRow(),1).toString(); 
       lista6 = manterrelatorio1.ListaRelatorio1(cod);
       ((DefaultTableModel) Tabela6.getModel()).setNumRows(0);
       ((DefaultTableModel) Tabela7.getModel()).setNumRows(0);
       Ydespesa.setText("");
       Ycredito.setText("");
       
          for( ManterRelatorio st : lista5){
          Yapelido.setText("Propriedade:  "+T);
        }
       
       double soma = 0;
       double soma1 = 0;
        
        for( ManterRelatorio st : lista6){
          
        String y = (st.getTipo());
        if (y.equals("Despesa")) {
            
            
       Tabela6.updateUI();
       DefaultTableModel modelo = (DefaultTableModel) Tabela6.getModel();
       modelo.addRow(new Object[]{st.getQuantidade(),st.getUnidade(), st.getDescricao(), st.getValor(),st.getData()});
      
       soma += st.getValor();
       Ydespesa.setText("Valor total das Despesas:R$ " +soma);
     
       }else if (y.equals("Crédito")){
                 
       Tabela7.updateUI();
       DefaultTableModel modelo = (DefaultTableModel) Tabela7.getModel();
       modelo.addRow(new Object[]{st.getQuantidade(),st.getUnidade(), st.getDescricao(), st.getValor(),st.getData()});
       
       soma1 += st.getValor();
       Ycredito.setText("Valor total dos Créditos:R$ " +soma1);
            }  
        } 
    }//GEN-LAST:event_Tabela5MouseClicked

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
      System.exit(0);
    }//GEN-LAST:event_sairActionPerformed

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

    private void pdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdfActionPerformed

        Document document = new Document (PageSize.A4);
        JOptionPane.showMessageDialog(null,"PDF gerado com sucesso!");
        
              
    try {
        
  PdfWriter writer = PdfWriter.getInstance (document, new FileOutputStream  ("Relatório.pdf" ));
  document.open ();
 
  
  Image figura = Image.getInstance("C:\\Users\\Samsung\\Documents\\NetBeansProjects\\ProjetoAgro\\01.png");
  document.add(figura);
  
  PdfPTable table = new PdfPTable(1);
  table.setWidthPercentage(90.0f);
  table.getDefaultCell().setBackgroundColor(BaseColor.LIGHT_GRAY);
  table.addCell("RELATÓRIO");
  document.add(table);
   
   Paragraph p1 = new Paragraph(" ");
   p1.setSpacingAfter(10);
   document.add( p1 );
  
   PdfContentByte cb = writer.getDirectContent ();
   cb.saveState ();
   PdfTemplate pdfTemplate = cb.createTemplate(Yapelido.getWidth(), Yapelido.getHeight());
   Graphics2D g = pdfTemplate.createGraphics(Yapelido.getWidth(), Yapelido.getHeight());
   Yapelido.print(g);
   cb.addTemplate(pdfTemplate, 70, 670);
   g.dispose ();
   cb.restoreState ();
   
   Paragraph p2 = new Paragraph(" ");
   p2.setSpacingAfter(10);
   document.add( p2 );
   
   PdfContentByte cb1 = writer.getDirectContent ();
   cb1.saveState ();
   PdfTemplate pdfTemplate1 = cb1.createTemplate(Ydespesa.getWidth(), Ydespesa.getHeight());
   Graphics2D g1 = pdfTemplate1.createGraphics(Ydespesa.getWidth(), Ydespesa.getHeight());
   Ydespesa.print(g1);
   cb1.addTemplate(pdfTemplate1, 70, 650);
   g1.dispose ();
   cb1.restoreState ();
   
   Paragraph p3 = new Paragraph(" ");
   p3.setSpacingAfter(10);
   document.add( p3 );
   
    PdfContentByte cb2 = writer.getDirectContent ();
    cb1.saveState ();
    PdfTemplate pdfTemplate2 = cb2.createTemplate(Ycredito.getWidth(), Ycredito.getHeight());
    Graphics2D g2 = pdfTemplate2.createGraphics(Ycredito.getWidth(), Ycredito.getHeight());
    Ycredito.print(g2);
    cb1.addTemplate(pdfTemplate2, 70, 630);
    g2.dispose ();
    cb1.restoreState ();
   
  Paragraph p4 = new Paragraph(" ");
  p4.setSpacingAfter(10);
  document.add( p4 );
       
   
   
 PdfPTable table1 = new PdfPTable(1);
  table1.setWidthPercentage(90.0f);
  table1.getDefaultCell().setBackgroundColor(BaseColor.LIGHT_GRAY);
  table1.addCell("Histórico Despesas");
  document.add(table1);
   
  Paragraph p5 = new Paragraph(" ");
  p5.setSpacingAfter(10);
  document.add( p5 );
            
            PdfPTable pdfTable = new PdfPTable(Tabela6.getColumnCount());
           
            for (int i = 0; i < Tabela6.getColumnCount(); i++) {
                pdfTable.addCell(Tabela6.getColumnName(i));
            }
           
            for (int rows = 0; rows < Tabela6.getRowCount(); rows++) {
                for (int cols = 0; cols < Tabela6.getColumnCount(); cols++) {
                    pdfTable.addCell(Tabela6.getModel().getValueAt(rows, cols).toString());

                }
            }
            document.add(pdfTable);
           
          
  Paragraph p6 = new Paragraph(" ");
  p6.setSpacingAfter(10);
  document.add( p6 );    
  
  PdfPTable table2 = new PdfPTable(1);
  table2.setWidthPercentage(90.0f);
  table2.getDefaultCell().setBackgroundColor(BaseColor.LIGHT_GRAY);
  table2.addCell("Histórico Créditos");
  document.add(table2);
            
  
  Paragraph p7 = new Paragraph(" ");
  p7.setSpacingAfter(10);
  document.add( p7 ); 
  
   PdfPTable pdfTable1 = new PdfPTable(Tabela7.getColumnCount());
           
            for (int i = 0; i < Tabela7.getColumnCount(); i++) {
                pdfTable1.addCell(Tabela7.getColumnName(i));
            }
           
            for (int rows = 0; rows < Tabela7.getRowCount(); rows++) {
                for (int cols = 0; cols < Tabela7.getColumnCount(); cols++) {
                    pdfTable1.addCell(Tabela7.getModel().getValueAt(rows, cols).toString());

                }
            }
            document.add(pdfTable1);
            document.close();
    
      } catch (Exception e) {
      System.err.println (e.getMessage ());
    }
    document.close ();  

    }//GEN-LAST:event_pdfActionPerformed
       
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManterRelatorioGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela5;
    private javax.swing.JTable Tabela6;
    private javax.swing.JTable Tabela7;
    private javax.swing.JLabel Yapelido;
    private javax.swing.JTextField YbuscaPropriedade;
    private javax.swing.JLabel Ycredito;
    private javax.swing.JLabel Ydespesa;
    private javax.swing.JButton buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton menu;
    private javax.swing.JButton pdf;
    private javax.swing.JButton sair;
    // End of variables declaration//GEN-END:variables
}
