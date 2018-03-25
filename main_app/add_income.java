package main_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;


public class add_income extends javax.swing.JFrame {

    public add_income() {
        initComponents();
        
        try {
            dbConnection = Connection_Manager.getConnection();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        
        cat_textfield.setEnabled(false);
        sub_textfield.setEnabled(false);
        fill_combo_boxes();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        radio_cat_exists = new javax.swing.JRadioButton();
        radio_cat_create = new javax.swing.JRadioButton();
        cat_box = new javax.swing.JComboBox<>();
        cat_textfield = new javax.swing.JTextField();
        radio_sub_exists = new javax.swing.JRadioButton();
        radio_sub_create = new javax.swing.JRadioButton();
        sub_box = new javax.swing.JComboBox<>();
        sub_textfield = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        etos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sxolia = new javax.swing.JTextArea();
        mhnas = new javax.swing.JComboBox<>();
        income_label = new javax.swing.JLabel();
        income_bg_panel_separator = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        insert = new javax.swing.JButton();
        poso = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(680, 680));

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        buttonGroup1.add(radio_cat_exists);
        radio_cat_exists.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        radio_cat_exists.setForeground(new java.awt.Color(0, 51, 51));
        radio_cat_exists.setSelected(true);
        radio_cat_exists.setText("Εισαγωγή σε ήδη υπάρχουσα ΚΑΤΗΓΟΡΙΑ :");
        radio_cat_exists.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radio_cat_existsItemStateChanged(evt);
            }
        });

        buttonGroup1.add(radio_cat_create);
        radio_cat_create.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        radio_cat_create.setText("Δημιουργία νέας ΚΑΤΗΓΟΡΙΑΣ :");
        radio_cat_create.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radio_cat_createItemStateChanged(evt);
            }
        });

        cat_box.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cat_box.setMaximumRowCount(100);
        cat_box.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        cat_box.setToolTipText("");
        cat_box.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cat_boxItemStateChanged(evt);
            }
        });

        cat_textfield.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        buttonGroup2.add(radio_sub_exists);
        radio_sub_exists.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        radio_sub_exists.setSelected(true);
        radio_sub_exists.setText("Εισαγωγή σε ήδη υπάρχουσα ΥΠΟΚΑΤΗΓΟΡΙΑ :");

        buttonGroup2.add(radio_sub_create);
        radio_sub_create.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        radio_sub_create.setText("Δημιουργία νέας ΥΠΟΚΑΤΗΓΟΡΙΑΣ :");
        radio_sub_create.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radio_sub_createItemStateChanged(evt);
            }
        });

        sub_box.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        sub_textfield.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Ποσό :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Μήνας :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Έτος :");

        etos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etos.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Σχόλια :");

        sxolia.setColumns(20);
        sxolia.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sxolia.setRows(5);
        jScrollPane1.setViewportView(sxolia);

        mhnas.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mhnas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ΙΑΝΟΥΑΡΙΟΣ", "ΦΕΒΡΟΥΑΡΙΟΣ", "ΜΑΡΤΙΟΣ", "ΑΠΡΙΛΙΟΣ", "ΜΑΪΟΣ", "ΙΟΥΝΙΟΣ", "ΙΟΥΛΙΟΣ", "ΑΥΓΟΥΣΤΟΣ", "ΣΕΠΤΕΜΒΡΙΟΣ", "ΟΚΤΩΒΡΙΟΣ", "ΝΟΕΜΒΡΙΟΣ", "ΔΕΚΕΜΒΡΙΟΣ" }));

        income_label.setFont(new java.awt.Font("Tahoma", 0, 60)); // NOI18N
        income_label.setForeground(new java.awt.Color(0, 102, 0));
        income_label.setText("ΕΙΣΑΓΩΓΗ ΕΣΟΔΩΝ");

        income_bg_panel_separator.setForeground(new java.awt.Color(0, 102, 51));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("€");

        insert.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        insert.setForeground(new java.awt.Color(0, 102, 0));
        insert.setText("ΕΙΣΑΓΩΓΗ");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        poso.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        poso.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(income_bg_panel_separator)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(radio_cat_exists)
                                .addGap(18, 18, 18)
                                .addComponent(cat_box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(radio_cat_create)
                                .addGap(110, 110, 110)
                                .addComponent(cat_textfield))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(radio_sub_exists)
                                .addGap(18, 18, 18)
                                .addComponent(sub_box, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(radio_sub_create)
                                .addGap(108, 108, 108)
                                .addComponent(sub_textfield)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(22, 22, 22)
                        .addComponent(etos, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(poso, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(133, 133, 133)
                                .addComponent(jLabel2)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(insert)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(mhnas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(income_label)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(income_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(insert)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(income_bg_panel_separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radio_cat_exists)
                            .addComponent(cat_box, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radio_cat_create)
                            .addComponent(cat_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(radio_sub_exists))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sub_box, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(radio_sub_create))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(sub_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(poso, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(mhnas, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etos, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void radio_cat_existsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radio_cat_existsItemStateChanged
        if(radio_cat_exists.isSelected()){
            cat_textfield.setEnabled(false);
        }else{
            cat_textfield.setEnabled(true);
            cat_box.setEnabled(false);
        }
    }//GEN-LAST:event_radio_cat_existsItemStateChanged

    private void radio_cat_createItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radio_cat_createItemStateChanged
        if(radio_cat_create.isSelected()){
            radio_sub_exists.setEnabled(false);
            cat_box.setEnabled(false);
            sub_box.setEnabled(false);
            radio_sub_create.setSelected(true);
        }else{
            cat_box.setEnabled(true);
            radio_sub_exists.setEnabled(true);
            sub_box.setEnabled(true);
        }
    }//GEN-LAST:event_radio_cat_createItemStateChanged

    private void radio_sub_createItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radio_sub_createItemStateChanged
        if(radio_sub_create.isSelected()){
            sub_box.setEnabled(false);
            sub_textfield.setEnabled(true);
        }else{
            sub_box.setEnabled(true);
            sub_textfield.setEnabled(false);
        }
    }//GEN-LAST:event_radio_sub_createItemStateChanged

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed
        if(!poso.getText().equals("") && !etos.getText().equals("") && !(String.valueOf(mhnas.getSelectedItem()).equals(""))){
            
        }
        String category = "";
        String subcategory ="";
        double amount = Double.valueOf(poso.getText());
        String year = etos.getText();
        String month = String.valueOf(mhnas.getSelectedItem());
        String comment = sxolia.getText();
        
        if(radio_cat_create.isSelected()){
            category = cat_textfield.getText();
            subcategory = sub_textfield.getText();
        }else{
            category = String.valueOf(cat_box.getSelectedItem());
            if(radio_sub_create.isSelected()){
                subcategory = sub_textfield.getText();
            }else{
                subcategory = String.valueOf(sub_box.getSelectedItem());
            }  
        }
        
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        
        try {
            st=dbConnection.prepareStatement("insert into Income(poso,etos,mhnas,kathgoria,upokathgoria,wra_ypovolhs,sxolia) values(?,?,?,?,?,?,?)");
            st.setDouble(1,amount);
            st.setString(2,year);
            st.setString(3,month);
            st.setString(4,category);
            st.setString(5,subcategory);
            st.setTimestamp(6, timestamp);
            st.setString(7,comment);
            st.executeUpdate();     
        } catch (SQLException ex) {
                System.out.println(ex.getMessage());
        }
        
        etos.setText("");
        mhnas.setSelectedIndex(0);
        sxolia.setText("");
        poso.setText("");
        if(cat_box.isEnabled())cat_box.setSelectedIndex(0);
        if(sub_box.isEnabled())sub_box.setSelectedIndex(0);
        if(cat_textfield.isEnabled())cat_textfield.setText("");
        if(sub_textfield.isEnabled())sub_textfield.setText("");
    }//GEN-LAST:event_insertActionPerformed

    private void cat_boxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cat_boxItemStateChanged
        
        sub_box.removeAllItems();
        String option=String.valueOf(cat_box.getSelectedItem());
        try {
            st=dbConnection.prepareStatement("select DISTINCT upokathgoria from Income where kathgoria=?");
            st.setString(1, option);
            rs=st.executeQuery();
            while(rs.next()){
                sub_box.addItem(rs.getString("upokathgoria"));
            }
                
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_cat_boxItemStateChanged

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
            java.util.logging.Logger.getLogger(add_income.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(add_income.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(add_income.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(add_income.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add_income().setVisible(true);
            }
        });
    }
    
    public void fill_combo_boxes(){
        
        String category_statement="select DISTINCT kathgoria from Income ";
        try {
            statement = dbConnection.createStatement();
            rs = statement.executeQuery(category_statement);
            
            rs = statement.executeQuery(category_statement);
            while(rs.next()){
                String str = rs.getString("kathgoria");
                System.out.println(str);
                cat_box.addItem(str);
            }
            cat_box.removeItemAt(0);
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
   // public void remove_combo_items(){
     //   income_category_box.removeAllItems();   
     //   income_month_box.removeAllItems();
      //  income_year_box.removeAllItems();
      //  income_subcategory_box.removeAllItems();
  //  }
    
    static Connection dbConnection = null;
    Statement statement = null;
    ResultSet rs = null;
    PreparedStatement st=null;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cat_box;
    private javax.swing.JTextField cat_textfield;
    private javax.swing.JTextField etos;
    private javax.swing.JSeparator income_bg_panel_separator;
    private javax.swing.JLabel income_label;
    private javax.swing.JButton insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> mhnas;
    private javax.swing.JTextField poso;
    private javax.swing.JRadioButton radio_cat_create;
    private javax.swing.JRadioButton radio_cat_exists;
    private javax.swing.JRadioButton radio_sub_create;
    private javax.swing.JRadioButton radio_sub_exists;
    private javax.swing.JComboBox<String> sub_box;
    private javax.swing.JTextField sub_textfield;
    private javax.swing.JTextArea sxolia;
    // End of variables declaration//GEN-END:variables
}
