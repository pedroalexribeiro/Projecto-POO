/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convivio.Convivio;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class NewProfessorUI extends javax.swing.JFrame {
    private MainClassUI importantFrame;
    /**
     * Creates new form NewProfessorUI
     * @param importantFrame
     */
    public NewProfessorUI(MainClassUI importantFrame) {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        professorComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        nomeTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        perfilComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        passwordTF = new javax.swing.JPasswordField();
        criaButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Criar um novo Professor");

        jLabel2.setText("O professor é:");

        professorComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Auxiliar", "Associado", "Catedrático" }));

        jLabel3.setText("Nome:");

        jLabel4.setText("Perfil:");

        perfilComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desportivo", "Cultural", "Boémio", "Poupadinho" }));

        jLabel5.setText("Password:");

        criaButton.setText("Cria");
        criaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criaButtonActionPerformed(evt);
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
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(professorComboBox, 0, 288, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeTF))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(perfilComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(passwordTF)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(criaButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelarButton)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nomeTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(perfilComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(passwordTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(professorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(criaButton)
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

    private void criaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criaButtonActionPerformed
        // TODO add your handling code here:
        String username = nomeTF.getText();
        char []prePassword = passwordTF.getPassword();
        String password = new String(prePassword);
        if(username == null || username.trim().equals("")){
            JOptionPane.showMessageDialog(null, "Nome não pode estar vazio!", "InfoBox: Username", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(password.trim().equals("")){
            JOptionPane.showMessageDialog(null, "Passoword não pode estar vazia!", "InfoBox: Password", JOptionPane.INFORMATION_MESSAGE);
        }else{
            boolean nomeAlreadyExists = false;
            ArrayList<Pessoa> listaPessoas = importantFrame.getListaPessoas();
            for(Pessoa p : listaPessoas){
                if(p.getNome().equals(username)){
                    nomeAlreadyExists = true;
                    break;
                }
            }
            if(nomeAlreadyExists){
                JOptionPane.showMessageDialog(null, "Já existe uma pessoa com esse nome!", "InfoBox: Nome", JOptionPane.INFORMATION_MESSAGE);
            }else{
                String perfil = perfilComboBox.getSelectedItem().toString();
                String type = professorComboBox.getSelectedItem().toString();
                importantFrame.addPessoa(new Professor(username, perfil, password, type));
                JOptionPane.showMessageDialog(null, "Professor criado com sucesso!", "InfoBox: Novo Professor", JOptionPane.INFORMATION_MESSAGE);
                this.setVisible(false);
                importantFrame.setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_criaButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarButton;
    private javax.swing.JButton criaButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nomeTF;
    private javax.swing.JPasswordField passwordTF;
    private javax.swing.JComboBox<String> perfilComboBox;
    private javax.swing.JComboBox<String> professorComboBox;
    // End of variables declaration//GEN-END:variables
}
