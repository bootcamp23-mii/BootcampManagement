/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author FES
 */
public class InputCVOrganizationView extends javax.swing.JInternalFrame {

    /**
     * Creates new form InputCVOrganizationView
     */
    public InputCVOrganizationView() {
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

        pnMain = new javax.swing.JPanel();
        pnMTop = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        pnMTRCenter = new javax.swing.JPanel();
        pnMTBottom = new javax.swing.JPanel();
        btOke = new javax.swing.JButton();
        pnMTRight = new javax.swing.JPanel();
        pnMTLeft = new javax.swing.JPanel();

        setBorder(null);

        pnMain.setBackground(new java.awt.Color(204, 255, 255));
        pnMain.setPreferredSize(new java.awt.Dimension(700, 500));
        pnMain.setLayout(new java.awt.BorderLayout(5, 5));

        pnMTop.setBackground(new java.awt.Color(204, 255, 255));
        pnMTop.setPreferredSize(new java.awt.Dimension(700, 50));

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitle.setText("Organization");

        javax.swing.GroupLayout pnMTopLayout = new javax.swing.GroupLayout(pnMTop);
        pnMTop.setLayout(pnMTopLayout);
        pnMTopLayout.setHorizontalGroup(
            pnMTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 716, Short.MAX_VALUE)
            .addGroup(pnMTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnMTopLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblTitle)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        pnMTopLayout.setVerticalGroup(
            pnMTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
            .addGroup(pnMTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnMTopLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(lblTitle)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pnMain.add(pnMTop, java.awt.BorderLayout.PAGE_START);

        pnMTRCenter.setBackground(new java.awt.Color(204, 255, 255));
        pnMTRCenter.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout pnMTRCenterLayout = new javax.swing.GroupLayout(pnMTRCenter);
        pnMTRCenter.setLayout(pnMTRCenterLayout);
        pnMTRCenterLayout.setHorizontalGroup(
            pnMTRCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 662, Short.MAX_VALUE)
        );
        pnMTRCenterLayout.setVerticalGroup(
            pnMTRCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );

        pnMain.add(pnMTRCenter, java.awt.BorderLayout.CENTER);

        pnMTBottom.setBackground(new java.awt.Color(204, 255, 255));
        pnMTBottom.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 25, 5));

        btOke.setText("Oke");
        btOke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOkeActionPerformed(evt);
            }
        });
        pnMTBottom.add(btOke);

        pnMain.add(pnMTBottom, java.awt.BorderLayout.PAGE_END);

        pnMTRight.setBackground(new java.awt.Color(204, 255, 255));
        pnMTRight.setPreferredSize(new java.awt.Dimension(20, 390));

        javax.swing.GroupLayout pnMTRightLayout = new javax.swing.GroupLayout(pnMTRight);
        pnMTRight.setLayout(pnMTRightLayout);
        pnMTRightLayout.setHorizontalGroup(
            pnMTRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        pnMTRightLayout.setVerticalGroup(
            pnMTRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        pnMain.add(pnMTRight, java.awt.BorderLayout.LINE_END);

        pnMTLeft.setBackground(new java.awt.Color(204, 255, 255));
        pnMTLeft.setPreferredSize(new java.awt.Dimension(20, 390));

        javax.swing.GroupLayout pnMTLeftLayout = new javax.swing.GroupLayout(pnMTLeft);
        pnMTLeft.setLayout(pnMTLeftLayout);
        pnMTLeftLayout.setHorizontalGroup(
            pnMTLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        pnMTLeftLayout.setVerticalGroup(
            pnMTLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        pnMain.add(pnMTLeft, java.awt.BorderLayout.LINE_START);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btOkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btOkeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btOke;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnMTBottom;
    private javax.swing.JPanel pnMTLeft;
    private javax.swing.JPanel pnMTRCenter;
    private javax.swing.JPanel pnMTRight;
    private javax.swing.JPanel pnMTop;
    private javax.swing.JPanel pnMain;
    // End of variables declaration//GEN-END:variables
}
