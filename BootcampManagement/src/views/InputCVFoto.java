/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.*;
import java.awt.Image;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import models.*;
import tools.*;

/**
 *
 * @author FES
 */
public class InputCVFoto extends javax.swing.JInternalFrame {
    
    private DBConnection connection = new DBConnection();
//    private SessionFactory factory = HibernateUtil.getSessionFactory();
//    private UploadControllerInterface c = new UploadController(factory);
    private UploadDBController cc = new UploadDBController(connection.getConnection());

//    private List<Upload> list = new ArrayList<>();
//    private List<UploadDB> listUp;
    private InputCVFileChooser fc = new InputCVFileChooser();
//    private Blob blobPhoto;
//    private Serializable serializable;
    
    /**
     * Creates new form InputCVFoto
     */
    public InputCVFoto() {
        initComponents();
        setDefaultCondition();
    }

    private void setDefaultCondition() {
        setImagetoLabel();
    }
    
    public void uploadToDB(File file) throws FileNotFoundException{
        List<UploadDB> list=cc.seachBy(Session.getSession());
        if (list.isEmpty()) {
            cc.upload(Session.getSession(), fc.getSelectedFile());
            JOptionPane.showMessageDialog(null, "Upload sukses");
        }
        else {
            cc.replace(Session.getSession(), fc.getSelectedFile());
            JOptionPane.showMessageDialog(null, "Upload ganti gambar sukses");
        }
        setImagetoLabel();
    }
    public void setImagetoLabel(){
        
        List<UploadDB> list=cc.seachBy(Session.getSession());
        try {
            if (!list.isEmpty()) {
//                pn2.remove(lblImage);
//                pn2.add(lblImage);
                lblImage.setText("");
                Image image = ImageIO.read(list.get(0).getPhoto());
                image=image.getScaledInstance(200, 300,  java.awt.Image.SCALE_SMOOTH);
                lblImage.setIcon(new ImageIcon(image));
                lblImage.repaint();
                lblImage.revalidate();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
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

        pn = new javax.swing.JPanel();
        pnMTop3 = new javax.swing.JPanel();
        lblTitle3 = new javax.swing.JLabel();
        pnMTRCenter = new javax.swing.JPanel();
        pn2 = new javax.swing.JPanel();
        lblImage = new javax.swing.JLabel();
        btUpload = new javax.swing.JButton();
        pnMTBottom = new javax.swing.JPanel();
        pnMTRight = new javax.swing.JPanel();
        pnMTLeft = new javax.swing.JPanel();

        setClosable(true);
        setTitle("Upload Image");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(700, 500));

        pn.setBackground(new java.awt.Color(204, 255, 255));
        pn.setPreferredSize(new java.awt.Dimension(700, 500));
        pn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnMTop3.setBackground(new java.awt.Color(204, 255, 255));
        pnMTop3.setPreferredSize(new java.awt.Dimension(700, 50));

        lblTitle3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitle3.setText("Upload Image");
        pnMTop3.add(lblTitle3);

        pn.add(pnMTop3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, -1, -1));

        pnMTRCenter.setBackground(new java.awt.Color(204, 255, 255));
        pnMTRCenter.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnMTRCenter.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pn2.setPreferredSize(new java.awt.Dimension(300, 200));

        lblImage.setText("Image");
        pn2.add(lblImage);

        pnMTRCenter.add(pn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 240, 290));

        btUpload.setText("Upload");
        btUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUploadActionPerformed(evt);
            }
        });
        pnMTRCenter.add(btUpload, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 320, -1, 40));

        pn.add(pnMTRCenter, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 66, 650, 407));

        pnMTBottom.setBackground(new java.awt.Color(204, 255, 255));
        pnMTBottom.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 25, 5));
        pn.add(pnMTBottom, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 478, 700, -1));

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
            .addGap(0, 407, Short.MAX_VALUE)
        );

        pn.add(pnMTRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 66, -1, 407));

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
            .addGap(0, 407, Short.MAX_VALUE)
        );

        pn.add(pnMTLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 66, -1, 407));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUploadActionPerformed
        
        fc.setVisible(true);
        this.revalidate();
    }//GEN-LAST:event_btUploadActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btUpload;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblTitle3;
    private javax.swing.JPanel pn;
    private javax.swing.JPanel pn2;
    private javax.swing.JPanel pnMTBottom;
    private javax.swing.JPanel pnMTLeft;
    private javax.swing.JPanel pnMTRCenter;
    private javax.swing.JPanel pnMTRight;
    private javax.swing.JPanel pnMTop3;
    // End of variables declaration//GEN-END:variables
}
