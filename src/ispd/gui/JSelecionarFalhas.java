/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ispd.gui;

//import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.HeadlessException;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import ispd.motor.*;

/**
 *
 * @author Camila
 */

public class JSelecionarFalhas extends javax.swing.JFrame {

public int OmissaoHardware;
public int OmissaoSoftware;

/*public JSelecionarFalhas(int OHH) {
        this.OmissaoHardware = OHH;
}
public int getOH() { return OH; }
public void setOH(int OH) { this.OH = OH; }
//}//public class JSelecionarFalhas extends javax.swing.JFrame {
*/

public int getOmissaoHardware() { 
    return OmissaoHardware; 
}

public void setOmissaoHardware(int OmissaoHardware) { 
    this.OmissaoHardware = OmissaoHardware; 
}

    /**
     * Creates new form JSelecionarFalhas
     */
    public JSelecionarFalhas() {       
        //int OH;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * 
     * by Camila
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        PanelJSelecionarFalhas = new javax.swing.JPanel();
        ckbOmissao = new javax.swing.JCheckBox();
        cbkOmissaoHardware = new javax.swing.JCheckBox();
        cbkOmissaoSoftware = new javax.swing.JCheckBox();
        cbxEnvelhecimento = new javax.swing.JCheckBox();
        cbxNegacaoService = new javax.swing.JCheckBox();
        cbxHDCheio = new javax.swing.JCheckBox();
        cbxFalhaResposta = new javax.swing.JCheckBox();
        cbxValores = new javax.swing.JCheckBox();
        cbxEstado = new javax.swing.JCheckBox();
        cbxInteracao = new javax.swing.JCheckBox();
        cbxSobrecargaTempo = new javax.swing.JCheckBox();
        cbxInterdependencia = new javax.swing.JCheckBox();
        cbxDiversas = new javax.swing.JCheckBox();
        cbxFPermanentes = new javax.swing.JCheckBox();
        cbxDesenhoIncorreto = new javax.swing.JCheckBox();
        cbxTempoResposta = new javax.swing.JCheckBox();
        cbxPrecoce = new javax.swing.JCheckBox();
        cbxTardia = new javax.swing.JCheckBox();
        cbxIncompatibilidade = new javax.swing.JCheckBox();
        cbxSoftware = new javax.swing.JCheckBox();
        cbxTransiente = new javax.swing.JCheckBox();
        jButtonSelecionarFalhas = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SelectFaults");
        setLocation(new java.awt.Point(300, 100));

        PanelJSelecionarFalhas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelJSelecionarFalhas.setMaximumSize(new java.awt.Dimension(159, 32769));
        PanelJSelecionarFalhas.setOpaque(false);

        ckbOmissao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ckbOmissao.setText("Omission");
        ckbOmissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbOmissaoActionPerformed(evt);
            }
        });

        cbkOmissaoHardware.setText("Hardware");
        cbkOmissaoHardware.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbkOmissaoHardwareActionPerformed(evt);
            }
        });

        cbkOmissaoSoftware.setText("Software");
        cbkOmissaoSoftware.setEnabled(false);

        cbxEnvelhecimento.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbxEnvelhecimento.setText("Aging related");
        cbxEnvelhecimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEnvelhecimentoActionPerformed(evt);
            }
        });

        cbxNegacaoService.setText("Denial of Service");
        cbxNegacaoService.setEnabled(false);
        cbxNegacaoService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxNegacaoServiceActionPerformed(evt);
            }
        });

        cbxHDCheio.setText("Full HD");
        cbxHDCheio.setEnabled(false);
        cbxHDCheio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxHDCheioActionPerformed(evt);
            }
        });

        cbxFalhaResposta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbxFalhaResposta.setText("Response faults");
        cbxFalhaResposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFalhaRespostaActionPerformed(evt);
            }
        });

        cbxValores.setText("Values faults");
        cbxValores.setEnabled(false);

        cbxEstado.setText("State transimission");
        cbxEstado.setEnabled(false);

        cbxInteracao.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbxInteracao.setText("Interaction");
        cbxInteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxInteracaoActionPerformed(evt);
            }
        });

        cbxSobrecargaTempo.setText("Timing overheads");
        cbxSobrecargaTempo.setEnabled(false);

        cbxInterdependencia.setText("Service interdependence");
        cbxInterdependencia.setEnabled(false);
        cbxInterdependencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxInterdependenciaActionPerformed(evt);
            }
        });

        cbxDiversas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbxDiversas.setText("Miscellaneous");
        cbxDiversas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxDiversasActionPerformed(evt);
            }
        });

        cbxFPermanentes.setText("Permanet fauls");
        cbxFPermanentes.setEnabled(false);

        cbxDesenhoIncorreto.setText("Incorrect desing");
        cbxDesenhoIncorreto.setEnabled(false);

        cbxTempoResposta.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbxTempoResposta.setText("Timing faults");
        cbxTempoResposta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTempoRespostaActionPerformed(evt);
            }
        });

        cbxPrecoce.setText("Early");
        cbxPrecoce.setEnabled(false);
        cbxPrecoce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPrecoceActionPerformed(evt);
            }
        });

        cbxTardia.setText("Late");
        cbxTardia.setEnabled(false);

        cbxIncompatibilidade.setText("Protocol Incompatibilities");
        cbxIncompatibilidade.setToolTipText("");
        cbxIncompatibilidade.setEnabled(false);
        cbxIncompatibilidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxIncompatibilidadeActionPerformed(evt);
            }
        });

        cbxSoftware.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbxSoftware.setText("Software");
        cbxSoftware.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxSoftwareActionPerformed(evt);
            }
        });

        cbxTransiente.setText("Transient or intermitent");
        cbxTransiente.setEnabled(false);

        javax.swing.GroupLayout PanelJSelecionarFalhasLayout = new javax.swing.GroupLayout(PanelJSelecionarFalhas);
        PanelJSelecionarFalhas.setLayout(PanelJSelecionarFalhasLayout);
        PanelJSelecionarFalhasLayout.setHorizontalGroup(
            PanelJSelecionarFalhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelJSelecionarFalhasLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(PanelJSelecionarFalhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckbOmissao)
                    .addComponent(cbkOmissaoHardware)
                    .addComponent(cbkOmissaoSoftware)
                    .addComponent(cbxInteracao)
                    .addComponent(cbxSobrecargaTempo)
                    .addComponent(cbxInterdependencia)
                    .addComponent(cbxIncompatibilidade)
                    .addComponent(cbxSoftware))
                .addGroup(PanelJSelecionarFalhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelJSelecionarFalhasLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cbxTransiente)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelJSelecionarFalhasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(PanelJSelecionarFalhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxEnvelhecimento)
                            .addComponent(cbxNegacaoService)
                            .addComponent(cbxHDCheio)
                            .addComponent(cbxDiversas)
                            .addComponent(cbxFPermanentes)
                            .addComponent(cbxDesenhoIncorreto))
                        .addGap(40, 40, 40)
                        .addGroup(PanelJSelecionarFalhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxTardia)
                            .addComponent(cbxPrecoce)
                            .addComponent(cbxTempoResposta)
                            .addComponent(cbxEstado)
                            .addComponent(cbxValores)
                            .addComponent(cbxFalhaResposta))
                        .addGap(51, 51, 51))))
        );
        PanelJSelecionarFalhasLayout.setVerticalGroup(
            PanelJSelecionarFalhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelJSelecionarFalhasLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(PanelJSelecionarFalhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckbOmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelJSelecionarFalhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbxEnvelhecimento)
                        .addComponent(cbxFalhaResposta)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelJSelecionarFalhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbkOmissaoHardware)
                    .addComponent(cbxNegacaoService)
                    .addComponent(cbxValores))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelJSelecionarFalhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbkOmissaoSoftware)
                    .addComponent(cbxHDCheio)
                    .addComponent(cbxEstado))
                .addGap(18, 18, 18)
                .addGroup(PanelJSelecionarFalhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxInteracao)
                    .addComponent(cbxDiversas)
                    .addComponent(cbxTempoResposta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelJSelecionarFalhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxSobrecargaTempo)
                    .addComponent(cbxFPermanentes)
                    .addComponent(cbxPrecoce))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelJSelecionarFalhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxInterdependencia)
                    .addComponent(cbxDesenhoIncorreto)
                    .addComponent(cbxTardia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxIncompatibilidade)
                .addGap(18, 18, 18)
                .addGroup(PanelJSelecionarFalhasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxSoftware)
                    .addComponent(cbxTransiente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonSelecionarFalhas.setText("Select the faults and return to the Main screen");
        jButtonSelecionarFalhas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelecionarFalhasActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Select Faults");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSelecionarFalhas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelJSelecionarFalhas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelJSelecionarFalhas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSelecionarFalhas)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ckbOmissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbOmissaoActionPerformed
      if (ckbOmissao.isSelected()){
           cbkOmissaoHardware.setEnabled(true);
           cbkOmissaoSoftware.setEnabled(true);
           JOptionPane.showMessageDialog (null, "Omission Faults.");
           
      }else {
           JOptionPane.showMessageDialog (null, "Omission faults not selected.");
      
      }
         /* if(cbkOmissaoHardware.isSelected()){
              TrueOmissaoHardware =1;
           }
           if(cbkOmissaoSoftware.isSelected()){
               //FalseOmissaoSoftware =0;
           }
      } else
          
        JOptionPane.showMessageDialog (null, "Failure not selected");*/
      // if (ckbOmissao.isSelected()){
    }//GEN-LAST:event_ckbOmissaoActionPerformed

    private void cbxPrecoceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPrecoceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxPrecoceActionPerformed

    private void cbxEnvelhecimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEnvelhecimentoActionPerformed
        if (cbxEnvelhecimento.isSelected()){
            cbxNegacaoService.setEnabled(true);
            cbxHDCheio.setEnabled(true);
            JOptionPane.showMessageDialog (null, "Development failure");
      } else
        JOptionPane.showMessageDialog (null, "Failure not selected");
        //cbxNegacaoService.setEnabled(cbxNegacaoService.isSelected());
        // cbxHDCheio.setEnabled(cbxHDCheio.isSelected());
    }//GEN-LAST:event_cbxEnvelhecimentoActionPerformed

    private void jButtonSelecionarFalhasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelecionarFalhasActionPerformed
        if(cbkOmissaoHardware.isSelected()){
            OmissaoHardware=1;
            
        } else {
            OmissaoHardware=0;
        }
        
        this.dispose();
       // gui.setVisible(true);
    }//GEN-LAST:event_jButtonSelecionarFalhasActionPerformed

    private void cbxFalhaRespostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxFalhaRespostaActionPerformed
        if (cbxFalhaResposta.isSelected()){
        cbxValores.setEnabled(true);
        cbxEstado.setEnabled(true);
        JOptionPane.showMessageDialog (null, "Response faults.");
        }
        else
        JOptionPane.showMessageDialog (null, "Not response faults.");
    }//GEN-LAST:event_cbxFalhaRespostaActionPerformed

    private void cbxInteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxInteracaoActionPerformed
       if (cbxInteracao.isSelected()){
        cbxSobrecargaTempo.setEnabled(true);
        cbxInterdependencia.setEnabled(true);
        cbxIncompatibilidade.setEnabled(true);
        JOptionPane.showMessageDialog (null, "Development failure");
       }
        else
         JOptionPane.showMessageDialog (null, "Failure not selected");
       
    }//GEN-LAST:event_cbxInteracaoActionPerformed

    private void cbxDiversasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxDiversasActionPerformed
       if (cbxDiversas.isSelected()){
        cbxFPermanentes.setEnabled(true);
        cbxDesenhoIncorreto.setEnabled(true);
        JOptionPane.showMessageDialog (null, "Development failure");
        }
        else
        JOptionPane.showMessageDialog (null, "Failure not selected");
    }//GEN-LAST:event_cbxDiversasActionPerformed

    private void cbxTempoRespostaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTempoRespostaActionPerformed
        if (cbxDiversas.isSelected()){
        cbxPrecoce.setEnabled(true);
        cbxTardia.setEnabled(true);
        JOptionPane.showMessageDialog (null, "Development failure.");
        }
        else{
           JOptionPane.showMessageDialog (null, "Failure not selected");
        }
    }//GEN-LAST:event_cbxTempoRespostaActionPerformed

    private void cbxSoftwareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxSoftwareActionPerformed
    if (cbxSoftware.isSelected()){
        cbxTransiente.setEnabled(true);
        JOptionPane.showMessageDialog (null, "Development failure");
    }
      else{
        JOptionPane.showMessageDialog (null, "Failure not selected.");   
    }//GEN-LAST:event_cbxSoftwareActionPerformed
    }
    
    private void cbkOmissaoHardwareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbkOmissaoHardwareActionPerformed
    //Verifica qual se a falha de omissão de hardware foi selecionada
    if (cbkOmissaoHardware != null){
        int OmissaoHardware = 1;//True
    }
    /*if (cbkOmissaoHardware.isSelected()){
         
     //   int OmissaoHardware = 1;//True
        //int OmissaoHardware=this.OmissaoHardware;
            JOptionPane.showMessageDialog (null, "Hardware failure selected."+this.OmissaoHardware);
         //ispd.motor.HardwareFaults.FIHardware(OmissaoHardware);
        
    }//if
    else{ 
           int OmissaoHardware=0;
            JOptionPane.showMessageDialog (null, "Hardware failure selected = "+OmissaoHardware);
    }//else */
    }//GEN-LAST:event_cbkOmissaoHardwareActionPerformed

    private void cbxInterdependenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxInterdependenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxInterdependenciaActionPerformed

    private void cbxIncompatibilidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxIncompatibilidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxIncompatibilidadeActionPerformed

    private void cbxNegacaoServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxNegacaoServiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxNegacaoServiceActionPerformed

    private void cbxHDCheioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxHDCheioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxHDCheioActionPerformed

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
            java.util.logging.Logger.getLogger(JSelecionarFalhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JSelecionarFalhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JSelecionarFalhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JSelecionarFalhas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JSelecionarFalhas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelJSelecionarFalhas;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JCheckBox cbkOmissaoHardware;
    public javax.swing.JCheckBox cbkOmissaoSoftware;
    public javax.swing.JCheckBox cbxDesenhoIncorreto;
    private javax.swing.JCheckBox cbxDiversas;
    public javax.swing.JCheckBox cbxEnvelhecimento;
    public javax.swing.JCheckBox cbxEstado;
    public javax.swing.JCheckBox cbxFPermanentes;
    public javax.swing.JCheckBox cbxFalhaResposta;
    public javax.swing.JCheckBox cbxHDCheio;
    public javax.swing.JCheckBox cbxIncompatibilidade;
    public javax.swing.JCheckBox cbxInteracao;
    public javax.swing.JCheckBox cbxInterdependencia;
    public javax.swing.JCheckBox cbxNegacaoService;
    public javax.swing.JCheckBox cbxPrecoce;
    public javax.swing.JCheckBox cbxSobrecargaTempo;
    public javax.swing.JCheckBox cbxSoftware;
    public javax.swing.JCheckBox cbxTardia;
    public javax.swing.JCheckBox cbxTempoResposta;
    public javax.swing.JCheckBox cbxTransiente;
    public javax.swing.JCheckBox cbxValores;
    public javax.swing.JCheckBox ckbOmissao;
    public javax.swing.JButton jButtonSelecionarFalhas;
    private javax.swing.JLabel jLabel22;
    // End of variables declaration//GEN-END:variables

    private void setVisible(JCheckBox chbOmissaoHardware) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void FIHardware() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class buttonGroup1 {

        public buttonGroup1() {
        }

        private void add(JCheckBox chbOmissaoHardware) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    //Create by Netbeans
    public static class chbOmissaoHardware {

        public chbOmissaoHardware() {
        }
    }
}