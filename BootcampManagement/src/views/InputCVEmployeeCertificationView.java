/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import models.Certificate;
import models.EmployeeCertification;
import org.hibernate.SessionFactory;
import tools.*;

/**
 *
 * @author FES
 */
public class InputCVEmployeeCertificationView extends javax.swing.JInternalFrame {

    private SessionFactory factory = HibernateUtil.getSessionFactory();
    private EmployeeCertificationControllerInterface c = new EmployeeCertificationController(factory);
    private CertificateControllerInterface cc = new CertificateController(factory);
    
    private DefaultTableModel tableModel;
    private SimpleDateFormat dateFormatOut = new SimpleDateFormat("dd-MM-yyyy");
    private List<models.Certificate> certificateList = new ArrayList<>();
    /**
     * Creates new form InputCVEmployeeCertificateView
     */
    public InputCVEmployeeCertificationView() {
        initComponents();
        setDefaultCondition();
    }

    private void setDefaultCondition(){
        showAllTable(c.search(Session.getSession()));
        dcEmployeeCertification.setDateFormat(dateFormatOut);
        tfCertificateDate.setEnabled(false);
        getRoleList();
        setComboBox();
    }

    private void showAllTable(List<EmployeeCertification> ec){
        Object[] columnNames = {"Nomor", "Certificate", "Date", "Certificate Number"};
        Object[][] data = new Object[ec.size()][columnNames.length];
        for (int i = 0; i < data.length; i++) {
            try {
                data[i][0] = (i + 1);
                data[i][1] = ec.get(i).getCertificate().getName();
                data[i][2] = dateFormatOut.format(ec.get(i).getCertificatedate());
                data[i][3] = ec.get(i).getCertificatenumber();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        tableModel = new DefaultTableModel(data, columnNames);
        tbEmpCertification.setModel(tableModel);
    }
    
    private void getRoleList(){
        for (Certificate data : cc.getAll()) {
            certificateList.add(data);
        }
    }
    
    private void setComboBox(){
        for (Certificate data : certificateList) {
            cbEmpCertification.addItem(data.getId()+" - "+data.getName());
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

        pnMain = new javax.swing.JPanel();
        pnMTop = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        pnMTRCenter = new javax.swing.JPanel();
        pnMTRC1 = new javax.swing.JPanel();
        lblEmpCertification = new javax.swing.JLabel();
        cbEmpCertification = new javax.swing.JComboBox<>();
        pnMTRC2 = new javax.swing.JPanel();
        lblEmpCertification2 = new javax.swing.JLabel();
        lblEmpCertification3 = new javax.swing.JLabel();
        dcEmployeeCertification = new datechooser.beans.DateChooserCombo();
        tfCertificateDate = new javax.swing.JTextField();
        tfCertificateNumber = new javax.swing.JTextField();
        pnMTRC3 = new javax.swing.JPanel();
        btSave = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        pnMTRC4 = new javax.swing.JPanel();
        scpEmpCertification = new javax.swing.JScrollPane();
        tbEmpCertification = new javax.swing.JTable();
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
        lblTitle.setText("Employee Certification");

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
        pnMTRC1.setPreferredSize(new java.awt.Dimension(630, 35));
        pnMTRC1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING));

        lblEmpCertification.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEmpCertification.setText("Certification: ");
        lblEmpCertification.setInheritsPopupMenu(false);
        pnMTRC1.add(lblEmpCertification);

        cbEmpCertification.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbEmpCertification.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        cbEmpCertification.setMinimumSize(new java.awt.Dimension(100, 25));
        cbEmpCertification.setPreferredSize(new java.awt.Dimension(350, 25));
        pnMTRC1.add(cbEmpCertification);

        pnMTRCenter.add(pnMTRC1);

        pnMTRC2.setBackground(new java.awt.Color(204, 255, 255));
        pnMTRC2.setPreferredSize(new java.awt.Dimension(630, 35));
        pnMTRC2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEmpCertification2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEmpCertification2.setText("Number: ");
        pnMTRC2.add(lblEmpCertification2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblEmpCertification3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEmpCertification3.setText("  Date: ");
        pnMTRC2.add(lblEmpCertification3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        dcEmployeeCertification.addCommitListener(new datechooser.events.CommitListener() {
            public void onCommit(datechooser.events.CommitEvent evt) {
                dcEmployeeCertificationOnCommit(evt);
            }
        });
        pnMTRC2.add(dcEmployeeCertification, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 30, -1));

        tfCertificateDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfCertificateDate.setMinimumSize(new java.awt.Dimension(6, 25));
        tfCertificateDate.setPreferredSize(new java.awt.Dimension(150, 25));
        tfCertificateDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCertificateDateActionPerformed(evt);
            }
        });
        pnMTRC2.add(tfCertificateDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        tfCertificateNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfCertificateNumber.setMinimumSize(new java.awt.Dimension(6, 25));
        tfCertificateNumber.setPreferredSize(new java.awt.Dimension(150, 25));
        tfCertificateNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCertificateNumberActionPerformed(evt);
            }
        });
        pnMTRC2.add(tfCertificateNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        pnMTRCenter.add(pnMTRC2);

        pnMTRC3.setBackground(new java.awt.Color(204, 255, 255));
        pnMTRC3.setPreferredSize(new java.awt.Dimension(640, 38));
        pnMTRC3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        btSave.setText("Save");
        pnMTRC3.add(btSave);

        btDelete.setText("Delete");
        pnMTRC3.add(btDelete);

        pnMTRCenter.add(pnMTRC3);

        pnMTRC4.setBackground(new java.awt.Color(204, 255, 255));
        pnMTRC4.setPreferredSize(new java.awt.Dimension(640, 250));

        scpEmpCertification.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scpEmpCertification.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        tbEmpCertification.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbEmpCertification.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbEmpCertificationMouseClicked(evt);
            }
        });
        scpEmpCertification.setViewportView(tbEmpCertification);

        javax.swing.GroupLayout pnMTRC4Layout = new javax.swing.GroupLayout(pnMTRC4);
        pnMTRC4.setLayout(pnMTRC4Layout);
        pnMTRC4Layout.setHorizontalGroup(
            pnMTRC4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scpEmpCertification, javax.swing.GroupLayout.DEFAULT_SIZE, 640, Short.MAX_VALUE)
        );
        pnMTRC4Layout.setVerticalGroup(
            pnMTRC4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMTRC4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(scpEmpCertification, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnMTRCenter.add(pnMTRC4);

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
            .addGap(0, 417, Short.MAX_VALUE)
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
            .addGap(0, 417, Short.MAX_VALUE)
        );

        pnMain.add(pnMTLeft, java.awt.BorderLayout.LINE_START);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void tfCertificateDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCertificateDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCertificateDateActionPerformed

    private void tfCertificateNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCertificateNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCertificateNumberActionPerformed

    private void dcEmployeeCertificationOnCommit(datechooser.events.CommitEvent evt) {//GEN-FIRST:event_dcEmployeeCertificationOnCommit
        tfCertificateDate.setText(dcEmployeeCertification.getText());
    }//GEN-LAST:event_dcEmployeeCertificationOnCommit

    private void tbEmpCertificationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbEmpCertificationMouseClicked
        String temp="";
        for (Certificate data : certificateList) {
            if (data.getName().equals(tbEmpCertification.getValueAt(tbEmpCertification.getSelectedRow(), 1).toString()))temp=data.getId();
        }
        for (int i = 0; i < cbEmpCertification.getItemCount(); i++) {
            if (cbEmpCertification.getItemAt(i).split(" - ")[0].equals(temp))
            cbEmpCertification.setSelectedIndex(i);
        }
        tfCertificateDate.setText(tbEmpCertification.getValueAt(tbEmpCertification.getSelectedRow(), 2).toString());
        tfCertificateNumber.setText(tbEmpCertification.getValueAt(tbEmpCertification.getSelectedRow(), 3).toString());
    }//GEN-LAST:event_tbEmpCertificationMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btOke;
    private javax.swing.JButton btSave;
    private javax.swing.JComboBox<String> cbEmpCertification;
    private datechooser.beans.DateChooserCombo dcEmployeeCertification;
    private javax.swing.JLabel lblEmpCertification;
    private javax.swing.JLabel lblEmpCertification2;
    private javax.swing.JLabel lblEmpCertification3;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnMTBottom;
    private javax.swing.JPanel pnMTLeft;
    private javax.swing.JPanel pnMTRC1;
    private javax.swing.JPanel pnMTRC2;
    private javax.swing.JPanel pnMTRC3;
    private javax.swing.JPanel pnMTRC4;
    private javax.swing.JPanel pnMTRCenter;
    private javax.swing.JPanel pnMTRight;
    private javax.swing.JPanel pnMTop;
    private javax.swing.JPanel pnMain;
    private javax.swing.JScrollPane scpEmpCertification;
    private javax.swing.JTable tbEmpCertification;
    private javax.swing.JTextField tfCertificateDate;
    private javax.swing.JTextField tfCertificateNumber;
    // End of variables declaration//GEN-END:variables
}
