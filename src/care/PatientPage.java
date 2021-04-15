/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package care;

import javax.swing.JFrame;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author SAIF
 */
public class PatientPage extends javax.swing.JFrame {

    /**
     * Creates new form PatientPage
     */
    String user;
    public PatientPage() {
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

        homebutton = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        doctorfield = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        barpannel = new javax.swing.JPanel();
        backbutton = new javax.swing.JButton();
        searchbutton = new javax.swing.JButton();
        searchbox = new javax.swing.JTextField();
        logoutbutton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1270, 630));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homebutton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        homebutton.setForeground(new java.awt.Color(0, 102, 153));
        homebutton.setText("HOME");
        homebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(homebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        title.setFont(new java.awt.Font("Trajan Pro", 0, 36)); // NOI18N
        title.setForeground(new java.awt.Color(255, 255, 255));
        title.setText("CARE  FOR  THE  SPECIAL  PEOPLE");
        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 670, 60));

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

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NAME", "DEGREE", "HOSPITAL", "DEPARTMENT", "EMAIL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(255, 255, 255));
        doctorfield.setViewportView(jTable1);

        getContentPane().add(doctorfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 890, 430));

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

        backbutton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        backbutton.setForeground(new java.awt.Color(0, 102, 153));
        backbutton.setText("BACK");
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 710, -1, -1));

        searchbutton.setBackground(new java.awt.Color(204, 204, 255));
        searchbutton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        searchbutton.setForeground(new java.awt.Color(0, 102, 153));
        searchbutton.setText("SEARCH");
        getContentPane().add(searchbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 180, -1, -1));

        searchbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchboxKeyReleased(evt);
            }
        });
        getContentPane().add(searchbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 180, 250, -1));

        logoutbutton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        logoutbutton.setForeground(new java.awt.Color(0, 102, 153));
        logoutbutton.setText("SIGN OUT");
        logoutbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(logoutbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 710, 120, -1));

        background.setIcon(new javax.swing.ImageIcon("C:\\Users\\SAIF\\Desktop\\background_light_blur_68629_1920x1080.jpg")); // NOI18N
        background.setText("background");
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebuttonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        StartPage sp = new StartPage();
        sp.setVisible(true);
    }//GEN-LAST:event_homebuttonActionPerformed

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);// for minimize
    }//GEN-LAST:event_minimizeMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        System.exit(0); //for exit
    }//GEN-LAST:event_exitMouseClicked

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        PatientProfilePage ppp= new PatientProfilePage(user);
        ppp.setVisible(true);
    }//GEN-LAST:event_backbuttonActionPerformed

    private void searchboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchboxKeyReleased
        // TODO add your handling code here:
        DefaultTableModel table = (DefaultTableModel)jTable1.getModel();
        String search =searchbox.getText();
        TableRowSorter<DefaultTableModel> tr = new  TableRowSorter<DefaultTableModel>(table);
        jTable1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_searchboxKeyReleased

    private void logoutbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbuttonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(PatientPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbutton;
    private javax.swing.JLabel background;
    private javax.swing.JPanel barpannel;
    private javax.swing.JScrollPane doctorfield;
    private javax.swing.JLabel exit;
    private javax.swing.JButton homebutton;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton logoutbutton;
    private javax.swing.JLabel minimize;
    private javax.swing.JTextField searchbox;
    private javax.swing.JButton searchbutton;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
