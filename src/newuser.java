
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
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
public class newuser extends javax.swing.JFrame {

    /**
     * Creates new form newuser
     */
    public newuser() {
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

        t1 = new javax.swing.JTextField();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        p1 = new javax.swing.JPasswordField();
        p2 = new javax.swing.JPasswordField();
        add1 = new javax.swing.JTextField();
        add2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        stat = new javax.swing.JTextField();
        cit = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        pin = new javax.swing.JFormattedTextField();
        phone = new javax.swing.JFormattedTextField();
        fn = new javax.swing.JLabel();
        ln = new javax.swing.JLabel();
        un = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        cpass = new javax.swing.JLabel();
        dob1 = new javax.swing.JLabel();
        add = new javax.swing.JLabel();
        s1 = new javax.swing.JLabel();
        c1 = new javax.swing.JLabel();
        pin1 = new javax.swing.JLabel();
        phone1 = new javax.swing.JLabel();
        error1 = new javax.swing.JLabel();
        gen = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        date1 = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(580, 640));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        t1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        getContentPane().add(t1);
        t1.setBounds(232, 89, 146, 30);

        t2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        getContentPane().add(t2);
        t2.setBounds(232, 127, 146, 30);

        t3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        getContentPane().add(t3);
        t3.setBounds(232, 165, 146, 30);

        p1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        getContentPane().add(p1);
        p1.setBounds(232, 210, 146, 30);

        p2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        getContentPane().add(p2);
        p2.setBounds(232, 255, 146, 30);

        add1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        getContentPane().add(add1);
        add1.setBounds(232, 334, 155, 30);

