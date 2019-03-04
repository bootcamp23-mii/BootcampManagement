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
public class ErrorBankView extends javax.swing.JInternalFrame {

    /**
     * Creates new form AspectView
     */
    public ErrorBankView() {
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

        lblTitleErrorBank = new javax.swing.JLabel();
        pnErrorBank = new javax.swing.JPanel();
        lblID = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        lblSubmitDate = new javax.swing.JLabel();
        tfSubmitDate = new javax.swing.JTextField();
        lblDescription = new javax.swing.JLabel();
        tfDescription = new javax.swing.JTextField();
        lblSolution = new javax.swing.JLabel();
        tfSolution = new javax.swing.JTextField();
        lblClassType = new javax.swing.JLabel();
        cbClassType = new javax.swing.JComboBox<>();
        lblEmployee = new javax.swing.JLabel();
        cbEmployee = new javax.swing.JComboBox<>();
        pnTable = new javax.swing.JPanel();
        scpErrorBank = new javax.swing.JScrollPane();
        tbErrorBank = new javax.swing.JTable();

        setClosable(true);
        getContentPane().setLayout(new java.awt.BorderLayout(10, 10));

        lblTitleErrorBank.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleErrorBank.setText("ERROR BANK");
        getContentPane().add(lblTitleErrorBank, java.awt.BorderLayout.PAGE_START);

        pnErrorBank.setLayout(new java.awt.GridLayout(6, 2, 5, 5));

        lblID.setText("ID");
        pnErrorBank.add(lblID);
        pnErrorBank.add(tfID);

        lblSubmitDate.setText("Submit Date");
        pnErrorBank.add(lblSubmitDate);
        pnErrorBank.add(tfSubmitDate);

        lblDescription.setText("Description");
        pnErrorBank.add(lblDescription);
        pnErrorBank.add(tfDescription);

        lblSolution.setText("Solution");
        pnErrorBank.add(lblSolution);
        pnErrorBank.add(tfSolution);

        lblClassType.setText("Class Type");
        pnErrorBank.add(lblClassType);

        pnErrorBank.add(cbClassType);

        lblEmployee.setText("Employee");
        pnErrorBank.add(lblEmployee);

        pnErrorBank.add(cbEmployee);

        getContentPane().add(pnErrorBank, java.awt.BorderLayout.CENTER);

        tbErrorBank.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Submit Date", "Description", "Solution", "Class Type", "Employee"
            }
        ));
        scpErrorBank.setViewportView(tbErrorBank);

        javax.swing.GroupLayout pnTableLayout = new javax.swing.GroupLayout(pnTable);
        pnTable.setLayout(pnTableLayout);
        pnTableLayout.setHorizontalGroup(
            pnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
            .addGroup(pnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(scpErrorBank, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE))
        );
        pnTableLayout.setVerticalGroup(
            pnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(pnTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnTableLayout.createSequentialGroup()
                    .addComponent(scpErrorBank, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        getContentPane().add(pnTable, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbClassType;
    private javax.swing.JComboBox<String> cbEmployee;
    private javax.swing.JLabel lblClassType;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblEmployee;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblSolution;
    private javax.swing.JLabel lblSubmitDate;
    private javax.swing.JLabel lblTitleErrorBank;
    private javax.swing.JPanel pnErrorBank;
    private javax.swing.JPanel pnTable;
    private javax.swing.JScrollPane scpErrorBank;
    private javax.swing.JTable tbErrorBank;
    private javax.swing.JTextField tfDescription;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfSolution;
    private javax.swing.JTextField tfSubmitDate;
    // End of variables declaration//GEN-END:variables
}