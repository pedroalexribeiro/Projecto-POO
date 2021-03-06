package convivio.Convivio;

/**
 * Classe NewUserUI serve para o utilzador que tipo de pessoa vai criar, ou "Professor"
 * ou "Funcionario" ou "Aluno".
 * @author Pedro Ribeiro e Duarte Carvalho
 */
public class NewUserUI extends javax.swing.JFrame {
    /**
     * Objecto da classe MainClassUI.
     */
    private MainClassUI importantFrame;
    /**
     * Creates new form NewUserUI
     * @param importantFrame Objecto da classe MainClassUI.
     */
    public NewUserUI(MainClassUI importantFrame) {
        initComponents();
        this.importantFrame = importantFrame;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        opcoesUserComboBox = new javax.swing.JComboBox<>();
        fraseLabel = new javax.swing.JLabel();
        criarButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();

        setResizable(false);

        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Criar um novo utilizador");

        opcoesUserComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aluno", "Funcionário", "Professor" }));

        fraseLabel.setText("Qual é o tipo de utilizador:");

        criarButton.setText("Criar");
        criarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarButtonActionPerformed(evt);
            }
        });

        cancelarButton.setText("Cancelar");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addComponent(fraseLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(opcoesUserComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(criarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelarButton)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcoesUserComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fraseLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(criarButton)
                    .addComponent(cancelarButton))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        importantFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelarButtonActionPerformed

    private void criarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarButtonActionPerformed
        // TODO add your handling code here:
        if(opcoesUserComboBox.getSelectedItem().toString().equals("Aluno")){
            this.setVisible(false);
            new NewStudentUI(importantFrame).setVisible(true);
            this.dispose();
        }else if(opcoesUserComboBox.getSelectedItem().toString().equals("Professor")){
            this.setVisible(false);
            new NewProfessorUI(importantFrame).setVisible(true);
            this.dispose();
        }else if(opcoesUserComboBox.getSelectedItem().toString().equals("Funcionário")){
            this.setVisible(false);
            new NewWorkerUI(importantFrame).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_criarButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarButton;
    private javax.swing.JButton criarButton;
    private javax.swing.JLabel fraseLabel;
    private javax.swing.JComboBox<String> opcoesUserComboBox;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
