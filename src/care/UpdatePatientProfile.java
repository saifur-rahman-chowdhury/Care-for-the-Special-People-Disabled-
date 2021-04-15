/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package care;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author SAIF
 */
public class UpdatePatientProfile extends javax.swing.JFrame {

    /**
     * Creates new form UpdatePatientProfile
     */
    String user;
    public UpdatePatientProfile() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public UpdatePatientProfile(String username){
        initComponents();
        this.setLocationRelativeTo(null);
        this.user = username;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        barpannel = new javax.swing.JPanel();
        minimize = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        homebutton = new javax.swing.JButton();
        username = new javax.swing.JLabel();
        usernamefield = new javax.swing.JTextField();
        password = new javax.swing.JLabel();
        passwordfield = new javax.swing.JPasswordField();
        firstname = new javax.swing.JLabel();
        lastname = new javax.swing.JLabel();
        title2 = new javax.swing.JLabel();
        firstnamefield = new javax.swing.JTextField();
        reenterpassword = new javax.swing.JLabel();
        lastnamefield = new javax.swing.JTextField();
        reenterpasswordfield = new javax.swing.JPasswordField();
        dateofbirth = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        dateofbirthfield = new com.toedter.calendar.JDateChooser();
        genderfield = new javax.swing.JComboBox<>();
        addressfield = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        signup = new javax.swing.JButton();
        backbutton = new javax.swing.JButton();
        patient = new javax.swing.JLabel();
        informationtitle = new javax.swing.JLabel();
        disability = new javax.swing.JLabel();
        disabilityfield = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        mobileno = new javax.swing.JLabel();
        mobilenofield = new javax.swing.JTextField();
        homebutton1 = new javax.swing.JButton();
        barpannel1 = new javax.swing.JPanel();
        bloodgroupfield = new javax.swing.JComboBox<>();
        bloodgroup = new javax.swing.JLabel();
        emailfield = new javax.swing.JTextField();
        email = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1230, 760));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Trajan Pro", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("CARE  FOR  THE  SPECIAL  PEOPLE");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 670, 60));

        barpannel.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout barpannelLayout = new javax.swing.GroupLayout(barpannel);
        barpannel.setLayout(barpannelLayout);
        barpannelLayout.setHorizontalGroup(
            barpannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1230, Short.MAX_VALUE)
        );
        barpannelLayout.setVerticalGroup(
            barpannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(barpannel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

        minimize.setFont(new java.awt.Font("Tahoma", 1, 42)); // NOI18N
        minimize.setForeground(new java.awt.Color(153, 255, 255));
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setText("-");
        minimize.setToolTipText("");
        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        getContentPane().add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 10, -1, 20));

        exit.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        exit.setForeground(new java.awt.Color(153, 255, 255));
        exit.setText("x");
        exit.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        getContentPane().add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 10, -1, 30));

        homebutton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        homebutton.setForeground(new java.awt.Color(0, 102, 153));
        homebutton.setText("HOME");
        homebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(homebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        username.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        username.setForeground(new java.awt.Color(204, 255, 255));
        username.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        username.setText("USER NAME");
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, 100, -1));

        usernamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernamefieldActionPerformed(evt);
            }
        });
        getContentPane().add(usernamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, 210, -1));

        password.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        password.setForeground(new java.awt.Color(204, 255, 255));
        password.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        password.setText("PASSWORD");
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, 100, -1));
        getContentPane().add(passwordfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, 210, -1));

        firstname.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        firstname.setForeground(new java.awt.Color(204, 255, 255));
        firstname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        firstname.setText("FIRST NAME");
        getContentPane().add(firstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 110, -1));

        lastname.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lastname.setForeground(new java.awt.Color(204, 255, 255));
        lastname.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lastname.setText("LAST NAME");
        getContentPane().add(lastname, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 100, -1));

        title2.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 24)); // NOI18N
        title2.setForeground(new java.awt.Color(204, 255, 204));
        title2.setText("UPDATE  ACCOUNT");
        getContentPane().add(title2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 260, 20));

        firstnamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnamefieldActionPerformed(evt);
            }
        });
        getContentPane().add(firstnamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, 210, -1));

        reenterpassword.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        reenterpassword.setForeground(new java.awt.Color(204, 255, 255));
        reenterpassword.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        reenterpassword.setText("RE ENTER PASSWORD");
        getContentPane().add(reenterpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, 190, -1));

        lastnamefield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnamefieldActionPerformed(evt);
            }
        });
        getContentPane().add(lastnamefield, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 210, -1));
        getContentPane().add(reenterpasswordfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 210, -1));

        dateofbirth.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        dateofbirth.setForeground(new java.awt.Color(204, 255, 255));
        dateofbirth.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        dateofbirth.setText("DATE of BIRTH");
        getContentPane().add(dateofbirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 480, 140, -1));

        gender.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        gender.setForeground(new java.awt.Color(204, 255, 255));
        gender.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        gender.setText("GENDER");
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 70, -1));

        address.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        address.setForeground(new java.awt.Color(204, 255, 255));
        address.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        address.setText("ADDRESS");
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, 80, -1));
        getContentPane().add(dateofbirthfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 480, 210, -1));

        genderfield.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MALE", "FEMALE", "OTHERS" }));
        getContentPane().add(genderfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 400, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        addressfield.setViewportView(jTextArea1);

        getContentPane().add(addressfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 520, 210, 50));

        signup.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        signup.setForeground(new java.awt.Color(0, 102, 153));
        signup.setText("UPDATE");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        getContentPane().add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 710, 110, -1));

        backbutton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        backbutton.setForeground(new java.awt.Color(0, 102, 153));
        backbutton.setText("BACK");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 710, -1, -1));

        patient.setIcon(new javax.swing.ImageIcon("C:\\Users\\SAIF\\Desktop\\IMG_4305.PNG")); // NOI18N
        patient.setText("patient");
        patient.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(patient, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 100, -1));

        informationtitle.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        informationtitle.setForeground(new java.awt.Color(204, 204, 255));
        informationtitle.setText("PATIENT INFORMATION");
        getContentPane().add(informationtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 200, -1));

        disability.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        disability.setForeground(new java.awt.Color(204, 255, 255));
        disability.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        disability.setText("DISABILITY");
        getContentPane().add(disability, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 670, 100, -1));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        disabilityfield.setViewportView(jTextArea2);

        getContentPane().add(disabilityfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 660, 210, 50));

        mobileno.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        mobileno.setForeground(new java.awt.Color(204, 255, 255));
        mobileno.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mobileno.setText("MOBILE NO.");
        getContentPane().add(mobileno, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 580, 100, -1));

        mobilenofield.setText("+880");
        getContentPane().add(mobilenofield, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 580, 210, -1));

        homebutton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        homebutton1.setForeground(new java.awt.Color(0, 102, 153));
        homebutton1.setText("HOME");
        homebutton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebutton1ActionPerformed(evt);
            }
        });
        getContentPane().add(homebutton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        barpannel1.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout barpannel1Layout = new javax.swing.GroupLayout(barpannel1);
        barpannel1.setLayout(barpannel1Layout);
        barpannel1Layout.setHorizontalGroup(
            barpannel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1230, Short.MAX_VALUE)
        );
        barpannel1Layout.setVerticalGroup(
            barpannel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(barpannel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

        bloodgroupfield.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "A+", "A-", "B+", "B-", "O+", "O-", "AB+", "AB-" }));
        getContentPane().add(bloodgroupfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, -1, -1));

        bloodgroup.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        bloodgroup.setForeground(new java.awt.Color(204, 255, 255));
        bloodgroup.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        bloodgroup.setText("BLOOD GROUP");
        getContentPane().add(bloodgroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 440, 120, -1));
        getContentPane().add(emailfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 620, 210, -1));

        email.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        email.setForeground(new java.awt.Color(204, 255, 255));
        email.setText("EMAIL");
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 620, -1, -1));

        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\SAIF\\Desktop\\background_light_blur_68629_1920x1080.jpg")); // NOI18N
        background.setText("background");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);// for minimize
    }//GEN-LAST:event_minimizeMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        System.exit(0); //for exit
    }//GEN-LAST:event_exitMouseClicked

    private void homebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebuttonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        StartPage sp = new StartPage();
        sp.setVisible(true);
    }//GEN-LAST:event_homebuttonActionPerformed

    private void usernamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernamefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernamefieldActionPerformed

    private void firstnamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnamefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnamefieldActionPerformed

    private void lastnamefieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnamefieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnamefieldActionPerformed

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        SignedUpSuccessfullyPage susp = new SignedUpSuccessfullyPage();
        susp.setVisible(true);
        if( !(firstnamefield.getText().equals("")) && !(lastnamefield.getText().equals("")) && !(usernamefield.getText().equals(""))&& !(passwordfield.getText().equals(""))&& !(reenterpasswordfield.getText().equals(""))&& !(genderfield.getSelectedItem().equals(""))){

                    if(passwordfield.getText().equals(reenterpasswordfield.getText())){     // to check the password and re enter password is name or not
                        DatabaseHandler db = new DatabaseHandler();
                        db.connectDatabase();
                        String g = genderfield.getSelectedItem().toString(); // for combobox
                        String d = ((JTextField)dateofbirthfield.getDateEditor().getUiComponent()).getText(); //for Date chooser
                        db.patientupdateData(firstnamefield.getText(),lastnamefield.getText(),usernamefield.getText(),passwordfield.getText(),reenterpasswordfield.getText(),g,d,jTextArea1.getText(),mobilenofield.getText(),jTextArea2.getText());
                        firstname.setText("");
                        lastname.setText("");
                        username.setText("");
                        password.setText("");
                        reenterpassword.setText("");
                        gender.setText("");
                        dateofbirth.setText("");
                        address.setText("");
                        mobileno.setText("");
                        disability.setText("");

                        this.setVisible(false);
                        RegistrationPage rp = new RegistrationPage();
                        rp.setVisible(true);

                        JOptionPane.showMessageDialog(this, "Successfully updates", "Success", JOptionPane.INFORMATION_MESSAGE);

                    }else
                    JOptionPane.showMessageDialog(this, "Check your username and password", "Not registered", JOptionPane.ERROR_MESSAGE);

                    /*
                }catch(Exception e){
                    System.out.println("Error in Query..");
                    e.printStackTrace();
                }  */

            }

    }//GEN-LAST:event_signupActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        PatientProfilePage rp= new PatientProfilePage(user);
        rp.setVisible(true);
    }//GEN-LAST:event_backbuttonActionPerformed

    private void homebutton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebutton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        StartPage sp = new StartPage();
        sp.setVisible(true);
    }//GEN-LAST:event_homebutton1ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdatePatientProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdatePatientProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdatePatientProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdatePatientProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdatePatientProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JScrollPane addressfield;
    private javax.swing.JButton backbutton;
    private javax.swing.JLabel background;
    private javax.swing.JPanel barpannel;
    private javax.swing.JPanel barpannel1;
    private javax.swing.JLabel bloodgroup;
    private javax.swing.JComboBox<String> bloodgroupfield;
    private javax.swing.JLabel dateofbirth;
    private com.toedter.calendar.JDateChooser dateofbirthfield;
    private javax.swing.JLabel disability;
    private javax.swing.JScrollPane disabilityfield;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailfield;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel firstname;
    private javax.swing.JTextField firstnamefield;
    private javax.swing.JLabel gender;
    private javax.swing.JComboBox<String> genderfield;
    private javax.swing.JButton homebutton;
    private javax.swing.JButton homebutton1;
    private javax.swing.JLabel informationtitle;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel lastname;
    private javax.swing.JTextField lastnamefield;
    private javax.swing.JLabel minimize;
    private javax.swing.JLabel mobileno;
    private javax.swing.JTextField mobilenofield;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField passwordfield;
    private javax.swing.JLabel patient;
    private javax.swing.JLabel reenterpassword;
    private javax.swing.JPasswordField reenterpasswordfield;
    private javax.swing.JButton signup;
    private javax.swing.JLabel title;
    private javax.swing.JLabel title2;
    private javax.swing.JLabel username;
    private javax.swing.JTextField usernamefield;
    // End of variables declaration//GEN-END:variables
}
