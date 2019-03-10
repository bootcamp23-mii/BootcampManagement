/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import controllers.BatchClassController;
import controllers.BatchClassControllerInterface;
import controllers.EmployeeController;
import controllers.EmployeeControllerInterface;
import controllers.EmployeeRoleController;
import controllers.EmployeeRoleControllerInterface;
import controllers.LoginController;
import controllers.ParticipantController;
import controllers.ParticipantControllerInterface;
import controllers.RoleController;
import controllers.RoleControllerInterface;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import models.BatchClass;
import models.Employee;
import models.EmployeeRole;
import models.Participant;
import models.Role;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.hibernate.SessionFactory;
import org.hibernate.engine.jdbc.connections.spi.ConnectionProvider;
import tools.HibernateUtil;
import tools.Session;
import views.*;

/**
 *
 * @author gerydanu
 */
public class BootcampManagementView extends javax.swing.JFrame {
    
    private SessionFactory factory = HibernateUtil.getSessionFactory();
    private LoginController c = new LoginController(factory);
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

    /**
     * Creates new form LoginView
     */
    public BootcampManagementView() {
        initComponents();
        setDefaultCondition();
    }
    
    private void setDefaultCondition(){
        getMiddle();
//        views.LoginView loginView = new views.LoginView();
//        pnBootcamp.add(pnLogin);
//        pnLogin.add(loginView);
//        loginView.setVisible(true);
        logout();
    }
    
    private void getMiddle() {
        int frameWidth = ((dim.width - this.getSize().width) / 2);
        int frameHeigth = ((dim.height - this.getSize().height) / 2);
        this.setLocation(frameWidth, frameHeigth);
    }
    
    private void logout(){
        Session.setSession("");

//        pnBootcamp.add(pnLogin);
        pnLogin.setVisible(true);
        pnBootcamp.revalidate();
        pnLogin.revalidate();
        
        mnAccountSetting.setEnabled(false);
        mnEditCV.setEnabled(false);
        mnBCManagement.setEnabled(false);
        mnEquipments.setEnabled(false);
        mnLocation.setEnabled(false);
        mnLogout.setEnabled(false);
    }
    
    public void login(){
        super.revalidate();
        pnLogin.setVisible(false);
//        pnBootcamp.removeAll();
        pnBootcamp.revalidate();
        autorityCheck();
        tfUsername.setText("");
        pfPassword.setText("");
    }
    
    private void autorityCheck(){
        EmployeeControllerInterface e = new EmployeeController(factory);
        ParticipantControllerInterface eParticipant = new ParticipantController(factory);
        List<Employee> dataEmployee = e.search(Session.getSession());
        List<Participant> dataParticipant = eParticipant.search(Session.getSession());
        for (Participant data : dataParticipant) {
            if (data.getId().equals(Session.getSession())) {
                mnBCManagement.setEnabled(true);
                mnBatchClassView.setEnabled(false);
                mnParticipantView.setEnabled(false);
                mnLessonView.setEnabled(false);
                mnErrorBankView.setEnabled(true);
                mnEvaluationView.setEnabled(false);
                mnScoreView.setEnabled(false);
                mnGenerateRaport.setEnabled(true);
            }
        }
        for (Employee employee : dataEmployee) {
            for (BatchClass data : employee.getBatchClassList()) {
                mnBCManagement.setEnabled(true);
                mnBatchClassView.setEnabled(true);
                mnParticipantView.setEnabled(true);
                mnLessonView.setEnabled(true);
                mnErrorBankView.setEnabled(true);
                mnEvaluationView.setEnabled(true);
                mnScoreView.setEnabled(true);
                mnGenerateRaport.setEnabled(true);
            }
        }
        for (Employee employee : dataEmployee) {
            for (EmployeeRole data : employee.getEmployeeRoleList()) {
                if (data.getRole().getName().equals("Admin")) {
                    mnAccountSetting.setEnabled(true);
                    mnEquipments.setEnabled(true);
                    mnLocation.setEnabled(true);
                }
            }
        }
        mnEditCV.setEnabled(true);
        mnLogout.setEnabled(true);
    }
    
