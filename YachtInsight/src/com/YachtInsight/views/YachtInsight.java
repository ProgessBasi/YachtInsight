/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.YachtInsight.views;

import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import com.YachtInsight.models.Yacht;
import java.awt.*;
import javax.swing.border.EmptyBorder;
import com.YachtInsight.Controllers.MergeSort;
import com.YachtInsight.controllers.BinarySearch;

/**
 *
 * @author proge
 */
public class YachtInsight extends javax.swing.JFrame {
    
    
    private final ArrayList<Yacht> yachtList = new ArrayList<>();
    /**
     * Creates new form YachtInsight
     */
    public YachtInsight() {
        initComponents();
        loadDataFromTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        pnlSide = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        pnlTitle = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnlMid = new javax.swing.JPanel();
        cmbSort = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblYachtData = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        cmbCategory = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtAreaSearch = new javax.swing.JTextField();
        btnAsceneding = new javax.swing.JButton();
        btnDescending = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlMain.setBackground(new java.awt.Color(11, 113, 174));

        pnlSide.setBackground(new java.awt.Color(11, 113, 174));

        btnUpdate.setText(" Update ");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnAdd.setText("  Add    ");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSideLayout = new javax.swing.GroupLayout(pnlSide);
        pnlSide.setLayout(pnlSideLayout);
        pnlSideLayout.setHorizontalGroup(
            pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSideLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSideLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnUpdate))
                    .addGroup(pnlSideLayout.createSequentialGroup()
                        .addGroup(pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdd))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlSideLayout.setVerticalGroup(
            pnlSideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSideLayout.createSequentialGroup()
                .addContainerGap(269, Short.MAX_VALUE)
                .addComponent(btnAdd)
                .addGap(28, 28, 28)
                .addComponent(btnUpdate)
                .addGap(28, 28, 28)
                .addComponent(btnDelete)
                .addGap(61, 61, 61))
        );

        pnlTitle.setBackground(new java.awt.Color(11, 113, 174));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("YachtInsight");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/YachtInsight/resources/Logo.png"))); // NOI18N

        javax.swing.GroupLayout pnlTitleLayout = new javax.swing.GroupLayout(pnlTitle);
        pnlTitle.setLayout(pnlTitleLayout);
        pnlTitleLayout.setHorizontalGroup(
            pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTitleLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlTitleLayout.setVerticalGroup(
            pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTitleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(37, 37, 37))
            .addGroup(pnlTitleLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnlMid.setBackground(new java.awt.Color(255, 255, 255));

        cmbSort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "S.N.", "Name", "ShipYard", "Built", "Cabins", "Speed ", "Size", "Length", "Price" }));

        jLabel3.setText("Sort By");

        tblYachtData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "Moonlight II", "Neorion", "2005", "18", "Fast Yacht", "Giga Yacht", "91", "68000"},
                {"2", "Yersin", "Piriou", "2015", "8", "Fast Yacht", "Super Yacht", "78", "59000"},
                {"3", "Silver Edge", "Silver Yachts", "2026", "8", "Fast Yacht", "Super Yacht", "80", "75000"},
                {"4", "Planet Nine ", "Admiral", "2018", "8", "Fast Yacht", "Super Yacht", "73", "85000"},
                {"5", "Alfa", "Benetti", "2020", "7", "Fast Yacht", "Super Yacht", "70", "67000"},
                {"6", "Atlantic", "Van Graaf", "2010", "6", "Sail Assisted", "Mega Yacht", "65", "43000"},
                {"7", "Pacific Provider", "Blount Marine", "1978", "6", "Fast Yacht", "Mega Yacht", "48", "25000"},
                {"8", "Gweilo", "Mengi Yay", "2009", "3", "Sail Assisted", "Mega Yacht", "47", "54500"},
                {"9", "Aresteas", "Yildizlar Mesrubat", "2017", "6", "Sail Assisted", "Mega Yacht", "51", "12500"},
                {"10", "Belle Anna", "Isa", "2012", "6", "Fast Yacht", "Mega Yacht", "50", "19900"}
            },
            new String [] {
                "S.N.", "Name", "Shipyard", "Built", "Cabins", "Speed", "Size", "Length(m)", "Price($)(k)"
            }
        ));
        jScrollPane2.setViewportView(tblYachtData);
        if (tblYachtData.getColumnModel().getColumnCount() > 0) {
            tblYachtData.getColumnModel().getColumn(1).setMinWidth(100);
            tblYachtData.getColumnModel().getColumn(2).setMinWidth(100);
            tblYachtData.getColumnModel().getColumn(5).setMinWidth(100);
            tblYachtData.getColumnModel().getColumn(6).setMinWidth(100);
            tblYachtData.getColumnModel().getColumn(7).setMinWidth(80);
            tblYachtData.getColumnModel().getColumn(8).setMinWidth(80);
        }

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "Built", "Cabins", "Speed", "Size", "Price($)(k)" }));

        jLabel8.setText("Category");

        btnAsceneding.setText("Ascending");
        btnAsceneding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAscenedingActionPerformed(evt);
            }
        });

        btnDescending.setText("Descending");
        btnDescending.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescendingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMidLayout = new javax.swing.GroupLayout(pnlMid);
        pnlMid.setLayout(pnlMidLayout);
        pnlMidLayout.setHorizontalGroup(
            pnlMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMidLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(pnlMidLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(cmbSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAsceneding)
                .addGap(18, 18, 18)
                .addComponent(btnDescending)
                .addGap(148, 148, 148)
                .addGroup(pnlMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMidLayout.createSequentialGroup()
                        .addComponent(cmbCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(27, 27, 27)
                        .addComponent(txtAreaSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch)
                        .addGap(33, 33, 33))
                    .addGroup(pnlMidLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMidLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );
        pnlMidLayout.setVerticalGroup(
            pnlMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMidLayout.createSequentialGroup()
                .addGroup(pnlMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMidLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlMidLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlMidLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbSort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch)
                            .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAreaSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAsceneding)
                            .addComponent(btnDescending))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addComponent(pnlMid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(pnlTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlSide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addComponent(pnlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pnlMid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // Create a panel for the title
    JPanel titlePanel = new JPanel();
    JLabel titleLabel = new JLabel("Update Data");
    titleLabel.setFont(new Font("Arial", Font.BOLD, 18));  // Set font size and style
    titlePanel.add(titleLabel);

    // Create a panel for input fields
    JPanel inputPanel = new JPanel(new GridLayout(0, 2));
    inputPanel.setBackground(new Color(11, 113, 174));  // Set the background color
    inputPanel.setBorder(new EmptyBorder(10, 10, 10, 10));  // Add padding to create space

    // Add labels and text fields to the input panel
    inputPanel.add(new JLabel("S.N.:"));
    JTextField snField = new JTextField();
    inputPanel.add(snField);
    inputPanel.add(new JLabel("Name:"));
    JTextField nameField = new JTextField();
    inputPanel.add(nameField);
    inputPanel.add(new JLabel("Field to Update:"));
    JTextField fieldToUpdateField = new JTextField();
    inputPanel.add(fieldToUpdateField);
    inputPanel.add(new JLabel("New Value:"));
    JTextField newValueField = new JTextField();
    inputPanel.add(newValueField);

    // Create a parent panel to hold both the title and input panels
    JPanel parentPanel = new JPanel(new BorderLayout());
    parentPanel.add(titlePanel, BorderLayout.NORTH);
    parentPanel.add(inputPanel, BorderLayout.CENTER);

    // Display the custom input dialog with the updated layout
    int option = JOptionPane.showConfirmDialog(
            this,
            parentPanel,
            "Update Data",
            JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.PLAIN_MESSAGE
    );

    if (option == JOptionPane.OK_OPTION) {
        // Validate input for non-numeric fields (S.N., Name, Field to Update)
        String sn = snField.getText();
        String name = nameField.getText();
        String fieldToUpdate = fieldToUpdateField.getText();
        String newValue = newValueField.getText();

        if (sn.isEmpty()) {
            JOptionPane.showMessageDialog(this, "SN cannot be empty.");
            return;
        }
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Name cannot be empty.");
            return;
        }
        if (fieldToUpdate.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Field To Update cannot be empty.");
            return;
        }
        if (newValue.isEmpty()) {
            JOptionPane.showMessageDialog(this, "New Value cannot be empty.");
            return;
        }

        // Find the row index based on S.N. and Name
        int rowIndexToUpdate = findYachtRowIndex(sn, name);

        if (rowIndexToUpdate != -1) {
            // Update the corresponding cell in the table
            DefaultTableModel model = (DefaultTableModel) tblYachtData.getModel();
            int columnIndex = getColumnIndexByName(fieldToUpdate);
            
            if (columnIndex != -1) {
                model.setValueAt(newValue, rowIndexToUpdate, columnIndex);
                loadDataFromTable();  // Update the yachtList data
                JOptionPane.showMessageDialog(this, "Yacht updated successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid field to update.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Yacht not found. Update failed.");
        }
    }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private int getColumnIndexByName(String columnName) {
    DefaultTableModel model = (DefaultTableModel) tblYachtData.getModel();
    for (int i = 0; i < model.getColumnCount(); i++) {
        if (model.getColumnName(i).equals(columnName)) {
            return i;
        }
    }
    return -1; // Column not found
}
    
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
    // Create a panel for the title
    JPanel titlePanel = new JPanel();
    JLabel titleLabel = new JLabel("Delete Yacht");
    titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
    titlePanel.add(titleLabel);

    // Create a panel for input fields
    JPanel inputPanel = new JPanel(new GridLayout(0, 2));
    inputPanel.setBackground(new Color(11, 113, 174));  // Set background color (same as add dialog)
    inputPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

    // Add labels and text fields to the input panel
    inputPanel.add(new JLabel("S.N.:"));
    JTextField snField = new JTextField();
    inputPanel.add(snField);
    inputPanel.add(new JLabel("Name:"));
    JTextField nameField = new JTextField();
    inputPanel.add(nameField);

    // Create a parent panel to hold both the title and input panels
    JPanel parentPanel = new JPanel(new BorderLayout());
    parentPanel.add(titlePanel, BorderLayout.NORTH);
    parentPanel.add(inputPanel, BorderLayout.CENTER);

    // Display the custom input dialog with the updated layout
    int option = JOptionPane.showConfirmDialog(
            this,
            parentPanel,
            "Delete Yacht",  // Updated title
            JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.PLAIN_MESSAGE
    );

    if (option == JOptionPane.OK_OPTION) {
        String snToDelete = snField.getText();
        String nameToDelete = nameField.getText();

        // Find the row index based on S.N. and Name
        int rowIndexToDelete = findYachtRowIndex(snToDelete, nameToDelete);
        
        if (snToDelete.isEmpty()) {
            JOptionPane.showMessageDialog(this, "SN cannot be empty.");
            return;
        }
        if (nameToDelete.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Name cannot be empty.");
            return;
        }

        if (rowIndexToDelete != -1) {
            // Confirm with the user before deleting
            int confirmation = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this yacht?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);

            if (confirmation == JOptionPane.YES_OPTION) {
                // Delete the row from the table
                DefaultTableModel model = (DefaultTableModel) tblYachtData.getModel();
                model.removeRow(rowIndexToDelete);

                // Update the yachtList data
                loadDataFromTable();

                JOptionPane.showMessageDialog(this, "Yacht deleted successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Deletion canceled.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Yacht not found. Deletion failed.");
        }
    }
    }//GEN-LAST:event_btnDeleteActionPerformed
private int findYachtRowIndex(String sn, String name) {
        for (int i = 0; i < yachtList.size(); i++) {
            Yacht yachtData = yachtList.get(i);
            if (yachtData.getSn().equals(sn) && yachtData.getName().equals(name)) {
                return i;
            }
        }
        return -1; // Yacht not found
       
}
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // Create a panel for the title
        JPanel titlePanel = new JPanel();
        JLabel titleLabel = new JLabel("Insert Data");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));  // Set font size and style
        titlePanel.add(titleLabel);

        // Create a panel for input fields
        JPanel inputPanel = new JPanel(new GridLayout(0, 2));
        inputPanel.setBackground(new Color(11, 113, 174));  // Set the background color
        inputPanel.setBorder(new EmptyBorder(10, 10, 10, 10));  // Add padding to create space

        // Add labels and text fields to the input panel
        inputPanel.add(new JLabel("S.N.:"));
        JTextField snField = new JTextField();
        inputPanel.add(snField);
        inputPanel.add(new JLabel("Name:"));
        JTextField nameField = new JTextField();
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Shipyard:"));
        JTextField shipyardField = new JTextField();
        inputPanel.add(shipyardField);
        inputPanel.add(new JLabel("Built:"));
        JTextField builtField = new JTextField();
        inputPanel.add(builtField);
        inputPanel.add(new JLabel("Cabins:"));
        JTextField cabinsField = new JTextField();
        inputPanel.add(cabinsField);
        inputPanel.add(new JLabel("Speed:"));
        JTextField speedField = new JTextField();
        inputPanel.add(speedField);
        inputPanel.add(new JLabel("Size:"));
        JTextField sizeField = new JTextField();
        inputPanel.add(sizeField);
        inputPanel.add(new JLabel("Length:"));
        JTextField lengthField = new JTextField();
        inputPanel.add(lengthField);
        inputPanel.add(new JLabel("Price:"));
        JTextField priceField = new JTextField();
        inputPanel.add(priceField);

        // Create a parent panel to hold both the title and input panels
        JPanel parentPanel = new JPanel(new BorderLayout());
        parentPanel.add(titlePanel, BorderLayout.NORTH);
        parentPanel.add(inputPanel, BorderLayout.CENTER);

        // Display the custom input dialog with the updated layout
        int option = JOptionPane.showConfirmDialog(
                this,
                parentPanel,
                "Insert Data",  // Updated title
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.PLAIN_MESSAGE
        );

        if (option == JOptionPane.OK_OPTION) {
        // Validate input for numeric fields

            // Validate input for non-numeric fields (S.N. and Name)
            String sn = snField.getText();
            String name = nameField.getText();
            

        if (sn.isEmpty()) {
            JOptionPane.showMessageDialog(this, "S.N. cannot be empty.");
            return;
        }
        if (isSnOrNameAlreadyExist(sn, null)) {
            JOptionPane.showMessageDialog(this, "S.N. must be unique.");
            return;
        }
        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Name cannot be empty.");
            return;
        }
        if (isSnOrNameAlreadyExist(null, name)) {
            JOptionPane.showMessageDialog(this, "Yacht already exists.");
            return;
        }
        if (shipyardField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Shipyard cannot be empty.");
            return;
        }
        if (builtField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Built cannot be empty.");
            return;
        }
        if (cabinsField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Cabin cannot be empty.");
            return;
        }
        if (speedField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Speed cannot be empty.");
            return;
        }
        if (sizeField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Size cannot be empty.");
            return;
        }
        if (lengthField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Length cannot be empty.");
            return;
        }
        if (priceField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Price cannot be empty.");
            return;
        }
        if (!isInteger(snField.getText()) || !isInteger(builtField.getText()) || !isInteger(cabinsField.getText())
                || !isInteger(lengthField.getText()) || !isInteger(priceField.getText())) {
            JOptionPane.showMessageDialog(this, "Please enter valid whole numbers in numeric fields.");
            return;
        }
        
            // Create a new Yacht object with the input data
            Yacht newYacht = new Yacht(
                    sn,
                    name,
                    shipyardField.getText(),
                    builtField.getText(),
                    cabinsField.getText(),
                    speedField.getText(),
                    sizeField.getText(),
                    lengthField.getText(),
                    priceField.getText()
            );

            // Add the new Yacht object to the list and table
            yachtList.add(newYacht);	
            addYachtToTable(newYacht);

            JOptionPane.showMessageDialog(this, "Yacht added successfully!");
        }
    }//GEN-LAST:event_btnAddActionPerformed
  private boolean isInteger(String str) {
    if (str == null || str.trim().isEmpty()) {
        return false;
    }

    try {
        Integer.valueOf(str);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
}
    
    private boolean isSnOrNameAlreadyExist(String sn, String name) {
    for (Yacht yacht : yachtList) {
        if (yacht.getSn().equals(sn) || yacht.getName().equals(name)) {
            return true; // Found a yacht with the same sn or name
        }
    }
        return false; // No yacht with the same sn or name found
    }
    
    private void addYachtToTable(Yacht yacht) {
    DefaultTableModel model = (DefaultTableModel) tblYachtData.getModel();
    model.addRow(new Object[]{
        yacht.getSn(),
        yacht.getName(),
        yacht.getShipyard(),
        yacht.getBuilt(),
        yacht.getCabins(),
        yacht.getSpeed(),
        yacht.getSize(),
        yacht.getLength(),
        yacht.getPrice()
    });
}
    
    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
    String searchCategory = cmbCategory.getSelectedItem().toString();
    String searchValue = txtAreaSearch.getText().trim().toLowerCase().replaceAll("\\s+", ""); // Remove spaces

    if (searchValue.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter a search value.");
        return;
    }

    int columnIndex = getColumnIndexByName(searchCategory);

    if (columnIndex != -1) {
        DefaultTableModel model = (DefaultTableModel) tblYachtData.getModel();
        loadDataFromTable(); // Load data from the table

        // Create an object of BinarySearch
        BinarySearch binarySearch = new BinarySearch();

        // Call binarySearchAll method
        ArrayList<Integer> resultIndexes = binarySearch.binarySearchAll(model, searchValue, columnIndex);

        if (!resultIndexes.isEmpty()) {
            // Display the found rows in a formatted way
            StringBuilder message = new StringBuilder("Yacht found in the following rows:\n\n");

            for (int index : resultIndexes) {
                String[] row = new String[model.getColumnCount()];
                for (int j = 0; j < model.getColumnCount(); j++) {
                    row[j] = model.getColumnName(j) + ": " + model.getValueAt(index, j).toString();
                }
                message.append(" - ").append(String.join(", ", row)).append("\n");
            }

            JOptionPane.showMessageDialog(this, message.toString());
            
        } else {
            JOptionPane.showMessageDialog(this, "Yacht not found.");
        }
    } else {
        JOptionPane.showMessageDialog(this, "Invalid search category.");
    }
    cmbCategory.setSelectedItem("Name");
    txtAreaSearch.setText("");
    }//GEN-LAST:event_btnSearchActionPerformed
   
