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
public class EvaluationView extends javax.swing.JInternalFrame {

    /**
     * Creates new form AspectView
     */
    public EvaluationView() {
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

        lblTitleEvaluation = new javax.swing.JLabel();
        pnEvaluation = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        lblIsDaily = new javax.swing.JLabel();
        chbIsDaily = new javax.swing.JCheckBox();
        lblDate = new javax.swing.JLabel();
        tfDate = new javax.swing.JTextField();
        lblNote = new javax.swing.JLabel();
        tfNote = new javax.swing.JTextField();
        lblParticipant = new javax.swing.JLabel();
        cbParticipant = new javax.swing.JComboBox<>();
        lblLesson = new javax.swing.JLabel();
        cbLesson = new javax.swing.JComboBox<>();
        lblTopic = new javax.swing.JLabel();
        cbTopic = new javax.swing.JComboBox<>();
        pnTable = new javax.swing.JPanel();
        scpEvaluation = new javax.swing.JScrollPane();
        tbEvaluation = new javax.swing.JTable();

        setClosable(true);
        getContentPane().setLayout(new java.awt.BorderLayout(10, 10));

        lblTitleEvaluation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleEvaluation.setText("EVALUATION");
        getContentPane().add(lblTitleEvaluation, java.awt.BorderLayout.PAGE_START);

        pnEvaluation.setLayout(new java.awt.GridLayout(7, 2, 5, 5));

        lblID.setText("ID");
        pnEvaluation.add(lblID);
        pnEvaluation.add(tfID);

        lblIsDaily.setText("Is Daily");
        pnEvaluation.add(lblIsDaily);
        pnEvaluation.add(chbIsDaily);

        lblDate.setText("Date");
        pnEvaluation.add(lblDate);
        pnEvaluation.add(tfDate);

        lblNote.setText("Note");
        pnEvaluation.add(lblNote);
        pnEvaluation.add(tfNote);

        lblParticipant.setText("Participant");
        pnEvaluation.add(lblParticipant);

        cbParticipant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbParticipantActionPerformed(evt);
            }
        });
        pnEvaluation.add(cbParticipant);

        lblLesson.setText("Lesson");
        pnEvaluation.add(lblLesson);

        pnEvaluation.add(cbLesson);

        lblTopic.setText("Topic");
        pnEvaluation.add(lblTopic);

        pnEvaluation.add(cbTopic);

        getContentPane().add(pnEvaluation, java.awt.BorderLayout.CENTER);

        tbEvaluation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Is Daily", "Date", "Note", "Participant", "Lesson", "Topic"
            }
        ));
        scpEvaluation.setViewportView(tbEvaluation);

        javax.swing.GroupLayout pnTableLayout = new javax.swing.GroupLayout(pnTable);
        pnTable.setLayout(pnTableLayout);
        pnTableLayout.setHorizontalGroup(
            pnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
            .addGroup(pnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(scpEvaluation, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE))
        );
        pnTableLayout.setVerticalGroup(
            pnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 122, Short.MAX_VALUE)
            .addGroup(pnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnTableLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(scpEvaluation, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        getContentPane().add(pnTable, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbParticipantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbParticipantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbParticipantActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbLesson;
    private javax.swing.JComboBox<String> cbParticipant;
    private javax.swing.JComboBox<String> cbTopic;
    private javax.swing.JCheckBox chbIsDaily;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblIsDaily;
    private javax.swing.JLabel lblLesson;
    private javax.swing.JLabel lblNote;
    private javax.swing.JLabel lblParticipant;
    private javax.swing.JLabel lblTitleEvaluation;
    private javax.swing.JLabel lblTopic;
    private javax.swing.JPanel pnEvaluation;
    private javax.swing.JPanel pnTable;
    private javax.swing.JScrollPane scpEvaluation;
    private javax.swing.JTable tbEvaluation;
    private javax.swing.JTextField tfDate;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfNote;
    // End of variables declaration//GEN-END:variables
}
