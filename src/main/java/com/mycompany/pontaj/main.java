/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pontaj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.HashMap;
import java.util.TimeZone;

/**
 *
 * @author kodie
 */
public class main extends javax.swing.JFrame {

    static int id = 1;
    public static String code = "";
    public static HashMap<String, String> loggedUsers = new HashMap<String, String>();//HashMap that stores the user and the time he logged in

    /**
     * Creates new form main
     */
    public main() {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        del = new javax.swing.JButton();
        jButton0 = new javax.swing.JButton();
        ENTER = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("1");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("2");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("3");
        jButton3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("4");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("5");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("6");
        jButton6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("7");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("8");
        jButton8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("9");
        jButton9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        del.setText("DEL");
        del.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });

        jButton0.setText("0");
        jButton0.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton0ActionPerformed(evt);
            }
        });

        ENTER.setText("ENTER");
        ENTER.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ENTER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENTERActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(67, 67, 67))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jTextField1.setText(jTextField1.getText() + "*");
        code = code + 1;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jTextField1.setText(jTextField1.getText() + "*");
        code = code + 2;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextField1.setText(jTextField1.getText() + "*");
        code = code + 3;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jTextField1.setText(jTextField1.getText() + "*");
        code = code + 4;
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTextField1.setText(jTextField1.getText() + "*");
        code = code + 5;
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jTextField1.setText(jTextField1.getText() + "*");
        code = code + 6;
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jTextField1.setText(jTextField1.getText() + "*");
        code = code + 7;
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jTextField1.setText(jTextField1.getText() + "*");
        code = code + 8;
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jTextField1.setText(jTextField1.getText() + "*");
        code = code + 9;
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton0ActionPerformed
        jTextField1.setText(jTextField1.getText() + "*");
        code = code + 0;
    }//GEN-LAST:event_jButton0ActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed

        String a = "";
        a = jTextField1.getText();
        a = a.substring(0, a.length() - 1);
        code = code.substring(0, code.length() - 1);
        jTextField1.setText(a);
    }//GEN-LAST:event_delActionPerformed

    private void ENTERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENTERActionPerformed
        String nume = "";
        if (checkDefaultPassword(code)) {
            chooseUserPasswordChange.userPassword = "0000";
            new changePassword().setVisible(true);
        }

        try {
            int flag = 1;
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Pontaj; create = true ", "Nicolae", "admin");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from ANGAJATI");
            while (rs.next()) {
                if (rs.getString(5).equals(code)) {
                    nume = rs.getString(2);
                    flag = 0;

                    break;
                }
            }
            if (flag == 0 && rs.getString(3).toString().equals("Administrator")) {
                //open Admin panel
                JOptionPane.showMessageDialog(null, "CODE OK",
                        "Error", JOptionPane.INFORMATION_MESSAGE);
                rs.close();
                st.close();
                conn.close();

                new supervisor().setVisible(true);

            } else if (flag == 0) {
                //Clock regular user in
                JOptionPane.showMessageDialog(null, "CODE OK",
                        "Error", JOptionPane.INFORMATION_MESSAGE);
                //log into db the time of log in 

                //change online status                                   
//                    login(code);
                if (checkOnline(code)) {
                    totalHoursWorked(code);
                    logout(code);
                } else {
                    login(code);
                }

                rs.close();
                st.close();
                conn.close();

            } else {
                jTextField1.setText("");
                JOptionPane.showMessageDialog(null, "INVALID CODE",
                        "Error", JOptionPane.ERROR_MESSAGE);

            }
            rs.close();
            st.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTextField1.setText("");
        code = "";
    }//GEN-LAST:event_ENTERActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    public static boolean checkOnline(String code) {
        Boolean aux = true;
        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Pontaj; create = true ", "Nicolae", "admin");
            Statement st = conn.createStatement();

            ResultSet rss = st.executeQuery("SELECT ONLINE FROM ANGAJATI WHERE PAROLA LIKE '" + code + "'");
            if (rss.next()) {
                aux = rss.getBoolean(1);
            }

        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return aux;
    }

    public static void logout(String code) {
        //***********************************************************************************
        String nume = "";
        if (checkOnline(code)) {
            try {
                Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Pontaj; create = true ", "Nicolae", "admin");
                Statement st = conn.createStatement();
                Boolean aux = true;
                ResultSet rss = st.executeQuery("SELECT ONLINE FROM ANGAJATI WHERE PAROLA LIKE '" + code + "'");
                if (rss.next()) {
                    aux = rss.getBoolean(1);
                }
                if (aux == true) {
                    String changeOnlineStatus = " UPDATE ANGAJATI SET ONLINE = '" + !aux + "'  where PAROLA = '" + code + "'";
                    Statement stmt = conn.createStatement();
                    stmt.executeUpdate(changeOnlineStatus);
                    rss.close();
                }

                ResultSet rs = st.executeQuery("select * from ANGAJATI");
                while (rs.next()) {
                    if (rs.getString(5).equals(code)) {
                        nume = rs.getString(2);
                        System.out.println("Nume = " + nume);
                        break;
                    }
                }

                Formatter formate = new Formatter();
                Calendar gfg_calender = Calendar.getInstance();
                formate = new Formatter();
                formate.format("%tl:%tM", gfg_calender, gfg_calender);
                String sql = "INSERT INTO PONTAJ (ID, NUME, ZI, LUNA, AN, ORALOGOFF) VALUES(?, ?, ?, ?, ?, ?) ";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
                //getTime() returns the current date in default time zone
                Date date = calendar.getTime();
                int day = calendar.get(Calendar.DATE);
                //Note: +1 the month for current month
                int month = calendar.get(Calendar.MONTH) + 1;
                int year = calendar.get(Calendar.YEAR);
                pstmt.setInt(1, id);
                id++;
                pstmt.setString(2, nume);
                pstmt.setInt(3, day);
                pstmt.setInt(4, month);
                pstmt.setInt(5, year);
                pstmt.setString(6, formate.toString());
                loggedUsers.remove(nume);
                System.out.println(formate.toString() + " - " + nume + " is now logged off. ");
                pstmt.executeUpdate();
                pstmt.close();
                conn.close();
                rss.close();
                st.close();
                conn.close();

            } catch (SQLException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public static void login(String code) {
        String nume = "";
        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Pontaj; create = true ", "Nicolae", "admin");
            Statement st = conn.createStatement();
            Boolean aux = false;
            ResultSet rss = st.executeQuery("SELECT ONLINE FROM ANGAJATI WHERE PAROLA LIKE '" + code + "'");
            if (rss.next()) {
                aux = rss.getBoolean(1);
            }
            if (aux == false) {

                String changeOnlineStatus = " UPDATE ANGAJATI SET ONLINE = '" + !aux + "'  where PAROLA = '" + code + "'";
                Statement stmt = conn.createStatement();
                stmt.executeUpdate(changeOnlineStatus);
                try {
                    ResultSet rs = st.executeQuery("select * from ANGAJATI");
                    while (rs.next()) {
                        if (rs.getString(5).equals(code)) {
                            nume = rs.getString(2);
                            System.out.println("Nume = " + nume);
                            break;
                        }
                    }
                    Formatter formate = new Formatter();

                    // Creating a calendar
                    Calendar gfg_calender = Calendar.getInstance();

                    // Displaying hour using Format clas using  format
                    // specifiers
                    // '%tl' for hours and '%tM' for minutes
                    formate = new Formatter();
                    formate.format("%tl:%tM", gfg_calender, gfg_calender);
                    String sql = "INSERT INTO PONTAJ (ID, NUME, ZI, LUNA, AN, ORALOGIN) VALUES(?, ?, ?, ?, ?, ?) ";////////
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
                    //getTime() returns the current date in default time zone
                    Date date = calendar.getTime();
                    int day = calendar.get(Calendar.DATE);
                    //Note: +1 the month for current month
                    int month = calendar.get(Calendar.MONTH) + 1;
                    int year = calendar.get(Calendar.YEAR);
                    pstmt.setInt(1, id);
                    id++;
                    pstmt.setString(2, nume);
                    pstmt.setInt(3, day);
                    pstmt.setInt(4, month);
                    pstmt.setInt(5, year);
                    pstmt.setString(6, formate.toString());
                    loggedUsers.put(nume, formate.toString());
                    System.out.println(formate.toString() + " - " + nume + " is now logged in. ");
                    pstmt.executeUpdate();
                    pstmt.close();
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
                rss.close();
                st.close();
                conn.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static boolean checkDefaultPassword(String code) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Pontaj; create = true ", "Nicolae", "admin");
            Statement st = conn.createStatement();
            Boolean aux = false;
            ResultSet rss = st.executeQuery("SELECT CHANGEPASSWORD FROM ANGAJATI WHERE PAROLA LIKE '" + code + "'");
            if (rss.next()) {
                aux = rss.getBoolean(1);
            }
            if (aux == true) {
                String changeOnlineStatus = " UPDATE ANGAJATI SET CHANGEPASSWORD = '" + !aux + "'  where PAROLA = '" + code + "'";
                Statement stmt = conn.createStatement();
                stmt.executeUpdate(changeOnlineStatus);
                rss.close();
                st.close();
                stmt.close();
                conn.close();
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    public static String totalHoursWorked(String code) throws ParseException {
        String totalHoursWorkedString = "";
        Double totalHoursWorked;
        String oraLogin = "";
        String oraLogOff = "";
        String nume = "";
        try {
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Pontaj; create = true ", "Nicolae", "admin");
            Statement st = conn.createStatement();
            Boolean aux = false;
            String changeOnlineStatus = " UPDATE PONTAJ SET ORELUCRATE = '" + !aux + "'  where PAROLA = '" + code + "'";
            Statement stmt = conn.createStatement();
            try {
                ResultSet rs = st.executeQuery("select * from ANGAJATI");
                while (rs.next()) {
                    if (rs.getString(5).equals(code)) {
                        nume = rs.getString(2);
                        System.out.println("Nume = " + nume);
                        break;
                    }
                }
                Formatter formate = new Formatter();

                // Creating a calendar
                Calendar gfg_calender = Calendar.getInstance();

                // Displaying hour using Format clas using  format
                // specifiers
                // '%tl' for hours and '%tM' for minutes
                formate = new Formatter();
                formate.format("%tl:%tM", gfg_calender, gfg_calender);
                String sql = "INSERT INTO PONTAJ (ID, NUME, ZI, LUNA, AN, ORALOGIN) VALUES(?, ?, ?, ?, ?, ?) ";////////
                PreparedStatement pstmt = conn.prepareStatement(sql);
                Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
                //getTime() returns the current date in default time zone
                Date date = calendar.getTime();
                int day = calendar.get(Calendar.DATE);
                //Note: +1 the month for current month
                int month = calendar.get(Calendar.MONTH) + 1;
                int year = calendar.get(Calendar.YEAR);
                pstmt.setInt(1, id);
                id++;
                pstmt.setString(2, nume);
                pstmt.setInt(3, day);
                pstmt.setInt(4, month);
                pstmt.setInt(5, year);
                pstmt.setString(6, formate.toString());
                oraLogOff = formate.toString();
//                    totalHoursWorked = Double.parseDouble(formate.toString()) - Double.parseDouble(loggedUsers.get(nume));

/// Calcul ore si minute lucrate
                String time1 = formate.toString();
                String time2 = loggedUsers.get(nume);

                DateFormat format = new SimpleDateFormat("HH:mm");
                Date date1 = format.parse(time1);
                Date date2 = format.parse(time2);
                long milliseconds = date1.getTime() - date2.getTime();
                int minutes = (int) ((milliseconds / (1000 * 60)) % 60);
                int hours = (int) ((milliseconds / (1000 * 60 * 60)) % 24);
                totalHoursWorkedString = (hours + ":" + minutes).toString();
                totalHoursWorked = Double.parseDouble(hours + ":" + minutes);
///
                pstmt.executeUpdate();
                pstmt.close();
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
//                rss.close();
            st.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return totalHoursWorkedString;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ENTER;
    private javax.swing.JButton del;
    private javax.swing.JButton jButton0;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
