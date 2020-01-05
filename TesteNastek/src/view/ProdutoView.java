package view;

import table.ProutoTableModel;
import dao.ProdutoDAO;
import javax.swing.JOptionPane;
import model.Produto;

public class ProdutoView extends javax.swing.JFrame {

    Produto pro = new Produto();
    ProdutoDAO prd = new ProdutoDAO();

    public ProdutoView() {
        initComponents();
        setLocationRelativeTo(null);
        tbProduto.setModel(new ProutoTableModel(new ProdutoDAO().listarTodos()));
        btExcluir.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        tfDescricao = new javax.swing.JTextField();
        tfPreco = new javax.swing.JTextField();
        btSalvar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProduto = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        tfPesquisaDescricao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Produtos");
        setResizable(false);

        jLabel1.setText("Código:");

        jLabel2.setText("Descrição:");

        jLabel3.setText("Preço:");

        tfCodigo.setEditable(false);

        tfDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDescricaoActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btExcluir.setText("Excluir");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btLimpar.setText("Limpar");
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });

        tbProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProdutoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbProduto);

        jLabel4.setText("Pesquisar");

        tfPesquisaDescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfPesquisaDescricaoActionPerformed(evt);
            }
        });
        tfPesquisaDescricao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfPesquisaDescricaoKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfPreco, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE)
                            .addComponent(tfDescricao)
                            .addComponent(tfCodigo)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btSalvar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tfPesquisaDescricao))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(tfPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSalvar)
                    .addComponent(btExcluir)
                    .addComponent(btLimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfPesquisaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDescricaoActionPerformed

    private void tfPesquisaDescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfPesquisaDescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfPesquisaDescricaoActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        // Botão salvar
        if (tfDescricao.getText().equals("") || tfPreco.getText().equals("")) {
            // mesagem para quando tantar salvar sem produto
            JOptionPane.showMessageDialog(null, "Há campos em branco", "Falha ao salvar!", JOptionPane.WARNING_MESSAGE);
        } else {
            //salvar
            if (tfCodigo.getText().equals("")) {
                // insere novo
                pro.setDescricao_produto(tfDescricao.getText());
                pro.setPreco_produto(Double.parseDouble(tfPreco.getText()));
                prd.inserir(pro);
            } else {
                // altera
                pro.setDescricao_produto(tfDescricao.getText());
                pro.setPreco_produto(Double.parseDouble(tfPreco.getText()));
                pro.setCodigo_produto(Integer.parseInt(tfCodigo.getText()));
                prd.alterar(pro);
            }
        }
        tbProduto.setModel(new ProutoTableModel(new ProdutoDAO().listarTodos()));
        tfCodigo.setText("");
        tfDescricao.setText("");
        tfPreco.setText("");
        tfPesquisaDescricao.setText("");
    }//GEN-LAST:event_btSalvarActionPerformed

    private void tbProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProdutoMouseClicked
        tfCodigo.setText(tbProduto.getValueAt(tbProduto.getSelectedRow(), ProutoTableModel.COL_CODIGO_PRODUTO).toString());
        tfDescricao.setText(tbProduto.getValueAt(tbProduto.getSelectedRow(), ProutoTableModel.COL_DESCRICAO_PRODUTO).toString());
        tfPreco.setText(tbProduto.getValueAt(tbProduto.getSelectedRow(), ProutoTableModel.COL_PRECO_PRODUTO).toString());
        btExcluir.setEnabled(true);
    }//GEN-LAST:event_tbProdutoMouseClicked

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        tbProduto.setModel(new ProutoTableModel(new ProdutoDAO().listarTodos()));
        tfCodigo.setText("");
        tfDescricao.setText("");
        tfPreco.setText("");
        tfPesquisaDescricao.setText("");
    }//GEN-LAST:event_btLimparActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int escolha = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir ?", "Produto - Excluir", JOptionPane.YES_NO_OPTION);

        if (escolha == 0) {
            int codigo = Integer.parseInt(tfCodigo.getText());
            prd.excluir(codigo);
            tbProduto.setModel(new ProutoTableModel(new ProdutoDAO().listarTodos()));
            tfCodigo.setText("");
            tfDescricao.setText("");
            tfPreco.setText("");
            tfPesquisaDescricao.setText("");
        }
        btExcluir.setEnabled(false);
    }//GEN-LAST:event_btExcluirActionPerformed

    private void tfPesquisaDescricaoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfPesquisaDescricaoKeyPressed
        String pesquisar = tfPesquisaDescricao.getText();
        tbProduto.setModel(new ProutoTableModel(new ProdutoDAO().listarTodosDescricao(pesquisar)));
    }//GEN-LAST:event_tfPesquisaDescricaoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbProduto;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfDescricao;
    private javax.swing.JTextField tfPesquisaDescricao;
    private javax.swing.JTextField tfPreco;
    // End of variables declaration//GEN-END:variables
}
