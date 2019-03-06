/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author gerydanu
 */
public class LessonView extends javax.swing.JInternalFrame {

    /**
     * Creates new form AspectView
     */
    public LessonView() {
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

        pnCenter = new javax.swing.JPanel();
        pnLesson = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        lblClasses = new javax.swing.JLabel();
        cbClasses = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        btInsert = new javax.swing.JButton();
        chbGetById = new javax.swing.JCheckBox();
        btDelete = new javax.swing.JButton();
        btSearch = new javax.swing.JButton();
        scpLesson = new javax.swing.JScrollPane();
        tbLesson = new javax.swing.JTable();

        setClosable(true);
        setTitle("Lesson");
        setMinimumSize(new java.awt.Dimension(750, 550));
        setPreferredSize(new java.awt.Dimension(750, 550));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);
        getContentPane().setLayout(new java.awt.BorderLayout(20, 20));

        pnCenter.setBackground(new java.awt.Color(153, 255, 153));
        pnCenter.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));

        pnLesson.setBackground(new java.awt.Color(153, 255, 153));
        pnLesson.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblID.setText("ID");
        pnLesson.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 3, 80, 34));
        pnLesson.add(tfID, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 3, 290, 34));

        lblName.setText("Name");
        pnLesson.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 42, 80, 34));
        pnLesson.add(tfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 42, 290, 34));

        lblClasses.setText("Class");
        pnLesson.add(lblClasses, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 81, 80, 34));

        cbClasses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbClassesMouseClicked(evt);
            }
        });
        pnLesson.add(cbClasses, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 81, 290, 34));
        pnLesson.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 420, 34));
        pnLesson.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 159, 220, 34));

        btInsert.setText("Insert");
        btInsert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btInsert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btInsertMouseClicked(evt);
            }
        });
        pnLesson.add(btInsert, new org.netbeans.lib.awtextra.AbsoluteConstraints(321, 159, 140, 34));

        chbGetById.setBackground(new java.awt.Color(153, 255, 153));
        chbGetById.setText("Get by ID");
        chbGetById.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chbGetById.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chbGetByIdMouseClicked(evt);
            }
        });
        pnLesson.add(chbGetById, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 198, 80, 34));

        btDelete.setText("Delete");
        btDelete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btDeleteMouseClicked(evt);
            }
        });
        pnLesson.add(btDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 140, 34));

        btSearch.setText("Search");
        btSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSearchMouseClicked(evt);
            }
        });
        pnLesson.add(btSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 140, 34));

        tbLesson.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Name", "Class"
            }
        ));
        scpLesson.setViewportView(tbLesson);

        javax.swing.GroupLayout pnCenterLayout = new javax.swing.GroupLayout(pnCenter);
        pnCenter.setLayout(pnCenterLayout);
        pnCenterLayout.setHorizontalGroup(
            pnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCenterLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(pnLesson, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 40, Short.MAX_VALUE))
            .addGroup(pnCenterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scpLesson)
                .addContainerGap())
        );
        pnCenterLayout.setVerticalGroup(
            pnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCenterLayout.createSequentialGroup()
                .addComponent(pnLesson, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scpLesson, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        getContentPane().add(pnCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbClassesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbClassesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbClassesMouseClicked

    private void chbGetByIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chbGetByIdMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_chbGetByIdMouseClicked

    private void btSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSearchMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btSearchMouseClicked

    private void btInsertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btInsertMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btInsertMouseClicked

    private void btDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDeleteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btDeleteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btInsert;
    private javax.swing.JButton btSearch;
    private javax.swing.JComboBox<String> cbClasses;
    private javax.swing.JCheckBox chbGetById;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblClasses;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblName;
    private javax.swing.JPanel pnCenter;
    private javax.swing.JPanel pnLesson;
    private javax.swing.JScrollPane scpLesson;
    private javax.swing.JTable tbLesson;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables
}
