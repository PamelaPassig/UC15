public class telaMenu extends javax.swing.JFrame {

    public telaMenu() {
        initComponents();
         setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        botaoLivro = new javax.swing.JButton();
        botaoListar = new javax.swing.JButton();
        botaoGerenciar = new javax.swing.JButton();
        botaoEmprestimo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(244, 244, 244));

        botaoLivro.setBackground(new java.awt.Color(59, 130, 246));
        botaoLivro.setForeground(new java.awt.Color(255, 255, 255));
        botaoLivro.setText("Cadastrar");
        botaoLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLivroActionPerformed(evt);
            }
        });

        botaoListar.setBackground(new java.awt.Color(59, 130, 246));
        botaoListar.setForeground(new java.awt.Color(255, 255, 255));
        botaoListar.setText("Listar");
        botaoListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoListarActionPerformed(evt);
            }
        });

        botaoGerenciar.setBackground(new java.awt.Color(59, 130, 246));
        botaoGerenciar.setForeground(new java.awt.Color(255, 255, 255));
        botaoGerenciar.setText("Gerenciar");
        botaoGerenciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoGerenciarActionPerformed(evt);
            }
        });

        botaoEmprestimo.setBackground(new java.awt.Color(59, 130, 246));
        botaoEmprestimo.setForeground(new java.awt.Color(255, 255, 255));
        botaoEmprestimo.setText("Empréstimo");
        botaoEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEmprestimoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("BVT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botaoLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botaoListar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(botaoEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(botaoGerenciar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 227, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoLivro)
                        .addGap(36, 36, 36)
                        .addComponent(botaoListar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(botaoGerenciar)
                        .addGap(44, 44, 44)
                        .addComponent(botaoEmprestimo)
                        .addGap(33, 33, 33))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLivroActionPerformed
         new telaCadastro().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoLivroActionPerformed

    private void botaoListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoListarActionPerformed
        new telaListagem().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoListarActionPerformed

    private void botaoGerenciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoGerenciarActionPerformed
        new telaGerencia().setVisible(true);
    this.dispose();
    }//GEN-LAST:event_botaoGerenciarActionPerformed

    private void botaoEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEmprestimoActionPerformed
         new telaEmprestimo().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_botaoEmprestimoActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEmprestimo;
    private javax.swing.JButton botaoGerenciar;
    private javax.swing.JButton botaoListar;
    private javax.swing.JButton botaoLivro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
