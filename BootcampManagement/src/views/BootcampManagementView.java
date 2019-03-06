/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.Dimension;
import java.awt.Toolkit;
import org.hibernate.SessionFactory;
import tools.HibernateUtil;

/**
 *
 * @author gerydanu
 */
public class BootcampManagementView extends javax.swing.JFrame {
    
    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
//    UserController uc = new UserController(sessionFactory);

    /**
     * Creates new form LoginView
     */
    public BootcampManagementView() {
        initComponents();
        getMiddle();
    }
    
    private void getMiddle() {
        int frameWidth = ((dim.width - this.getSize().width) / 2);
        int frameHeigth = ((dim.height - this.getSize().height) / 2);
        this.setLocation(frameWidth, frameHeigth);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnBootcamp = new javax.swing.JPanel();
        pnLogin = new javax.swing.JPanel();
        pnLoginCard = new javax.swing.JPanel();
        lblLogin = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        pfPassword = new javax.swing.JPasswordField();
        btLogin = new javax.swing.JButton();
        btRegister = new javax.swing.JButton();
        lblLogoMII = new javax.swing.JLabel();
        lblLogoMetrodata = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnEditCV = new javax.swing.JMenu();
        mnBCManagement = new javax.swing.JMenu();
        mnParticipantView = new javax.swing.JMenuItem();
        mnScoreView = new javax.swing.JMenuItem();
        mnBatchClassView = new javax.swing.JMenuItem();
        mnErrorBankView = new javax.swing.JMenuItem();
        mnEvaluationView = new javax.swing.JMenuItem();
        mnEquipments = new javax.swing.JMenu();
        mnLocation = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bootcamp Management");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setName("loginView"); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 600));
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new java.awt.BorderLayout(10, 10));

        pnBootcamp.setBackground(new java.awt.Color(0, 169, 255));
        pnBootcamp.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bootcamp Management", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N
        pnBootcamp.setLayout(new java.awt.BorderLayout());

        pnLogin.setBackground(new java.awt.Color(204, 255, 255));

        pnLoginCard.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnLoginCard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogin.setLabelFor(pnBootcamp);
        lblLogin.setText("LOGIN");
        lblLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblLogin.setNextFocusableComponent(pnLoginCard);
        pnLoginCard.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 340, 40));

        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblUsername.setText("Username");
        pnLoginCard.add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 120, 30));

        tfUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pnLoginCard.add(tfUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 160, 30));

        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblPassword.setText("Password");
        pnLoginCard.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 120, 30));
        pnLoginCard.add(pfPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 160, 30));

        btLogin.setText("Login");
        btLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });
        pnLoginCard.add(btLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 180, 30));

        btRegister.setText("Register");
        btRegister.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnLoginCard.add(btRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, 180, 30));

        lblLogoMII.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogoMII.setIcon(new javax.swing.ImageIcon(getClass().getResource("/others/mii-logo.png"))); // NOI18N

        lblLogoMetrodata.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogoMetrodata.setIcon(new javax.swing.ImageIcon(getClass().getResource("/others/metrodata-logo.png"))); // NOI18N

        javax.swing.GroupLayout pnLoginLayout = new javax.swing.GroupLayout(pnLogin);
        pnLogin.setLayout(pnLoginLayout);
        pnLoginLayout.setHorizontalGroup(
            pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLoginLayout.createSequentialGroup()
                .addContainerGap(186, Short.MAX_VALUE)
                .addGroup(pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnLoginLayout.createSequentialGroup()
                        .addComponent(lblLogoMII)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblLogoMetrodata))
                    .addComponent(pnLoginCard, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        pnLoginLayout.setVerticalGroup(
            pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLoginLayout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addGroup(pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLogoMII)
                    .addComponent(lblLogoMetrodata))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnLoginCard, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        pnBootcamp.add(pnLogin, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnBootcamp, java.awt.BorderLayout.CENTER);

        jMenuBar1.setBackground(new java.awt.Color(0, 169, 255));
        jMenuBar1.setName(""); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(310, 30));

        mnEditCV.setText("Edit CV");
        jMenuBar1.add(mnEditCV);

        mnBCManagement.setText("Bootcamp Management");
        mnBCManagement.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        mnParticipantView.setText("Participant");
        mnParticipantView.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnParticipantView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnParticipantViewActionPerformed(evt);
            }
        });
        mnBCManagement.add(mnParticipantView);

        mnScoreView.setText("Score");
        mnScoreView.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnScoreView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnScoreViewActionPerformed(evt);
            }
        });
        mnBCManagement.add(mnScoreView);

        mnBatchClassView.setText("Batch Class");
        mnBatchClassView.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnBatchClassView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBatchClassViewActionPerformed(evt);
            }
        });
        mnBCManagement.add(mnBatchClassView);

        mnErrorBankView.setText("Error Bank");
        mnErrorBankView.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnErrorBankView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnErrorBankViewActionPerformed(evt);
            }
        });
        mnBCManagement.add(mnErrorBankView);

        mnEvaluationView.setText("Evaluation");
        mnEvaluationView.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnEvaluationView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEvaluationViewActionPerformed(evt);
            }
        });
        mnBCManagement.add(mnEvaluationView);

        jMenuBar1.add(mnBCManagement);

        mnEquipments.setText("Equipments");
        jMenuBar1.add(mnEquipments);

        mnLocation.setText("Location");
        jMenuBar1.add(mnLocation);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btLoginActionPerformed

    private void mnEvaluationViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEvaluationViewActionPerformed
        EvaluationView ev = new EvaluationView();
        pnBootcamp.add(ev);
        ev.setVisible(true);
    }//GEN-LAST:event_mnEvaluationViewActionPerformed

    private void mnParticipantViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnParticipantViewActionPerformed
        ParticipantView ptv = new ParticipantView();
        pnBootcamp.add(ptv);
        ptv.setVisible(true);
    }//GEN-LAST:event_mnParticipantViewActionPerformed

    private void mnScoreViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnScoreViewActionPerformed
        ScoreView sv = new ScoreView();
        pnBootcamp.add(sv);
        sv.setVisible(true);
    }//GEN-LAST:event_mnScoreViewActionPerformed

    private void mnBatchClassViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnBatchClassViewActionPerformed
        BatchClassView bcv = new BatchClassView();
        pnBootcamp.add(bcv);
        bcv.setVisible(true);
    }//GEN-LAST:event_mnBatchClassViewActionPerformed

    private void mnErrorBankViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnErrorBankViewActionPerformed
        ErrorBankView ebv = new ErrorBankView();
        pnBootcamp.add(ebv);
        ebv.setVisible(true);
    }//GEN-LAST:event_mnErrorBankViewActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BootcampManagementView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BootcampManagementView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BootcampManagementView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BootcampManagementView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BootcampManagementView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btLogin;
    private javax.swing.JButton btRegister;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLogoMII;
    private javax.swing.JLabel lblLogoMetrodata;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JMenu mnBCManagement;
    private javax.swing.JMenuItem mnBatchClassView;
    private javax.swing.JMenu mnEditCV;
    private javax.swing.JMenu mnEquipments;
    private javax.swing.JMenuItem mnErrorBankView;
    private javax.swing.JMenuItem mnEvaluationView;
    private javax.swing.JMenu mnLocation;
    private javax.swing.JMenuItem mnParticipantView;
    private javax.swing.JMenuItem mnScoreView;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JPanel pnBootcamp;
    private javax.swing.JPanel pnLogin;
    private javax.swing.JPanel pnLoginCard;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}