/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
 * WorkAreaJPanel.java
 *
 * Created on May 17, 2020, 8:35:29 AM
 */
package UserInterface.Main.WorkSpaceProfiles;

import TheBusiness.Business.Business;
import TheBusiness.CustomerManagement.CustomerDirectory;
import TheBusiness.CustomerManagement.CustomerProfile;
import TheBusiness.MarketModel.Channel;
import TheBusiness.MarketModel.Market;
import TheBusiness.Personnel.Person;
import TheBusiness.SalesManagement.SalesPersonProfile;
import UserInterface.Main.PricingMainFrame;
import UserInterface.Main.WorkSpaceProfiles.OrderManagement.ManageSalesPersonOrders;
import UserInterface.Main.WorkSpaceProfiles.OrderManagement.ProcessOrder;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kal
 */
public class SalesPersonWorkAreaJPanel extends javax.swing.JPanel {

    javax.swing.JPanel CardSequencePanel;
    Business business;
    SalesPersonProfile salesperson;

    /**
     * Creates new form UnitRiskWorkArea
     * @param b
     * @param spp
     * @param clp
     */

    public SalesPersonWorkAreaJPanel(Business b, SalesPersonProfile spp, JPanel clp) {

        business = b;
        this.CardSequencePanel = clp;
        salesperson = spp;
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
        jButton10 = new javax.swing.JButton();
        customerNameTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(51, 51, 51));

        jButton4.setBackground(new java.awt.Color(102, 153, 255));
        jButton4.setFont(getFont());
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Serve Customers");
        jButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.setMaximumSize(new java.awt.Dimension(200, 40));
        jButton4.setMinimumSize(new java.awt.Dimension(20, 23));
        jButton4.setPreferredSize(new java.awt.Dimension(240, 30));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4IdentifyResourceAssetsActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(102, 153, 255));
        jButton10.setFont(getFont());
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("Review Order Status History");
        jButton10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton10.setMaximumSize(new java.awt.Dimension(200, 40));
        jButton10.setMinimumSize(new java.awt.Dimension(20, 20));
        jButton10.setPreferredSize(new java.awt.Dimension(240, 25));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        customerNameTextField.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Customer");

        btnLogout.setBackground(new java.awt.Color(255, 255, 255));
        btnLogout.setForeground(new java.awt.Color(0, 0, 0));
        btnLogout.setText("Log Out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customerNameTextField)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                .addGap(75, 75, 75)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(460, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnLogout))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton10, jButton4});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnLogout)
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(customerNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(441, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton10, jButton4});

    }// </editor-fold>//GEN-END:initComponents

    private void jButton4IdentifyResourceAssetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4IdentifyResourceAssetsActionPerformed
        
// TODO add your handling code here:

 
        String customername = customerNameTextField.getText();
        if (customername.isEmpty()) return;
        CustomerProfile selectedcustomer = business.getCustomerDirectory().findCustomer(customername);

        if(selectedcustomer == null) {
            JOptionPane.showMessageDialog(this, "Customer doesn't exist. Create new customer.");
            CustomerDirectory cd = business.getCustomerDirectory();
            Person p = new Person(customername);
            String c = JOptionPane.showInputDialog(this, "Enter Channel:", "New customer", JOptionPane.INFORMATION_MESSAGE);
            String m = JOptionPane.showInputDialog(this, "Enter Market:", "New customer", JOptionPane.INFORMATION_MESSAGE);
            
            Channel channel = business.getChannelCatalog().findChannel(c);
            Market market = business.getMarketCatalog().findMarket(m);
            
            cd.newCustomerProfile(p, channel, market);
            return;
        }
        
        ProcessOrder aos = new ProcessOrder(business, selectedcustomer ,salesperson, CardSequencePanel);

        CardSequencePanel.add("ManageVulns", aos);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

    }//GEN-LAST:event_jButton4IdentifyResourceAssetsActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:

        ManageSalesPersonOrders iet = new ManageSalesPersonOrders(business, CardSequencePanel, salesperson);

        CardSequencePanel.add("FindResourceAsset", iet);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

    }//GEN-LAST:event_jButton10ActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        CardSequencePanel.remove(this);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).previous(CardSequencePanel);
    }//GEN-LAST:event_btnLogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JTextField customerNameTextField;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
