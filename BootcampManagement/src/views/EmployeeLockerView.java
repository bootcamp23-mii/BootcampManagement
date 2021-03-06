/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.EmployeeController;
import controllers.EmployeeLockerController;
import controllers.LockerController;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Employee;
import models.EmployeeLocker;
import models.Locker;
import org.hibernate.SessionFactory;
import tools.HibernateUtil;

/**
 *
 * @author Firsta
 */
public class EmployeeLockerView extends javax.swing.JInternalFrame {
       SessionFactory factory = HibernateUtil.getSessionFactory();
       DefaultTableModel model = new DefaultTableModel();
       
       LockerController lc = new LockerController(factory);
       EmployeeController ec = new EmployeeController(factory);
       EmployeeLockerController elc = new EmployeeLockerController(factory);
       
       private SimpleDateFormat dateFormatIn = new SimpleDateFormat("MM/dd/yy");
       private SimpleDateFormat dateFormatOut = new SimpleDateFormat("dd-MM-yyyy");
       private List<models.Employee> employeelList= new ArrayList<>();
       private List<models.Locker> lockerList = new ArrayList<>();
    /**
     * Creates new form EmployeeLockerView
     */
    public EmployeeLockerView() {
        initComponents();
        tableData(elc.getAll());
        initUserConf();
        initUserConf2();
    }
    
     private void initUserConf(){
        for (Employee employee : ec.getAll()) {
            cbEmployee.addItem(employee.getId()+" - "+employee.getName());
        }

    }
    
     private void initUserConf2(){
         for (Locker locker : lc.getAll()) {
             cbLockerNumber.addItem(locker.getId()+" - "+locker.getLockernumber());
         }

    }
     
    private boolean confirm(){
        if (tfId.getText().equals("") || cbEmployee.getSelectedIndex()==0 || cbLockerNumber.getSelectedIndex()==0 ||
            tfReceiveDate.getText().equals("") ||
            tfReturnDate.getText().equals("") || tfNote.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Data tidak boleh kosong");
            return false;
        }
        return true;
    }
    
    private void filterhuruf(KeyEvent a) {
        if (Character.isAlphabetic(a.getKeyChar())) {
            a.consume();
            JOptionPane.showMessageDialog(null, "Hanya Bisa Memasukan Karakter Angka");
        }
    }
    
    private void clearing() {
        tfId.setEnabled(true);
        tfId.setEditable(true);
        tfId.setText("");
        tfReceiveDate.setText("");
        tfReturnDate.setText("");
        tfSearch.setText("");
        cbEmployee.setSelectedIndex(0);
        cbLockerNumber.setSelectedIndex(0);
        tfNote.setText("");
    }  
    
    private boolean isEmpty(){
        if(elc.search(tfId.getText()).isEmpty()){
            return true;
        }
        return false;
    }
    
    private void tableData(List<EmployeeLocker> list){
        Object[] columnNames = {"No","ID","Name","Locker Number","Receive Date","Return Date","Note"};
        Object[][] data = new Object[list.size()][columnNames.length];
        for (int i = 0; i < data.length; i++) {
            Object[] objects = data[i];
            data[i][0] = (i+1);
            data[i][1] = list.get(i).getId();
            data[i][2] = list.get(i).getEmployee().getName();
            data[i][3] = list.get(i).getLocker().getLockernumber();
            data[i][4] = dateFormatOut.format(list.get(i).getReceivedate());
            data[i][5] = dateFormatOut.format(list.get(i).getReturndate());
            data[i][6] = list.get(i).getNotes();
            
            model = new DefaultTableModel(data, columnNames);
            tbEmployeeLocker.setModel(model);
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

        jLabel1 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        tfId = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        cbEmployee = new javax.swing.JComboBox<>();
        lblLockerNumber = new javax.swing.JLabel();
        cbLockerNumber = new javax.swing.JComboBox<>();
        lblReceiveDate = new javax.swing.JLabel();
        tfReceiveDate = new javax.swing.JTextField();
        lblReturnDate = new javax.swing.JLabel();
        tfReturnDate = new javax.swing.JTextField();
        lblNote = new javax.swing.JLabel();
        tfNote = new javax.swing.JTextField();
        cbSearch = new javax.swing.JComboBox<>();
        btDelete = new javax.swing.JButton();
        btReset = new javax.swing.JButton();
        btSave = new javax.swing.JButton();
        lblSearch = new javax.swing.JLabel();
        tfSearch = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEmployeeLocker = new javax.swing.JTable();

        setClosable(true);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("ACCESS LOCKER");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 24, -1, -1));

