package visao;

import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author joaov
 */
public class FrmSorteio extends javax.swing.JFrame {

    /**
     * Creates new form FrmSorteio
     */
    public FrmSorteio() {
        initComponents();
    }

    ArrayList<Integer> listaNumeros = new ArrayList<>();
    Random geradorNumero;
    int quantidadeFaltante = 0;
    int ordem = 0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLNumerosorteado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JTFQtdNumero = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTAListanumeros = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        JBCancelar = new javax.swing.JButton();
        JBSortear = new javax.swing.JButton();
        JBFechar = new javax.swing.JButton();
        JBNovo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sorteio de números");

        JLNumerosorteado.setFont(new java.awt.Font("Segoe UI", 1, 150)); // NOI18N
        JLNumerosorteado.setText("0");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Digite quantos números serão sorteados:");

        JTFQtdNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFQtdNumeroActionPerformed(evt);
            }
        });

        JTAListanumeros.setEditable(false);
        JTAListanumeros.setColumns(20);
        JTAListanumeros.setRows(5);
        jScrollPane1.setViewportView(JTAListanumeros);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Lista de números sorteados:");

        JBCancelar.setText("Cancelar");
        JBCancelar.setEnabled(false);
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        JBSortear.setText("Sortear");
        JBSortear.setEnabled(false);
        JBSortear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSortearActionPerformed(evt);
            }
        });

        JBFechar.setText("Fechar");
        JBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBFecharActionPerformed(evt);
            }
        });

        JBNovo.setText("Novo");
        JBNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(JLNumerosorteado)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTFQtdNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JBFechar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(JBCancelar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JBSortear))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(55, 55, 55)
                            .addComponent(jLabel1)
                            .addGap(59, 59, 59))))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JBNovo)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFQtdNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBNovo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(JLNumerosorteado, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBCancelar)
                    .addComponent(JBSortear))
                .addGap(18, 18, 18)
                .addComponent(JBFechar)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFQtdNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFQtdNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFQtdNumeroActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        this.JBNovo.setEnabled(true);
        this.JBSortear.setEnabled(false);
        this.JBCancelar.setEnabled(false);
        JTAListanumeros.setText("");
        JTFQtdNumero.setText("");
        listaNumeros.clear();
        JLNumerosorteado.setText("0");
        quantidadeFaltante = 0;
        ordem = 0;
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBFecharActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JBFecharActionPerformed

    private void JBNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNovoActionPerformed
        int QtdNumero = Integer.parseInt(this.JTFQtdNumero.getText());
        JTAListanumeros.setText("");
        listaNumeros.clear();
        JLNumerosorteado.setText("0");
        quantidadeFaltante = 0;
        ordem = 0;
        if (QtdNumero > 0) {
            for (int i = 1; i <= QtdNumero; i++) {
                listaNumeros.add(i);
            }
            quantidadeFaltante = QtdNumero;
            this.JBNovo.setEnabled(false);
            this.JBCancelar.setEnabled(true);
            this.JBSortear.setEnabled(true);
        } else {
            JOptionPane.showMessageDialog(null, "Valor deve ser maior que 0!");
        }
    }//GEN-LAST:event_JBNovoActionPerformed

    private void JBSortearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSortearActionPerformed
        if (!listaNumeros.isEmpty()) {
            geradorNumero = new Random();
            int indice = geradorNumero.nextInt(quantidadeFaltante);
            quantidadeFaltante--;
            ordem++;
            JTAListanumeros.append(ordem + "º Sorteado: " + listaNumeros.get(indice).toString() + "\n");
            JLNumerosorteado.setText(listaNumeros.get(indice).toString());
            listaNumeros.remove(indice);
        } else {
            JOptionPane.showMessageDialog(null, "Não há mais números na lista para serem sorteados :/ \n Por favor inicie um novo sorteio!");
            JTAListanumeros.setText("");
            JTFQtdNumero.setText("");
            listaNumeros.clear();
            JLNumerosorteado.setText("0");
            quantidadeFaltante = 0;
            ordem = 0;
            this.JBNovo.setEnabled(true);
            this.JBCancelar.setEnabled(false);
            this.JBSortear.setEnabled(false);
        }
    }//GEN-LAST:event_JBSortearActionPerformed

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
            java.util.logging.Logger.getLogger(FrmSorteio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSorteio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSorteio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSorteio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSorteio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCancelar;
    private javax.swing.JButton JBFechar;
    private javax.swing.JButton JBNovo;
    private javax.swing.JButton JBSortear;
    private javax.swing.JLabel JLNumerosorteado;
    private javax.swing.JTextArea JTAListanumeros;
    private javax.swing.JTextField JTFQtdNumero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
