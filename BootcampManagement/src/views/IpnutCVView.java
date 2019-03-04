/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

/**
 *
 * @author FES
 */
public class IpnutCVView extends javax.swing.JInternalFrame {

    /**
     * Creates new form IpnutCVView
     */
    public IpnutCVView() {
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

        pnInputMain = new javax.swing.JPanel();
        pnMTop = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnMCenter = new javax.swing.JPanel();
        pnMCLeft = new javax.swing.JPanel();
        pnEmpRole = new javax.swing.JPanel();
        lblRole1 = new javax.swing.JLabel();
        cbEmpRole = new javax.swing.JComboBox<>();
        lblRole2 = new javax.swing.JLabel();
        ftfRoleStart = new javax.swing.JFormattedTextField();
        lblRole3 = new javax.swing.JLabel();
        ftfRoleEnd = new javax.swing.JFormattedTextField();
        jSeparator2 = new javax.swing.JSeparator();
        pnEducationHis = new javax.swing.JPanel();
        lblEducationHis1 = new javax.swing.JLabel();
        cbEducationHis = new javax.swing.JComboBox<>();
        lblEducationHis2 = new javax.swing.JLabel();
        tfEducationHisGPA = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jSeparator3 = new javax.swing.JSeparator();
        pnEmpLanguage = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jComboBox2 = new javax.swing.JComboBox<>();
        jSeparator4 = new javax.swing.JSeparator();
        pnEmpSkill = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jComboBox3 = new javax.swing.JComboBox<>();
        pnMCRight = new javax.swing.JPanel();
        pnMCR1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        pnMCR2 = new javax.swing.JPanel();
        jSeparator6 = new javax.swing.JSeparator();
        pnMCR3 = new javax.swing.JPanel();
        jSeparator7 = new javax.swing.JSeparator();
        pnMCR4 = new javax.swing.JPanel();
        pnMBottom = new javax.swing.JPanel();

        setClosable(true);
        setMaximumSize(new java.awt.Dimension(1200, 1000));
        setPreferredSize(new java.awt.Dimension(1200, 1000));

        pnInputMain.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("INPUT CV");
        pnMTop.add(jLabel1);

        pnInputMain.add(pnMTop, java.awt.BorderLayout.PAGE_START);

        pnMCenter.setLayout(new java.awt.GridLayout(1, 2));

        pnMCLeft.setMaximumSize(new java.awt.Dimension(1000, 1000));
        pnMCLeft.setMinimumSize(new java.awt.Dimension(500, 48));
        pnMCLeft.setPreferredSize(new java.awt.Dimension(600, 500));
        pnMCLeft.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        pnEmpRole.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblRole1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRole1.setText("Role:  ");
        pnEmpRole.add(lblRole1);

        cbEmpRole.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbEmpRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        cbEmpRole.setMinimumSize(new java.awt.Dimension(56, 25));
        cbEmpRole.setName(""); // NOI18N
        cbEmpRole.setPreferredSize(new java.awt.Dimension(140, 25));
        pnEmpRole.add(cbEmpRole);

        lblRole2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRole2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblRole2.setText("  Start: ");
        lblRole2.setPreferredSize(new java.awt.Dimension(61, 22));
        pnEmpRole.add(lblRole2);

        ftfRoleStart.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-MM-yyyy"))));
        ftfRoleStart.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ftfRoleStart.setPreferredSize(new java.awt.Dimension(100, 25));
        pnEmpRole.add(ftfRoleStart);

        lblRole3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblRole3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblRole3.setText("End:");
        pnEmpRole.add(lblRole3);

        ftfRoleEnd.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-MM-yyyy"))));
        ftfRoleEnd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ftfRoleEnd.setPreferredSize(new java.awt.Dimension(100, 25));
        pnEmpRole.add(ftfRoleEnd);

        pnMCLeft.add(pnEmpRole);

        jSeparator2.setPreferredSize(new java.awt.Dimension(600, 5));
        pnMCLeft.add(jSeparator2);

        pnEducationHis.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEducationHis1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEducationHis1.setText("Education History: ");
        pnEducationHis.add(lblEducationHis1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        cbEducationHis.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cbEducationHis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        cbEducationHis.setMinimumSize(new java.awt.Dimension(100, 25));
        cbEducationHis.setPreferredSize(new java.awt.Dimension(390, 25));
        pnEducationHis.add(cbEducationHis, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 380, -1));

        lblEducationHis2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEducationHis2.setText("GPA:  ");
        pnEducationHis.add(lblEducationHis2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        tfEducationHisGPA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tfEducationHisGPA.setMinimumSize(new java.awt.Dimension(6, 25));
        tfEducationHisGPA.setPreferredSize(new java.awt.Dimension(80, 25));
        pnEducationHis.add(tfEducationHisGPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        jButton1.setText("jButton1");
        pnEducationHis.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        jButton2.setText("jButton2");
        pnEducationHis.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        pnEducationHis.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 580, 110));

        pnMCLeft.add(pnEducationHis);

        jSeparator3.setPreferredSize(new java.awt.Dimension(600, 5));
        pnMCLeft.add(jSeparator3);

        pnEmpLanguage.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Employee Language: ");
        pnEmpLanguage.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        pnEmpLanguage.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 580, 120));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBox2.setMinimumSize(new java.awt.Dimension(30, 25));
        jComboBox2.setPreferredSize(new java.awt.Dimension(300, 25));
        pnEmpLanguage.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 310, -1));

        pnMCLeft.add(pnEmpLanguage);

        jSeparator4.setPreferredSize(new java.awt.Dimension(600, 5));
        pnMCLeft.add(jSeparator4);

        pnEmpSkill.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Employee Skill: ");
        pnEmpSkill.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable3);

        pnEmpSkill.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 580, 120));

        jComboBox3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        jComboBox3.setMinimumSize(new java.awt.Dimension(30, 25));
        jComboBox3.setPreferredSize(new java.awt.Dimension(300, 25));
        pnEmpSkill.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 310, -1));

        pnMCLeft.add(pnEmpSkill);

        pnMCenter.add(pnMCLeft);

        pnMCR1.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Role:  ");
        pnMCR1.add(jLabel9);

        pnMCRight.add(pnMCR1);

        jSeparator5.setPreferredSize(new java.awt.Dimension(600, 5));
        pnMCRight.add(jSeparator5);

        javax.swing.GroupLayout pnMCR2Layout = new javax.swing.GroupLayout(pnMCR2);
        pnMCR2.setLayout(pnMCR2Layout);
        pnMCR2Layout.setHorizontalGroup(
            pnMCR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 592, Short.MAX_VALUE)
        );
        pnMCR2Layout.setVerticalGroup(
            pnMCR2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 212, Short.MAX_VALUE)
        );

        pnMCRight.add(pnMCR2);

        jSeparator6.setPreferredSize(new java.awt.Dimension(600, 5));
        pnMCRight.add(jSeparator6);

        javax.swing.GroupLayout pnMCR3Layout = new javax.swing.GroupLayout(pnMCR3);
        pnMCR3.setLayout(pnMCR3Layout);
        pnMCR3Layout.setHorizontalGroup(
            pnMCR3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 592, Short.MAX_VALUE)
        );
        pnMCR3Layout.setVerticalGroup(
            pnMCR3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 212, Short.MAX_VALUE)
        );

        pnMCRight.add(pnMCR3);

        jSeparator7.setPreferredSize(new java.awt.Dimension(600, 5));
        pnMCRight.add(jSeparator7);

        javax.swing.GroupLayout pnMCR4Layout = new javax.swing.GroupLayout(pnMCR4);
        pnMCR4.setLayout(pnMCR4Layout);
        pnMCR4Layout.setHorizontalGroup(
            pnMCR4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 592, Short.MAX_VALUE)
        );
        pnMCR4Layout.setVerticalGroup(
            pnMCR4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 212, Short.MAX_VALUE)
        );

        pnMCRight.add(pnMCR4);

        pnMCenter.add(pnMCRight);

        pnInputMain.add(pnMCenter, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout pnMBottomLayout = new javax.swing.GroupLayout(pnMBottom);
        pnMBottom.setLayout(pnMBottomLayout);
        pnMBottomLayout.setHorizontalGroup(
            pnMBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1184, Short.MAX_VALUE)
        );
        pnMBottomLayout.setVerticalGroup(
            pnMBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 82, Short.MAX_VALUE)
        );

        pnInputMain.add(pnMBottom, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnInputMain, javax.swing.GroupLayout.DEFAULT_SIZE, 1184, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnInputMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbEducationHis;
    private javax.swing.JComboBox<String> cbEmpRole;
    private javax.swing.JFormattedTextField ftfRoleEnd;
    private javax.swing.JFormattedTextField ftfRoleStart;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JLabel lblEducationHis1;
    private javax.swing.JLabel lblEducationHis2;
    private javax.swing.JLabel lblRole1;
    private javax.swing.JLabel lblRole2;
    private javax.swing.JLabel lblRole3;
    private javax.swing.JPanel pnEducationHis;
    private javax.swing.JPanel pnEmpLanguage;
    private javax.swing.JPanel pnEmpRole;
    private javax.swing.JPanel pnEmpSkill;
    private javax.swing.JPanel pnInputMain;
    private javax.swing.JPanel pnMBottom;
    private javax.swing.JPanel pnMCLeft;
    private javax.swing.JPanel pnMCR1;
    private javax.swing.JPanel pnMCR2;
    private javax.swing.JPanel pnMCR3;
    private javax.swing.JPanel pnMCR4;
    private javax.swing.JPanel pnMCRight;
    private javax.swing.JPanel pnMCenter;
    private javax.swing.JPanel pnMTop;
    private javax.swing.JTextField tfEducationHisGPA;
    // End of variables declaration//GEN-END:variables
}
