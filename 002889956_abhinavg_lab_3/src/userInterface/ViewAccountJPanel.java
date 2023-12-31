/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface;

import business.Account;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class ViewAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewAccountJPanel
     */
    private JPanel userProcessContainer;
    private Account account;
    public ViewAccountJPanel(JPanel userProcessContainer, Account account) {
        initComponents();
        this.account = account;
        this.userProcessContainer = userProcessContainer;
        populateAccountDetails();
    }
private void populateAccountDetails() {
    txt_AccountNumber.setText(account.getAccountNumber());
    txt_RoutingNumber.setText(account.getRoutingNumber());
    txt_BankName.setText(account.getBankName());
    btn_Save.setEnabled(false);
    btn_Update.setEnabled(true);
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_RoutingNumber = new javax.swing.JTextField();
        txt_AccountNumber = new javax.swing.JTextField();
        txt_BankName = new javax.swing.JTextField();
        btn_Save = new javax.swing.JButton();
        btn_Update = new javax.swing.JButton();

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setText("Routing Number:");

        jLabel2.setText("Account Information");

        jLabel3.setText("Account Number:");

        jLabel5.setText("Bank Name:");

        txt_RoutingNumber.setEnabled(false);
        txt_RoutingNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_RoutingNumberActionPerformed(evt);
            }
        });

        txt_AccountNumber.setEnabled(false);
        txt_AccountNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_AccountNumberActionPerformed(evt);
            }
        });

        txt_BankName.setEnabled(false);
        txt_BankName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_BankNameActionPerformed(evt);
            }
        });

        btn_Save.setText("Save");
        btn_Save.setEnabled(false);
        btn_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SaveActionPerformed(evt);
            }
        });

        btn_Update.setText("Update");
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(btnBack)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(214, 214, 214)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_AccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(328, 328, 328)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_BankName, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(txt_RoutingNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(348, 348, 348)
                        .addComponent(btn_Save)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Update)))
                .addContainerGap(547, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(jLabel2))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_RoutingNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_AccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_BankName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Save)
                    .addComponent(btn_Update))
                .addContainerGap(310, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txt_RoutingNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_RoutingNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_RoutingNumberActionPerformed

    private void txt_AccountNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_AccountNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_AccountNumberActionPerformed

    private void txt_BankNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_BankNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_BankNameActionPerformed

    private void btn_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SaveActionPerformed
            if(txt_AccountNumber.getText().isBlank() || txt_BankName.getText().isBlank() || 
                    txt_RoutingNumber.getText().isBlank()) 
            {
                JOptionPane.showMessageDialog(this, "Please fill all the panels");
            }
            else{
                account.setAccountNumber(txt_AccountNumber.getText());
                account.setBankName(txt_BankName.getText());
                account.setRoutingNumber(txt_RoutingNumber.getText());
                btn_Save.setEnabled(false);
                btn_Update.setEnabled(true);
                JOptionPane.showMessageDialog(this, "Account Updated");
                  txt_AccountNumber.setEnabled(false);
        txt_BankName.setEnabled(false);
        txt_RoutingNumber.setEnabled(false);
            }
        
// TODO add your handling code here:
    }//GEN-LAST:event_btn_SaveActionPerformed

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        txt_AccountNumber.setEnabled(true);
        txt_BankName.setEnabled(true);
        txt_RoutingNumber.setEnabled(true);
        btn_Save.setEnabled(true);
        btn_Update.setEnabled(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_UpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btn_Save;
    private javax.swing.JButton btn_Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txt_AccountNumber;
    private javax.swing.JTextField txt_BankName;
    private javax.swing.JTextField txt_RoutingNumber;
    // End of variables declaration//GEN-END:variables

    
}
