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
public class ParticipantView extends javax.swing.JInternalFrame {

    /**
     * Creates new form AspectView
     */
    public ParticipantView() {
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

        lblTitleParticipant = new javax.swing.JLabel();
        pnParticipant = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        lblGrade = new javax.swing.JLabel();
        tfGrade = new javax.swing.JTextField();
        lblBatchClass = new javax.swing.JLabel();
        cbBatchClass = new javax.swing.JComboBox<>();
        pnTable = new javax.swing.JPanel();
        scpParticipant = new javax.swing.JScrollPane();
        tbParticipant = new javax.swing.JTable();

        setClosable(true);
        getContentPane().setLayout(new java.awt.BorderLayout(10, 10));

        lblTitleParticipant.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleParticipant.setText("PARTICIPANT");
        getContentPane().add(lblTitleParticipant, java.awt.BorderLayout.PAGE_START);

        pnParticipant.setLayout(new java.awt.GridLayout(3, 2, 5, 5));

        lblID.setText("ID");
        pnParticipant.add(lblID);
        pnParticipant.add(tfID);

        lblGrade.setText("Grade");
        pnParticipant.add(lblGrade);
        pnParticipant.add(tfGrade);

        lblBatchClass.setText("Batch Class");
        pnParticipant.add(lblBatchClass);

        cbBatchClass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBatchClassActionPerformed(evt);
            }
        });
        pnParticipant.add(cbBatchClass);

        getContentPane().add(pnParticipant, java.awt.BorderLayout.CENTER);

        tbParticipant.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Grade", "Batch Class"
            }
        ));
        scpParticipant.setViewportView(tbParticipant);

        javax.swing.GroupLayout pnTableLayout = new javax.swing.GroupLayout(pnTable);
        pnTable.setLayout(pnTableLayout);
        pnTableLayout.setHorizontalGroup(
            pnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
            .addGroup(pnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(scpParticipant, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE))
        );
        pnTableLayout.setVerticalGroup(
            pnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 122, Short.MAX_VALUE)
            .addGroup(pnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTableLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scpParticipant, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        getContentPane().add(pnTable, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbBatchClassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBatchClassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbBatchClassActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbBatchClass;
    private javax.swing.JLabel lblBatchClass;
    private javax.swing.JLabel lblGrade;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblTitleParticipant;
    private javax.swing.JPanel pnParticipant;
    private javax.swing.JPanel pnTable;
    private javax.swing.JScrollPane scpParticipant;
    private javax.swing.JTable tbParticipant;
    private javax.swing.JTextField tfGrade;
    private javax.swing.JTextField tfID;
    // End of variables declaration//GEN-END:variables
}
