/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.BatchClassController;
import controllers.BatchController;
import controllers.ClassesController;
import controllers.RoomController;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import models.Employee;
import models.Batch;
import models.BatchClass;
import models.Classes;
import models.Room;
import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;
import tools.HibernateUtil;

/**
 *
 * @author gerydanu
 */
public class BatchClassView extends javax.swing.JInternalFrame {
    private SessionFactory factory = HibernateUtil.getSessionFactory();
    private BatchClassController bcc = new BatchClassController(factory);
    private BatchController bc = new BatchController(factory);
    private ClassesController csc = new ClassesController(factory);
    private RoomController rc = new RoomController(factory);
    DefaultTableModel myTableModel = new DefaultTableModel();
    private List<models.Employee> trainerList = new ArrayList<>();
    private List<models.BatchClass> batchClassList= new ArrayList<>();
    private List<models.Batch> batchList= new ArrayList<>();
    private List<models.Classes> classTypeList= new ArrayList<>();
    private List<models.Room> roomList= new ArrayList<>();

    /**
     * Creates new form AspectView
     */
    public BatchClassView() {
        initComponents();
        tableBatchClass(bcc.getAll());
        showTrainer();
        showBatch();
        showClasses();
        showRoom();
    }
    
    private void showTrainer() {
        for (Employee trainer : trainerList) cbTrainer.addItem(trainer.getName());
    }
    
    void showBatch() {
        for (Batch batch : bc.getAll()) {
            cbBatch.addItem(batch.getId()+" - "+batch.getName());
        }
    }
    
    void showClasses() {
        for (Classes classes : csc.getAll()) {
            cbClasses.addItem(classes.getId()+" - "+classes.getName());
        }
    }
    
    void showRoom() {
        for (Room room : rc.getAll()) {
            cbRoom.addItem(room.getId()+" - "+room.getName());
        }
    }
    
    private void tableBatchClass(List<models.BatchClass> batchClass) {
        Object[] columnNames = {"No.", "ID", "Trainer", "Batch", "Classes", "Room"};
        Object[][] data = new Object[batchClass.size()][columnNames.length];
        for (int i = 0; i < data.length; i++) {
            data[i][0] = (i + 1);
            data[i][1] = batchClass.get(i).getId();
            data[i][2] = batchClass.get(i).getTrainer().getName();
            data[i][3] = batchClass.get(i).getBatch().getName();
            data[i][4] = batchClass.get(i).getClasses().getName();
            data[i][5] = batchClass.get(i).getRoom().getName();

        }
        myTableModel = new DefaultTableModel(data, columnNames);
        tbBatchClass.setModel(myTableModel);
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
        pnBatchClass = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        lblTrainer = new javax.swing.JLabel();
        cbTrainer = new javax.swing.JComboBox<>();
        lblBatch = new javax.swing.JLabel();
        cbBatch = new javax.swing.JComboBox<>();
        lblClasses = new javax.swing.JLabel();
        cbClasses = new javax.swing.JComboBox<>();
        lblRoom = new javax.swing.JLabel();
        cbRoom = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        tfKeyword = new javax.swing.JTextField();
        btInsert = new javax.swing.JButton();
        chbGetById = new javax.swing.JCheckBox();
        btDelete = new javax.swing.JButton();
        btSearch = new javax.swing.JButton();
        scpBatchClass = new javax.swing.JScrollPane();
        tbBatchClass = new javax.swing.JTable();

        setBackground(new java.awt.Color(153, 255, 153));
        setClosable(true);
        setTitle("Batch Class");
        setMinimumSize(new java.awt.Dimension(750, 550));
        setPreferredSize(new java.awt.Dimension(750, 550));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);

