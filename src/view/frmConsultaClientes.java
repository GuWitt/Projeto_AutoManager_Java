package view;

import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author GUSTAVOKNEVITZKLEINW
 */
public class frmConsultaClientes extends javax.swing.JFrame {

    private void atualizarTabela(){
        DefaultTableModel modelo = (DefaultTableModel) tblClientes.getModel();
        
        modelo.setRowCount(0);
        
        String sql = "SELECT * FROM cliente "
                     + "ORDER BY id";
        
        try (Connection conex = Conexao.conectar();
             PreparedStatement stmt = conex.prepareStatement(sql);
             ResultSet resultado = stmt.executeQuery() ){
            
            while (resultado.next()){
                modelo.addRow(new Object[] {
                    resultado.getInt("id"),
                    resultado.getString("nome"),
                    resultado.getString("cpf"),
                    resultado.getString("telefone"),
                    resultado.getString("email"),
                    resultado.getString("endereco"),
                    resultado.getBoolean("ativo") ? "Sim" : "Não"
                });
            }
        } catch (SQLException erro){
            JOptionPane.showMessageDialog(
                        this,
                        "Erro ao atualizar tabela:\n" + erro.getMessage(),
                        "Erro no banco de dados",
                        JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public frmConsultaClientes() {
        initComponents();
        atualizarTabela();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        cmbPesquisarPor = new javax.swing.JComboBox<>();
        btnLocalizar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        chkAtivo = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CPF", "Numero", "Email", "Endereco", "Ativo"
            }
        ));
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblClientes);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CONSULTA DE CLIENTES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        txtPesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisa:"));

        cmbPesquisarPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nome", "CPF" }));
        cmbPesquisarPor.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar Por:"));

