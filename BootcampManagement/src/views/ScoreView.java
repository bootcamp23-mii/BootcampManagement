/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.AspectController;
import controllers.AspectControllerInterface;
import controllers.EvaluationController;
import controllers.EvaluationControllerInterface;
import controllers.ScoreController;
import controllers.ScoreControllerInterface;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import models.Aspect;
import models.Evaluation;
import org.hibernate.SessionFactory;
import tools.HibernateUtil;

/**
 *
 * @author gerydanu
 */
public class ScoreView extends javax.swing.JInternalFrame {
    private SessionFactory factory = HibernateUtil.getSessionFactory();
    private EvaluationControllerInterface evc = new EvaluationController(factory);
    private AspectControllerInterface apc = new AspectController(factory);
    private ScoreControllerInterface scc = new ScoreController(factory);
    DefaultTableModel myTableModel = new DefaultTableModel();
    private List<Integer> ratingList = new ArrayList<>();
    private List<models.Evaluation> evaluationList = new ArrayList<>();
    private List<models.Aspect> aspectList = new ArrayList<>();
//    private List<models.Score> scoreList = new ArrayList<>();

    /**
     * Creates new form AspectView
     */
    public ScoreView() {
        initComponents();
        showEvaluation();
        showAspect();
        tableScore(scc.getAll());
    }
    
    void showRating() {
    }
    
    private void showEvaluation() {
        for (Evaluation score : evc.getAll()) {
            cbEvaluation.addItem(score.getNote());
        }
    }
    
    private void showAspect() {
        for (Aspect aspect : apc.getAll()) {
            cbAspect.addItem(aspect.getName());
        }
    }
    
    private void tableScore(List<models.Score> score) {
        Object[] columnNames = {"No.", "ID", "Rating", "Evaluation Date", "Aspect"};
        Object[][] data = new Object[score.size()][columnNames.length];
        for (int i = 0; i < data.length; i++) {
            data[i][0] = (i + 1);
            data[i][1] = score.get(i).getId();
            data[i][2] = score.get(i).getRating();
            data[i][3] = score.get(i).getEvaluation();
            data[i][4] = score.get(i).getAspect();
        }
        myTableModel = new DefaultTableModel(data, columnNames);
        tbScore.setModel(myTableModel);
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
        pnScore = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        lblRating = new javax.swing.JLabel();
        slRating = new javax.swing.JSlider();
        lblEvaluation = new javax.swing.JLabel();
        cbEvaluation = new javax.swing.JComboBox<>();
        lblAspect = new javax.swing.JLabel();
        cbAspect = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        btSave = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btClear = new javax.swing.JButton();
        scpScore = new javax.swing.JScrollPane();
        tbScore = new javax.swing.JTable();

        setBackground(new java.awt.Color(153, 255, 153));
        setClosable(true);
        setTitle("Score");
        setMinimumSize(new java.awt.Dimension(750, 550));
        setPreferredSize(new java.awt.Dimension(750, 550));
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);
        getContentPane().setLayout(new java.awt.BorderLayout(10, 10));

        pnCenter.setBackground(new java.awt.Color(153, 255, 153));
        pnCenter.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));

        pnScore.setBackground(new java.awt.Color(153, 255, 153));
        pnScore.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblID.setText("ID");
        pnScore.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 34));
        pnScore.add(tfID, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 0, 560, 34));

        lblRating.setText("Rating");
        pnScore.add(lblRating, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 39, 60, 34));

        slRating.setBackground(new java.awt.Color(153, 255, 153));
        slRating.setMajorTickSpacing(1);
        slRating.setMaximum(5);
        slRating.setMinimum(1);
        slRating.setPaintLabels(true);
        slRating.setPaintTicks(true);
        slRating.setSnapToTicks(true);
        slRating.setToolTipText("");
        slRating.setValue(3);
        slRating.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnScore.add(slRating, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 560, -1));

        lblEvaluation.setText("Evaluation");
        pnScore.add(lblEvaluation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 60, 34));

        pnScore.add(cbEvaluation, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 560, 34));

        lblAspect.setText("Aspect");
        pnScore.add(lblAspect, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 60, 34));

        pnScore.add(cbAspect, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 560, 34));
        pnScore.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 630, 34));

        btSave.setText("Save");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });
        pnScore.add(btSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 80, 34));

        btDelete.setText("Delete");
        pnScore.add(btDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 80, 34));

        btClear.setText("Clear");
        btClear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearActionPerformed(evt);
            }
        });
        pnScore.add(btClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 80, 30));

        tbScore.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No.", "ID", "Rating", "Evaluation", "Aspect"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbScore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbScoreMouseClicked(evt);
            }
        });
        scpScore.setViewportView(tbScore);

        javax.swing.GroupLayout pnCenterLayout = new javax.swing.GroupLayout(pnCenter);
        pnCenter.setLayout(pnCenterLayout);
        pnCenterLayout.setHorizontalGroup(
            pnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scpScore)
            .addGroup(pnCenterLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(pnScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );
        pnCenterLayout.setVerticalGroup(
            pnCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCenterLayout.createSequentialGroup()
                .addComponent(pnScore, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(scpScore, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(pnCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearActionPerformed
        clearField();
    }//GEN-LAST:event_btClearActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSaveActionPerformed

    private void tbScoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbScoreMouseClicked
        tfID.setText(tbScore.getValueAt(tbScore.getSelectedRow(), 1).toString());
        slRating.setValue(Integer.parseInt(tbScore.getValueAt(tbScore.getSelectedRow(), 2).toString()));
        for (int i = 0; i < cbEvaluation.getItemCount(); i++) {
            if (cbEvaluation.getItemAt(i).equals(tbScore.getValueAt(tbScore.getSelectedRow(), 3).toString()))
                cbEvaluation.setSelectedIndex(i);
        }
        for (int j = 0; j < cbAspect.getItemCount(); j++) {
            if (cbAspect.getItemAt(j).equals(tbScore.getValueAt(tbScore.getSelectedRow(), 4).toString()))
                cbAspect.setSelectedIndex(j);
        }
        

        tfID.setEnabled(false);
    }//GEN-LAST:event_tbScoreMouseClicked

    private void clearField() {
        tfID.setEnabled(true);
        tfID.setEditable(true);
        tfID.setText("");
        slRating.setValue(3);
        cbEvaluation.setSelectedIndex(0);
        cbAspect.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btClear;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btSave;
    private javax.swing.JComboBox<String> cbAspect;
    private javax.swing.JComboBox<String> cbEvaluation;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAspect;
    private javax.swing.JLabel lblEvaluation;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblRating;
    private javax.swing.JPanel pnCenter;
    private javax.swing.JPanel pnScore;
    private javax.swing.JScrollPane scpScore;
    private javax.swing.JSlider slRating;
    private javax.swing.JTable tbScore;
    private javax.swing.JTextField tfID;
    // End of variables declaration//GEN-END:variables
}
