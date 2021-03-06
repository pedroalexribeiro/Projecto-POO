package convivio.Convivio;

import java.util.ArrayList;

/**
 * Classe AdminUI serve para o administrador da aplicação criar e gerir os convívios.
 * @author Pedro Ribeiro e Duarte Carvalho
 */
public class AdminUI extends javax.swing.JFrame {
    /**
     * Objecto da classe MainClassUI.
     */
    private MainClassUI importantFrame;
    /**
     * Creates new form AdminUI
     * @param importantFrame Objecto da classe MainClasseUI.
     */
    public AdminUI(MainClassUI importantFrame) {
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
        criarConvivioButton = new javax.swing.JButton();
        criarLocalButton = new javax.swing.JButton();
        sairButton = new javax.swing.JButton();

        setResizable(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bem-vindo Admin!");

        criarConvivioButton.setText("Criar novo convivio");
        criarConvivioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarConvivioButtonActionPerformed(evt);
            }
        });

        criarLocalButton.setText("Criar novo local");
        criarLocalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarLocalButtonActionPerformed(evt);
            }
        });

        sairButton.setText("Sair");
        sairButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(criarConvivioButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(criarLocalButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sairButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(criarConvivioButton)
                .addGap(18, 18, 18)
                .addComponent(criarLocalButton)
                .addGap(18, 18, 18)
                .addComponent(sairButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sairButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        importantFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sairButtonActionPerformed

    private void criarConvivioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarConvivioButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new NewConvivioUI(this).setVisible(true);
    }//GEN-LAST:event_criarConvivioButtonActionPerformed

    private void criarLocalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarLocalButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new NewLocalUI(this).setVisible(true);
    }//GEN-LAST:event_criarLocalButtonActionPerformed

    /**
    * Adiciona um convívio à lista de convivios.
    * @param c Objecto da classe Convivio.
    */
   public void addConvivio(ConvivioDei c){
       importantFrame.addConvivio(c);
   }
    
    /**
    * Verifica se já existe algum convívio com o nome passado como argumento.
    * @param s string com o nome de um convívio.
    * @return Boolean.
    */
    public boolean hasSameNameConvivio(String s){
        return importantFrame.hasSameNameConvivio(s);
    }
     
    /**
    * Adiciona um local à lista de locais de um convívio.
    * @param nome String com o nome do convívio ao qual queremos adicionar o local.
    * @param l Objecto local que queremos adicionar ao convivio.
    */
    public void adicionarLocalAConvivio(String nome, Local l){
        importantFrame.adicionarLocalAConvivio(nome,l);
    }
     
    /**
     *
     * @return ArrayList de convívios.
     */
    public ArrayList<ConvivioDei> getListaConvivios() {
        return importantFrame.getListaConvivios();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton criarConvivioButton;
    private javax.swing.JButton criarLocalButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton sairButton;
    // End of variables declaration//GEN-END:variables
}
