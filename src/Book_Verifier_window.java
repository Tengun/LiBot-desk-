
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TENGAH
 */
public class Book_Verifier_window extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    /**
     * Creates new form Book_Verifier1
     */
    public Book_Verifier_window() {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        txt_Date_Logged_In = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        txt_Book_ISBN_number = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        txt_Book_Name = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        txt_Book_Author = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        txt_Book_Edition = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jTextField_book_search_by_acc_number = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel_Book_Search_Button = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(52, 73, 94));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/book_verifier48.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 51, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Book Verifier Centre");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 11, -1, 48));

        jPanel1.setBackground(new java.awt.Color(141, 133, 133));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date Logged In");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 154, 26));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 154, 26));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ISBN");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 154, 26));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Author");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 154, 26));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, 500, 10));

        txt_Date_Logged_In.setEditable(false);
        txt_Date_Logged_In.setBackground(new java.awt.Color(141, 133, 133));
        txt_Date_Logged_In.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Date_Logged_In.setForeground(new java.awt.Color(255, 255, 255));
        txt_Date_Logged_In.setBorder(null);
        txt_Date_Logged_In.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_Date_Logged_In.setMargin(new java.awt.Insets(2, 2, 0, 2));
        txt_Date_Logged_In.setName(""); // NOI18N
        txt_Date_Logged_In.setSelectionColor(new java.awt.Color(102, 102, 102));
        txt_Date_Logged_In.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Date_Logged_InActionPerformed(evt);
            }
        });
        txt_Date_Logged_In.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_Date_Logged_InKeyPressed(evt);
            }
        });
        jPanel1.add(txt_Date_Logged_In, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 500, 32));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 500, 10));

        txt_Book_ISBN_number.setEditable(false);
        txt_Book_ISBN_number.setBackground(new java.awt.Color(141, 133, 133));
        txt_Book_ISBN_number.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Book_ISBN_number.setForeground(new java.awt.Color(255, 255, 255));
        txt_Book_ISBN_number.setBorder(null);
        txt_Book_ISBN_number.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_Book_ISBN_number.setMargin(new java.awt.Insets(2, 2, 0, 2));
        txt_Book_ISBN_number.setName(""); // NOI18N
        txt_Book_ISBN_number.setSelectionColor(new java.awt.Color(102, 102, 102));
        txt_Book_ISBN_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Book_ISBN_numberActionPerformed(evt);
            }
        });
        txt_Book_ISBN_number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_Book_ISBN_numberKeyPressed(evt);
            }
        });
        jPanel1.add(txt_Book_ISBN_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 500, 32));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 500, 10));

        txt_Book_Name.setEditable(false);
        txt_Book_Name.setBackground(new java.awt.Color(141, 133, 133));
        txt_Book_Name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Book_Name.setForeground(new java.awt.Color(255, 255, 255));
        txt_Book_Name.setBorder(null);
        txt_Book_Name.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_Book_Name.setMargin(new java.awt.Insets(2, 2, 0, 2));
        txt_Book_Name.setName(""); // NOI18N
        txt_Book_Name.setSelectionColor(new java.awt.Color(102, 102, 102));
        txt_Book_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Book_NameActionPerformed(evt);
            }
        });
        txt_Book_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_Book_NameKeyPressed(evt);
            }
        });
        jPanel1.add(txt_Book_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 160, 500, 32));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 500, 10));

        txt_Book_Author.setEditable(false);
        txt_Book_Author.setBackground(new java.awt.Color(141, 133, 133));
        txt_Book_Author.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Book_Author.setForeground(new java.awt.Color(255, 255, 255));
        txt_Book_Author.setBorder(null);
        txt_Book_Author.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_Book_Author.setMargin(new java.awt.Insets(2, 2, 0, 2));
        txt_Book_Author.setName(""); // NOI18N
        txt_Book_Author.setSelectionColor(new java.awt.Color(102, 102, 102));
        txt_Book_Author.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Book_AuthorActionPerformed(evt);
            }
        });
        txt_Book_Author.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_Book_AuthorKeyPressed(evt);
            }
        });
        jPanel1.add(txt_Book_Author, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 500, 32));
        jPanel1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 500, 10));

        txt_Book_Edition.setEditable(false);
        txt_Book_Edition.setBackground(new java.awt.Color(141, 133, 133));
        txt_Book_Edition.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Book_Edition.setForeground(new java.awt.Color(255, 255, 255));
        txt_Book_Edition.setBorder(null);
        txt_Book_Edition.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_Book_Edition.setMargin(new java.awt.Insets(2, 2, 0, 2));
        txt_Book_Edition.setName(""); // NOI18N
        txt_Book_Edition.setSelectionColor(new java.awt.Color(102, 102, 102));
        txt_Book_Edition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Book_EditionActionPerformed(evt);
            }
        });
        txt_Book_Edition.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_Book_EditionKeyPressed(evt);
            }
        });
        jPanel1.add(txt_Book_Edition, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 280, 500, 32));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Edition");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 154, 26));
        jPanel1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, 260, 10));

        jTextField_book_search_by_acc_number.setBackground(new java.awt.Color(141, 133, 133));
        jTextField_book_search_by_acc_number.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_book_search_by_acc_number.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_book_search_by_acc_number.setToolTipText("Enter book's accession number");
        jTextField_book_search_by_acc_number.setBorder(null);
        jTextField_book_search_by_acc_number.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField_book_search_by_acc_number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_book_search_by_acc_numberActionPerformed(evt);
            }
        });
        jTextField_book_search_by_acc_number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_book_search_by_acc_numberKeyReleased(evt);
            }
        });
        jPanel1.add(jTextField_book_search_by_acc_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, 260, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("   View Books");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 380, 90, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Quick search a book by typing its accession number.");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 30));

        jLabel_Book_Search_Button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search32.png"))); // NOI18N
        jLabel_Book_Search_Button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Book_Search_Button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel_Book_Search_ButtonMousePressed(evt);
            }
        });
        jPanel1.add(jLabel_Book_Search_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, 40, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back64.png"))); // NOI18N
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel23MousePressed(evt);
            }
        });
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 400, 60, 60));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 990, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_Date_Logged_InActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Date_Logged_InActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Date_Logged_InActionPerformed

    private void txt_Date_Logged_InKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Date_Logged_InKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Date_Logged_InKeyPressed

    private void txt_Book_ISBN_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Book_ISBN_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Book_ISBN_numberActionPerformed

    private void txt_Book_ISBN_numberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Book_ISBN_numberKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Book_ISBN_numberKeyPressed

    private void txt_Book_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Book_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Book_NameActionPerformed

    private void txt_Book_NameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Book_NameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Book_NameKeyPressed

    private void txt_Book_AuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Book_AuthorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Book_AuthorActionPerformed

    private void txt_Book_AuthorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Book_AuthorKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Book_AuthorKeyPressed

    private void txt_Book_EditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Book_EditionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Book_EditionActionPerformed

    private void txt_Book_EditionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Book_EditionKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Book_EditionKeyPressed

    private void jTextField_book_search_by_acc_numberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_book_search_by_acc_numberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_book_search_by_acc_numberActionPerformed

    private void jTextField_book_search_by_acc_numberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_book_search_by_acc_numberKeyReleased
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_jTextField_book_search_by_acc_numberKeyReleased

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        // TODO add your handling code here:
        dispose();
        new All_Books().setVisible(true);
    }//GEN-LAST:event_jLabel6MousePressed

    private void jLabel_Book_Search_ButtonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Book_Search_ButtonMousePressed
        // TODO add your handling code here:
         try{
            String query = "SELECT * FROM `books` WHERE `Accession_Number` = ?";
            conn = DriverManager.getConnection("jdbc:mysql://localhost/libot", "root", "tinotenda");
            pst = conn.prepareStatement(query);
            pst.setString(1, jTextField_book_search_by_acc_number.getText());
            rs= pst.executeQuery();
            if(rs.next()){
              String setISBN = rs.getString("ISBN"); 
              txt_Book_ISBN_number.setText(setISBN);   
              
              String setName = rs.getString("Name");
              txt_Book_Name.setText(setName);
              
              String setAuthor = rs.getString("Author");
              txt_Book_Author.setText(setAuthor);
              
              String setEdition = rs.getString("Edition");
              txt_Book_Edition.setText(setEdition);
                 
              String setDate = rs.getString("Date_In");
              txt_Date_Logged_In.setText(setDate);
              
            }else{
               JOptionPane.showMessageDialog(this,"Book not found, check your syntax!","Error", 0);
                jTextField_book_search_by_acc_number.setText("");
               txt_Book_Author.setText("");
               txt_Book_Edition.setText("");
               txt_Book_ISBN_number.setText("");
               txt_Book_Name.setText("");
               txt_Date_Logged_In.setText("");
               
            }
        }catch(Exception ex){
        }
    }//GEN-LAST:event_jLabel_Book_Search_ButtonMousePressed

    private void jLabel23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MousePressed
        // TODO add your handling code here:
        new Books_window().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel23MousePressed

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
            java.util.logging.Logger.getLogger(Book_Verifier_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Book_Verifier_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Book_Verifier_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Book_Verifier_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Book_Verifier_window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_Book_Search_Button;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField jTextField_book_search_by_acc_number;
    private javax.swing.JTextField txt_Book_Author;
    private javax.swing.JTextField txt_Book_Edition;
    private javax.swing.JTextField txt_Book_ISBN_number;
    private javax.swing.JTextField txt_Book_Name;
    private javax.swing.JTextField txt_Date_Logged_In;
    // End of variables declaration//GEN-END:variables
}