        add2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        getContentPane().add(add2);
        add2.setBounds(232, 372, 155, 30);

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("First Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(59, 89, 134, 27);

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Last Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(59, 127, 134, 27);

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Username");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(59, 165, 134, 20);

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Password");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(59, 210, 134, 20);

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("Confirm Password");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(59, 255, 146, 27);

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Date Of Birth");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(59, 293, 134, 30);

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 153));
        jLabel7.setText("Address Line 1");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(59, 334, 134, 27);

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("Address Line 2");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(59, 375, 134, 24);

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("State");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(59, 410, 134, 27);

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setText("City");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(59, 448, 134, 30);

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 153));
        jLabel11.setText("Pincode");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(59, 489, 134, 27);

        jLabel12.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 153));
        jLabel12.setText("Phone");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(59, 532, 134, 29);

        jButton1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 153));
        jButton1.setText("Create Account");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(400, 530, 155, 30);

        stat.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        getContentPane().add(stat);
        stat.setBounds(232, 410, 155, 30);

        cit.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        getContentPane().add(cit);
        cit.setBounds(232, 448, 155, 30);

        jLabel13.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 153));
        jLabel13.setText("YYYY-MM-DD");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(406, 293, 116, 30);

        try {
            pin.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        pin.setToolTipText("Ex : 123456");
        pin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pinKeyTyped(evt);
            }
        });
        getContentPane().add(pin);
        pin.setBounds(232, 489, 116, 30);

        try {
            phone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        phone.setText("");
        phone.setToolTipText("Ex : 1234567890");
        phone.setPreferredSize(new java.awt.Dimension(36, 27));
        getContentPane().add(phone);
        phone.setBounds(232, 532, 116, 30);

        fn.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(fn);
        fn.setBounds(32, 89, 21, 14);

        ln.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(ln);
        ln.setBounds(32, 137, 21, 17);

        un.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(un);
        un.setBounds(32, 172, 21, 20);

        pass.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(pass);
        pass.setBounds(32, 217, 21, 20);

        cpass.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(cpass);
        cpass.setBounds(32, 255, 18, 20);

        dob1.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(dob1);
        dob1.setBounds(35, 293, 18, 14);

        add.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(add);
        add.setBounds(32, 334, 18, 20);

        s1.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(s1);
        s1.setBounds(32, 417, 18, 20);

        c1.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(c1);
        c1.setBounds(32, 458, 18, 20);

        pin1.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(pin1);
        pin1.setBounds(32, 489, 18, 14);

        phone1.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(phone1);
        phone1.setBounds(32, 532, 21, 29);

        error1.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        error1.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(error1);
        error1.setBounds(385, 210, 162, 20);

        gen.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        gen.setForeground(new java.awt.Color(0, 0, 153));
        gen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        getContentPane().add(gen);
        gen.setBounds(490, 90, 60, 30);

        jLabel14.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 153));
        jLabel14.setText("Gender");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(410, 90, 70, 25);

        jButton2.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 153));
        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(59, 29, 134, 30);
        getContentPane().add(date1);
        date1.setBounds(230, 290, 160, 30);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/air3.jpg"))); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(0, 0, 580, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void close()
{
    WindowEvent winClose=new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
    Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClose);
}
int no = 0;

    private void number() {
        try {
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flight", "root", "");
            Statement stmt = con.createStatement();
            String query = "select sno from users;";
            ResultSet rs = stmt.executeQuery(query);
            while (rs.next()) {
                no = rs.getInt("sno");
            }

            no = no + 1;

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    Calendar rightNow = Calendar.getInstance();
    int y = rightNow.get(Calendar.YEAR);
    int m = rightNow.get(Calendar.MONTH) + 1;
    int d = rightNow.get(Calendar.DAY_OF_MONTH);

    String y1 = Integer.toString(y);
    String m1 = Integer.toString(m);
    String d1 = Integer.toString(d);
    String max = y1 + "-" + m1 + "-" + d1;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
number();
String gender = (String) gen.getSelectedItem();
String name1 = t1.getText();
String name2 = t2.getText();
String user = t3.getText();
String pwd = new String(p1.getPassword());
String cpwd = new String(p2.getPassword());
String address1 = add1.getText();
String address2 = add2.getText();
String state = stat.getText();
String city = cit.getText();
String pincode = pin.getText();
int pincode2=Integer.parseInt(pin.getText());
String phon = phone.getText();
long phone2=Long.parseLong(phone.getText());
SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
String dob = formatter.format(date1.getDate());
      
                
        
int lpwd = pwd.length();
int lcpwd = cpwd.length();
int lpin = pincode.length();
int lphon = phon.length();
int ladd1 = address1.length();
int lname1 = name1.length();
int lname2 = name2.length();
int lstate = state.length();
int lcity = city.length();
int luser = user.length();
int x=0;
int z=luser-1;
for(int y=0;y<=z;y++)
{ 
 char c=user.charAt(y);
 String h=c+"";
 if(" ".equals(h))
 {
  x=x+1;
 }
}
String n = "";
String preuser = "";
try 
{
 Class.forName("java.sql.Driver");
 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flight", "root", "");
 Statement stmt = con.createStatement();
 String query = "select username,sno from users where username='" + user + "';";
 ResultSet rs = stmt.executeQuery(query);
 while (rs.next()) 
 {
  preuser = rs.getString("username");
 }
 String no1 = Integer.toString(no);
 if (user.equals(preuser)) 
 {
  JOptionPane.showMessageDialog(this, "Username Not Available.");
 }
 if (x>=1 || luser==0) 
 {
  JOptionPane.showMessageDialog(this, "Invalid Username");
 }
 else 
 {
  if(pincode2>=100000 && phone2>=1000000000 && lpwd >= 8 && lcpwd >= 8 
     && pwd.equals(cpwd) && lname1 != 0 && lname2 != 0 && ladd1 != 0 
     && lstate != 0 && lcity != 0 && luser != 0) 
  {
   String q = "insert into users values(" + no1 + ",'" + user + "','" + pwd + "','" 
             + name1 + "','" + name2 + "','" + address1 + "','" + address2 + "','" + state + "','"
             + city + "','" + pincode + "','" + phon + "','" + dob +"','"+ gender+ "');";
   stmt.execute(q);
   JOptionPane.showMessageDialog(this, "Registered Successfully");
  } 
  else 
  {
   String error="Please Check";
   if (lname1 == 0) 
   {
    error+="\n"+"First Name";
   }
   if (lname2 == 0) 
   {
    error+="\n"+"Last Name";
   }
   if (luser == 0) 
   {
    error+="\n"+"User Name";
   }
   if (!pwd.equals(cpwd)) 
   {
    error1.setText("Password Do Not Match");
   }
   if (lpwd < 8) 
   {
    error+="\n"+"Password";
   }
   if (lcpwd < 8) 
   {
    error+="\n"+"Confirm Password";
   }
   if (ladd1 == 0) 
   {
    error+="\n"+"Address";
   }
   if (lstate == 0) 
   {
   error+="\n"+"State";
   }
   if (lcity == 0) 
   {
    error+="\n"+"City";
   }
   if (pincode2<100000) 
   {
    error+="\n"+"Pincode";
   }
   if (phone2<1000000000) 
   {
    error+="\n"+"Phone No.";
   }
   JOptionPane.showMessageDialog(this, error);
  }
 }
 rs.close();
 stmt.close();
 con.close();
} 
catch (Exception e) 
{
 System.out.print(e);
}

// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pinKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pinKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_pinKeyTyped

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
Calendar cal = Calendar.getInstance();
        java.util.Date t=cal.getTime();   
        
date1.setMaxSelectableDate(t);
date1.setDate(t);
Font f=t1.getFont();
date1.setFont(f);
pin.setFont(f);
phone.setFont(f);// TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
close();
login a=new login();
a.setVisible(true);// TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(newuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newuser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel add;
    private javax.swing.JTextField add1;
    private javax.swing.JTextField add2;
    private javax.swing.JLabel c1;
    private javax.swing.JTextField cit;
    private javax.swing.JLabel cpass;
    private com.toedter.calendar.JDateChooser date1;
    private javax.swing.JLabel dob1;
    private javax.swing.JLabel error1;
    private javax.swing.JLabel fn;
    private javax.swing.JComboBox<String> gen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel ln;
    private javax.swing.JPasswordField p1;
    private javax.swing.JPasswordField p2;
    private javax.swing.JLabel pass;
    private javax.swing.JFormattedTextField phone;
    private javax.swing.JLabel phone1;
    private javax.swing.JFormattedTextField pin;
    private javax.swing.JLabel pin1;
    private javax.swing.JLabel s1;
    private javax.swing.JTextField stat;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JLabel un;
    // End of variables declaration//GEN-END:variables
}
