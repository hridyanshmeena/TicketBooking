import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RAJVEER
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
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

        ui1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        p1 = new javax.swing.JPasswordField();
        pa1 = new javax.swing.JLabel();
        log1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMinimumSize(new java.awt.Dimension(417, 294));
        setPreferredSize(new java.awt.Dimension(417, 273));
        setResizable(false);
        setSize(new java.awt.Dimension(417, 273));
        getContentPane().setLayout(null);

        ui1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        ui1.setForeground(new java.awt.Color(0, 0, 153));
        ui1.setText("User Id");
        getContentPane().add(ui1);
        ui1.setBounds(10, 130, 80, 30);

        t1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        t1.setToolTipText("");
        getContentPane().add(t1);
        t1.setBounds(100, 130, 106, 31);

        p1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1ActionPerformed(evt);
            }
        });
        getContentPane().add(p1);
        p1.setBounds(100, 170, 106, 34);

        pa1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        pa1.setForeground(new java.awt.Color(0, 0, 153));
        pa1.setText("Password");
        getContentPane().add(pa1);
        pa1.setBounds(10, 170, 80, 30);

        log1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        log1.setForeground(new java.awt.Color(0, 0, 153));
        log1.setText("Login");
        log1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        log1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log1ActionPerformed(evt);
            }
        });
        getContentPane().add(log1);
        log1.setBounds(10, 220, 80, 30);

        jButton1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 153));
        jButton1.setText("EXIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(270, 220, 78, 33);

        jButton2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 153));
        jButton2.setText("New User");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(100, 220, 110, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IndiGo_Logo.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(417, 293));
        jLabel1.setMinimumSize(new java.awt.Dimension(417, 293));
        jLabel1.setPreferredSize(new java.awt.Dimension(417, 293));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 60, 59);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/air4.jpg"))); // NOI18N
        jLabel6.setMaximumSize(new java.awt.Dimension(1000, 1000));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 417, 260);

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void close()
{
    WindowEvent winClose=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClose);
} 
    private void p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_p1ActionPerformed

    private void log1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log1ActionPerformed
String name1="";
String pwd1="";
int sn=0;
String pwd = new String (p1.getPassword()) ;
String name = t1.getText() ;
try{
    Class.forName("java.sql.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/flight","root","");
    Statement stmt=con.createStatement();
    String query="select username,password,sno from users where username='"+name+"' ;";
    ResultSet rs=stmt.executeQuery(query);
    while(rs.next())
    {
    pwd1=rs.getString("password");
    name1=rs.getString("username");
    sn=rs.getInt("sno");
    
    }
   
    if(pwd.equals(pwd1) && name.equals(name1))
     {
       close();
       Flight n=new Flight();
       n.setVisible(true);
       Flight.user.setText(""+sn);
     }
   
    else
     { 
     JOptionPane.showMessageDialog(this,"Invalid username or password.");
     }    
    
    rs.close();
    stmt.close();
    con.close();
   } 

catch (Exception e) {
            System.out.print(e);
        }   
    }//GEN-LAST:event_log1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        System.exit(0);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
close();
   newuser c=new newuser();
   c.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JButton log1;
    public static javax.swing.JPasswordField p1;
    public static javax.swing.JLabel pa1;
    public static javax.swing.JTextField t1;
    public static javax.swing.JLabel ui1;
    // End of variables declaration//GEN-END:variables
}