private void loadDataFromTable() {
    DefaultTableModel tableModel = (DefaultTableModel) tblYachtData.getModel();
    int rowCount = tableModel.getRowCount();

    yachtList.clear(); // Clear existing data

    for (int i = 0; i < rowCount; i++) {
        String sn = tableModel.getValueAt(i, 0).toString();
        String name = tableModel.getValueAt(i, 1).toString();
        String shipyard = tableModel.getValueAt(i, 2).toString();
        String built = tableModel.getValueAt(i, 3).toString();
        String cabins = tableModel.getValueAt(i, 4).toString();
        String speed = tableModel.getValueAt(i, 5).toString();
        String size = tableModel.getValueAt(i, 6).toString();
        String length = tableModel.getValueAt(i, 7).toString();
        String price = tableModel.getValueAt(i, 8).toString();

        yachtList.add(new Yacht(sn, name, shipyard, built, cabins, speed, size, length, price));
    }
}
    
    private void btnAscenedingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAscenedingActionPerformed
      sortYachtData(true);  
    }//GEN-LAST:event_btnAscenedingActionPerformed
    
    private void btnDescendingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescendingActionPerformed
      sortYachtData(false); 
    }//GEN-LAST:event_btnDescendingActionPerformed

    private void sortYachtData(boolean ascending) {
        DefaultTableModel model = (DefaultTableModel) tblYachtData.getModel();
        int columnToSort = cmbSort.getSelectedIndex();

        if (columnToSort >= 0) {
            int rowCount = model.getRowCount();
            ArrayList<ArrayList<Object>> rowData = new ArrayList<>(rowCount);

            // Extract all data from the table
            for (int i = 0; i < rowCount; i++) {
                ArrayList<Object> row = new ArrayList<>(model.getColumnCount());
                for (int j = 0; j < model.getColumnCount(); j++) {
                    Object value = model.getValueAt(i, j);

                    // Convert string values to int if the data is numeric
                    if (value instanceof String && isNumeric((String) value)) {
                        row.add(Integer.valueOf((String) value));
                    } else {
                        row.add(value);
                    }
                }
                rowData.add(row);
            }

            // Use MergeSort to sort the rows based on the selected column
            MergeSort.mergeSort(rowData, columnToSort, 0, rowCount - 1, ascending);

            // Update the table with the sorted data
            for (int i = 0; i < rowCount; i++) {
                for (int j = 0; j < model.getColumnCount(); j++) {
                    model.setValueAt(rowData.get(i).get(j), i, j);
                }
            }
        }
    }


private boolean isNumeric(String str) {
    try {
        Integer.valueOf(str);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
}

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
            java.util.logging.Logger.getLogger(YachtInsight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YachtInsight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YachtInsight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YachtInsight.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YachtInsight().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAsceneding;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDescending;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JComboBox<String> cmbSort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlMid;
    private javax.swing.JPanel pnlSide;
    private javax.swing.JPanel pnlTitle;
    private javax.swing.JTable tblYachtData;
    private javax.swing.JTextField txtAreaSearch;
    // End of variables declaration//GEN-END:variables
}