        lblId.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblId.setText("ID");
        getContentPane().add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 85, -1, -1));

        tfId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfIdActionPerformed(evt);
            }
        });
        getContentPane().add(tfId, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 83, 194, -1));

        lblName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblName.setText("Name");
        getContentPane().add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 123, -1, -1));

        cbEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEmployeeActionPerformed(evt);
            }
        });
        getContentPane().add(cbEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 121, 194, -1));

        lblLockerNumber.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblLockerNumber.setText("Locker Number");
        getContentPane().add(lblLockerNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(53, 161, -1, -1));

        getContentPane().add(cbLockerNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 159, 194, -1));

        lblReceiveDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblReceiveDate.setText("Receive Date");
        getContentPane().add(lblReceiveDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 85, -1, -1));
        getContentPane().add(tfReceiveDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 83, 194, -1));

        lblReturnDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblReturnDate.setText("Return Date");
        getContentPane().add(lblReturnDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 123, -1, -1));
        getContentPane().add(tfReturnDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 121, 194, -1));

        lblNote.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblNote.setText("Note");
        getContentPane().add(lblNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 159, -1, -1));
        getContentPane().add(tfNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 159, 194, -1));

        cbSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search", "Search By Id", "Search All" }));
        cbSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSearchActionPerformed(evt);
            }
        });
        getContentPane().add(cbSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 228, 194, -1));

        btDelete.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btDelete.setText("Delete");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 278, -1, -1));

        btReset.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btReset.setText("Reset");
        btReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetActionPerformed(evt);
            }
        });
        getContentPane().add(btReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(549, 278, -1, -1));

        btSave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btSave.setText("Save");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });
        getContentPane().add(btSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 278, -1, -1));

        lblSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblSearch.setText("Search");
        getContentPane().add(lblSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 199, -1, -1));
        getContentPane().add(tfSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(497, 197, 194, -1));

        tbEmployeeLocker.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbEmployeeLocker.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbEmployeeLockerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbEmployeeLocker);

        jScrollPane2.setViewportView(jScrollPane1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 319, 615, 166));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSearchActionPerformed
        String cari = tfSearch.getText().toString();

        if(cari !="" && cbSearch.getSelectedItem()== "Search By Id"){

            EmployeeLocker tampungan = elc.getById(cari);
            tfId.setText(tampungan.getId()+ "");
            cbEmployee.setSelectedItem(tampungan.getEmployee());
            cbLockerNumber.setSelectedItem(tampungan.getLocker());
            tfReceiveDate.setText(tampungan.getReceivedate().toString());
            tfReturnDate.setText(tampungan.getReturndate().toString());
            tfNote.setText(tampungan.getNotes());

        }else if(cari != "" && cbSearch.getSelectedItem() == "Search"){
            tableData(elc.search(cari));
        } else {
            tableData(elc.getAll());
        }
    }//GEN-LAST:event_cbSearchActionPerformed

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
         String id = tfId.getText();
        if(id.equals("")){
            JOptionPane.showMessageDialog(null, "Data tidak boleh kosong");
        }else{
            try {
                int reply = JOptionPane.showConfirmDialog(null,
                "Anda yakin akan menghapus data?","Konfirmasi" ,JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(reply == JOptionPane.YES_OPTION){
                    JOptionPane.showMessageDialog(null, elc.delete(tfId.getText(), tfReceiveDate.getText(),tfReturnDate.getText(), tfNote.getText(), cbEmployee.getSelectedItem().toString().split(" - ")[0], cbLockerNumber.getSelectedItem().toString().split(" - ")[0]));
            
                    clearing();
                } 
            }catch (Exception e) {
             e.printStackTrace();
            }
        }
        tableData(elc.getAll());
    }//GEN-LAST:event_btDeleteActionPerformed

    private void btResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetActionPerformed
        clearing();
    }//GEN-LAST:event_btResetActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        if (isEmpty()) {
            JOptionPane.showMessageDialog(null, elc.save(tfId.getText(), tfReceiveDate.getText(), tfReturnDate.getText(), tfNote.getText(),
                cbEmployee.getSelectedItem().toString().split(" - ")[0], cbLockerNumber.getSelectedItem().toString().split(" - ")[0]));
        }else{
            try {
                int reply = JOptionPane.showConfirmDialog(null, "Anda yakin akan melakukan perubahan data?",
                    "Konfirmasi", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(reply == JOptionPane.YES_OPTION){
                    JOptionPane.showMessageDialog(null, elc.save(tfId.getText(), tfReceiveDate.getText(), tfReturnDate.getText(), tfNote.getText(),
                        cbEmployee.getSelectedItem().toString().split(" - ")[0], cbLockerNumber.getSelectedItem().toString().split(" - ")[0]));

                clearing();
                tableData(elc.getAll());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        }
        clearing();
        tableData(elc.getAll());
    }//GEN-LAST:event_btSaveActionPerformed

    private void tbEmployeeLockerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbEmployeeLockerMouseClicked
        tfId.setText(tbEmployeeLocker.getValueAt(tbEmployeeLocker.getSelectedRow(), 1).toString());

        for (int i = 0; i < cbEmployee.getItemCount(); i++) {
            if (cbEmployee.getItemAt(i).split(" - ")[0].equals(tbEmployeeLocker.getValueAt(tbEmployeeLocker.getSelectedRow(), 2).toString()))
            cbEmployee.setSelectedIndex(i);
        }

        for (int i = 0; i < cbLockerNumber.getItemCount(); i++) {
            if (cbLockerNumber.getItemAt(i).split(" - ")[0].equals(tbEmployeeLocker.getValueAt(tbEmployeeLocker.getSelectedRow(), 3).toString()))
            cbLockerNumber.setSelectedIndex(i);
        }
        tfReceiveDate.setText(tbEmployeeLocker.getValueAt(tbEmployeeLocker.getSelectedRow(), 4).toString());
        tfReturnDate.setText(tbEmployeeLocker.getValueAt(tbEmployeeLocker.getSelectedRow(), 5).toString());
        tfNote.setText(tbEmployeeLocker.getValueAt(tbEmployeeLocker.getSelectedRow(), 6).toString());

        tfId.setEnabled(false);
        btDelete.setEnabled(true);
    }//GEN-LAST:event_tbEmployeeLockerMouseClicked

    private void cbEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEmployeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEmployeeActionPerformed

    private void tfIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfIdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btReset;
    private javax.swing.JButton btSave;
    private javax.swing.JComboBox<String> cbEmployee;
    private javax.swing.JComboBox<String> cbLockerNumber;
    private javax.swing.JComboBox<String> cbSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLockerNumber;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNote;
    private javax.swing.JLabel lblReceiveDate;
    private javax.swing.JLabel lblReturnDate;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JTable tbEmployeeLocker;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfNote;
    private javax.swing.JTextField tfReceiveDate;
    private javax.swing.JTextField tfReturnDate;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables
}
