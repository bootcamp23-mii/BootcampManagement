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
public class IpnutCVView extends javax.swing.JInternalFrame {

    /**
     * Creates new form IpnutCVView
     */
    public IpnutCVView() {
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

        pnInputMain = new javax.swing.JPanel();
        pn1Top = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pn1Center = new javax.swing.JPanel();
        pn1Bottom = new javax.swing.JPanel();

        pnInputMain.setLayout(new java.awt.BorderLayout());

        pn1Top.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("jLabel1");
        pn1Top.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        pnInputMain.add(pn1Top, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout pn1CenterLayout = new javax.swing.GroupLayout(pn1Center);
        pn1Center.setLayout(pn1CenterLayout);
        pn1CenterLayout.setHorizontalGroup(
            pn1CenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 849, Short.MAX_VALUE)
        );
        pn1CenterLayout.setVerticalGroup(
            pn1CenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        pnInputMain.add(pn1Center, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout pn1BottomLayout = new javax.swing.GroupLayout(pn1Bottom);
        pn1Bottom.setLayout(pn1BottomLayout);
        pn1BottomLayout.setHorizontalGroup(
            pn1BottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 849, Short.MAX_VALUE)
        );
        pn1BottomLayout.setVerticalGroup(
            pn1BottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 82, Short.MAX_VALUE)
        );

        pnInputMain.add(pn1Bottom, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnInputMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnInputMain, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pn1Bottom;
    private javax.swing.JPanel pn1Center;
    private javax.swing.JPanel pn1Top;
    private javax.swing.JPanel pnInputMain;
    // End of variables declaration//GEN-END:variables
}