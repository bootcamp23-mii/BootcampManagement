/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.*;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import models.Achievement;
import org.hibernate.SessionFactory;
import tools.*;

/**
 *
 * @author FES
 */
public class InputCVAchievementView extends javax.swing.JInternalFrame {

    private SessionFactory factory = HibernateUtil.getSessionFactory();
    private AchievementControllerInterface c = new AchievementController(factory);
    
    private DefaultTableModel tableModel;
    /**
     * Creates new form InputCVAchievementView
     */
    public InputCVAchievementView() {
        initComponents();
        setDefaultCondition();
    }

    private void setDefaultCondition(){
        showAllTable(c.searchWD(Session.getSession()));
    }

    private void showAllTable(List<Achievement> dataList){
        Object[] columnNames = {"Nomor","Achievement"};
        Object[][] data = new Object[dataList.size()][columnNames.length];
        for (int i = 0; i < data.length; i++) {
            try {
                data[i][0] = (i + 1);
                data[i][1] = dataList.get(i).getName();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        tableModel = new DefaultTableModel(data, columnNames);
        tbAchievement.setModel(tableModel);
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
        pnMTRC1 = new javax.swing.JPanel();
        lblAchievement = new javax.swing.JLabel();
        tfAchievement = new javax.swing.JTextField();
        pnMTRC2 = new javax.swing.JPanel();
        btSave = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btClear = new javax.swing.JButton();
        pnMTRC3 = new javax.swing.JPanel();
        spcAchievement = new javax.swing.JScrollPane();
        tbAchievement = new javax.swing.JTable();
        pnMTBottom = new javax.swing.JPanel();
        btOke = new javax.swing.JButton();
        pnMTRight = new javax.swing.JPanel();
        pnMTLeft = new javax.swing.JPanel();

        setBorder(null);
        setPreferredSize(new java.awt.Dimension(700, 500));

        pnMain.setBackground(new java.awt.Color(204, 255, 255));
        pnMain.setPreferredSize(new java.awt.Dimension(700, 500));
        pnMain.setLayout(new java.awt.BorderLayout(5, 5));

        pnMTop.setBackground(new java.awt.Color(204, 255, 255));
        pnMTop.setPreferredSize(new java.awt.Dimension(700, 50));

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitle.setText("Achievement");

        javax.swing.GroupLayout pnMTopLayout = new javax.swing.GroupLayout(pnMTop);
        pnMTop.setLayout(pnMTopLayout);
        pnMTopLayout.setHorizontalGroup(
            pnMTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
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

        pnMTRC1.setBackground(new java.awt.Color(204, 255, 255));
        pnMTRC1.setPreferredSize(new java.awt.Dimension(640, 38));
        pnMTRC1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblAchievement.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblAchievement.setText("Achievement: ");
        pnMTRC1.add(lblAchievement);

        tfAchievement.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfAchievement.setPreferredSize(new java.awt.Dimension(400, 23));
        pnMTRC1.add(tfAchievement);

        pnMTRCenter.add(pnMTRC1);

        pnMTRC2.setBackground(new java.awt.Color(204, 255, 255));
        pnMTRC2.setPreferredSize(new java.awt.Dimension(640, 38));
        pnMTRC2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        btSave.setText("Save");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });
        pnMTRC2.add(btSave);

        btDelete.setText("Delete");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });
        pnMTRC2.add(btDelete);

        btClear.setText("Clear");
        btClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearActionPerformed(evt);
            }
        });
        pnMTRC2.add(btClear);

        pnMTRCenter.add(pnMTRC2);

        pnMTRC3.setBackground(new java.awt.Color(204, 255, 255));
        pnMTRC3.setPreferredSize(new java.awt.Dimension(640, 280));

        spcAchievement.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        spcAchievement.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        spcAchievement.setPreferredSize(new java.awt.Dimension(640, 280));

        tbAchievement.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbAchievement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAchievementMouseClicked(evt);
            }
        });
        spcAchievement.setViewportView(tbAchievement);

        pnMTRC3.add(spcAchievement);

        pnMTRCenter.add(pnMTRC3);

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
            .addGap(0, 380, Short.MAX_VALUE)
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
            .addGap(0, 380, Short.MAX_VALUE)
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
            .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btOkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkeActionPerformed
        dispose();
    }//GEN-LAST:event_btOkeActionPerformed

    private void tbAchievementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbAchievementMouseClicked
        tfAchievement.setText(tbAchievement.getValueAt(tbAchievement.getSelectedRow(), 1).toString());
    }//GEN-LAST:event_tbAchievementMouseClicked

    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearActionPerformed
        tfAchievement.setText("");
    }//GEN-LAST:event_btClearActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        c.deleteSoft("", tfAchievement.getText(), Session.getSession());
        setDefaultCondition();
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        c.save("", tfAchievement.getText(), Session.getSession());
        setDefaultCondition();
    }//GEN-LAST:event_btSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btClear;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btOke;
    private javax.swing.JButton btSave;
    private javax.swing.JLabel lblAchievement;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnMTBottom;
    private javax.swing.JPanel pnMTLeft;
    private javax.swing.JPanel pnMTRC1;
    private javax.swing.JPanel pnMTRC2;
    private javax.swing.JPanel pnMTRC3;
    private javax.swing.JPanel pnMTRCenter;
    private javax.swing.JPanel pnMTRight;
    private javax.swing.JPanel pnMTop;
    private javax.swing.JPanel pnMain;
    private javax.swing.JScrollPane spcAchievement;
    private javax.swing.JTable tbAchievement;
    private javax.swing.JTextField tfAchievement;
    // End of variables declaration//GEN-END:variables
}
