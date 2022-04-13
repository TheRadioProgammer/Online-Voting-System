
package votetuto;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author afwadmin
 */
public class DahsBoard extends javax.swing.JFrame {

    /**
     * Creates new form DahsBoard
     */
    public DahsBoard() {
        initComponents();
        DisplayElections();
    }
 Connection Con = null;
 PreparedStatement pst = null;
 ResultSet Rs = null;
 Statement St = null;
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CnameLbl1 = new javax.swing.JLabel();
        CnameLbl2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ElectionsTable = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        WinnerLbl = new javax.swing.JLabel();
        CandidatePictureLbl = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        BravoLbl = new javax.swing.JLabel();
        VotesLbl = new javax.swing.JLabel();
        PercentageLbl = new javax.swing.JLabel();

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
                .addGap(382, 382, 382)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(CnameLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(503, 503, 503)
                    .addComponent(CnameLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(537, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CnameLbl2)))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addComponent(CnameLbl1)
                    .addContainerGap(31, Short.MAX_VALUE)))
        );

        jLabel1.setFont(new java.awt.Font("Vollkorn Italic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Welcome In MycodeSpace Voting Application");

        ElectionsTable.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ElectionsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        ElectionsTable.setRowHeight(28);
        ElectionsTable.setSelectionBackground(new java.awt.Color(255, 0, 51));
        ElectionsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ElectionsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ElectionsTable);

        jButton3.setFont(new java.awt.Font("Vollkorn Italic", 0, 20)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 153, 0));
        jButton3.setText("Back");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        WinnerLbl.setFont(new java.awt.Font("Vollkorn Italic", 0, 18)); // NOI18N
        WinnerLbl.setForeground(new java.awt.Color(255, 102, 0));
        WinnerLbl.setText("Name");

        CandidatePictureLbl.setFont(new java.awt.Font("Vollkorn Italic", 0, 18)); // NOI18N
        CandidatePictureLbl.setForeground(new java.awt.Color(255, 102, 0));
        CandidatePictureLbl.setText("Photo");

        jLabel7.setFont(new java.awt.Font("Vollkorn Italic", 0, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 0));
        jLabel7.setText("Elections List");

        BravoLbl.setFont(new java.awt.Font("Vollkorn Italic", 0, 26)); // NOI18N
        BravoLbl.setForeground(new java.awt.Color(51, 255, 0));
        BravoLbl.setText("Winner");

        VotesLbl.setFont(new java.awt.Font("Century Gothic", 0, 26)); // NOI18N
        VotesLbl.setForeground(new java.awt.Color(51, 255, 0));
        VotesLbl.setText("Votes");

        PercentageLbl.setFont(new java.awt.Font("Vollkorn Italic", 0, 26)); // NOI18N
        PercentageLbl.setForeground(new java.awt.Color(255, 0, 51));
        PercentageLbl.setText("Percentage");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(439, 439, 439))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(BravoLbl)
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(CandidatePictureLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(VotesLbl)
                            .addComponent(PercentageLbl)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(WinnerLbl)
                        .addGap(297, 297, 297)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 949, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(BravoLbl)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CandidatePictureLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(VotesLbl)
                        .addGap(26, 26, 26)
                        .addComponent(PercentageLbl)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(WinnerLbl)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
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
int WinnerId,Percentage,Votes;

    private  void GetWinner()
{
    try{
  Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
 St = Con.createStatement();
 String Query = "select CandidateId, Count(CandidateId) from VotesTbl where ElectId="+Key+" Group BY CandidateId ORDER BY CandidateId DESC LIMIT 1 ";
 Rs = St.executeQuery(Query);
 while (Rs.next()) {
 //JOptionPane.showMessageDialog(this,""+Rs.getInt(1));
     WinnerId = Rs.getInt(1);
 } 
 }catch(SQLException e)
 {
     JOptionPane.showMessageDialog(this, e);
 }
}
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
private void GetWinnerData()
{
    
        String Query = "select Cphoto,CName from CandidateTbl where CId="+WinnerId;
        Statement St;
        ResultSet Rs;
        try {
    Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
    St = Con.createStatement();
    Rs = St.executeQuery(Query);
    if(Rs.next())
    {
        CandidatePictureLbl.setIcon(ResizePhoto(null, Rs.getBytes("Cphoto")));
        WinnerLbl.setText(Rs.getString("CName"));
    }
        } catch (Exception e) {
        }   
}
private void GetVotes()
{
    try{
  Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
 St = Con.createStatement();
 String Query = "select Count(CandidateId) from VotesTbl where CandidateId="+WinnerId;
 Rs = St.executeQuery(Query);
 while (Rs.next()) {
 
     Votes = Rs.getInt(1);
    VotesLbl.setText(Votes+" Votes");    
 } 
 }catch(SQLException e)
 {
     JOptionPane.showMessageDialog(this, e);
 }
}
int TotalVotes;
double WinPercentage;
private void GetPercentage()
{   
       try{
  Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
 St = Con.createStatement();
 String Query = "select Count(*) from VotesTbl where ElectID="+Key;
 Rs = St.executeQuery(Query);
 while (Rs.next()) {
  TotalVotes = Rs.getInt(1);  
 if(TotalVotes == 0)
 {
     JOptionPane.showMessageDialog(this, "No Vote Yet for this election");
     CandidatePictureLbl.setIcon(null);
     VotesLbl.setText("");
     PercentageLbl.setText("");
 }else{
  WinPercentage = (Votes*100)/TotalVotes;
  PercentageLbl.setText(new DecimalFormat("##.##").format(WinPercentage)+"%");
 }
 
 } 
 }catch(SQLException e)
 {
     JOptionPane.showMessageDialog(this, e);
 }
}
    int Key = -1;
    private void ElectionsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ElectionsTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)ElectionsTable.getModel();
        int MyIndex = ElectionsTable.getSelectedRow();
        Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
        GetWinner();
        GetWinnerData();
        GetVotes();
        GetPercentage();
    }//GEN-LAST:event_ElectionsTableMouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        new MainMenu().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jButton3MouseClicked

    private void CnameLbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CnameLbl1MouseClicked
        System.exit(1);
    }//GEN-LAST:event_CnameLbl1MouseClicked

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
            java.util.logging.Logger.getLogger(DahsBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DahsBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DahsBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DahsBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DahsBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BravoLbl;
    private javax.swing.JLabel CandidatePictureLbl;
    private javax.swing.JLabel CnameLbl1;
    private javax.swing.JLabel CnameLbl2;
    private javax.swing.JTable ElectionsTable;
    private javax.swing.JLabel PercentageLbl;
    private javax.swing.JLabel VotesLbl;
    private javax.swing.JLabel WinnerLbl;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
