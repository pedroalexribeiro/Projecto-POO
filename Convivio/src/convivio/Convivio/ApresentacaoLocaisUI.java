/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convivio.Convivio;

import java.util.ArrayList;

/**
 *
 * @author pedro
 */
public class ApresentacaoLocaisUI extends javax.swing.JFrame {
    private MainClassUI importantFrame;
    private InsideConvUI returnFrame;    
    private String nomeConvivio;
    private ArrayList<String> locais;
    private Pessoa pessoa;
    /**
     * Creates new form ApresentacaoLocaisUI
     */
    public ApresentacaoLocaisUI(MainClassUI importantFrame, InsideConvUI returnFrame, String nomeConvivio, Pessoa pessoa, boolean order) {
        this.importantFrame = importantFrame;
        this.returnFrame = returnFrame;
        this.nomeConvivio = nomeConvivio;
        this.pessoa = pessoa;
        this.locais = new ArrayList<>();
        initComponents();  
        if(order){
            populateTextAreaOrdered();
        }else{
            populateTextArea();
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        infoLocaisTextArea = new javax.swing.JTextArea();
        retornarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Apresentação dos locais do convivio");

        infoLocaisTextArea.setEditable(false);
        infoLocaisTextArea.setColumns(20);
        infoLocaisTextArea.setRows(5);
        jScrollPane1.setViewportView(infoLocaisTextArea);

        retornarButton.setText("Retornar");
        retornarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retornarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(retornarButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(retornarButton)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void retornarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retornarButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        returnFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_retornarButtonActionPerformed

    private void populateTextArea(){
        String infoLocais = "";
        ArrayList<ConvivioDei> listaTotal = importantFrame.getListaConvivios();
        for(ConvivioDei conv : listaTotal){
            if(nomeConvivio.equals(conv.getNome())){
                infoLocais = conv.getInfoLocais();
                break;
            }
        }
        if(infoLocais.equals("")){
            infoLocaisTextArea.setText("Este convívio não tem locais a visitar ainda.");
        }else{
            infoLocaisTextArea.setText(infoLocais);
        }
    }
    
    private void populateTextAreaOrdered(){
        String infoLocais = "";
        ArrayList<ConvivioDei> listaTotal = importantFrame.getListaConvivios();
        for(ConvivioDei conv : listaTotal){
            if(nomeConvivio.equals(conv.getNome())){
                infoLocais = conv.getInfoLocaisOrdered();
                break;
            }
        }
        if(infoLocais.equals("")){
            infoLocaisTextArea.setText("Este convívio não tem locais a visitar ainda.");
        }else{
            infoLocaisTextArea.setText(infoLocais);
        }
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea infoLocaisTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton retornarButton;
    // End of variables declaration//GEN-END:variables
}
