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
public class InsideConvUI extends javax.swing.JFrame {
    private MainClassUI importantFrame;
    private ClientUI clientFrame;
    private String nomeConvivio;
    private Pessoa pessoa;
    /**
     * Creates new form InsideConvUI
     * @param importantFrame
     * @param clientFrame
     * @param convivio
     * @param pessoa
     */
    public InsideConvUI(MainClassUI importantFrame, ClientUI clientFrame, String nomeConvivio, Pessoa pessoa) {
        this.importantFrame = importantFrame;
        this.clientFrame = clientFrame;
        this.nomeConvivio = nomeConvivio;
        this.pessoa = pessoa;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        selecaoLocaisButton = new javax.swing.JButton();
        seriacaoButton = new javax.swing.JButton();
        verGuestListButton = new javax.swing.JButton();
        receitaButton = new javax.swing.JButton();
        sairButton = new javax.swing.JButton();
        apresentarLocaisButton = new javax.swing.JButton();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Está no menu do convivio ");
        jLabel1.setText("Está no menu do convivio "+nomeConvivio);

        selecaoLocaisButton.setText("Seleção dos locais a visitar ");
        selecaoLocaisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selecaoLocaisButtonActionPerformed(evt);
            }
        });

        seriacaoButton.setText("Seriação dos locais a visitar");
        seriacaoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seriacaoButtonActionPerformed(evt);
            }
        });

        verGuestListButton.setText("Visualização de “guest lists”");
        verGuestListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verGuestListButtonActionPerformed(evt);
            }
        });

        receitaButton.setText("Contabilização das receitas dos locais visitados");
        receitaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                receitaButtonActionPerformed(evt);
            }
        });

        sairButton.setText("Sair do convivio");
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });

        apresentarLocaisButton.setText("Apresentação dos locais do convivio");
        apresentarLocaisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apresentarLocaisButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(selecaoLocaisButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(seriacaoButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(verGuestListButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(receitaButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(sairButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(apresentarLocaisButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(apresentarLocaisButton)
                .addGap(18, 18, 18)
                .addComponent(selecaoLocaisButton)
                .addGap(18, 18, 18)
                .addComponent(seriacaoButton)
                .addGap(18, 18, 18)
                .addComponent(verGuestListButton)
                .addGap(18, 18, 18)
                .addComponent(receitaButton)
                .addGap(18, 18, 18)
                .addComponent(sairButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void receitaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_receitaButtonActionPerformed
        // TODO add your handling code here:
        double totalReceita = 0;
        ConvivioDei convivio = importantFrame.getConvivio(nomeConvivio);
        ArrayList<Inscricao> inscricoes = convivio.getInscricoes();
        for(Inscricao ins : inscricoes){
            totalReceita += ins.getReceita();
        }
        JOptionPane.showMessageDialog(null, "O valor mínimo de receita prevista é "+totalReceita, "InfoBox: Valor da receita", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_receitaButtonActionPerformed

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        clientFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sairButtonActionPerformed

    private void selecaoLocaisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selecaoLocaisButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new SelecaoLocaisUI(importantFrame, this, nomeConvivio, pessoa).setVisible(true);        
    }//GEN-LAST:event_selecaoLocaisButtonActionPerformed

    private void apresentarLocaisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apresentarLocaisButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ApresentacaoLocaisUI(importantFrame, this, nomeConvivio, pessoa, false).setVisible(true);
    }//GEN-LAST:event_apresentarLocaisButtonActionPerformed

    private void seriacaoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seriacaoButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new ApresentacaoLocaisUI(importantFrame, this, nomeConvivio, pessoa, true).setVisible(true);
    }//GEN-LAST:event_seriacaoButtonActionPerformed

    private void verGuestListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verGuestListButtonActionPerformed
        // TODO add your handling code here:
        ConvivioDei convivio = importantFrame.getConvivio(nomeConvivio);
        ArrayList<Local> listaLocais = convivio.getListaLocais();
        boolean isThereBar = false;
        for(Local local : listaLocais){
            if(local.isBar()){
                isThereBar = true;
                break;
            }
        }
        if(isThereBar){
            this.setVisible(false);
            new GuestListUI(importantFrame, this, nomeConvivio).setVisible(true);  
        }else{
             JOptionPane.showMessageDialog(null, "Este convívio não tem bares", "InfoBox: No bares", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_verGuestListButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apresentarLocaisButton;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton receitaButton;
    private javax.swing.JButton sairButton;
    private javax.swing.JButton selecaoLocaisButton;
    private javax.swing.JButton seriacaoButton;
    private javax.swing.JButton verGuestListButton;
    // End of variables declaration//GEN-END:variables
}