        btnLocalizar.setBackground(new java.awt.Color(0, 204, 204));
        btnLocalizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLocalizar.setForeground(new java.awt.Color(0, 0, 0));
        btnLocalizar.setText("Localizar");
        btnLocalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocalizarActionPerformed(evt);
            }
        });

        btnAtualizar.setBackground(new java.awt.Color(204, 204, 0));
        btnAtualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtualizar.setForeground(new java.awt.Color(0, 0, 0));
        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        btnAlterar.setBackground(new java.awt.Color(0, 204, 204));
        btnAlterar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAlterar.setForeground(new java.awt.Color(0, 0, 0));
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setBackground(new java.awt.Color(255, 51, 0));
        btnExcluir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(0, 0, 0));
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        txtID.setEditable(false);
        txtID.setBorder(javax.swing.BorderFactory.createTitledBorder("ID:"));

        txtNome.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome:"));

        txtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder("Email:"));

        txtEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço:"));

        chkAtivo.setText("Ativo");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\GUSTAVOKNEVITZKLEINW\\Downloads\\Ícone_Minimalista_de_Carro_e_Chave_Inglesa-removebg-preview (2).png")); // NOI18N

        txtCPF.setBorder(javax.swing.BorderFactory.createTitledBorder("CPF"));

        txtTelefone.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefone"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                    .addComponent(txtNome)
                                    .addComponent(txtTelefone))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(85, 85, 85)
                                        .addComponent(chkAtivo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                            .addComponent(txtCPF))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbPesquisarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnLocalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLocalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbPesquisarPor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCPF)
                    .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(txtNome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                    .addComponent(txtTelefone))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(chkAtivo))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        atualizarTabela();
        txtPesquisa.setText("");
        txtPesquisa.requestFocus();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnLocalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocalizarActionPerformed
        String pesquisa = txtPesquisa.getText().trim();
        
        if(pesquisa.isEmpty()){
            JOptionPane.showMessageDialog(this, "Digite a pasquisa ou parte dela", "Pesquisa vazia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        DefaultTableModel modelo = (DefaultTableModel) tblClientes.getModel();
        
        modelo.setRowCount(0);
        
        String tipo_pesquisa = cmbPesquisarPor.getSelectedItem().toString();
        
        String sql = "";
        
        if(tipo_pesquisa == "Nome"){
            sql = "SELECT * FROM cliente WHERE nome ILIKE ? ORDER BY nome";
        }
        if(tipo_pesquisa == "CPF"){
            sql = "SELECT * FROM cliente WHERE cpf ILIKE ? ORDER BY cpf";
        }
        if(tipo_pesquisa == "ID"){
            sql = "SELECT * FROM cliente WHERE id = ? ORDER BY id";
        }
        
        try (Connection conex = Conexao.conectar();
             PreparedStatement stmt = conex.prepareStatement(sql)){
            
            
            if(tipo_pesquisa.equals("ID")){
                stmt.setInt(1, Integer.parseInt(pesquisa));
            }else{
                stmt.setString(1, "%" + pesquisa + "%");
            }
            
            try (ResultSet resultado = stmt.executeQuery()){
                while (resultado.next()){
                    modelo.addRow(new Object [] {
                        resultado.getInt("id"),
                        resultado.getString("nome"),
                        resultado.getString("cpf"),
                        resultado.getString("telefone"),
                        resultado.getString("email"),
                        resultado.getString("endereco"),
                        resultado.getBoolean("ativo")
                    });
                }
            }
            
            if(modelo.getRowCount() == 0){
                JOptionPane.showMessageDialog(this, "Nenhum cliente encontrado para: " + pesquisa, "Resultado da Pesquisa", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException erro){
            JOptionPane.showMessageDialog(this,
                "Erro ao localizar cliente:\n" + erro.getMessage(),
                "Erro no banco de dados",
                JOptionPane.ERROR_MESSAGE);
        } 
    }//GEN-LAST:event_btnLocalizarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linha = tblClientes.getSelectedRow();
        
        if(linha == -1){
           JOptionPane.showMessageDialog(this,"Selecione um cliente para excluir!");
           return; 
        }
        
        int id = Integer.parseInt(tblClientes.getValueAt(linha, 0).toString());
        
        int resposta = JOptionPane.showConfirmDialog(this, 
            "Deseja realmente excluir o cliente do ID "+ id + " ?",
            "Confirmar Exclusão",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE);
        
        if (resposta != JOptionPane.YES_OPTION) {
            return;
        }
        
        String sql = "DELETE FROM cliente WHERE id = ?";
        
        try (Connection conex = Conexao.conectar();
                PreparedStatement stmt = conex.prepareStatement(sql)){
            
            stmt.setInt(1, id);
            
            int registros = stmt.executeUpdate();
            if (registros > 0){
                JOptionPane.showMessageDialog(this, "Cliente excluido com sucesso!");
                atualizarTabela();
            } else {
                JOptionPane.showMessageDialog(this, "Cliente não encontrado!");
            }
        } catch (SQLException erro){
            JOptionPane.showMessageDialog(this, "Erro ao excluir cliente: " + erro.getMessage());
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
        int linha = tblClientes.getSelectedRow();
        
        if(linha == -1){
            return;
        }
        
        txtID.setText(tblClientes.getValueAt(linha,0).toString());
        txtNome.setText(tblClientes.getValueAt(linha,1).toString());
        txtCPF.setText(tblClientes.getValueAt(linha,2).toString());
        txtTelefone.setText(tblClientes.getValueAt(linha,3).toString());
        txtEmail.setText(tblClientes.getValueAt(linha,4).toString());
        txtEndereco.setText(tblClientes.getValueAt(linha,5).toString());
    }//GEN-LAST:event_tblClientesMouseClicked

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int linha = tblClientes.getSelectedRow();
         
         if (linha == -1){
             JOptionPane.showMessageDialog(this,"Selecione um cliente na tabela para alterar");
             return;
         }
         
         //2. Pegar o ID da limha selecionada
         // O ID não será alterado.
         int id = Integer.parseInt(tblClientes.getValueAt(linha,0).toString());
         
         //3. Ler os novos valores digitados nos campos especie,nome, idade
         String nome = txtNome.getText().trim();
         String CPF = txtCPF.getText().trim();
         String telefone = txtTelefone.getText().trim();
         String email = txtEmail.getText().trim();
         String endereco = txtEndereco.getText().trim();
         
         //4. Validar se todos os campos estão preenchidos
         if (nome.isEmpty() || CPF.isEmpty() || telefone.isEmpty()) {
             JOptionPane.showMessageDialog(this, "Preecha os campos OBRIGATÓRIOS: Nome, CPF, Telefone");
             return;
         }
         
        
         // 6. Pedir Confirmação antes de gravar no banco de dados
         int resposta = JOptionPane.showConfirmDialog(this, 
                         "Deseja alterar os dados do cliente de ID "+id+"?" ,
                         "Confirmar Alteração",
                         JOptionPane.YES_NO_CANCEL_OPTION,
                         JOptionPane.QUESTION_MESSAGE);
         if (resposta != JOptionPane.YES_OPTION) {
             return;
         }
         
         // 7. Alteramos apenas a escpecie, nome e idade
         // O WHERE garante que somente o animal selecionado será atualziado
         
         String sql = """
                      UPDATE cliente
                      SET nome = ?, cpf = ?, telefone = ?, email = ?, endereco = ?
                      WHERE id = ?
                      """;
         
         try (Connection conex = Conexao.conectar();
              PreparedStatement stmt = conex.prepareStatement(sql)){
             //8. Preecher os Parametros(?) na mesma ordem do SQL
             stmt.setString(1,nome);
             stmt.setString(2, CPF);
             stmt.setString(3, telefone);
             stmt.setString(4, email);
             stmt.setString(5, endereco);
             stmt.setInt(6, id);
             
             //9. Executamos a alteração no Banco de Dados
             int registros = stmt.executeUpdate();
             if (registros > 0){
                 JOptionPane.showMessageDialog(this, "Cliente alterado com sucesso!");
                 atualizarTabela();
                 txtID.setText("");
                 txtNome.setText("");
                 txtCPF.setText("");
                 txtTelefone.setText("");
                 txtEmail.setText("");
                 txtEndereco.setText("");
                 chkAtivo.setSelected(false);
                 txtNome.requestFocus();
             } else {
                 JOptionPane.showMessageDialog(this, "Cliente não encontrado");
             }
         } catch (SQLException erro){
           JOptionPane.showConfirmDialog(this, "Erro ao alterar cliente: " + erro.getMessage());
         }
    }//GEN-LAST:event_btnAlterarActionPerformed

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
            java.util.logging.Logger.getLogger(frmConsultaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmConsultaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmConsultaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmConsultaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmConsultaClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnLocalizar;
    private javax.swing.JCheckBox chkAtivo;
    private javax.swing.JComboBox<String> cmbPesquisarPor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
