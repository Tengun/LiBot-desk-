
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
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
public class Student_Verifier_window extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    /**
     * Creates new form Student_Update_window
     */
    public Student_Verifier_window() {
        initComponents();
                txt_Student_Name.setEditable(false);
                txt_Student_Surname.setEditable(false);
                txt_Student_ID.setEditable(false);
                txt_Student_Gender.setEditable(false);
                txt_Student_Course.setEditable(false);
                txt_Student_Level.setEditable(false);
                txt_Student_Intake.setEditable(false);
                txt_Student_Intake_Year.setEditable(false);
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
        jLabel23 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jTextField_student_search_by_Reg_Number = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        txt_Student_Course = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        txt_Student_Name = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        txt_Student_Surname = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        txt_Student_ID = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        txt_Student_Gender = new javax.swing.JTextField();
        Gender = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        txt_Student_Level = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        txt_Student_Intake = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        txt_Student_Intake_Year = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(52, 73, 94));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/book_verifier48.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 51, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Student Verifier Centre");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(79, 11, -1, 48));

        jPanel1.setBackground(new java.awt.Color(141, 133, 133));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back64.png"))); // NOI18N
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel23MousePressed(evt);
            }
        });
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 570, 50, 30));
        jPanel1.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 50, 260, 10));

        jTextField_student_search_by_Reg_Number.setBackground(new java.awt.Color(141, 133, 133));
        jTextField_student_search_by_Reg_Number.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_student_search_by_Reg_Number.setForeground(new java.awt.Color(255, 255, 255));
        jTextField_student_search_by_Reg_Number.setToolTipText("Enter student Reg number");
        jTextField_student_search_by_Reg_Number.setBorder(null);
        jTextField_student_search_by_Reg_Number.setCaretColor(new java.awt.Color(255, 255, 255));
        jTextField_student_search_by_Reg_Number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_student_search_by_Reg_NumberActionPerformed(evt);
            }
        });
        jTextField_student_search_by_Reg_Number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_student_search_by_Reg_NumberKeyReleased(evt);
            }
        });
        jPanel1.add(jTextField_student_search_by_Reg_Number, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 260, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search32.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 40, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Course");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 154, 26));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Surname");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 154, 26));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 154, 26));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 154, 26));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, 500, 10));

        txt_Student_Course.setEditable(false);
        txt_Student_Course.setBackground(new java.awt.Color(141, 133, 133));
        txt_Student_Course.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Student_Course.setForeground(new java.awt.Color(255, 255, 255));
        txt_Student_Course.setBorder(null);
        txt_Student_Course.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_Student_Course.setMargin(new java.awt.Insets(2, 2, 0, 2));
        txt_Student_Course.setName(""); // NOI18N
        txt_Student_Course.setSelectionColor(new java.awt.Color(102, 102, 102));
        txt_Student_Course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Student_CourseActionPerformed(evt);
            }
        });
        txt_Student_Course.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_Student_CourseKeyPressed(evt);
            }
        });
        jPanel1.add(txt_Student_Course, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, 500, 32));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 500, 10));

        txt_Student_Name.setEditable(false);
        txt_Student_Name.setBackground(new java.awt.Color(141, 133, 133));
        txt_Student_Name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Student_Name.setForeground(new java.awt.Color(255, 255, 255));
        txt_Student_Name.setBorder(null);
        txt_Student_Name.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_Student_Name.setMargin(new java.awt.Insets(2, 2, 0, 2));
        txt_Student_Name.setName(""); // NOI18N
        txt_Student_Name.setSelectionColor(new java.awt.Color(102, 102, 102));
        txt_Student_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Student_NameActionPerformed(evt);
            }
        });
        txt_Student_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_Student_NameKeyPressed(evt);
            }
        });
        jPanel1.add(txt_Student_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 500, 32));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 500, 10));

        txt_Student_Surname.setEditable(false);
        txt_Student_Surname.setBackground(new java.awt.Color(141, 133, 133));
        txt_Student_Surname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Student_Surname.setForeground(new java.awt.Color(255, 255, 255));
        txt_Student_Surname.setBorder(null);
        txt_Student_Surname.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_Student_Surname.setMargin(new java.awt.Insets(2, 2, 0, 2));
        txt_Student_Surname.setName(""); // NOI18N
        txt_Student_Surname.setSelectionColor(new java.awt.Color(102, 102, 102));
        txt_Student_Surname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Student_SurnameActionPerformed(evt);
            }
        });
        txt_Student_Surname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_Student_SurnameKeyPressed(evt);
            }
        });
        jPanel1.add(txt_Student_Surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 500, 32));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 500, 10));

        txt_Student_ID.setEditable(false);
        txt_Student_ID.setBackground(new java.awt.Color(141, 133, 133));
        txt_Student_ID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Student_ID.setForeground(new java.awt.Color(255, 255, 255));
        txt_Student_ID.setBorder(null);
        txt_Student_ID.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_Student_ID.setMargin(new java.awt.Insets(2, 2, 0, 2));
        txt_Student_ID.setName(""); // NOI18N
        txt_Student_ID.setSelectionColor(new java.awt.Color(102, 102, 102));
        txt_Student_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Student_IDActionPerformed(evt);
            }
        });
        txt_Student_ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_Student_IDKeyPressed(evt);
            }
        });
        jPanel1.add(txt_Student_ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 500, 32));
        jPanel1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 500, 10));

        txt_Student_Gender.setEditable(false);
        txt_Student_Gender.setBackground(new java.awt.Color(141, 133, 133));
        txt_Student_Gender.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Student_Gender.setForeground(new java.awt.Color(255, 255, 255));
        txt_Student_Gender.setBorder(null);
        txt_Student_Gender.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_Student_Gender.setMargin(new java.awt.Insets(2, 2, 0, 2));
        txt_Student_Gender.setName(""); // NOI18N
        txt_Student_Gender.setSelectionColor(new java.awt.Color(102, 102, 102));
        txt_Student_Gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Student_GenderActionPerformed(evt);
            }
        });
        txt_Student_Gender.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_Student_GenderKeyPressed(evt);
            }
        });
        jPanel1.add(txt_Student_Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 500, 32));

        Gender.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Gender.setForeground(new java.awt.Color(255, 255, 255));
        Gender.setText("Gender");
        jPanel1.add(Gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 154, 26));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 500, 10));

        txt_Student_Level.setEditable(false);
        txt_Student_Level.setBackground(new java.awt.Color(141, 133, 133));
        txt_Student_Level.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Student_Level.setForeground(new java.awt.Color(255, 255, 255));
        txt_Student_Level.setBorder(null);
        txt_Student_Level.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_Student_Level.setMargin(new java.awt.Insets(2, 2, 0, 2));
        txt_Student_Level.setName(""); // NOI18N
        txt_Student_Level.setSelectionColor(new java.awt.Color(102, 102, 102));
        txt_Student_Level.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Student_LevelActionPerformed(evt);
            }
        });
        txt_Student_Level.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_Student_LevelKeyPressed(evt);
            }
        });
        jPanel1.add(txt_Student_Level, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 500, 32));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Level");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 154, 26));
        jPanel1.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 500, 10));

        txt_Student_Intake.setEditable(false);
        txt_Student_Intake.setBackground(new java.awt.Color(141, 133, 133));
        txt_Student_Intake.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Student_Intake.setForeground(new java.awt.Color(255, 255, 255));
        txt_Student_Intake.setBorder(null);
        txt_Student_Intake.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_Student_Intake.setMargin(new java.awt.Insets(2, 2, 0, 2));
        txt_Student_Intake.setName(""); // NOI18N
        txt_Student_Intake.setSelectionColor(new java.awt.Color(102, 102, 102));
        txt_Student_Intake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Student_IntakeActionPerformed(evt);
            }
        });
        txt_Student_Intake.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_Student_IntakeKeyPressed(evt);
            }
        });
        jPanel1.add(txt_Student_Intake, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 440, 500, 32));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Intake ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 154, 26));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Intake Year");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, 154, 26));
        jPanel1.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 530, 500, 10));

        txt_Student_Intake_Year.setEditable(false);
        txt_Student_Intake_Year.setBackground(new java.awt.Color(141, 133, 133));
        txt_Student_Intake_Year.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Student_Intake_Year.setForeground(new java.awt.Color(255, 255, 255));
        txt_Student_Intake_Year.setBorder(null);
        txt_Student_Intake_Year.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_Student_Intake_Year.setMargin(new java.awt.Insets(2, 2, 0, 2));
        txt_Student_Intake_Year.setName(""); // NOI18N
        txt_Student_Intake_Year.setSelectionColor(new java.awt.Color(102, 102, 102));
        txt_Student_Intake_Year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Student_Intake_YearActionPerformed(evt);
            }
        });
        txt_Student_Intake_Year.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_Student_Intake_YearKeyPressed(evt);
            }
        });
        jPanel1.add(txt_Student_Intake_Year, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, 500, 32));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("View Students");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel12MousePressed(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 560, -1, 21));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Quick search by typing student Reg Number.");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MousePressed
        // TODO add your handling code here:
        new Librarian_window().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel23MousePressed

    private void jTextField_student_search_by_Reg_NumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_student_search_by_Reg_NumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_student_search_by_Reg_NumberActionPerformed

    private void jTextField_student_search_by_Reg_NumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_student_search_by_Reg_NumberKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField_student_search_by_Reg_NumberKeyReleased

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        // TODO add your handling code here:
        try{
            String query = "SELECT * FROM `students` WHERE `Reg No` = ?";
            conn = DriverManager.getConnection("jdbc:mysql://localhost/libot", "root", "tinotenda");
            pst = conn.prepareStatement(query);
            pst.setString(1, jTextField_student_search_by_Reg_Number.getText());
            rs= pst.executeQuery();
            if(rs.next()){
                String setStudent_Name = rs.getString("Name");
                txt_Student_Name.setText(setStudent_Name);

                String setSurname = rs.getString("Surname");
                txt_Student_Surname.setText(setSurname);

                String setStudent_ID = rs.getString("National_ID");
                txt_Student_ID.setText(setStudent_ID);

                String setGender = rs.getString("Gender");
                txt_Student_Gender.setText(setGender);

                String setCourse = rs.getString("Course");
                txt_Student_Course.setText(setCourse);

                String setLevel = rs.getString("Level");
                txt_Student_Level.setText(setLevel);
                
                String setIntake = rs.getString("Intake");
                txt_Student_Intake.setText(setIntake);
                
                String setIntake_Year = rs.getString("Intake_Year");
                txt_Student_Intake_Year.setText(setIntake_Year);
            }else{
                JOptionPane.showMessageDialog(this, "Student not found, check your syntax!", "Error", 0);
                txt_Student_Name.setText("");
                txt_Student_Surname.setText("");
                txt_Student_ID.setText("");
                txt_Student_Gender.setText("");
                txt_Student_Course.setText("");
                txt_Student_Level.setText("");
                txt_Student_Intake.setText("");
                txt_Student_Intake_Year.setText("");
                jTextField_student_search_by_Reg_Number.setText("");
                /*                                                 */
                txt_Student_Name.setEditable(false);
                txt_Student_Surname.setEditable(false);
                txt_Student_ID.setEditable(false);
                txt_Student_Gender.setEditable(false);
                txt_Student_Course.setEditable(false);
                txt_Student_Level.setEditable(false);
                txt_Student_Intake.setEditable(false);
                txt_Student_Intake_Year.setEditable(false);
                
            }
        }catch(Exception ex){
        }
    }//GEN-LAST:event_jLabel9MousePressed

    private void txt_Student_CourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Student_CourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Student_CourseActionPerformed

    private void txt_Student_CourseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Student_CourseKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Student_CourseKeyPressed

    private void txt_Student_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Student_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Student_NameActionPerformed

    private void txt_Student_NameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Student_NameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Student_NameKeyPressed

    private void txt_Student_SurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Student_SurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Student_SurnameActionPerformed

    private void txt_Student_SurnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Student_SurnameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Student_SurnameKeyPressed

    private void txt_Student_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Student_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Student_IDActionPerformed

    private void txt_Student_IDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Student_IDKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Student_IDKeyPressed

    private void txt_Student_GenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Student_GenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Student_GenderActionPerformed

    private void txt_Student_GenderKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Student_GenderKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Student_GenderKeyPressed

    private void txt_Student_LevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Student_LevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Student_LevelActionPerformed

    private void txt_Student_LevelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Student_LevelKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Student_LevelKeyPressed

    private void txt_Student_IntakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Student_IntakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Student_IntakeActionPerformed

    private void txt_Student_IntakeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Student_IntakeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Student_IntakeKeyPressed

    private void txt_Student_Intake_YearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Student_Intake_YearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Student_Intake_YearActionPerformed

    private void txt_Student_Intake_YearKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_Student_Intake_YearKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Student_Intake_YearKeyPressed

    private void jLabel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MousePressed
        // TODO add your handling code here:
        new All_Students().setVisible(true);
        dispose();
    }//GEN-LAST:event_jLabel12MousePressed

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
            java.util.logging.Logger.getLogger(Student_Verifier_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Verifier_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Verifier_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Verifier_window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Verifier_window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField_student_search_by_Reg_Number;
    private javax.swing.JTextField txt_Student_Course;
    private javax.swing.JTextField txt_Student_Gender;
    private javax.swing.JTextField txt_Student_ID;
    private javax.swing.JTextField txt_Student_Intake;
    private javax.swing.JTextField txt_Student_Intake_Year;
    private javax.swing.JTextField txt_Student_Level;
    private javax.swing.JTextField txt_Student_Name;
    private javax.swing.JTextField txt_Student_Surname;
    // End of variables declaration//GEN-END:variables
}