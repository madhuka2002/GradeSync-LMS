/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.gradesync;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;
import javax.swing.*;
import java.awt.*;
import com.mongodb.client.FindIterable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import com.mongodb.client.MongoCursor;
import java.util.Arrays;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class TeacherDashboardFrame extends javax.swing.JFrame {
    private DefaultTableModel tableModel;
    private static String loggedInTeacherUsername;
    public TeacherDashboardFrame() {
        initComponents();
        loadRecorrectionData();
        loadStudentList();
        loadTeacherInfo();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        announcementDialog = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        announcementArea = new javax.swing.JTextArea();
        publishButton = new javax.swing.JButton();
        chatPanel = new javax.swing.JDialog();
        jPanel12 = new javax.swing.JPanel();
        messageField = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        chatArea = new javax.swing.JTextArea();
        sendButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        studentList = new javax.swing.JList<>();
        msgRefreshButton = new javax.swing.JButton();
        resetAllChatsButton = new javax.swing.JButton();
        securityPanel = new javax.swing.JDialog();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        currentPasswordField = new javax.swing.JPasswordField();
        newPasswordField = new javax.swing.JPasswordField();
        confirmPasswordField = new javax.swing.JPasswordField();
        changePasswordButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        studentIDField = new javax.swing.JTextField();
        batchField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        clearButton = new javax.swing.JButton();
        submitButton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        showStudents = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        removeStudentIDField = new javax.swing.JTextField();
        removeStudentButton = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        uStudentIDField = new javax.swing.JTextField();
        uSubmitButton = new javax.swing.JButton();
        uPasswordField = new javax.swing.JPasswordField();
        RecorrectionPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        recorrectionTable = new javax.swing.JTable();
        refreshButton = new javax.swing.JButton();
        clearAll = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        gStudentIDField = new javax.swing.JTextField();
        gSubjectNameField = new javax.swing.JTextField();
        gGradeField = new javax.swing.JTextField();
        gClearButton = new javax.swing.JButton();
        gSubmitResultButton = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        removeStudentResultsButton = new javax.swing.JButton();
        removeResultStudentIDField = new javax.swing.JTextField();
        removeResultSubjectField = new javax.swing.JTextField();
        viewResultsButton = new javax.swing.JButton();
        logOut = new javax.swing.JButton();
        postAnnouncementButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        submitButton1 = new javax.swing.JButton();
        teacherIDLabel = new javax.swing.JLabel();
        securityButton = new javax.swing.JButton();

        announcementDialog.setTitle("GradeSync > Publish");
        announcementDialog.setAlwaysOnTop(true);
        announcementDialog.setLocation(new java.awt.Point(500, 200));
        announcementDialog.setMinimumSize(new java.awt.Dimension(295, 173));
        announcementDialog.setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        announcementArea.setColumns(20);
        announcementArea.setRows(5);
        jScrollPane2.setViewportView(announcementArea);

        publishButton.setBackground(new java.awt.Color(51, 51, 51));
        publishButton.setFont(new java.awt.Font("SimSun-ExtB", 1, 12)); // NOI18N
        publishButton.setForeground(new java.awt.Color(255, 255, 255));
        publishButton.setText("PUBLISH");
        publishButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        publishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                publishButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(publishButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(publishButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout announcementDialogLayout = new javax.swing.GroupLayout(announcementDialog.getContentPane());
        announcementDialog.getContentPane().setLayout(announcementDialogLayout);
        announcementDialogLayout.setHorizontalGroup(
            announcementDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        announcementDialogLayout.setVerticalGroup(
            announcementDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        chatPanel.setTitle("GradeSync > Messaging");
        chatPanel.setLocation(new java.awt.Point(500, 200));
        chatPanel.setMaximumSize(new java.awt.Dimension(300, 349));
        chatPanel.setMinimumSize(new java.awt.Dimension(300, 349));
        chatPanel.setResizable(false);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        messageField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Message", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        messageField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageFieldActionPerformed(evt);
            }
        });

        chatArea.setColumns(20);
        chatArea.setRows(5);
        chatArea.setEnabled(false);
        jScrollPane3.setViewportView(chatArea);

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

        studentList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        studentList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        studentList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentListMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(studentList);

        msgRefreshButton.setFont(new java.awt.Font("SimSun-ExtB", 1, 12)); // NOI18N
        msgRefreshButton.setText("REFRESH");
        msgRefreshButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        msgRefreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msgRefreshButtonActionPerformed(evt);
            }
        });

        resetAllChatsButton.setFont(new java.awt.Font("SimSun-ExtB", 1, 12)); // NOI18N
        resetAllChatsButton.setText("CLEAR CHATS");
        resetAllChatsButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        resetAllChatsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetAllChatsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                            .addComponent(resetAllChatsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(messageField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(msgRefreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resetAllChatsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(messageField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sendButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msgRefreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout chatPanelLayout = new javax.swing.GroupLayout(chatPanel.getContentPane());
        chatPanel.getContentPane().setLayout(chatPanelLayout);
        chatPanelLayout.setHorizontalGroup(
            chatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        chatPanelLayout.setVerticalGroup(
            chatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        securityPanel.setTitle("GradeSync > Security");
        securityPanel.setLocation(new java.awt.Point(500, 200));
        securityPanel.setMaximumSize(new java.awt.Dimension(252, 231));
        securityPanel.setMinimumSize(new java.awt.Dimension(252, 231));
        securityPanel.setPreferredSize(new java.awt.Dimension(252, 231));
        securityPanel.setResizable(false);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Change your password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

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

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(changePasswordButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(currentPasswordField)
                    .addComponent(newPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(confirmPasswordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(currentPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(newPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(confirmPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(changePasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout securityPanelLayout = new javax.swing.GroupLayout(securityPanel.getContentPane());
        securityPanel.getContentPane().setLayout(securityPanelLayout);
        securityPanelLayout.setHorizontalGroup(
            securityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        securityPanelLayout.setVerticalGroup(
            securityPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GradeSync > Teacher Dashboard");
        setMinimumSize(new java.awt.Dimension(1011, 636));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Student Management"));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Student", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        studentIDField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Identity", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        batchField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Batch", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        nameField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        emailField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Email", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        clearButton.setFont(new java.awt.Font("SimSun-ExtB", 1, 12)); // NOI18N
        clearButton.setText("CLEAR");
        clearButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        submitButton.setBackground(new java.awt.Color(51, 51, 51));
        submitButton.setFont(new java.awt.Font("SimSun-ExtB", 1, 12)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("ADD");
        submitButton.setToolTipText("");
        submitButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailField)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(submitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(batchField, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(studentIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studentIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(batchField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Manage Students", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        showStudents.setBackground(new java.awt.Color(51, 51, 51));
        showStudents.setFont(new java.awt.Font("SimSun-ExtB", 1, 12)); // NOI18N
        showStudents.setForeground(new java.awt.Color(255, 255, 255));
        showStudents.setText("SHOW STUDENT LIST");
        showStudents.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        showStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showStudentsActionPerformed(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Remove Student", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        removeStudentIDField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Identity", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        removeStudentButton.setFont(new java.awt.Font("SimSun-ExtB", 1, 12)); // NOI18N
        removeStudentButton.setText("REMOVE");
        removeStudentButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        removeStudentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeStudentButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(removeStudentIDField)
                    .addComponent(removeStudentButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(removeStudentIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeStudentButton, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Set Initials", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel10.setForeground(new java.awt.Color(102, 102, 102));

        uStudentIDField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Identity", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        uStudentIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uStudentIDFieldActionPerformed(evt);
            }
        });

        uSubmitButton.setBackground(new java.awt.Color(51, 51, 51));
        uSubmitButton.setFont(new java.awt.Font("SimSun-ExtB", 1, 12)); // NOI18N
        uSubmitButton.setForeground(new java.awt.Color(255, 255, 255));
        uSubmitButton.setText("SET");
        uSubmitButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        uSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uSubmitButtonActionPerformed(evt);
            }
        });

        uPasswordField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Initial Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(uPasswordField)
                    .addComponent(uStudentIDField, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(uSubmitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(uStudentIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uSubmitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(showStudents, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(showStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4))))
        );

        RecorrectionPanel.setBackground(new java.awt.Color(255, 255, 255));
        RecorrectionPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Recorrection Requests"));

        recorrectionTable.setAutoCreateRowSorter(true);
        recorrectionTable.setForeground(new java.awt.Color(102, 102, 102));
        recorrectionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Student Identity", "Subject", "Grade", "Review"
            }
        ));
        recorrectionTable.setEnabled(false);
        recorrectionTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                recorrectionTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(recorrectionTable);
        if (recorrectionTable.getColumnModel().getColumnCount() > 0) {
            recorrectionTable.getColumnModel().getColumn(0).setResizable(false);
            recorrectionTable.getColumnModel().getColumn(1).setResizable(false);
            recorrectionTable.getColumnModel().getColumn(2).setResizable(false);
            recorrectionTable.getColumnModel().getColumn(3).setResizable(false);
        }

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

        clearAll.setFont(new java.awt.Font("SimSun-ExtB", 1, 12)); // NOI18N
        clearAll.setText("CLEAR ALL");
        clearAll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        clearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearAllActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout RecorrectionPanelLayout = new javax.swing.GroupLayout(RecorrectionPanel);
        RecorrectionPanel.setLayout(RecorrectionPanelLayout);
        RecorrectionPanelLayout.setHorizontalGroup(
            RecorrectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RecorrectionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RecorrectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(RecorrectionPanelLayout.createSequentialGroup()
                        .addComponent(clearAll, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(refreshButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        RecorrectionPanelLayout.setVerticalGroup(
            RecorrectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RecorrectionPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RecorrectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refreshButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearAll, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Results Management"));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Add Result", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        gStudentIDField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Identity", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        gSubjectNameField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Subject Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        gGradeField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Grade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        gClearButton.setFont(new java.awt.Font("SimSun-ExtB", 1, 12)); // NOI18N
        gClearButton.setText("CLEAR");
        gClearButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        gClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gClearButtonActionPerformed(evt);
            }
        });

        gSubmitResultButton.setBackground(new java.awt.Color(51, 51, 51));
        gSubmitResultButton.setFont(new java.awt.Font("SimSun-ExtB", 1, 12)); // NOI18N
        gSubmitResultButton.setForeground(new java.awt.Color(255, 255, 255));
        gSubmitResultButton.setText("ADD");
        gSubmitResultButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        gSubmitResultButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gSubmitResultButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(gStudentIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gSubjectNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gGradeField, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(gClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(gSubmitResultButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(gStudentIDField, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(gSubjectNameField)
                    .addComponent(gGradeField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gSubmitResultButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Results", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(153, 153, 153))); // NOI18N

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Remove Results", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        removeStudentResultsButton.setFont(new java.awt.Font("SimSun-ExtB", 1, 12)); // NOI18N
        removeStudentResultsButton.setText("REMOVE");
        removeStudentResultsButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        removeStudentResultsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeStudentResultsButtonActionPerformed(evt);
            }
        });

        removeResultStudentIDField.setToolTipText("");
        removeResultStudentIDField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Identity", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        removeResultSubjectField.setToolTipText("");
        removeResultSubjectField.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Subject Name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(removeResultStudentIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(removeResultSubjectField, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(removeStudentResultsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(removeStudentResultsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(removeResultSubjectField, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(removeResultStudentIDField, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );

        viewResultsButton.setBackground(new java.awt.Color(51, 51, 51));
        viewResultsButton.setFont(new java.awt.Font("SimSun-ExtB", 1, 12)); // NOI18N
        viewResultsButton.setForeground(new java.awt.Color(255, 255, 255));
        viewResultsButton.setText("SHOW RESULT LIST");
        viewResultsButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        viewResultsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewResultsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewResultsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(viewResultsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        logOut.setFont(new java.awt.Font("SimSun-ExtB", 1, 12)); // NOI18N
        logOut.setText("LOGOUT");
        logOut.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });

        postAnnouncementButton.setBackground(new java.awt.Color(51, 51, 51));
        postAnnouncementButton.setFont(new java.awt.Font("SimSun-ExtB", 1, 12)); // NOI18N
        postAnnouncementButton.setForeground(new java.awt.Color(255, 255, 255));
        postAnnouncementButton.setText("POST ANNOUNCEMENT");
        postAnnouncementButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        postAnnouncementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postAnnouncementButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("SimSun-ExtB", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/book.png"))); // NOI18N
        jLabel1.setText("TEACHER DASHBOARD");

        submitButton1.setBackground(new java.awt.Color(51, 51, 51));
        submitButton1.setFont(new java.awt.Font("SimSun-ExtB", 1, 12)); // NOI18N
        submitButton1.setForeground(new java.awt.Color(255, 255, 255));
        submitButton1.setText("CHAT WITH STUDENT");
        submitButton1.setToolTipText("");
        submitButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        submitButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButton1ActionPerformed(evt);
            }
        });

        teacherIDLabel.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        teacherIDLabel.setForeground(new java.awt.Color(102, 102, 102));
        teacherIDLabel.setText("Logged in as: {teacher}");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(teacherIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(submitButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(postAnnouncementButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(125, 125, 125)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(securityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RecorrectionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(logOut, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(securityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(submitButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                            .addComponent(postAnnouncementButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(teacherIDLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(RecorrectionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clearFields();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        addStudent();
    }//GEN-LAST:event_submitButtonActionPerformed

    private void showStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showStudentsActionPerformed
        showAllStudents();
    }//GEN-LAST:event_showStudentsActionPerformed

    private void removeStudentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeStudentButtonActionPerformed
        removeStudent();
    }//GEN-LAST:event_removeStudentButtonActionPerformed

    private void gClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gClearButtonActionPerformed
        gClearFields();
    }//GEN-LAST:event_gClearButtonActionPerformed

    private void gSubmitResultButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gSubmitResultButtonActionPerformed
        submitResult();
    }//GEN-LAST:event_gSubmitResultButtonActionPerformed

    private void viewResultsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewResultsButtonActionPerformed
        showAllResults();
    }//GEN-LAST:event_viewResultsButtonActionPerformed

    private void removeStudentResultsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeStudentResultsButtonActionPerformed
        removeResults();
    }//GEN-LAST:event_removeStudentResultsButtonActionPerformed

    private void uStudentIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uStudentIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uStudentIDFieldActionPerformed

    private void uSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uSubmitButtonActionPerformed
        setInitialPassword();
    }//GEN-LAST:event_uSubmitButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        refreshTableData();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void recorrectionTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recorrectionTableMouseClicked

    }//GEN-LAST:event_recorrectionTableMouseClicked

    private void clearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearAllActionPerformed
        clearAllRecorrections();
    }//GEN-LAST:event_clearAllActionPerformed

    private void postAnnouncementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postAnnouncementButtonActionPerformed
        // TODO add your handling code here:
        announcementDialog.setVisible(true);
        announcementDialog.setSize(295, 172);
    }//GEN-LAST:event_postAnnouncementButtonActionPerformed

    private void publishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_publishButtonActionPerformed
        String announcement = announcementArea.getText().trim();
        if (!announcement.isEmpty()) {
            postAnnouncement(announcement);
            announcementDialog.dispose();
        } else {
            JOptionPane.showMessageDialog(announcementDialog, "Announcement cannot be empty.", "Input Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_publishButtonActionPerformed

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        SwingUtilities.invokeLater(() -> {
            WelcomeFrame student = new WelcomeFrame();
            student.setVisible(true);
        });
    }//GEN-LAST:event_logOutActionPerformed

    private void messageFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageFieldActionPerformed

    }//GEN-LAST:event_messageFieldActionPerformed

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        sendMessage();
    }//GEN-LAST:event_sendButtonActionPerformed

    private void submitButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButton1ActionPerformed
        // TODO add your handling code here:
        chatPanel.setVisible(true);
        chatPanel.setSize(310, 370);
    }//GEN-LAST:event_submitButton1ActionPerformed
private String selectedStudentID;
    private void studentListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentListMouseClicked
        selectedStudentID = studentList.getSelectedValue();
        loadMessages();
    }//GEN-LAST:event_studentListMouseClicked

    private void msgRefreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msgRefreshButtonActionPerformed
        loadMessages();
    }//GEN-LAST:event_msgRefreshButtonActionPerformed

    private void currentPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_currentPasswordFieldActionPerformed

    }//GEN-LAST:event_currentPasswordFieldActionPerformed

    private void newPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPasswordFieldActionPerformed

    }//GEN-LAST:event_newPasswordFieldActionPerformed

    private void changePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordButtonActionPerformed
        handleChangePassword();
        securityPanel.dispose();
    }//GEN-LAST:event_changePasswordButtonActionPerformed

    private void securityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_securityButtonActionPerformed
        securityPanel.setVisible(true);
        securityPanel.setSize(252, 267);
    }//GEN-LAST:event_securityButtonActionPerformed

    private void resetAllChatsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetAllChatsButtonActionPerformed
        resetAllChats();
    }//GEN-LAST:event_resetAllChatsButtonActionPerformed
  private void resetAllChats() {
        try {
            MongoDBConnection.getDatabase().getCollection("messages").deleteMany(new Document());
            JOptionPane.showMessageDialog(this, "All chats have been reset.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "An error occurred while resetting chats.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void studentListActionPerformed(java.awt.event.ActionEvent evt) {
    selectedStudentID = studentList.getSelectedValue();
    loadMessages();
  }
  //------------------------------------------------------------
  private void handleChangePassword() {
        String currentPassword = currentPasswordField.getText().trim();
        String newPassword = newPasswordField.getText().trim();
        String confirmNewPassword = confirmPasswordField.getText().trim();

        if (currentPassword.isEmpty() || newPassword.isEmpty() || confirmNewPassword.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "All fields must be filled out.", "Input Error",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (!newPassword.equals(confirmNewPassword)) {
            JOptionPane.showMessageDialog(this,
                    "New passwords do not match.", "Input Error",
                    JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (updatePassword(currentPassword, newPassword)) {
            JOptionPane.showMessageDialog(this,
                    "Password updated successfully.", "Success",
                    JOptionPane.INFORMATION_MESSAGE);
            clearPasswordFields();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Current password is incorrect.", "Update Failed",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private boolean updatePassword(String currentPassword, String newPassword) {
        try {
            MongoDatabase database = MongoDBConnection.getDatabase();
            MongoCollection<Document> teachersCollection = database.getCollection("Teachers");
            Document query = new Document("username", loggedInTeacherUsername)
                    .append("password", currentPassword);
            Document teacher = teachersCollection.find(query).first();

            if (teacher != null) {
                Document update = new Document("$set", new Document("password", newPassword));
                teachersCollection.updateOne(query, update);
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "An error occurred while updating the password.", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private void clearPasswordFields() {
        currentPasswordField.setText("");
        newPasswordField.setText("");
        confirmPasswordField.setText("");
    }
  //------------------------------------------------------------
  private void loadStudentList() {
    List<String> studentIDs = MongoDBConnection.getAllStudentIDsWithMessages();
    studentList.setListData(studentIDs.toArray(new String[0]));
  }

  private void loadMessages() {
    if (selectedStudentID != null) {
      List<Document> messages =
          MongoDBConnection.getMessagesByStudentID(selectedStudentID);
      chatArea.setText("");
      for (Document message : messages) {
        String sender = message.getString("sender");
        String messageText = message.getString("message");
        chatArea.append(sender + ": " + messageText + "\n");
      }
    }
  }
  private void sendMessage() {
    String message = messageField.getText();
    if (!message.isEmpty() && selectedStudentID != null) {
      MongoDBConnection.insertMessage(selectedStudentID, "Teacher", message);
      chatArea.append("Teacher: " + message + "\n");
      messageField.setText("");
    }
  }
  private void postAnnouncement(String announcement) {
    MongoCollection<Document> announcementsCollection =
        MongoDBConnection.getDatabase().getCollection("announcements");
    Document announcementDoc =
        new Document("Announcement", announcement)
            .append("Timestamp", System.currentTimeMillis());
    announcementsCollection.insertOne(announcementDoc);
    JOptionPane.showMessageDialog(this, "Announcement posted successfully.");
  }
  private void clearAllRecorrections() {
    int confirmation = JOptionPane.showConfirmDialog(this,
        "Are you sure you want to clear all records in recorrections?",
        "Confirm", JOptionPane.YES_NO_OPTION);
    if (confirmation == JOptionPane.YES_OPTION) {
      try {
        MongoDatabase database = MongoDBConnection.getDatabase();
        MongoCollection<Document> recorrectionsCollection =
            database.getCollection("recorrections");
        recorrectionsCollection.deleteMany(new Document());
        refreshTableData();
        JOptionPane.showMessageDialog(
            this, "All recorrections cleared successfully.");
      } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this,
            "An error occurred while clearing recorrections.", "Error",
            JOptionPane.ERROR_MESSAGE);
      }
    }
  }
  private void setInitialPassword() {
    String studentID = uStudentIDField.getText().trim();
    String password = new String(uPasswordField.getPassword()).trim();
    if (studentID.isEmpty() || password.isEmpty()) {
      JOptionPane.showMessageDialog(this,
          "Student ID and Password are required.", "Input Error",
          JOptionPane.WARNING_MESSAGE);
      return;
    }
    try {
      MongoDatabase database = MongoDBConnection.getDatabase();
      MongoCollection<Document> studentsCollection =
          database.getCollection("students");
      Document query = new Document("StudentID", studentID);
      Document update =
          new Document("$set", new Document("Password", password));
      long result =
          studentsCollection.updateOne(query, update).getModifiedCount();
      if (result > 0) {
        JOptionPane.showMessageDialog(this, "Password updated successfully.");
      } else {
        JOptionPane.showMessageDialog(this, "No matching student found.",
            "Error", JOptionPane.ERROR_MESSAGE);
      }
      uClearFields();
    } catch (Exception e) {
      e.printStackTrace();
      JOptionPane.showMessageDialog(this,
          "An error occurred while updating the password.", "Error",
          JOptionPane.ERROR_MESSAGE);
    }
  }
  private void uClearFields() {
    uStudentIDField.setText("");
    uPasswordField.setText("");
  }
  private void removeResults() {
    String studentID = removeResultStudentIDField.getText().trim();
    String subjectName = removeResultSubjectField.getText().trim();
    if (studentID.isEmpty() || subjectName.isEmpty()) {
      JOptionPane.showMessageDialog(this,
          "Student ID and Subject Name are required.", "Input Error",
          JOptionPane.WARNING_MESSAGE);
      return;
    }
    try {
      MongoDatabase database = MongoDBConnection.getDatabase();
      MongoCollection<Document> resultsCollection = database.getCollection(
          "grades"); // Ensure this is the correct collection name
      System.out.println("Attempting to remove result with StudentID: "
          + studentID + " and SubjectName: " + subjectName);
      Document query = new Document("StudentID", studentID)
                           .append("SubjectName", subjectName);
      System.out.println("Query: " + query.toJson());
      long result = resultsCollection.deleteOne(query).getDeletedCount();
      System.out.println("Delete Result Count: " + result);
      if (result > 0) {
        JOptionPane.showMessageDialog(this, "Result removed successfully.");
      } else {
        JOptionPane.showMessageDialog(this, "No matching result found.",
            "Error", JOptionPane.ERROR_MESSAGE);
      }
      rClearFields();
    } catch (Exception e) {
      e.printStackTrace();
      JOptionPane.showMessageDialog(this,
          "An error occurred while removing the result.", "Error",
          JOptionPane.ERROR_MESSAGE);
    }
  }
  private void rClearFields() {
    removeResultStudentIDField.setText("");
    removeResultSubjectField.setText("");
  }
  private void showAllResults() {
    try {
      MongoDatabase database = MongoDBConnection.getDatabase();
      MongoCollection<Document> resultsCollection =
          database.getCollection("grades");
      MongoCursor<Document> cursor = resultsCollection.find().iterator();
      DefaultTableModel tableModel = new DefaultTableModel();
      tableModel.addColumn("Student ID");
      tableModel.addColumn("Subject Name");
      tableModel.addColumn("Grade");
      while (cursor.hasNext()) {
        Document doc = cursor.next();
        tableModel.addRow(new Object[] {doc.getString("StudentID"),
            doc.getString("SubjectName"), doc.getString("Grade")});
      }
      cursor.close();
      JTable resultTable = new JTable(tableModel);
      JScrollPane scrollPane = new JScrollPane(resultTable);
      resultTable.setFillsViewportHeight(true);
      JOptionPane.showMessageDialog(
          this, scrollPane, "All Results", JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception e) {
      e.printStackTrace();
      JOptionPane.showMessageDialog(this,
          "An error occurred while retrieving results.", "Error",
          JOptionPane.ERROR_MESSAGE);
    }
  }
  private void submitResult() {
    String studentID = gStudentIDField.getText().trim();
    String subjectName = gSubjectNameField.getText().trim();
    String grade = gGradeField.getText().trim();
    if (studentID.isEmpty() || subjectName.isEmpty() || grade.isEmpty()) {
      JOptionPane.showMessageDialog(this, "All fields are required.",
          "Input Error", JOptionPane.WARNING_MESSAGE);
      return;
    }
    try {
      MongoDatabase database = MongoDBConnection.getDatabase();
      MongoCollection<Document> studentsCollection =
          database.getCollection("students");
      Document query = new Document("StudentID", studentID);
      Document studentDoc = studentsCollection.find(query).first();
      if (studentDoc == null) {
        JOptionPane.showMessageDialog(this,
            "Invalid Student ID. Please enter a valid Student ID.",
            "Validation Error", JOptionPane.WARNING_MESSAGE);
        return;
      }
      MongoCollection<Document> gradesCollection =
          database.getCollection("grades");
      Document gradeDoc = new Document("StudentID", studentID)
                              .append("SubjectName", subjectName)
                              .append("Grade", grade);
      gradesCollection.insertOne(gradeDoc);
      JOptionPane.showMessageDialog(this, "Result submitted successfully.");
      gClearFields();
    } catch (Exception e) {
      e.printStackTrace();
      JOptionPane.showMessageDialog(this,
          "An error occurred while submitting the result.", "Error",
          JOptionPane.ERROR_MESSAGE);
    }
  }
  private void gClearFields() {
    gStudentIDField.setText("");
    gSubjectNameField.setText("");
    gGradeField.setText("");
  }
  private void removeStudent() {
    String studentID = removeStudentIDField.getText().trim();
    if (studentID.isEmpty()) {
      JOptionPane.showMessageDialog(this, "Student ID is required.",
          "Input Error", JOptionPane.WARNING_MESSAGE);
      return;
    }
    try {
      MongoDatabase database = MongoDBConnection.getDatabase();
      MongoCollection<Document> studentsCollection =
          database.getCollection("students");
      Document query = new Document("StudentID", studentID);
      long result = studentsCollection.deleteOne(query).getDeletedCount();
      if (result > 0) {
        JOptionPane.showMessageDialog(this, "Student removed successfully.");
      } else {
        JOptionPane.showMessageDialog(
            this, "Student not found.", "Error", JOptionPane.ERROR_MESSAGE);
      }
      stuClearFields();
    } catch (Exception e) {
      e.printStackTrace();
      JOptionPane.showMessageDialog(this,
          "An error occurred while removing the student.", "Error",
          JOptionPane.ERROR_MESSAGE);
    }
  }
  private void stuClearFields() {
    removeStudentIDField.setText("");
  }
  private void showAllStudents() {
    try {
      MongoDatabase database = MongoDBConnection.getDatabase();
      MongoCollection<Document> studentsCollection =
          database.getCollection("students");
      MongoCursor<Document> cursor = studentsCollection.find().iterator();
      DefaultTableModel tableModel = new DefaultTableModel();
      tableModel.addColumn("Student ID");
      tableModel.addColumn("Name");
      tableModel.addColumn("Email");
      tableModel.addColumn("Batch");
      while (cursor.hasNext()) {
        Document doc = cursor.next();
        tableModel.addRow(
            new Object[] {doc.getString("StudentID"), doc.getString("Name"),
                doc.getString("Email"), doc.getString("Batch")});
      }
      cursor.close();
      JTable studentTable = new JTable(tableModel);
      JScrollPane scrollPane = new JScrollPane(studentTable);
      studentTable.setFillsViewportHeight(true);
      JOptionPane.showMessageDialog(
          this, scrollPane, "All Students", JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception e) {
      e.printStackTrace();
      JOptionPane.showMessageDialog(this,
          "An error occurred while retrieving students.", "Error",
          JOptionPane.ERROR_MESSAGE);
    }
  }
  private void addStudent() {
    String studentID = studentIDField.getText().trim();
    String name = nameField.getText().trim();
    String email = emailField.getText().trim();
    String batch = batchField.getText().trim();
    if (studentID.isEmpty() || name.isEmpty() || email.isEmpty()
        || batch.isEmpty()) {
      JOptionPane.showMessageDialog(this, "All fields are required.",
          "Input Error", JOptionPane.WARNING_MESSAGE);
      return;
    }
    try {
      MongoDatabase database = MongoDBConnection.getDatabase();
      MongoCollection<Document> studentsCollection =
          database.getCollection("students");
      Document newStudent = new Document("StudentID", studentID)
                                .append("Name", name)
                                .append("Email", email)
                                .append("Batch", batch);
      studentsCollection.insertOne(newStudent);
      JOptionPane.showMessageDialog(this, "Student added successfully.");
      clearFields();
    } catch (Exception e) {
      e.printStackTrace();
      JOptionPane.showMessageDialog(this,
          "An error occurred while adding the student.", "Error",
          JOptionPane.ERROR_MESSAGE);
    }
  }
  private void clearFields() {
    studentIDField.setText("");
    nameField.setText("");
    emailField.setText("");
    batchField.setText("");
  }
  private void loadRecorrectionData() {
    try {
      MongoDatabase database = MongoDBConnection.getDatabase();
      MongoCollection<Document> recorrectionsCollection =
          database.getCollection("recorrections");
      DefaultTableModel newTableModel = new DefaultTableModel();
      newTableModel.addColumn("Student Identity");
      newTableModel.addColumn("Subject");
      newTableModel.addColumn("Grade");
      newTableModel.addColumn("Review");
      MongoCursor<Document> cursor = recorrectionsCollection.find().iterator();
      while (cursor.hasNext()) {
        Document doc = cursor.next();
        newTableModel.addRow(new Object[] {doc.getString("StudentID"),
            doc.getString("SubjectName"), doc.getString("Grade"),
            doc.getString("Review")});
      }
      cursor.close();
      recorrectionTable.setModel(newTableModel);
    } catch (Exception e) {
      e.printStackTrace();
      JOptionPane.showMessageDialog(this,
          "An error occurred while retrieving recorrections.", "Error",
          JOptionPane.ERROR_MESSAGE);
    }
  }
  private void refreshTableData() {
    loadRecorrectionData();
  }
  private void loadTeacherInfo() {
        try {
            MongoDatabase database = MongoDBConnection.getDatabase();
            if (database == null) {
                JOptionPane.showMessageDialog(this,
                        "Failed to connect to the database.", "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            MongoCollection<Document> teachersCollection =
                    database.getCollection("Teachers");
            Document query = new Document("username", loggedInTeacherUsername);
            Document teacher = teachersCollection.find(query).first();
            if (teacher != null) {
                String username = teacher.getString("username");
                // Assuming 'Name' field exists for displaying the teacher's name
//                String teacherName = teacher.getString("Name");
                teacherIDLabel.setText("Logged in as: " + username);
//                teacherNameLabel.setText("Name: " + teacherName);
            } else {
                teacherIDLabel.setText("Username: Not found");
//                teacherNameLabel.setText("Name: Not found");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this,
                    "An error occurred while retrieving teacher information.", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void setLoggedInTeacherUsername(String username) {
        loggedInTeacherUsername = username;
    }
  public static void main(String args[]) {
    try {
      UIManager.setLookAndFeel(new FlatLightLaf());
    } catch (Exception e) {
      e.printStackTrace();
    }
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new TeacherDashboardFrame().setVisible(true);
      }
    });
  }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel RecorrectionPanel;
    private javax.swing.JTextArea announcementArea;
    private javax.swing.JDialog announcementDialog;
    private javax.swing.JTextField batchField;
    private javax.swing.JButton changePasswordButton;
    private javax.swing.JTextArea chatArea;
    private javax.swing.JDialog chatPanel;
    private javax.swing.JButton clearAll;
    private javax.swing.JButton clearButton;
    private javax.swing.JPasswordField confirmPasswordField;
    private javax.swing.JPasswordField currentPasswordField;
    private javax.swing.JTextField emailField;
    private javax.swing.JButton gClearButton;
    private javax.swing.JTextField gGradeField;
    private javax.swing.JTextField gStudentIDField;
    private javax.swing.JTextField gSubjectNameField;
    private javax.swing.JButton gSubmitResultButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton logOut;
    private javax.swing.JTextField messageField;
    private javax.swing.JButton msgRefreshButton;
    private javax.swing.JTextField nameField;
    private javax.swing.JPasswordField newPasswordField;
    private javax.swing.JButton postAnnouncementButton;
    private javax.swing.JButton publishButton;
    private javax.swing.JTable recorrectionTable;
    private javax.swing.JButton refreshButton;
    private javax.swing.JTextField removeResultStudentIDField;
    private javax.swing.JTextField removeResultSubjectField;
    private javax.swing.JButton removeStudentButton;
    private javax.swing.JTextField removeStudentIDField;
    private javax.swing.JButton removeStudentResultsButton;
    private javax.swing.JButton resetAllChatsButton;
    private javax.swing.JButton securityButton;
    private javax.swing.JDialog securityPanel;
    private javax.swing.JButton sendButton;
    private javax.swing.JButton showStudents;
    private javax.swing.JTextField studentIDField;
    private javax.swing.JList<String> studentList;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton submitButton1;
    private javax.swing.JLabel teacherIDLabel;
    private javax.swing.JPasswordField uPasswordField;
    private javax.swing.JTextField uStudentIDField;
    private javax.swing.JButton uSubmitButton;
    private javax.swing.JButton viewResultsButton;
    // End of variables declaration//GEN-END:variables
}
