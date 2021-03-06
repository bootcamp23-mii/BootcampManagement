/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.BatchClassController;
import controllers.BatchClassControllerInterface;
import controllers.BatchController;
import controllers.BatchControllerInterface;
import controllers.ClassesController;
import controllers.ClassesControllerInterface;
import controllers.EmployeeController;
import controllers.EmployeeControllerInterface;
import controllers.ParticipantController;
import controllers.ParticipantControllerInterface;
import controllers.RoomController;
import controllers.RoomControllerInterface;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import models.Batch;
import models.BatchClass;
import models.Classes;
import models.Employee;
import models.Participant;
import models.Room;
import org.hibernate.SessionFactory;
import tools.HibernateUtil;

/**
 *
 * @author gerydanu
 */
public class ParticipantView extends javax.swing.JInternalFrame {
    private SessionFactory factory = HibernateUtil.getSessionFactory();
    private EmployeeControllerInterface emc = new EmployeeController(factory);
    private BatchClassControllerInterface bcc = new BatchClassController(factory);
    private BatchControllerInterface bc = new BatchController(factory);
    private ClassesControllerInterface csc = new ClassesController(factory);
    private RoomControllerInterface rc = new RoomController(factory);
    private ParticipantControllerInterface ptc = new ParticipantController(factory);
    DefaultTableModel myTableModel = new DefaultTableModel();
    private List<models.Employee> trainerList = new ArrayList<>();
    private List<models.BatchClass> batchClassList = new ArrayList<>();
    private List<models.Batch> batchList= new ArrayList<>();
    private List<models.Classes> classTypeList= new ArrayList<>();
    private List<models.Room> roomList= new ArrayList<>();
    private List<models.Participant> participantList = new ArrayList<>();
    
    
    /**
     * Creates new form AspectView
     */
    public ParticipantView() {
        initComponents();
        showTrainer();
        showBatch();
        showClasses();
        showRoom();
        tableParticipant(ptc.getAll());
    }
    
    private void showTrainer() {
        for (Employee employee : emc.getAll()) {
            for (BatchClass batchClass : employee.getBatchClassList()) {
                cbTrainer.addItem(batchClass.getTrainer().getName());
            }
        }
    }
    
    void showBatch() {
        for (Batch batch : bc.getAll()) {
            cbBatch.addItem(batch.getName());
        }
    }
    
    void showClasses() {
        for (Classes classes : csc.getAll()) {
            cbClass.addItem(classes.getName());
        }
    }
    
    void showRoom() {
        for (Room room : rc.getAll()) {
            cbRoom.addItem(room.getName());
        }
    }
    
