/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.BatchClassController;
import controllers.ParticipantController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import models.BatchClass;
import models.Participant;
import org.hibernate.SessionFactory;
import tools.HibernateUtil;

/**
 *
 * @author gerydanu
 */
public class ParticipantView extends javax.swing.JInternalFrame {
    private SessionFactory factory = HibernateUtil.getSessionFactory();
    private BatchClassController bcc = new BatchClassController(factory);
    private ParticipantController ptc = new ParticipantController(factory);
    DefaultTableModel myTableModel = new DefaultTableModel();
    private List<models.BatchClass> batchClassList = new ArrayList<>();
    private List<models.Participant> participantList = new ArrayList<>();
    
    
    /**
     * Creates new form AspectView
     */
    public ParticipantView() {
        initComponents();
        showBatchClass();
        tableParticipant(ptc.getAll());
    }
    
    private void showBatchClass() {
        for (BatchClass batchClass : bcc.getAll()) {
            cbBatchClass.addItem(batchClass.getBatch().getName()+" "+batchClass.getClasses().getName());
        }
    }
    
    private void tableParticipant(List<models.Participant> participant) {
        Object[] columnNames = {"No.", "ID", "Grade", "Batch Class"};
        Object[][] data = new Object[participant.size()][columnNames.length];
        for (int i = 0; i < data.length; i++) {
            data[i][0] = (i + 1);
            data[i][1] = participant.get(i).getId();
            data[i][2] = participant.get(i).getGrade();
            data[i][3] = (participant.get(i).getBatchclass().getBatch().getName())+" "+(participant.get(i).getBatchclass().getClasses().getName());
        }
        myTableModel = new DefaultTableModel(data, columnNames);
        tbParticipant.setModel(myTableModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnCenter = new javax.swing.JPanel();
        pnParticipant = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        lblGrade = new javax.swing.JLabel();
        tfGrade = new javax.swing.JTextField();
        lblBatchClass = new javax.swing.JLabel();
        cbBatchClass = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        tfSearch = new javax.swing.JTextField();
        btInsert = new javax.swing.JButton();
        btSearch = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        chbGetById = new javax.swing.JCheckBox();
        pnTable = new javax.swing.JPanel();
        scpParticipant = new javax.swing.JScrollPane();
        tbParticipant = new javax.swing.JTable();

        setClosable(true);
        setTitle("Participant");

        pnParticipant.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblID.setText("ID");
        pnParticipant.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 2, 80, 30));
        pnParticipant.add(tfID, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 2, 240, 30));

        lblGrade.setText("Grade");
        pnParticipant.add(lblGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 37, 80, 30));
        pnParticipant.add(tfGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 37, 240, 30));

        lblBatchClass.setText("Batch Class");
        pnParticipant.add(lblBatchClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 72, 80, 30));

        cbBatchClass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbBatchClassMouseClicked(evt);
            }
        });
        cbBatchClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBatchClassActionPerformed(evt);
            }
        });
        pnParticipant.add(cbBatchClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 72, 240, 30));
        pnParticipant.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 107, 215, 30));
        pnParticipant.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 107, 215, 30));
        pnParticipant.add(tfSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 142, 290, 30));

        btInsert.setText("Insert");
        btInsert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btInsertMouseClicked(evt);
            }
        });
        btInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInsertActionPerformed(evt);
            }
        });
        pnParticipant.add(btInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 142, 130, 30));

        btSearch.setText("Search");
        pnParticipant.add(btSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 177, 190, 30));

        btDelete.setText("Delete");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });
        pnParticipant.add(btDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(305, 177, 130, 30));

        chbGetById.setText("Get by ID");
        chbGetById.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbGetByIdActionPerformed(evt);
            }
        });
        pnParticipant.add(chbGetById, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 80, 30));

        pnCenter.add(pnParticipant);

        tbParticipant.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "No.", "ID", "Grade", "Batch Class"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbParticipant.getTableHeader().setReorderingAllowed(false);
        tbParticipant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbParticipantMouseClicked(evt);
            }
        });
        scpParticipant.setViewportView(tbParticipant);
        if (tbParticipant.getColumnModel().getColumnCount() > 0) {
            tbParticipant.getColumnModel().getColumn(0).setPreferredWidth(2);
            tbParticipant.getColumnModel().getColumn(1).setPreferredWidth(3);
            tbParticipant.getColumnModel().getColumn(2).setPreferredWidth(5);
        }

        javax.swing.GroupLayout pnTableLayout = new javax.swing.GroupLayout(pnTable);
        pnTable.setLayout(pnTableLayout);
        pnTableLayout.setHorizontalGroup(
            pnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTableLayout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addComponent(scpParticipant, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );
        pnTableLayout.setVerticalGroup(
            pnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scpParticipant, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        pnCenter.add(pnTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnCenter, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnCenter, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbBatchClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBatchClassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbBatchClassActionPerformed

    private void tbParticipantMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbParticipantMouseClicked
        tfID.setText(tbParticipant.getValueAt(tbParticipant.getSelectedRow(), 1).toString());
        tfGrade.setText(tbParticipant.getValueAt(tbParticipant.getSelectedRow(), 2).toString());
        for (int i = 0; i < cbBatchClass.getItemCount(); i++) {
            if (cbBatchClass.getItemAt(i).equals(tbParticipant.getValueAt(tbParticipant.getSelectedRow(), 3).toString()))
                cbBatchClass.setSelectedIndex(i);
        }

        tfID.setEnabled(false);
    }//GEN-LAST:event_tbParticipantMouseClicked

    private void btInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInsertActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btInsertActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btDeleteActionPerformed

    private void chbGetByIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbGetByIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbGetByIdActionPerformed

    private void cbBatchClassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbBatchClassMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbBatchClassMouseClicked

    private void btInsertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btInsertMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btInsertMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btInsert;
    private javax.swing.JButton btSearch;
    private javax.swing.JComboBox<String> cbBatchClass;
    private javax.swing.JCheckBox chbGetById;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblBatchClass;
    private javax.swing.JLabel lblGrade;
    private javax.swing.JLabel lblID;
    private javax.swing.JPanel pnCenter;
    private javax.swing.JPanel pnParticipant;
    private javax.swing.JPanel pnTable;
    private javax.swing.JScrollPane scpParticipant;
    private javax.swing.JTable tbParticipant;
    private javax.swing.JTextField tfGrade;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables
}