    private boolean checkLogin(){
        if (c.login(tfUsername.getText(), pfPassword.getText())){
            Session.setSession(tfUsername.getText());
            return true;
        }
        return false;
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
        lblLogoMII = new javax.swing.JLabel();
        lblLogoMetrodata = new javax.swing.JLabel();
        mnbBootcamp = new javax.swing.JMenuBar();
        mnAccountSetting = new javax.swing.JMenu();
        mnCreateAccount = new javax.swing.JMenuItem();
        mnEditCV = new javax.swing.JMenu();
        mnCVEmployeeRole = new javax.swing.JMenuItem();
        mnCVEducationHistory = new javax.swing.JMenuItem();
        mnCVEmployeeLanguage = new javax.swing.JMenuItem();
        mnCVEmployeeSkill = new javax.swing.JMenuItem();
        mnCVOrganization = new javax.swing.JMenuItem();
        mnCVAchievement = new javax.swing.JMenuItem();
        mnCVEmployeeCertification = new javax.swing.JMenuItem();
        mnCVWorkExperience = new javax.swing.JMenuItem();
        mnCVFoto = new javax.swing.JMenuItem();
        separatorCV = new javax.swing.JPopupMenu.Separator();
        mnCVGenerate = new javax.swing.JMenuItem();
        mnBCManagement = new javax.swing.JMenu();
        mnBatchClassView = new javax.swing.JMenuItem();
        mnParticipantView = new javax.swing.JMenuItem();
        mnLessonView = new javax.swing.JMenuItem();
        mnErrorBankView = new javax.swing.JMenuItem();
        mnEvaluationView = new javax.swing.JMenuItem();
        mnScoreView = new javax.swing.JMenuItem();
        separatorBM = new javax.swing.JPopupMenu.Separator();
        mnGenerateRaport = new javax.swing.JMenuItem();
        mnEquipments = new javax.swing.JMenu();
        mnIdcard = new javax.swing.JMenuItem();
        mnAccessCard = new javax.swing.JMenuItem();
        mnAccessLocker = new javax.swing.JMenuItem();
        mnLocation = new javax.swing.JMenu();
        mnPlacement = new javax.swing.JMenuItem();
        mnSeparator = new javax.swing.JMenu();
        mnLogout = new javax.swing.JMenu();
        mniLogout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bootcamp Management");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setName("loginView"); // NOI18N
        setPreferredSize(new java.awt.Dimension(800, 600));
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new java.awt.BorderLayout(10, 10));

        pnBootcamp.setBackground(new java.awt.Color(0, 169, 255));
        pnBootcamp.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bootcamp Management", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N
        pnBootcamp.setLayout(new java.awt.BorderLayout());

        pnLogin.setBackground(new java.awt.Color(0, 169, 255));
        pnLogin.setName(""); // NOI18N

