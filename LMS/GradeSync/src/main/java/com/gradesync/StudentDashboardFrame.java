package com.gradesync;
import com.formdev.flatlaf.FlatLightLaf;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import org.bson.Document;

public class StudentDashboardFrame extends javax.swing.JFrame {
  private DefaultTableModel tableModel;
  private static String studentID;
  public StudentDashboardFrame() {
    initComponents();
    loadStudentResults();
    loadAnnouncements();
    loadStudentInfo();
    loadMessages();
  }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chatPanel = new javax.swing.JDialog();
        jPanel6 = new javax.swing.JPanel();
        messageField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        chatArea = new javax.swing.JTextArea();
        sendButton = new javax.swing.JButton();
        msgRefreshButton = new javax.swing.JButton();
        securityPanel = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        currentPasswordField = new javax.swing.JPasswordField();
        newPasswordField = new javax.swing.JPasswordField();
        confirmPasswordField = new javax.swing.JPasswordField();
        changePasswordButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        subjectNameField = new javax.swing.JTextField();
        reviewTextArea = new javax.swing.JTextField();
        requestRecorrectionButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultsTable = new javax.swing.JTable();
        refreshButton = new javax.swing.JButton();
        generateTranscriptButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        announcementLabel = new javax.swing.JLabel();
        imgttt = new javax.swing.JLabel();
        studentIDLabel = new javax.swing.JLabel();
        chatButton = new javax.swing.JButton();
        logOut1 = new javax.swing.JButton();
        securityButton = new javax.swing.JButton();
        studentNameLabel = new javax.swing.JLabel();