        pnCenter.setBackground(new java.awt.Color(153, 255, 153));
        pnCenter.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 20, 10, 20));
        pnCenter.setPreferredSize(new java.awt.Dimension(780, 580));

        pnBatchClass.setBackground(new java.awt.Color(153, 255, 153));
        pnBatchClass.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblID.setText("ID");
        pnBatchClass.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 30));
        pnBatchClass.add(tfID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 210, 30));

        lblTrainer.setText("Trainer");
        pnBatchClass.add(lblTrainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 50, 30));

        cbTrainer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbTrainerMouseClicked(evt);
            }
        });
        pnBatchClass.add(cbTrainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 210, 30));

        lblBatch.setText("Batch");
        pnBatchClass.add(lblBatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 50, 30));

        cbBatch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbBatchMouseClicked(evt);
            }
        });
        pnBatchClass.add(cbBatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 210, 30));

        lblClasses.setText("Class");
        pnBatchClass.add(lblClasses, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 50, 30));

        cbClasses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbClassesMouseClicked(evt);
            }
        });
        pnBatchClass.add(cbClasses, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 210, 30));

        lblRoom.setText("Room");
        pnBatchClass.add(lblRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, 50, 30));

        cbRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbRoomMouseClicked(evt);
            }
        });
        pnBatchClass.add(cbRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 210, 30));
        pnBatchClass.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 570, 28));
        pnBatchClass.add(tfKeyword, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 210, 30));

        btInsert.setText("Insert");
        btInsert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnBatchClass.add(btInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 70, 28));

        chbGetById.setBackground(new java.awt.Color(153, 255, 153));
        chbGetById.setText("Get by ID");
        chbGetById.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chbGetById.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbGetByIdActionPerformed(evt);
            }
        });
        pnBatchClass.add(chbGetById, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 80, 30));

        btDelete.setText("Delete");
        btDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnBatchClass.add(btDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 70, 28));

        btSearch.setText("Search");
        btSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });
        pnBatchClass.add(btSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 80, 30));

        scpBatchClass.setBackground(new java.awt.Color(153, 255, 153));

        tbBatchClass.setAutoCreateRowSorter(true);
        tbBatchClass.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No.", "ID", "Trainer", "Batch", "Class", "Room"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbBatchClass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbBatchClassMouseClicked(evt);
            }
        });
        scpBatchClass.setViewportView(tbBatchClass);

        javax.swing.GroupLayout pnCenterLayout = new javax.swing.GroupLayout(pnCenter);
        pnCenter.setLayout(pnCenterLayout);
        pnCenterLayout.setHorizontalGroup(
            pnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCenterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scpBatchClass)
                .addContainerGap())
            .addGroup(pnCenterLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(pnBatchClass, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        pnCenterLayout.setVerticalGroup(
            pnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCenterLayout.createSequentialGroup()
                .addComponent(pnBatchClass, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scpBatchClass, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))
        );

        getContentPane().add(pnCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSearchActionPerformed

    private void chbGetByIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbGetByIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chbGetByIdActionPerformed

    private void tbBatchClassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbBatchClassMouseClicked
        tfID.setText(tbBatchClass.getValueAt(tbBatchClass.getSelectedRow(), 1).toString());
        for (int i = 0; i < cbTrainer.getItemCount(); i++) {
            if (cbTrainer.getItemAt(i).equals(tbBatchClass.getValueAt(tbBatchClass.getSelectedRow(), 2).toString()))
                cbTrainer.setSelectedIndex(i);
        }

        tfID.setEnabled(false);
    }//GEN-LAST:event_tbBatchClassMouseClicked

    private void cbTrainerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbTrainerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTrainerMouseClicked

    private void cbBatchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbBatchMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbBatchMouseClicked

    private void cbClassesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbClassesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbClassesMouseClicked

    private void cbRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbRoomMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbRoomMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btInsert;
    private javax.swing.JButton btSearch;
    private javax.swing.JComboBox<String> cbBatch;
    private javax.swing.JComboBox<String> cbClasses;
    private javax.swing.JComboBox<String> cbRoom;
    private javax.swing.JComboBox<String> cbTrainer;
    private javax.swing.JCheckBox chbGetById;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBatch;
    private javax.swing.JLabel lblClasses;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblRoom;
    private javax.swing.JLabel lblTrainer;
    private javax.swing.JPanel pnBatchClass;
    private javax.swing.JPanel pnCenter;
    private javax.swing.JScrollPane scpBatchClass;
    private javax.swing.JTable tbBatchClass;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfKeyword;
    // End of variables declaration//GEN-END:variables
}