    private void tableParticipant(List<models.Participant> participant) {
        Object[] columnNames = {"No.", "ID", "Grade", "Trainer", "Batch", "Class", "Room"};
        Object[][] data = new Object[participant.size()][columnNames.length];
        for (int i = 0; i < data.length; i++) {
            data[i][0] = (i + 1);
            data[i][1] = participant.get(i).getId();
            data[i][2] = participant.get(i).getGrade();
            data[i][3] = participant.get(i).getBatchclass().getTrainer().getName();
            data[i][4] = participant.get(i).getBatchclass().getBatch().getName();
            data[i][5] = participant.get(i).getBatchclass().getClasses().getName();
            data[i][6] = participant.get(i).getBatchclass().getRoom().getName();
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
        lblTrainer = new javax.swing.JLabel();
        cbTrainer = new javax.swing.JComboBox<>();
        lblBatch = new javax.swing.JLabel();
        cbBatch = new javax.swing.JComboBox<>();
        lblClass = new javax.swing.JLabel();
        cbClass = new javax.swing.JComboBox<>();
        lblRoom = new javax.swing.JLabel();
        cbRoom = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        btClear = new javax.swing.JButton();
        btSave = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        scpParticipant = new javax.swing.JScrollPane();
        tbParticipant = new javax.swing.JTable();

        setBackground(new java.awt.Color(153, 255, 153));
        setClosable(true);
        setTitle("Participant");
        setMinimumSize(new java.awt.Dimension(750, 550));
        setPreferredSize(new java.awt.Dimension(750, 550));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);

        pnCenter.setBackground(new java.awt.Color(153, 255, 153));
        pnCenter.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));

        pnParticipant.setBackground(new java.awt.Color(153, 255, 153));
        pnParticipant.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblID.setText("ID");
        pnParticipant.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 20));
        pnParticipant.add(tfID, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 240, 30));

        lblGrade.setText("Grade");
        pnParticipant.add(lblGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 50, 20));
        pnParticipant.add(tfGrade, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 240, 30));

        lblTrainer.setText("Trainer");
        pnParticipant.add(lblTrainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 50, 20));

        cbTrainer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbTrainerMouseClicked(evt);
            }
        });
        pnParticipant.add(cbTrainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 240, 30));

        lblBatch.setText("Batch");
        pnParticipant.add(lblBatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 50, 20));

        cbBatch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbBatchMouseClicked(evt);
            }
        });
        pnParticipant.add(cbBatch, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 240, 30));

        lblClass.setText("Class");
        pnParticipant.add(lblClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 50, 20));

        cbClass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbClassMouseClicked(evt);
            }
        });
        pnParticipant.add(cbClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 240, 30));

        lblRoom.setText("Room");
        pnParticipant.add(lblRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 50, 20));

        cbRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbRoomMouseClicked(evt);
            }
        });
        pnParticipant.add(cbRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 240, 30));
        pnParticipant.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 670, 20));

        btClear.setText("Clear");
        btClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearActionPerformed(evt);
            }
        });
        pnParticipant.add(btClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 80, 30));

        btSave.setText("Save");
        btSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSaveMouseClicked(evt);
            }
        });
        pnParticipant.add(btSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 80, 30));

        btDelete.setText("Delete");
        btDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btDeleteMouseClicked(evt);
            }
        });
        pnParticipant.add(btDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 80, 30));

        tbParticipant.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No.", "ID", "Grade", "Trainer", "Batch", "Class", "Room"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
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

        javax.swing.GroupLayout pnCenterLayout = new javax.swing.GroupLayout(pnCenter);
        pnCenter.setLayout(pnCenterLayout);
        pnCenterLayout.setHorizontalGroup(
            pnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCenterLayout.createSequentialGroup()
                .addGroup(pnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCenterLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scpParticipant, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE))
                    .addComponent(pnParticipant, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnCenterLayout.setVerticalGroup(
            pnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCenterLayout.createSequentialGroup()
                .addComponent(pnParticipant, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scpParticipant, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))
        );

        getContentPane().add(pnCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbParticipantMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbParticipantMouseClicked
        tfID.setText(tbParticipant.getValueAt(tbParticipant.getSelectedRow(), 1).toString());
        tfGrade.setText(tbParticipant.getValueAt(tbParticipant.getSelectedRow(), 2).toString());
        for (int i = 0; i < cbTrainer.getItemCount(); i++) {
            if (cbTrainer.getItemAt(i).equals(tbParticipant.getValueAt(tbParticipant.getSelectedRow(), 2).toString()))
                cbTrainer.setSelectedIndex(i);
        }
        for (int j = 0; j < cbBatch.getItemCount(); j++) {
            if (cbBatch.getItemAt(j).equals(tbParticipant.getValueAt(tbParticipant.getSelectedRow(), 3).toString()))
                cbBatch.setSelectedIndex(j);
        }
        for (int k = 0; k < cbClass.getItemCount(); k++) {
            if (cbClass.getItemAt(k).equals(tbParticipant.getValueAt(tbParticipant.getSelectedRow(), 4).toString()))
                cbClass.setSelectedIndex(k);
        }
        for (int l = 0; l < cbRoom.getItemCount(); l++) {
            if (cbRoom.getItemAt(l).equals(tbParticipant.getValueAt(tbParticipant.getSelectedRow(), 5).toString()))
                cbRoom.setSelectedIndex(l);
        }

        tfID.setEnabled(false);
    }//GEN-LAST:event_tbParticipantMouseClicked

    private void btDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDeleteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btDeleteMouseClicked

    private void btSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSaveMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btSaveMouseClicked

    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearActionPerformed
        clearField();
    }//GEN-LAST:event_btClearActionPerformed

    private void cbTrainerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbTrainerMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTrainerMouseClicked

    private void cbBatchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbBatchMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbBatchMouseClicked

    private void cbClassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbClassMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbClassMouseClicked

    private void cbRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbRoomMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbRoomMouseClicked

    private void clearField() {
        tfID.setEnabled(true);
        tfID.setEditable(true);
        tfID.setText("");
        tfGrade.setText("");
        cbTrainer.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btClear;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btSave;
    private javax.swing.JComboBox<String> cbBatch;
    private javax.swing.JComboBox<String> cbClass;
    private javax.swing.JComboBox<String> cbRoom;
    private javax.swing.JComboBox<String> cbTrainer;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBatch;
    private javax.swing.JLabel lblClass;
    private javax.swing.JLabel lblGrade;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblRoom;
    private javax.swing.JLabel lblTrainer;
    private javax.swing.JPanel pnCenter;
    private javax.swing.JPanel pnParticipant;
    private javax.swing.JScrollPane scpParticipant;
    private javax.swing.JTable tbParticipant;
    private javax.swing.JTextField tfGrade;
    private javax.swing.JTextField tfID;
    // End of variables declaration//GEN-END:variables
}
