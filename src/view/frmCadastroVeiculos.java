package view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import conexao.Conexao;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

/**
 *
 * @author GUSTAVOKNEVITZKLEINW
 */
public class frmCadastroVeiculos extends javax.swing.JFrame {
    
    private void limparCampos(){
        txtCliente.setText("");
        txtPlaca.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        txtNomeCliente.setText("");
        txtObservacao.setText("");
        spnAno.setValue(2030);
        txtCliente.requestFocus();
    }
    
    public frmCadastroVeiculos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        txtPlaca = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        spnAno = new javax.swing.JSpinner();
        cmbCor = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservacao = new javax.swing.JTextArea();
        btnCadastrar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        chkAtivo = new javax.swing.JCheckBox();
        txtNomeCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CADASTRO DE VEÍCULOS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(251, 251, 251))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Cliente:");

        btnBuscarCliente.setText("Buscar Cliente");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        txtPlaca.setBorder(javax.swing.BorderFactory.createTitledBorder("Placa"));

        txtMarca.setBorder(javax.swing.BorderFactory.createTitledBorder("Marca"));

        txtModelo.setBorder(javax.swing.BorderFactory.createTitledBorder("Modelo"));

        spnAno.setModel(new javax.swing.SpinnerNumberModel(2030, 2000, 2030, 1));
        spnAno.setBorder(javax.swing.BorderFactory.createTitledBorder("Ano"));

        cmbCor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Preto", "Prata", "Branco", "Amarelo", "Azul", "Vermelho" }));
        cmbCor.setBorder(javax.swing.BorderFactory.createTitledBorder("Cor"));

        txtObservacao.setColumns(20);
        txtObservacao.setRows(5);
        txtObservacao.setBorder(javax.swing.BorderFactory.createTitledBorder("Observacao"));
        jScrollPane1.setViewportView(txtObservacao);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        chkAtivo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        chkAtivo.setText("Ativo");

        txtNomeCliente.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbCor, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnAno, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtModelo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(113, 113, 113)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCliente))
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBuscarCliente)
                                .addGap(28, 28, 28)
                                .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(chkAtivo))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtNomeCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkAtivo)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spnAno, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCor, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCadastrar)
                            .addComponent(btnLimpar))
                        .addContainerGap(57, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        String sqlInsert = """
                           INSERT INTO veiculo
                           (cliente_id, placa, marca, modelo, ano, cor, observacao, ativo)
                           VALUES (?, ?, ?, ?, ?, ?, ?, ?)
                           """;
        
        try{
            Connection conex = Conexao.conectar();
            PreparedStatement stmt = conex.prepareStatement(sqlInsert);
            
            int cliente_id = Integer.parseInt(txtCliente.getText());
            String placa = txtPlaca.getText();
            String marca = txtMarca.getText();
            String modelo = txtModelo.getText();
            int ano = Integer.parseInt(spnAno.getValue().toString());
            String cor = cmbCor.getSelectedItem().toString();
            String observacao = txtObservacao.getText();
            boolean ativo = chkAtivo.isSelected();
            
            if(placa == "" || marca == "" || modelo == ""){
                JOptionPane.showMessageDialog(this, "Preencha corretamente os campos");
                return;
            }
            
            stmt.setInt(1, cliente_id);
            stmt.setString(2, placa);
            stmt.setString(3, marca);
            stmt.setString(4, modelo);
            stmt.setInt(5, ano);
            stmt.setString(6, cor);
            stmt.setString(7, observacao);
            stmt.setBoolean(8, ativo);
            
            int linhas = stmt.executeUpdate();
            if (linhas > 0){
                JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!");
                limparCampos();
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(this, "Não foi possivel cadastrar! - Erro no banco de dados" + erro);
        }
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
       limparCampos();
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        String sqlSelect = "SELECT nome FROM cliente WHERE id = ?";
        
        try{
            Connection conex = Conexao.conectar();
            PreparedStatement stmt = conex.prepareStatement(sqlSelect);
            
            int cliente_id = Integer.parseInt(txtCliente.getText());
            
            stmt.setInt(1, cliente_id);
            
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
            // Exemplo: preenchendo um campo txtNome (ajuste conforme seu formulário)
            txtNomeCliente.setText(rs.getString("nome"));
        } else {
            JOptionPane.showMessageDialog(this, "Cliente não encontrado!");
        }
           
        } catch(SQLException erro){
           JOptionPane.showMessageDialog(this,"Não foi possível Localizar! - Erro: " + erro); 
        }
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(frmCadastroVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCadastroVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCadastroVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCadastroVeiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCadastroVeiculos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JCheckBox chkAtivo;
    private javax.swing.JComboBox<String> cmbCor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spnAno;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JTextArea txtObservacao;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