        pnLoginCard.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pnLoginCard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogin.setText("LOGIN");
        lblLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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
        pnLoginCard.add(btLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 110, 30));

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
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(pnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLogoMII)
                    .addComponent(lblLogoMetrodata))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnLoginCard, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        pnBootcamp.add(pnLogin, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnBootcamp, java.awt.BorderLayout.CENTER);

        mnbBootcamp.setBackground(new java.awt.Color(0, 169, 255));
        mnbBootcamp.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 169, 255), 2, true));
        mnbBootcamp.setName(""); // NOI18N
        mnbBootcamp.setPreferredSize(new java.awt.Dimension(310, 30));

        mnAccountSetting.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mnAccountSetting.setText("Account Setting");
        mnAccountSetting.setBorderPainted(true);
        mnAccountSetting.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mnAccountSetting.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnAccountSetting.setIconTextGap(10);
        mnAccountSetting.setOpaque(true);

        mnCreateAccount.setBackground(new java.awt.Color(0, 169, 255));
        mnCreateAccount.setText("Create Account");
        mnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCreateAccountActionPerformed(evt);
            }
        });
        mnAccountSetting.add(mnCreateAccount);

        mnbBootcamp.add(mnAccountSetting);

        mnEditCV.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 169, 255), 2, true));
        mnEditCV.setText("   Edit CV     ");
        mnEditCV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnEditCV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mnEditCV.setIconTextGap(5);
        mnEditCV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnEditCVActionPerformed(evt);
            }
        });

        mnCVEmployeeRole.setText("Employee Role");
        mnCVEmployeeRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCVEmployeeRoleActionPerformed(evt);
            }
        });
        mnEditCV.add(mnCVEmployeeRole);

        mnCVEducationHistory.setText("Education History");
        mnCVEducationHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCVEducationHistoryActionPerformed(evt);
            }
        });
        mnEditCV.add(mnCVEducationHistory);

        mnCVEmployeeLanguage.setText("Employee Language");
        mnCVEmployeeLanguage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCVEmployeeLanguageActionPerformed(evt);
            }
        });
        mnEditCV.add(mnCVEmployeeLanguage);

        mnCVEmployeeSkill.setText("Employee Skill");
        mnCVEmployeeSkill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCVEmployeeSkillActionPerformed(evt);
            }
        });
        mnEditCV.add(mnCVEmployeeSkill);

        mnCVOrganization.setText("Organization");
        mnCVOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCVOrganizationActionPerformed(evt);
            }
        });
        mnEditCV.add(mnCVOrganization);

        mnCVAchievement.setText("Achievement");
        mnCVAchievement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCVAchievementActionPerformed(evt);
            }
        });
        mnEditCV.add(mnCVAchievement);

        mnCVEmployeeCertification.setText("Employee Certification");
        mnCVEmployeeCertification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCVEmployeeCertificationActionPerformed(evt);
            }
        });
        mnEditCV.add(mnCVEmployeeCertification);

        mnCVWorkExperience.setText("Work Experience");
        mnCVWorkExperience.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCVWorkExperienceActionPerformed(evt);
            }
        });
        mnEditCV.add(mnCVWorkExperience);

        mnCVFoto.setText("Photo");
        mnCVFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCVFotoActionPerformed(evt);
            }
        });
        mnEditCV.add(mnCVFoto);
        mnEditCV.add(separatorCV);

        mnCVGenerate.setText("CV Generate");
        mnCVGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCVGenerateActionPerformed(evt);
            }
        });
        mnEditCV.add(mnCVGenerate);

        mnbBootcamp.add(mnEditCV);

        mnBCManagement.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 169, 255), 2, true));
        mnBCManagement.setText("   Bootcamp Management     ");
        mnBCManagement.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mnBCManagement.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnBCManagement.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mnBCManagement.setIconTextGap(5);

        mnBatchClassView.setText("Batch Class");
        mnBatchClassView.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnBatchClassView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnBatchClassViewActionPerformed(evt);
            }
        });
        mnBCManagement.add(mnBatchClassView);

        mnParticipantView.setText("Participant");
        mnParticipantView.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mnParticipantView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnParticipantViewActionPerformed(evt);
            }
        });
        mnBCManagement.add(mnParticipantView);

        mnLessonView.setText("Lesson");
        mnLessonView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLessonViewActionPerformed(evt);
            }
        });
        mnBCManagement.add(mnLessonView);

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

        mnScoreView.setText("Score");
        mnScoreView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnScoreViewActionPerformed(evt);
            }
        });
        mnBCManagement.add(mnScoreView);
        mnBCManagement.add(separatorBM);

        mnGenerateRaport.setText("Generate Raport");
        mnGenerateRaport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnGenerateRaportActionPerformed(evt);
            }
        });
        mnBCManagement.add(mnGenerateRaport);

        mnbBootcamp.add(mnBCManagement);

        mnEquipments.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 169, 255), 2, true));
        mnEquipments.setText("   Equipments     ");
        mnEquipments.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnEquipments.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mnEquipments.setIconTextGap(5);
        mnEquipments.addMenuListener(new javax.swing.event.MenuListener() {
            public void menuCanceled(javax.swing.event.MenuEvent evt) {
            }
            public void menuDeselected(javax.swing.event.MenuEvent evt) {
            }
            public void menuSelected(javax.swing.event.MenuEvent evt) {
                mnEquipmentsMenuSelected(evt);
            }
        });

        mnIdcard.setText("Id Card");
        mnIdcard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnIdcardActionPerformed(evt);
            }
        });
        mnEquipments.add(mnIdcard);

        mnAccessCard.setText("Access Card");
        mnAccessCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAccessCardActionPerformed(evt);
            }
        });
        mnEquipments.add(mnAccessCard);

        mnAccessLocker.setText("Access Locker");
        mnAccessLocker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAccessLockerActionPerformed(evt);
            }
        });
        mnEquipments.add(mnAccessLocker);

        mnbBootcamp.add(mnEquipments);

        mnLocation.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 169, 255), 2, true));
        mnLocation.setText("   Location     ");
        mnLocation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnLocation.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mnLocation.setIconTextGap(5);

        mnPlacement.setText("Placement");
        mnPlacement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnPlacementActionPerformed(evt);
            }
        });
        mnLocation.add(mnPlacement);

        mnbBootcamp.add(mnLocation);

        mnSeparator.setBackground(new java.awt.Color(0, 169, 255));
        mnSeparator.setText("                                                  ");
        mnSeparator.setEnabled(false);
        mnSeparator.setOpaque(true);
        mnbBootcamp.add(mnSeparator);

        mnLogout.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 169, 255), 2, true));
        mnLogout.setText("LOGOUT");
        mnLogout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mnLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnLogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnLogoutActionPerformed(evt);
            }
        });

        mniLogout.setText("Logout");
        mniLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLogoutActionPerformed(evt);
            }
        });
        mnLogout.add(mniLogout);

        mnbBootcamp.add(mnLogout);

        setJMenuBar(mnbBootcamp);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnEvaluationViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEvaluationViewActionPerformed
        EvaluationView ev = new EvaluationView();
        pnBootcamp.add(ev);
        pnLogin.setVisible(false);
        ev.setVisible(true);
    }//GEN-LAST:event_mnEvaluationViewActionPerformed

    private void mnParticipantViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnParticipantViewActionPerformed
        ParticipantView ptv = new ParticipantView();
        pnBootcamp.add(ptv);
        pnLogin.setVisible(false);
        ptv.setVisible(true);
    }//GEN-LAST:event_mnParticipantViewActionPerformed

    private void mnBatchClassViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnBatchClassViewActionPerformed
        BatchClassView bcv = new BatchClassView();
        pnBootcamp.add(bcv);
        pnLogin.setVisible(false);
        bcv.setVisible(true);
    }//GEN-LAST:event_mnBatchClassViewActionPerformed

    private void mnErrorBankViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnErrorBankViewActionPerformed
        ErrorBankView ebv = new ErrorBankView();
        pnBootcamp.add(ebv);
        pnLogin.setVisible(false);
        ebv.setVisible(true);
    }//GEN-LAST:event_mnErrorBankViewActionPerformed

    private void mnCVEmployeeRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCVEmployeeRoleActionPerformed
        InputCVEmployeeRoleView view = new InputCVEmployeeRoleView();
        pnLogin.setVisible(false);
        pnBootcamp.add(view);
        view.setVisible(true);
        view.revalidate();
    }//GEN-LAST:event_mnCVEmployeeRoleActionPerformed

    private void mnCVEducationHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCVEducationHistoryActionPerformed
        InputCVEducationHistoryView view = new InputCVEducationHistoryView();
        pnLogin.setVisible(false);
        pnBootcamp.add(view);
        view.setVisible(true);
        view.revalidate();
    }//GEN-LAST:event_mnCVEducationHistoryActionPerformed

    private void mnCVEmployeeLanguageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCVEmployeeLanguageActionPerformed
        InputCVEmployeeLanguageView view = new InputCVEmployeeLanguageView();
        pnLogin.setVisible(false);
        pnBootcamp.add(view);
        view.setVisible(true);
        view.revalidate();
    }//GEN-LAST:event_mnCVEmployeeLanguageActionPerformed

    private void mnCVEmployeeSkillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCVEmployeeSkillActionPerformed
        InputCVEmployeeSkillView view = new InputCVEmployeeSkillView();
        pnLogin.setVisible(false);
        pnBootcamp.add(view);
        view.setVisible(true);
        view.revalidate();
    }//GEN-LAST:event_mnCVEmployeeSkillActionPerformed

    private void mnCVOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCVOrganizationActionPerformed
        InputCVOrganizationView view = new InputCVOrganizationView();
        pnLogin.setVisible(false);
        pnBootcamp.add(view);
        view.setVisible(true);
        view.revalidate();
    }//GEN-LAST:event_mnCVOrganizationActionPerformed

    private void mnCVAchievementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCVAchievementActionPerformed
        InputCVAchievementView view = new InputCVAchievementView();
        pnLogin.setVisible(false);
        pnBootcamp.add(view);
        view.setVisible(true);
        view.revalidate();
    }//GEN-LAST:event_mnCVAchievementActionPerformed

    private void mnCVEmployeeCertificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCVEmployeeCertificationActionPerformed
        InputCVEmployeeCertificationView view = new InputCVEmployeeCertificationView();
        pnLogin.setVisible(false);
        pnBootcamp.add(view);
        view.setVisible(true);
        view.revalidate();
    }//GEN-LAST:event_mnCVEmployeeCertificationActionPerformed

    private void mnCVWorkExperienceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCVWorkExperienceActionPerformed
        InputCVWorkExperienceView view = new InputCVWorkExperienceView();
        pnLogin.setVisible(false);
        pnBootcamp.add(view);
        view.setVisible(true);
        view.revalidate();
    }//GEN-LAST:event_mnCVWorkExperienceActionPerformed

    private void mnCVFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCVFotoActionPerformed
        InputCVFoto view = new InputCVFoto();
        pnLogin.setVisible(false);
        pnBootcamp.add(view);
        view.setVisible(true);
        view.revalidate();
    }//GEN-LAST:event_mnCVFotoActionPerformed

    private void mnLessonViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnLessonViewActionPerformed
        LessonView lv = new LessonView();
        pnBootcamp.add(lv);
        pnLogin.setVisible(false);
        lv.setVisible(true);
    }//GEN-LAST:event_mnLessonViewActionPerformed

    private void mnScoreViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnScoreViewActionPerformed
        ScoreView sv = new ScoreView();
        pnBootcamp.add(sv);
        pnLogin.setVisible(false);
        sv.setVisible(true);
    }//GEN-LAST:event_mnScoreViewActionPerformed

    private void mnCVGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCVGenerateActionPerformed
        try {
            String fileName = "./src/reports/CV3.jrxml";
            String filetoFill = "./src/reports/CV3.jasper";
            JasperCompileManager.compileReport(fileName);
            Map param = new HashMap();
            param.put("setID", Session.getSession());
            Connection conn = factory.getSessionFactoryOptions().getServiceRegistry().getService(ConnectionProvider.class).getConnection();
            JasperFillManager.fillReport(filetoFill, param,conn);
            JasperPrint jp = JasperFillManager.fillReport(filetoFill, param, conn);
            JasperViewer.viewReport(jp, false);
        } catch (Exception ex) {
            System.out.println(ex.toString());
}
    }//GEN-LAST:event_mnCVGenerateActionPerformed

    private void mnEquipmentsMenuSelected(javax.swing.event.MenuEvent evt) {//GEN-FIRST:event_mnEquipmentsMenuSelected
        // TODO add your handling code here:
    }//GEN-LAST:event_mnEquipmentsMenuSelected

    private void mnAccessCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAccessCardActionPerformed
        EmployeeAccessView eav = new EmployeeAccessView();
        pnBootcamp.add(eav);
        pnLogin.setVisible(false);
        eav.setVisible(true);
    }//GEN-LAST:event_mnAccessCardActionPerformed

    private void mnIdcardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnIdcardActionPerformed
        IdCardView icv = new IdCardView();
        pnBootcamp.add(icv);
        pnLogin.setVisible(false);
        icv.setVisible(true);
    }//GEN-LAST:event_mnIdcardActionPerformed

    private void mnAccessLockerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAccessLockerActionPerformed
        EmployeeLockerView elv = new EmployeeLockerView();
        pnBootcamp.add(elv);
        pnLogin.setVisible(false);
        elv.setVisible(true);
    }//GEN-LAST:event_mnAccessLockerActionPerformed

    private void mnPlacementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnPlacementActionPerformed
        PlacementView pv = new PlacementView();
        pnBootcamp.add(pv);
        pnLogin.setVisible(false);
        pv.setVisible(true);
    }//GEN-LAST:event_mnPlacementActionPerformed

    private void mnGenerateRaportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnGenerateRaportActionPerformed
        try {
            String fileName = "./src/reports/Raport.jrxml";
            String filetoFill = "./src/reports/Raport.jasper";
            JasperCompileManager.compileReport(fileName);
            Map param = new HashMap();
            param.put("setID", Session.getSession());
            Connection conn = factory.getSessionFactoryOptions().getServiceRegistry().getService(ConnectionProvider.class).getConnection();
            JasperFillManager.fillReport(filetoFill, param,conn);
            JasperPrint jp = JasperFillManager.fillReport(filetoFill, param, conn);
            JasperViewer.viewReport(jp, false);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_mnGenerateRaportActionPerformed

    private void mnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCreateAccountActionPerformed
        CreateAccountView cav = new CreateAccountView();
        pnBootcamp.add(cav);
        pnLogin.setVisible(false);
        cav.setVisible(true);
    }//GEN-LAST:event_mnCreateAccountActionPerformed

    private void mnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnLogoutActionPerformed

