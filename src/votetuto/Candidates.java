/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votetuto;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import jdk.nashorn.internal.parser.TokenType;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author afwadmin
 */
public class Candidates extends javax.swing.JFrame {

    /**
     * Creates new form Candidates
     */
    public Candidates() {
        initComponents();
        GetElections();
        DisplayCandidates();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CandAgeTb = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        CnameLbl1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CandNameTb = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CandidateTable = new javax.swing.JTable();
        AddBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        CAgeTb = new javax.swing.JTextField();
        CandGenCb = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ElectionCb = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        CandidatePictureLbl = new javax.swing.JLabel();
        BrowseBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        CandAgeTb.setBackground(new java.awt.Color(255, 255, 255));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(332, 332, 332)
                .addComponent(CnameLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CnameLbl1)
                    .addComponent(jLabel2))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Vollkorn Italic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Manage Candidates");

        CandNameTb.setFont(new java.awt.Font("Vollkorn Italic", 0, 16)); // NOI18N
        CandNameTb.setForeground(new java.awt.Color(255, 153, 0));

        jLabel3.setFont(new java.awt.Font("Vollkorn Italic", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Vollkorn Italic", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("Age");

        CandidateTable.setFont(new java.awt.Font("Vollkorn Regular", 0, 14)); // NOI18N
        CandidateTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Gender", "Photo", "Election"
            }
        ));
        CandidateTable.setRowHeight(25);
        CandidateTable.setSelectionBackground(new java.awt.Color(255, 153, 0));
        CandidateTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CandidateTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CandidateTable);

        AddBtn.setFont(new java.awt.Font("Vollkorn Italic", 0, 20)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(255, 153, 0));
        AddBtn.setText("Add");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseEntered(evt);
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

        CAgeTb.setFont(new java.awt.Font("Vollkorn Italic", 0, 16)); // NOI18N
        CAgeTb.setForeground(new java.awt.Color(255, 153, 0));

        CandGenCb.setFont(new java.awt.Font("Vollkorn Italic", 0, 14)); // NOI18N
        CandGenCb.setForeground(new java.awt.Color(255, 153, 0));
        CandGenCb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));

        jLabel5.setFont(new java.awt.Font("Vollkorn Italic", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 0));
        jLabel5.setText("Photo");

        jLabel6.setFont(new java.awt.Font("Vollkorn Italic", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("Elections");

        ElectionCb.setFont(new java.awt.Font("Vollkorn Italic", 0, 14)); // NOI18N
        ElectionCb.setForeground(new java.awt.Color(255, 153, 0));

        jLabel7.setFont(new java.awt.Font("Vollkorn Italic", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 0));
        jLabel7.setText("Gender");

        CandidatePictureLbl.setFont(new java.awt.Font("Vollkorn Italic", 0, 18)); // NOI18N
        CandidatePictureLbl.setForeground(new java.awt.Color(255, 102, 0));
        CandidatePictureLbl.setText("Photo");

        BrowseBtn.setFont(new java.awt.Font("Vollkorn Italic", 0, 20)); // NOI18N
        BrowseBtn.setForeground(new java.awt.Color(255, 153, 0));
        BrowseBtn.setText("Browse");
        BrowseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BrowseBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout CandAgeTbLayout = new javax.swing.GroupLayout(CandAgeTb);
        CandAgeTb.setLayout(CandAgeTbLayout);
        CandAgeTbLayout.setHorizontalGroup(
            CandAgeTbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CandAgeTbLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(427, 427, 427))
            .addGroup(CandAgeTbLayout.createSequentialGroup()
                .addGroup(CandAgeTbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CandAgeTbLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(CandAgeTbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CandAgeTbLayout.createSequentialGroup()
                                .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(CandAgeTbLayout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ElectionCb, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(CandAgeTbLayout.createSequentialGroup()
                                .addGroup(CandAgeTbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(CandNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(CandAgeTbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CandAgeTbLayout.createSequentialGroup()
                                        .addGroup(CandAgeTbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CAgeTb, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addGap(18, 18, 18)
                                        .addComponent(CandGenCb, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(CandAgeTbLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(CandAgeTbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(CandidatePictureLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CandAgeTbLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BrowseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
            .addGroup(CandAgeTbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CandAgeTbLayout.createSequentialGroup()
                    .addGap(259, 259, 259)
                    .addComponent(jLabel7)
                    .addContainerGap(759, Short.MAX_VALUE)))
        );
        CandAgeTbLayout.setVerticalGroup(
            CandAgeTbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CandAgeTbLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGroup(CandAgeTbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CandAgeTbLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(CandAgeTbLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(CandAgeTbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CandAgeTbLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(CandAgeTbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CAgeTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CandGenCb, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(CandAgeTbLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CandNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(CandAgeTbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CandAgeTbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ElectionCb, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CandidatePictureLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BrowseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(CandAgeTbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))))
            .addGroup(CandAgeTbLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CandAgeTbLayout.createSequentialGroup()
                    .addGap(155, 155, 155)
                    .addComponent(jLabel7)
                    .addContainerGap(423, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CandAgeTb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CandAgeTb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 Connection Con = null;
 PreparedStatement pst = null;
 ResultSet Rs = null;
 Statement St = null;
    private void GetElections()
    {
        try {
              Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
              St = Con.createStatement();
              String Query = "select * from ElectionTbl";
              Rs = St.executeQuery(Query);
              while(Rs.next())
              {
                  String ElectId = Rs.getString("EId");
                  ElectionCb.addItem(ElectId);
              }
        } catch (Exception e) {
        }
    }
    private void DisplayCandidates()
    {
        try {
           Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
           St = Con.createStatement();
           Rs = St.executeQuery("Select * from CandidateTbl");
           CandidateTable.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception e) {
        }
    }
    int CId ;
Statement St1 = null;
ResultSet Rs1 = null; 
private void CandCount()
{
    try{
    St1 = Con.createStatement();
    Rs1 = St1.executeQuery("select MAx(CId) from CandidateTbl");
    Rs1.next();
    CId = Rs1.getInt(1)+1;
    }catch(Exception Ex)
    {
        
    }
}
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        if(CAgeTb.getText().isEmpty() || CandNameTb.getText().isEmpty()||ElectionCb.getSelectedIndex()==-1||CandGenCb.getSelectedIndex() == -1)
        {
            JOptionPane.showMessageDialog(this, "Missing Information");
        }else
        {
         
            try {
           CandCount();
          Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
           PreparedStatement Add = Con.prepareStatement("insert into CandidateTbl values(?,?,?,?,?,?)");
           InputStream img = new  FileInputStream(imgpath);
           Add.setInt(1, CId);
           Add.setString(2, CandNameTb.getText());
           Add.setInt(3, Integer.valueOf(CAgeTb.getText()));
           Add.setString(4, CandGenCb.getSelectedItem().toString());
           Add.setBlob(5, img);
           Add.setInt(6, Integer.valueOf(ElectionCb.getSelectedItem().toString()));
           int row = Add.executeUpdate();
           JOptionPane.showMessageDialog(this, "Candidate Registered");
           Con.close();
           DisplayCandidates();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex);
            }
             
              
        }
    }//GEN-LAST:event_AddBtnMouseClicked
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
    String imgpath = null;
    private void BrowseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BrowseBtnMouseClicked
       //Fetch candidate Photo
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","gif","png");
        chooser.addChoosableFileFilter(filter);
        int result = chooser.showSaveDialog(null);
        if(result == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = chooser.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            CandidatePictureLbl.setIcon(ResizePhoto(path,null));
            imgpath = path;
        }
    }//GEN-LAST:event_BrowseBtnMouseClicked
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
    private void CandidateTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CandidateTableMouseClicked
       DefaultTableModel model = (DefaultTableModel)CandidateTable.getModel();
        int MyIndex = CandidateTable.getSelectedRow();
       Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
       CandNameTb.setText(model.getValueAt(MyIndex, 1).toString());
       CAgeTb.setText(model.getValueAt(MyIndex, 2).toString());
       CandGenCb.setSelectedItem(model.getValueAt(MyIndex, 3).toString());
       CandGenCb.setSelectedItem(model.getValueAt(MyIndex, 5).toString());
       FetchPhoto();
    }//GEN-LAST:event_CandidateTableMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
          if(Key == -1)
        {
            JOptionPane.showMessageDialog(this, "Select The Election To Be Deleted");
        }else{
            try {
                 Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
                 String Query = "Delete from CandidateTbl where CId ="+Key;
                 Statement Del = Con.createStatement();
                 Del.executeUpdate(Query);
                 JOptionPane.showMessageDialog(this, "Candidate Deleted Successfully");
                 DisplayCandidates();
            } catch (Exception e) {
              JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
          if(imgpath != null){
            try {
               InputStream img = new FileInputStream(imgpath);
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/electionsdb","root","");
                 String Query = "Update CandidateTbl set CName=?,CAge=?,CGen=?,Cphoto=?,CElect=? where CId=?";            
                 PreparedStatement UpdateQuery = Con.prepareStatement(Query);
                 UpdateQuery.setString(1, CandNameTb.getText());
                 UpdateQuery.setInt(2, Integer.valueOf(CAgeTb.getText().toString()));
                 UpdateQuery.setString(3, CandGenCb.getSelectedItem().toString());
                 UpdateQuery.setBlob(4, img);
                 UpdateQuery.setString(5, ElectionCb.getSelectedItem().toString());
                 UpdateQuery.setInt(6, Key);              
                if(UpdateQuery.executeUpdate() == 1) 
                {
                    JOptionPane.showMessageDialog(this, "Candidate Updated Successfully");
                 DisplayCandidates(); 
                } else{
                    JOptionPane.showMessageDialog(this, "Missing Information");
                }
        }catch(Exception Ex){
             JOptionPane.showMessageDialog(this, Ex);
        }
          }
          else{
            JOptionPane.showMessageDialog(this, "Select Photo"); 
            CandidatePictureLbl.setIcon(null);
            CandidatePictureLbl.setText("");
          }
           imgpath = null;                
    }//GEN-LAST:event_EditBtnMouseClicked

    private void DeleteBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnMouseEntered

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
          new MainMenu().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_BackBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Candidates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Candidates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Candidates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Candidates.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Candidates().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton BrowseBtn;
    private javax.swing.JTextField CAgeTb;
    private javax.swing.JPanel CandAgeTb;
    private javax.swing.JComboBox CandGenCb;
    private javax.swing.JTextField CandNameTb;
    private javax.swing.JLabel CandidatePictureLbl;
    private javax.swing.JTable CandidateTable;
    private javax.swing.JLabel CnameLbl1;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JComboBox ElectionCb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
