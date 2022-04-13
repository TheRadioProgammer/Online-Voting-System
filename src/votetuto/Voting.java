
package votetuto;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Voting extends javax.swing.JFrame {

  
    public Voting() {
        initComponents();
        DisplayCandidates();
        BravoLbl.setVisible(false);
       
    }
    int VotingId;
    public  Voting(int VoterId)
    {
         initComponents();
        DisplayCandidates();
        BravoLbl.setVisible(false);
        VotingId = VoterId;
      //   JOptionPane.showMessageDialog(this, VotingId);      
    }
 Connection Con = null;
 PreparedStatement pst = null;
 ResultSet Rs = null;
 Statement St = null;
    private void DisplayCandidates()
    {
        try {
           Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
           St = Con.createStatement();
           Rs = St.executeQuery("Select * from CandidateTbl");
           CandidatesTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception e) {
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CnameLbl1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CandidatesTable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        CnameLbl = new javax.swing.JLabel();
        CandidatePictureLbl = new javax.swing.JLabel();
        VoteBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        BravoLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 153, 0));

        jLabel2.setFont(new java.awt.Font("Vollkorn Italic", 0, 26)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Elections Management System");

        CnameLbl1.setFont(new java.awt.Font("Vollkorn Italic", 0, 18)); // NOI18N
        CnameLbl1.setForeground(new java.awt.Color(255, 102, 0));
        CnameLbl1.setIcon(new javax.swing.ImageIcon("C:\\Users\\afwadmin\\Desktop\\Code\\ElectionsJava\\close_window_16px.png")); // NOI18N
        CnameLbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CnameLbl1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(382, 382, 382)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CnameLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CnameLbl1)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Vollkorn Italic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Welcome In MycodeSpace Voting Application");

        CandidatesTable.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        CandidatesTable.setModel(new javax.swing.table.DefaultTableModel(
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
        CandidatesTable.setRowHeight(28);
        CandidatesTable.setSelectionBackground(new java.awt.Color(255, 0, 51));
        CandidatesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CandidatesTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CandidatesTable);

        jButton3.setFont(new java.awt.Font("Vollkorn Italic", 0, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 153, 0));
        jButton3.setText("Back");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Vollkorn Italic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setText("Your Candidate");

        CnameLbl.setFont(new java.awt.Font("Vollkorn Italic", 0, 18)); // NOI18N
        CnameLbl.setForeground(new java.awt.Color(255, 102, 0));
        CnameLbl.setText("Name");

        CandidatePictureLbl.setFont(new java.awt.Font("Vollkorn Italic", 0, 18)); // NOI18N
        CandidatePictureLbl.setForeground(new java.awt.Color(255, 102, 0));
        CandidatePictureLbl.setText("Photo");

        VoteBtn.setFont(new java.awt.Font("Vollkorn Italic", 0, 24)); // NOI18N
        VoteBtn.setForeground(new java.awt.Color(255, 153, 0));
        VoteBtn.setText("Vote");
        VoteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VoteBtnMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Vollkorn Italic", 0, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 0));
        jLabel7.setText("Candidates List");

        BravoLbl.setFont(new java.awt.Font("Vollkorn Italic", 0, 26)); // NOI18N
        BravoLbl.setForeground(new java.awt.Color(51, 255, 0));
        BravoLbl.setText("Vote Counted!!! Bravo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel5)
                                .addGap(63, 63, 63))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(CandidatePictureLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGap(25, 25, 25)
                        .addComponent(VoteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(BravoLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(CnameLbl)
                        .addGap(297, 297, 297)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 949, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(439, 439, 439))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CandidatePictureLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BravoLbl)
                            .addComponent(VoteBtn))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CnameLbl)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 private ImageIcon ResizePhoto(String ImagePath, byte[] pic)
{
    ImageIcon MyImage = null;
    if(ImagePath != null)
    {
        MyImage = new ImageIcon(ImagePath);
    }else{
        MyImage = new ImageIcon(pic);
    }
    Image img = MyImage.getImage();
    Image newImg = img.getScaledInstance(CandidatePictureLbl.getWidth(), CandidatePictureLbl.getHeight(), Image.SCALE_SMOOTH);
    ImageIcon image = new ImageIcon(newImg);
    return image;            
}
    private void FetchPhoto()
    {
        String Query = "select Cphoto from CandidateTbl where CId="+Key;
        Statement St;
        ResultSet Rs;
        try {
    Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
    St = Con.createStatement();
    Rs = St.executeQuery(Query);
    if(Rs.next())
    {
        CandidatePictureLbl.setIcon(ResizePhoto(null, Rs.getBytes("Cphoto")));      
    }
        } catch (Exception e) {
        }
    }
    int Key = -1;
    int ElecId;
    private void CandidatesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CandidatesTableMouseClicked
         DefaultTableModel model = (DefaultTableModel)CandidatesTable.getModel();
        int MyIndex = CandidatesTable.getSelectedRow();
       Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
       CnameLbl.setText(model.getValueAt(MyIndex, 1).toString());
       ElecId = Integer.valueOf(model.getValueAt(MyIndex, 5).toString());
       FetchPhoto();
    }//GEN-LAST:event_CandidatesTableMouseClicked
int VId ;
Statement St1 = null;
ResultSet Rs1 = null;
    private void VCount()
{
    try{
    St1 = Con.createStatement();
    Rs1 = St1.executeQuery("select MAx(VoteId) from VotesTbl");
    Rs1.next();
    VId = Rs1.getInt(1)+1;
    }catch(Exception Ex)
    {
        
    }
}
 int VNumber;
    private void VCheck()
{
    try{
    St1 = Con.createStatement();
    Rs1 = St1.executeQuery("select * from VotesTbl where VoterId="+VotingId+" and ElectId = "+ElecId+"");
  if(Rs1.next())
  {
      VNumber = 1;
  }else
  {
     VNumber = 0; 
  }
    }catch(Exception Ex)
    {
        JOptionPane.showMessageDialog(this, Ex);
    }
}
    private void VoteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoteBtnMouseClicked
       VCheck();
        if(Key == -1)
        {
            JOptionPane.showMessageDialog(this, "Select Your Candidate");
        }else if(VNumber > 0)
        {
             JOptionPane.showMessageDialog(this, "You Can Not Vote Twice!!!");
        }else
        {
            try {
              VCount();
              Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
                PreparedStatement Add = Con.prepareStatement("insert into VotesTbl values(?,?,?,?)");
                Add.setInt(1, VId);                
                Add.setInt(2, VotingId);
                Add.setInt(3, ElecId);
                Add.setInt(4, Key);
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Vote Counted");
                Con.close();
                BravoLbl.setVisible(true);
                DisplayCandidates();
                VoteBtn.setVisible(false);
            } catch (Exception e) {
           JOptionPane.showMessageDialog(this, e);
            }         
        }
    }//GEN-LAST:event_VoteBtnMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3MouseClicked

    private void CnameLbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CnameLbl1MouseClicked
        System.exit(1);
    }//GEN-LAST:event_CnameLbl1MouseClicked

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
            java.util.logging.Logger.getLogger(Voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Voting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Voting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BravoLbl;
    private javax.swing.JLabel CandidatePictureLbl;
    private javax.swing.JTable CandidatesTable;
    private javax.swing.JLabel CnameLbl;
    private javax.swing.JLabel CnameLbl1;
    private javax.swing.JButton VoteBtn;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