//        this.revalidate();
    }//GEN-LAST:event_mnLogoutActionPerformed

    private void mnEditCVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnEditCVActionPerformed
        System.out.println("CV");
    }//GEN-LAST:event_mnEditCVActionPerformed

    private void mniLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLogoutActionPerformed
        this.logout();
    }//GEN-LAST:event_mniLogoutActionPerformed

    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
        if (checkLogin()) login();
    }//GEN-LAST:event_btLoginActionPerformed

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
                if ("Windows".equals(info.getName())) {
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
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLogoMII;
    private javax.swing.JLabel lblLogoMetrodata;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JMenuItem mnAccessCard;
    private javax.swing.JMenuItem mnAccessLocker;
    private javax.swing.JMenu mnAccountSetting;
    private javax.swing.JMenu mnBCManagement;
    private javax.swing.JMenuItem mnBatchClassView;
    private javax.swing.JMenuItem mnCVAchievement;
    private javax.swing.JMenuItem mnCVEducationHistory;
    private javax.swing.JMenuItem mnCVEmployeeCertification;
    private javax.swing.JMenuItem mnCVEmployeeLanguage;
    private javax.swing.JMenuItem mnCVEmployeeRole;
    private javax.swing.JMenuItem mnCVEmployeeSkill;
    private javax.swing.JMenuItem mnCVFoto;
    private javax.swing.JMenuItem mnCVGenerate;
    private javax.swing.JMenuItem mnCVOrganization;
    private javax.swing.JMenuItem mnCVWorkExperience;
    private javax.swing.JMenuItem mnCreateAccount;
    private javax.swing.JMenu mnEditCV;
    private javax.swing.JMenu mnEquipments;
    private javax.swing.JMenuItem mnErrorBankView;
    private javax.swing.JMenuItem mnEvaluationView;
    private javax.swing.JMenuItem mnGenerateRaport;
    private javax.swing.JMenuItem mnIdcard;
    private javax.swing.JMenuItem mnLessonView;
    private javax.swing.JMenu mnLocation;
    private javax.swing.JMenu mnLogout;
    private javax.swing.JMenuItem mnParticipantView;
    private javax.swing.JMenuItem mnPlacement;
    private javax.swing.JMenuItem mnScoreView;
    private javax.swing.JMenu mnSeparator;
    private javax.swing.JMenuBar mnbBootcamp;
    private javax.swing.JMenuItem mniLogout;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JPanel pnBootcamp;
    private javax.swing.JPanel pnLogin;
    private javax.swing.JPanel pnLoginCard;
    private javax.swing.JPopupMenu.Separator separatorBM;
    private javax.swing.JPopupMenu.Separator separatorCV;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
