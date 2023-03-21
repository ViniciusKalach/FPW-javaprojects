
package Tarefa_POO_2;

/**
 *
 * @author Vinícius RA 211559
 */
public class FuncionárioForm extends javax.swing.JFrame {
    private Funcionário fun;

    public FuncionárioForm() {
        initComponents();
        Panel2.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        L1 = new javax.swing.JLabel();
        L2 = new javax.swing.JLabel();
        L3 = new javax.swing.JLabel();
        L4 = new javax.swing.JLabel();
        jNome = new javax.swing.JTextField();
        jSobrenome = new javax.swing.JTextField();
        jvph = new javax.swing.JTextField();
        jSpinner = new javax.swing.JSpinner();
        jCadastrobt = new javax.swing.JButton();
        Panel2 = new javax.swing.JPanel();
        L5 = new javax.swing.JLabel();
        L6 = new javax.swing.JLabel();
        L7 = new javax.swing.JLabel();
        jvalor = new javax.swing.JLabel();
        jsal = new javax.swing.JLabel();
        jhor = new javax.swing.JLabel();
        jNCBt = new javax.swing.JButton();
        jCalcularbt = new javax.swing.JButton();
        jSpinner2 = new javax.swing.JSpinner();
        jAddbt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "CADASTRO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans Typewriter", 0, 24))); // NOI18N
        Panel1.setPreferredSize(new java.awt.Dimension(300, 250));

        L1.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        L1.setText("Horas trabalhadas:");

        L2.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        L2.setText("Sobrenome:");

        L3.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        L3.setText("Nome:");

        L4.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        L4.setText("Valor por hora:");

        jCadastrobt.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        jCadastrobt.setText("Cadastrar");
        jCadastrobt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastrobtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jCadastrobt))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(Panel1Layout.createSequentialGroup()
                            .addComponent(L3)
                            .addGap(58, 58, 58)
                            .addComponent(jNome, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addComponent(L1)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Panel1Layout.createSequentialGroup()
                                .addComponent(L2)
                                .addGap(18, 18, 18)
                                .addComponent(jSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(L4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jvph, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L3)
                    .addComponent(jNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L2)
                    .addComponent(jSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L1)
                    .addComponent(jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(L4)
                    .addComponent(jvph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jCadastrobt)
                .addGap(20, 20, 20))
        );

        Panel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "MOSTRAR", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Sans Typewriter", 0, 24))); // NOI18N
        Panel2.setPreferredSize(new java.awt.Dimension(300, 250));

        L5.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        L5.setText("Valor p/hora:");

        L6.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        L6.setText("Salário:");

        L7.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        L7.setText("Horas trab.:");

        jvalor.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        jvalor.setText("0");

        jsal.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        jsal.setText("0");

        jhor.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        jhor.setText("0");

        jNCBt.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        jNCBt.setText("Nome completo");
        jNCBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNCBtActionPerformed(evt);
            }
        });

        jCalcularbt.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        jCalcularbt.setText("Calcular");
        jCalcularbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCalcularbtActionPerformed(evt);
            }
        });

        jAddbt.setFont(new java.awt.Font("Lucida Sans Typewriter", 0, 14)); // NOI18N
        jAddbt.setText("Add");
        jAddbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAddbtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jsal)
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addComponent(L5)
                        .addGap(20, 20, 20)
                        .addComponent(jvalor))
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addComponent(L6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addComponent(L7)
                        .addGap(28, 28, 28)
                        .addComponent(jhor)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jNCBt)
                    .addComponent(jCalcularbt)
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addComponent(jAddbt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jNCBt)
                    .addGroup(Panel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(L5)
                            .addComponent(jvalor))))
                .addGap(18, 18, 18)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L6)
                    .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jsal)
                        .addComponent(jCalcularbt)))
                .addGap(18, 18, 18)
                .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(L7)
                        .addComponent(jhor))
                    .addGroup(Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jAddbt)
                        .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                    .addComponent(Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jNCBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNCBtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNCBtActionPerformed

    private void jCalcularbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCalcularbtActionPerformed
        // TODO add your handling code here:
      //  double valor = fun.calcularSalario();
      //  jsal.setText(fun.valor);
    }//GEN-LAST:event_jCalcularbtActionPerformed

    private void jAddbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAddbtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jAddbtActionPerformed

    private void jCadastrobtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastrobtActionPerformed
        // TODO add your handling code here:
        fun = new Funcionário();
        
        String nome = String.valueOf(jNome.getText());
        fun.setNome(nome);
        String sobrenome = String.valueOf(jSobrenome.getText());
        fun.setSobrenome(sobrenome);
        int horasTrabalhadas = (Integer) jSpinner.getValue();
        fun.setHorasTrabalhadas(horasTrabalhadas);
        double valorPorHora = Double.parseDouble(jvph.getText());
        fun.setValorPorHora(valorPorHora);        
        
        Panel2.setVisible(true);
    }//GEN-LAST:event_jCadastrobtActionPerformed

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
            java.util.logging.Logger.getLogger(FuncionárioForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncionárioForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncionárioForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncionárioForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionárioForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L2;
    private javax.swing.JLabel L3;
    private javax.swing.JLabel L4;
    private javax.swing.JLabel L5;
    private javax.swing.JLabel L6;
    private javax.swing.JLabel L7;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JButton jAddbt;
    private javax.swing.JButton jCadastrobt;
    private javax.swing.JButton jCalcularbt;
    private javax.swing.JButton jNCBt;
    private javax.swing.JTextField jNome;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jSobrenome;
    private javax.swing.JSpinner jSpinner;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JLabel jhor;
    private javax.swing.JLabel jsal;
    private javax.swing.JLabel jvalor;
    private javax.swing.JTextField jvph;
    // End of variables declaration//GEN-END:variables
}
