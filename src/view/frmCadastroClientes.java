package view;
import java.sql.Connection;
import conexao.Conexao;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;

import conexao.Conexao;

/**
 *
 * @author GUSTAVOKNEVITZKLEINW
 */
public class frmCadastroClientes extends javax.swing.JFrame {

    private void limparCampos(){
        txtNome.setText("");
        txtCPF.setText("");
        txtTelefone.setText("");
        txtEmail.setText("");
        txtEndereco.setText("");
        chkAtivo.setSelected(false);
        txtNome.requestFocus();
    };
    
    public frmCadastroClientes() {
        initComponents();
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtEmail = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        chkAtivo = new javax.swing.JCheckBox();
        btnCadastrar = new javax.swing.JButton();
        btnLimparCampos = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CADASTRO CLIENTES");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(307, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(284, 284, 284))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        txtNome.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome"));

        txtTelefone.setBorder(javax.swing.BorderFactory.createTitledBorder("Telefone"));
        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtEmail.setBorder(javax.swing.BorderFactory.createTitledBorder("E-mail"));

        txtEndereco.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        chkAtivo.setText("Ativo");

        btnCadastrar.setBackground(new java.awt.Color(153, 255, 51));
        btnCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnLimparCampos.setBackground(new java.awt.Color(153, 153, 153));
        btnLimparCampos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnLimparCampos.setText("Limpar Campos");
        btnLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\GUSTAVOKNEVITZKLEINW\\Downloads\\Ícone_Minimalista_de_Carro_e_Chave_Inglesa-removebg-preview (2).png")); // NOI18N

        txtCPF.setBorder(javax.swing.BorderFactory.createTitledBorder("CPF"));
        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(txtTelefone))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(txtCPF))
                        .addGap(37, 37, 37)
                        .addComponent(chkAtivo))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnLimparCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNome, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                            .addComponent(txtCPF)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(chkAtivo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(txtEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimparCampos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        String sqlInsert = """
                           INSERT INTO cliente
                           (nome, cpf, telefone, email, endereco, ativo)
                           VALUES (?, ?, ?, ?, ?, ?)
                           """;
        
        try{
            Connection conex = Conexao.conectar();
            PreparedStatement stmt = conex.prepareStatement(sqlInsert);
            
            String nome = txtNome.getText();
            String cpf = txtCPF.getText();
            String telefone = txtTelefone.getText();
            String email = txtEmail.getText();
            String endereco = txtEndereco.getText();
            Boolean ativo = chkAtivo.isSelected();
            
            if(nome == "" || cpf == "" || telefone == ""){
                JOptionPane.showMessageDialog(this, "Preencha corretamente os campos, nenhum deve ser vazio!");
                return;
            }
            
            stmt.setString(1, nome);
            stmt.setString(2, cpf);
            stmt.setString(3, telefone);
            stmt.setString(4, email);
            stmt.setString(5, endereco);
            stmt.setBoolean(6, ativo);
            
            
            
            int linhas = stmt.executeUpdate();
            if (linhas > 0){
                JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso!");
                limparCampos();
            }
        } catch (SQLException erro){
           JOptionPane.showMessageDialog(this,"Não foi possível Cadastrar! - Erro: "+ erro); 
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparCamposActionPerformed

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
            java.util.logging.Logger.getLogger(frmCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCadastroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCadastroClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JCheckBox chkAtivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