        chatPanel.setTitle("GradeSync > Messaging");
        chatPanel.setResizable(false);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        messageField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Message", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        messageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageFieldActionPerformed(evt);
            }
        });

        chatArea.setColumns(20);
        chatArea.setRows(5);
        chatArea.setEnabled(false);
        jScrollPane2.setViewportView(chatArea);

        sendButton.setBackground(new java.awt.Color(51, 51, 51));
        sendButton.setFont(new java.awt.Font("SimSun-ExtB", 1, 12)); // NOI18N
        sendButton.setForeground(new java.awt.Color(255, 255, 255));
        sendButton.setText("SEND");
        sendButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        msgRefreshButton.setFont(new java.awt.Font("SimSun-ExtB", 1, 12)); // NOI18N
        msgRefreshButton.setText("REFRESH");
        msgRefreshButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        msgRefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msgRefreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                    .addComponent(messageField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(sendButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(msgRefreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messageField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sendButton, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(msgRefreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout chatPanelLayout = new javax.swing.GroupLayout(chatPanel.getContentPane());
        chatPanel.getContentPane().setLayout(chatPanelLayout);
        chatPanelLayout.setHorizontalGroup(
            chatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        chatPanelLayout.setVerticalGroup(
            chatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        securityPanel.setTitle("GradeSync > Security");
        securityPanel.setMaximumSize(new java.awt.Dimension(252, 267));
        securityPanel.setMinimumSize(new java.awt.Dimension(252, 267));
        securityPanel.setPreferredSize(new java.awt.Dimension(252, 267));
        securityPanel.setResizable(false);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Change your password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        currentPasswordField.setForeground(new java.awt.Color(102, 102, 102));
        currentPasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Current Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        currentPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currentPasswordFieldActionPerformed(evt);
            }
        });

        newPasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "New Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        newPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPasswordFieldActionPerformed(evt);
            }
        });

        confirmPasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Confirm Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        changePasswordButton.setBackground(new java.awt.Color(51, 51, 51));
        changePasswordButton.setFont(new java.awt.Font("SimSun-ExtB", 1, 12)); // NOI18N
        changePasswordButton.setForeground(new java.awt.Color(255, 255, 255));
        changePasswordButton.setText("CHANGE");
        changePasswordButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        changePasswordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(changePasswordButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(currentPasswordField)
                    .addComponent(newPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(confirmPasswordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(currentPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(changePasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout securityPanelLayout = new javax.swing.GroupLayout(securityPanel.getContentPane());
        securityPanel.getContentPane().setLayout(securityPanelLayout);
        securityPanelLayout.setHorizontalGroup(
            securityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        securityPanelLayout.setVerticalGroup(
            securityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GradeSync > Student Dashboard");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(823, 556));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Recorrection Requests", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        subjectNameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        subjectNameField.setToolTipText("");
        subjectNameField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Subject", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        reviewTextArea.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        reviewTextArea.setToolTipText("");
        reviewTextArea.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reason", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        requestRecorrectionButton.setBackground(new java.awt.Color(51, 51, 51));
        requestRecorrectionButton.setFont(new java.awt.Font("SimSun-ExtB", 1, 12)); // NOI18N
        requestRecorrectionButton.setForeground(new java.awt.Color(255, 255, 255));
        requestRecorrectionButton.setText("REQUEST");
        requestRecorrectionButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        requestRecorrectionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestRecorrectionButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subjectNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 334, Short.MAX_VALUE)
                    .addComponent(reviewTextArea)
                    .addComponent(requestRecorrectionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(subjectNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reviewTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(requestRecorrectionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Results", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        resultsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Subject", "Grade"
            }
        ));
        jScrollPane1.setViewportView(resultsTable);

        refreshButton.setBackground(new java.awt.Color(51, 51, 51));
        refreshButton.setFont(new java.awt.Font("SimSun-ExtB", 1, 12)); // NOI18N
        refreshButton.setForeground(new java.awt.Color(255, 255, 255));
        refreshButton.setText("REFRESH");
        refreshButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        generateTranscriptButton.setFont(new java.awt.Font("SimSun-ExtB", 1, 12)); // NOI18N
        generateTranscriptButton.setText("TRANSCRIPT");
        generateTranscriptButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        generateTranscriptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateTranscriptButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(generateTranscriptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(generateTranscriptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Announcement", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(announcementLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 782, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(announcementLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
        );

        imgttt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/student.jpg"))); // NOI18N

        studentIDLabel.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        studentIDLabel.setForeground(new java.awt.Color(102, 102, 102));
        studentIDLabel.setText("Logged in as: {student}");

        chatButton.setBackground(new java.awt.Color(51, 51, 51));
        chatButton.setFont(new java.awt.Font("SimSun-ExtB", 1, 12)); // NOI18N
        chatButton.setForeground(new java.awt.Color(255, 255, 255));
        chatButton.setText("CHAT WITH TEACHER");
        chatButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        chatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chatButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(chatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(studentIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imgttt, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(imgttt, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(chatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(studentIDLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        logOut1.setFont(new java.awt.Font("SimSun-ExtB", 1, 12)); // NOI18N
        logOut1.setText("LOGOUT");
        logOut1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        logOut1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOut1ActionPerformed(evt);
            }
        });

        securityButton.setBackground(new java.awt.Color(51, 51, 51));
        securityButton.setFont(new java.awt.Font("SimSun-ExtB", 1, 12)); // NOI18N
        securityButton.setForeground(new java.awt.Color(255, 255, 255));
        securityButton.setText("SECURITY");
        securityButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        securityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                securityButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(securityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(logOut1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(logOut1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(securityButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        studentNameLabel.setFont(new java.awt.Font("SimSun-ExtB", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(321, 321, 321)
                    .addComponent(studentNameLabel)
                    .addContainerGap(502, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(263, 263, 263)
                    .addComponent(studentNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(263, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void requestRecorrectionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestRecorrectionButtonActionPerformed
        requestRecorrection();
    }//GEN-LAST:event_requestRecorrectionButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        loadStudentResults();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void generateTranscriptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateTranscriptButtonActionPerformed
        generateTranscript();
    }//GEN-LAST:event_generateTranscriptButtonActionPerformed

    private void logOut1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOut1ActionPerformed
        this.dispose();
        SwingUtilities.invokeLater(() -> {
            WelcomeFrame student = new WelcomeFrame();
            student.setVisible(true);
        });
    }//GEN-LAST:event_logOut1ActionPerformed

    private void chatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chatButtonActionPerformed
        // TODO add your handling code here:
        chatPanel.setVisible(true);
        chatPanel.setSize(300, 320);
    }//GEN-LAST:event_chatButtonActionPerformed

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        sendMessage();
    }//GEN-LAST:event_sendButtonActionPerformed

    private void messageFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageFieldActionPerformed

    }//GEN-LAST:event_messageFieldActionPerformed

    private void msgRefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msgRefreshButtonActionPerformed
        loadMessages();
    }//GEN-LAST:event_msgRefreshButtonActionPerformed

    private void securityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_securityButtonActionPerformed
        securityPanel.setVisible(true);
        securityPanel.setSize(252, 267);
    }//GEN-LAST:event_securityButtonActionPerformed

    private void newPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPasswordFieldActionPerformed

    }//GEN-LAST:event_newPasswordFieldActionPerformed

    private void changePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordButtonActionPerformed
        changePassword(new String(currentPasswordField.getPassword()), 
                       new String(newPasswordField.getPassword()), 
                       new String(confirmPasswordField.getPassword())
        );
        securityPanel.dispose();
    }//GEN-LAST:event_changePasswordButtonActionPerformed
    private void changePassword(String currentPassword, String newPassword, String confirmPassword) {
        if (!newPassword.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "New password and confirmation do not match!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (MongoDBConnection.validateCurrentPassword(studentID, currentPassword)) {
            MongoDBConnection.updatePassword(studentID, newPassword);
            JOptionPane.showMessageDialog(this, "Password changed successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Current password is incorrect!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void currentPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentPasswordFieldActionPerformed

    }//GEN-LAST:event_currentPasswordFieldActionPerformed
  private void loadMessages() {
    List<Document> messages =
        MongoDBConnection.getMessagesByStudentID(studentID);
    chatArea.setText("");
    for (Document message : messages) {
      String sender = message.getString("sender");
      String messageText = message.getString("message");
      chatArea.append(sender + ": " + messageText + "\n");
      //            chatArea.append("Me: " + messageText + "\n");
    }
  }
  private void sendMessage() {
    String message = messageField.getText();
    if (!message.isEmpty()) {
      MongoDBConnection.insertMessage(studentID, "Student", message);
      chatArea.append("Me: " + message + "\n");
      messageField.setText("");
      loadMessages();
    }
  }
  private void generateTranscript() {
    try {
      // Fetch student details
      MongoDatabase database = MongoDBConnection.getDatabase();
      MongoCollection<Document> studentsCollection =
          database.getCollection("students");
      Document studentDoc =
          studentsCollection.find(new Document("StudentID", studentID)).first();
      if (studentDoc == null) {
        JOptionPane.showMessageDialog(this,
            "Failed to retrieve student information.", "Error",
            JOptionPane.ERROR_MESSAGE);
        return;
      }
      String studentName = studentDoc.getString("Name");
      String batch = studentDoc.getString("Batch");
      // Fetch student results
      MongoCollection<Document> gradeCollection =
          database.getCollection("grades");
      MongoCursor<Document> cursor =
          gradeCollection.find(new Document("StudentID", studentID)).iterator();
      StringBuilder transcript = new StringBuilder();
      transcript.append("Transcript for Student:\n");
      transcript.append("Student ID: ").append(studentID).append("\n");
      transcript.append("Name: ").append(studentName).append("\n");
      transcript.append("Batch: ").append(batch).append("\n\n");
      transcript.append("Results:\n");
      while (cursor.hasNext()) {
        Document gradeDoc = cursor.next();
        String subjectName = gradeDoc.getString("SubjectName");
        String grade = gradeDoc.getString("Grade");
        transcript.append(subjectName).append(": ").append(grade).append("\n");
      }
      cursor.close();
      // Save transcript to a text file
      JFileChooser fileChooser = new JFileChooser();
      fileChooser.setSelectedFile(new File("transcript.txt"));
      int option = fileChooser.showSaveDialog(this);
      if (option == JFileChooser.APPROVE_OPTION) {
        File file = fileChooser.getSelectedFile();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
          writer.write(transcript.toString());
          JOptionPane.showMessageDialog(this, "Transcript saved successfully.",
              "Success", JOptionPane.INFORMATION_MESSAGE);
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
      JOptionPane.showMessageDialog(this,
          "An error occurred while generating the transcript.", "Error",
          JOptionPane.ERROR_MESSAGE);
    }
  }
  private void loadStudentInfo() {
    try {
      MongoDatabase database = MongoDBConnection.getDatabase();
      if (database == null) {
        JOptionPane.showMessageDialog(this,
            "Failed to connect to the database.", "Error",
            JOptionPane.ERROR_MESSAGE);
        return;
      }
      MongoCollection<Document> studentsCollection =
          database.getCollection("students");
      Document query = new Document("StudentID", studentID);
      Document student = studentsCollection.find(query).first();
      if (student != null) {
        String studentName = student.getString("Name");
        studentIDLabel.setText("Logged in as " + studentID);
//        studentNameLabel.setText(studentName);
      } else {
        studentIDLabel.setText("Student ID: Not found");
//        studentNameLabel.setText("Name: Not found");
      }
    } catch (Exception e) {
      e.printStackTrace();
      JOptionPane.showMessageDialog(this,
          "An error occurred while retrieving student information.", "Error",
          JOptionPane.ERROR_MESSAGE);
    }
  }
  public static void setStudentID(String id) {
    studentID = id;
  }
  private void requestRecorrection() {
    String subjectName = subjectNameField.getText().trim();
    String review = reviewTextArea.getText().trim();
    if (subjectName.isEmpty() || review.isEmpty()) {
      JOptionPane.showMessageDialog(this, "Subject and review cannot be empty.",
          "Input Error", JOptionPane.WARNING_MESSAGE);
      return;
    }
    // Retrieve the current grade
    String grade = getCurrentGrade(studentID, subjectName);

    if (grade != null) {
      saveRecorrectionRequest(studentID, subjectName, grade, review);
      rsClearFields();
    } else {
      JOptionPane.showMessageDialog(this, "Failed to retrieve current grade.",
          "Error", JOptionPane.ERROR_MESSAGE);
    }
  }
  private void rsClearFields() {
    subjectNameField.setText("");
    reviewTextArea.setText("");
}
  private String getCurrentGrade(String studentID, String subjectName) {
    try {
      MongoDatabase database = MongoDBConnection.getDatabase();
      MongoCollection<Document> gradeCollection =
          database.getCollection("grades");
      Document query = new Document("StudentID", studentID)
                           .append("SubjectName", subjectName);
      Document document = gradeCollection.find(query).first();

      if (document != null) {
        return document.getString("Grade");
      } else {
        return null;
      }
    } catch (Exception e) {
      e.printStackTrace();
      JOptionPane.showMessageDialog(this,
          "An error occurred while retrieving the grade.", "Error",
          JOptionPane.ERROR_MESSAGE);
      return null;
    }
  }
  private void saveRecorrectionRequest(
      String studentID, String subjectName, String grade, String review) {
    try {
      MongoDatabase database = MongoDBConnection.getDatabase();
      MongoCollection<Document> recorrectionsCollection =
          database.getCollection("recorrections");
      Document recorrection = new Document("StudentID", studentID)
                                  .append("SubjectName", subjectName)
                                  .append("Grade", grade)
                                  .append("Review", review);
      recorrectionsCollection.insertOne(recorrection);
      JOptionPane.showMessageDialog(this,
          "Recorrection request submitted successfully.", "Success",
          JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception e) {
      e.printStackTrace();
      JOptionPane.showMessageDialog(this,
          "An error occurred while submitting the recorrection request.",
          "Error", JOptionPane.ERROR_MESSAGE);
    }
  }

  private void loadAnnouncements() {
    try {
      MongoCollection<Document> announcementsCollection =
          MongoDBConnection.getDatabase().getCollection("announcements");
      // Retrieve all announcements and sort them by _id manually
      List<Document> announcements =
          announcementsCollection.find().into(new ArrayList<>());
      Document latestAnnouncement = null;
      if (!announcements.isEmpty()) {
        latestAnnouncement = announcements.get(
            announcements.size() - 1); // Get the last document in the list
      }
      if (latestAnnouncement != null) {
        announcementLabel.setText(latestAnnouncement.getString("Announcement"));
      } else {
        announcementLabel.setText("No new announcements.");
      }
    } catch (Exception e) {
      e.printStackTrace();
      JOptionPane.showMessageDialog(this,
          "An error occurred while loading announcements.", "Error",
          JOptionPane.ERROR_MESSAGE);
    }
  }

  private void loadStudentResults() {
    try {
      MongoDatabase database = MongoDBConnection.getDatabase();
      if (database == null) {
        JOptionPane.showMessageDialog(this,
            "Failed to connect to the database.", "Error",
            JOptionPane.ERROR_MESSAGE);
        return;
      }
      MongoCollection<Document> gradeCollection =
          database.getCollection("grades");
      DefaultTableModel tableModel = new DefaultTableModel();
      tableModel.addColumn("Subject");
      tableModel.addColumn("Grade");
      // Query to get results for the logged-in student
      Document query = new Document("StudentID", studentID);
      MongoCursor<Document> cursor = gradeCollection.find(query).iterator();
      while (cursor.hasNext()) {
        Document doc = cursor.next();
        String subjectName = doc.getString("SubjectName");
        String grade = doc.getString("Grade");
        // Add row to the table model
        tableModel.addRow(new Object[] {subjectName, grade});
      }
      cursor.close();
      resultsTable.setModel(tableModel);
    } catch (Exception e) {
      e.printStackTrace();
      JOptionPane.showMessageDialog(this,
          "An error occurred while retrieving student results.", "Error",
          JOptionPane.ERROR_MESSAGE);
    }
  }

  public static void main(String args[]) {
    try {
      UIManager.setLookAndFeel(new FlatLightLaf());
    } catch (Exception e) {
      e.printStackTrace();
    }

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new StudentDashboardFrame().setVisible(true);
      }
    });
  }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel announcementLabel;
    private javax.swing.JButton changePasswordButton;
    private javax.swing.JTextArea chatArea;
    private javax.swing.JButton chatButton;
    private javax.swing.JDialog chatPanel;
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JPasswordField currentPasswordField;
    private javax.swing.JButton generateTranscriptButton;
    private javax.swing.JLabel imgttt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton logOut1;
    private javax.swing.JTextField messageField;
    private javax.swing.JButton msgRefreshButton;
    private javax.swing.JPasswordField newPasswordField;
    private javax.swing.JButton refreshButton;
    private javax.swing.JButton requestRecorrectionButton;
    private javax.swing.JTable resultsTable;
    private javax.swing.JTextField reviewTextArea;
    private javax.swing.JButton securityButton;
    private javax.swing.JDialog securityPanel;
    private javax.swing.JButton sendButton;
    private javax.swing.JLabel studentIDLabel;
    private javax.swing.JLabel studentNameLabel;
    private javax.swing.JTextField subjectNameField;
    // End of variables declaration//GEN-END:variables
}
