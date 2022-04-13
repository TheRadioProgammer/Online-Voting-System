
package votetuto;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Elections extends javax.swing.JFrame {

 Connection Con = null;
 PreparedStatement pst = null;
 ResultSet Rs = null;
 Statement St = null;
    public Elections() {
        initComponents();
        DisplayElections();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CnameLbl2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ElectionNameTb = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ElectionsTable = new javax.swing.JTable();
        AddButton = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        ElectionDate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));

        jLabel2.setFont(new java.awt.Font("Vollkorn Italic", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Elections Management System");

        CnameLbl2.setFont(new java.awt.Font("Vollkorn Italic", 0, 18)); // NOI18N
        CnameLbl2.setForeground(new java.awt.Color(255, 102, 0));
        CnameLbl2.setIcon(new javax.swing.ImageIcon("C:\\Users\\afwadmin\\Desktop\\Code\\ElectionsJava\\close_window_16px.png")); // NOI18N
        CnameLbl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CnameLbl2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(320, 320, 320)
                .addComponent(CnameLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(CnameLbl2))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Vollkorn Italic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Manage Elections");

        ElectionNameTb.setFont(new java.awt.Font("Vollkorn Italic", 0, 16)); // NOI18N
        ElectionNameTb.setForeground(new java.awt.Color(255, 153, 0));

        jLabel3.setFont(new java.awt.Font("Vollkorn Italic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Vollkorn Italic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("Name");

        ElectionsTable.setFont(new java.awt.Font("Vollkorn Regular", 0, 14)); // NOI18N
        ElectionsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Name", "Date"
            }
        ));
        ElectionsTable.setRowHeight(25);
        ElectionsTable.setSelectionBackground(new java.awt.Color(255, 153, 0));
        ElectionsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ElectionsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ElectionsTable);

        AddButton.setFont(new java.awt.Font("Vollkorn Italic", 0, 20)); // NOI18N
        AddButton.setForeground(new java.awt.Color(255, 153, 0));
        AddButton.setText("Add");
        AddButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddButtonMouseClicked(evt);
            }
        });

        EditBtn.setFont(new java.awt.Font("Vollkorn Italic", 0, 20)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(255, 153, 0));
        EditBtn.setText("Edit");
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });

        DeleteBtn.setFont(new java.awt.Font("Vollkorn Italic", 0, 20)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 153, 0));
        DeleteBtn.setText("Delete");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });

        BackBtn.setFont(new java.awt.Font("Vollkorn Italic", 0, 20)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(255, 153, 0));
        BackBtn.setText("Back");
        BackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(427, 427, 427))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(ElectionNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(ElectionDate, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(104, 104, 104))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ElectionDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ElectionNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(158, 158, 158)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
int EId ;
Statement St1 = null;
ResultSet Rs1 = null;
    private void ElecCount()
{
    try{
    St1 = Con.createStatement();
    Rs1 = St1.executeQuery("select MAx(EId) from ElectionTbl");
    Rs1.next();
    EId = Rs1.getInt(1)+1;
    }catch(Exception Ex)
    {
        
    }
}
    private void DisplayElections()
    {
        try {
           Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
           St = Con.createStatement();
           Rs = St.executeQuery("Select * from ElectionTbl");
           ElectionsTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception e) {
        }
    }
    private void AddButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButtonMouseClicked
        //Code to Insert New Elections in the database
        if(ElectionNameTb.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter The Election Name");
        }else
        {
            try {
              String Day = String.valueOf(ElectionDate.getDate().getDay());
              String Month = String.valueOf(ElectionDate.getDate().getMonth());
              String Year = String.valueOf(ElectionDate.getDate().getYear());
              String EDate = Day + "/" + Month + "/" + Year;
              ElecCount();
              Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
                PreparedStatement Add = Con.prepareStatement("insert into ElectionTbl values(?,?,?)");
                Add.setInt(1, EId);
                Add.setString(2, ElectionNameTb.getText());
                Add.setString(3, EDate);
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Election Added Successfully");
                Con.close();
                DisplayElections();
            } catch (Exception e) {
           JOptionPane.showMessageDialog(this, e);
            }         
        }
    }//GEN-LAST:event_AddButtonMouseClicked
int Key = -1;
    private void ElectionsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ElectionsTableMouseClicked
       DefaultTableModel model = (DefaultTableModel)ElectionsTable.getModel();
       int MyIndex = ElectionsTable.getSelectedRow();
       Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
       ElectionNameTb.setText(model.getValueAt(MyIndex, 1).toString());
    }//GEN-LAST:event_ElectionsTableMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        if(Key == -1)
        {
            JOptionPane.showMessageDialog(this, "Select The Election To Be Deleted");
        }else{
            try {
                 Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
                 String Query = "Delete from ElectionTbl where EId ="+Key;
                 Statement Del = Con.createStatement();
                 Del.executeUpdate(Query);
                 JOptionPane.showMessageDialog(this, "Election Deleted Successfully");
                 DisplayElections();
            } catch (Exception e) {
              JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
        if(Key == -1 || ElectionDate.getDate().toString().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Information");
        }else{
            try {
                String Day = String.valueOf(ElectionDate.getDate().getDay());
              String Month = String.valueOf(ElectionDate.getDate().getMonth());
              String Year = String.valueOf(ElectionDate.getDate().getYear());
              String EDate = Day + "/" + Month + "/" + Year;
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
                 String Query = "Update ElectionTbl set EName=?,EDate=? where EId=?";
                 
                 PreparedStatement UpdateQuery = Con.prepareStatement(Query);
                 UpdateQuery.setString(1, ElectionNameTb.getText());
                 UpdateQuery.setString(2, EDate);
                 UpdateQuery.setInt(3, Key);
                 UpdateQuery.executeUpdate();
                 JOptionPane.showMessageDialog(this, "Election Updated Successfully");
                 DisplayElections();
            } catch (Exception e) {
              JOptionPane.showMessageDialog(this, e);
            }
        }
        
    }//GEN-LAST:event_EditBtnMouseClicked

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
        new MainMenu().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BackBtnMouseClicked

    private void CnameLbl2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CnameLbl2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CnameLbl2MouseClicked

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
            java.util.logging.Logger.getLogger(Elections.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Elections.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Elections.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Elections.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Elections().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel CnameLbl2;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private com.toedter.calendar.JDateChooser ElectionDate;
    private javax.swing.JTextField ElectionNameTb;
    private javax.swing.JTable ElectionsTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
