package main_app;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import static main_app.income_menu.dbConnection;

public class expense_menu extends javax.swing.JFrame {
    
    
    public expense_menu() {
        initComponents();
        
        try {
            dbConnection = Connection_Manager.getConnection();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        income_model = (DefaultTableModel) income_table.getModel();
        income_table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                
                if (e.getButton() == java.awt.event.MouseEvent.BUTTON3) {
                    System.out.println("Right Click");
                    int r = income_table.rowAtPoint(e.getPoint());
                    if (r >= 0 && r < income_table.getRowCount()) {
                        income_table.setRowSelectionInterval(r, r);
                    } else {
                        income_table.clearSelection();
                    }
                    
                    doPop(e);                        
                }     
            }
            
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background_panel = new javax.swing.JPanel();
        income_bg_panel = new javax.swing.JPanel();
        income_label = new javax.swing.JLabel();
        income_bg_panel_separator = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        income_subcategory_box = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        income_category_box = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        income_month_box = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        income_year_box = new javax.swing.JComboBox<>();
        jButton9 = new javax.swing.JButton();
        income_search = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        income_table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(864, 768));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });

        background_panel.setBackground(new java.awt.Color(255, 255, 255));

        income_bg_panel.setBackground(new java.awt.Color(255, 204, 204));
        income_bg_panel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        income_bg_panel.setMinimumSize(new java.awt.Dimension(668, 720));
        income_bg_panel.setPreferredSize(new java.awt.Dimension(668, 720));

        income_label.setFont(new java.awt.Font("Tahoma", 0, 72)); // NOI18N
        income_label.setForeground(new java.awt.Color(102, 0, 0));
        income_label.setText("ΕΞΟΔΑ");

        income_bg_panel_separator.setForeground(new java.awt.Color(0, 102, 51));

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(102, 0, 0));
        jLabel12.setText("Κατηγορία :");

        income_subcategory_box.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        income_subcategory_box.setForeground(new java.awt.Color(0, 102, 0));
        income_subcategory_box.setEnabled(false);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 0));
        jLabel13.setText("Υποκατηγορία :");

        income_category_box.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        income_category_box.setForeground(new java.awt.Color(0, 102, 0));
        income_category_box.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                income_category_boxItemStateChanged(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 0));
        jLabel14.setText("Έτος :");

        income_month_box.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        income_month_box.setForeground(new java.awt.Color(0, 102, 0));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 0));
        jLabel15.setText("Μήνας :");

        income_year_box.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        income_year_box.setForeground(new java.awt.Color(0, 102, 0));

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(102, 0, 0));
        jButton9.setText("Προσθήκη");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        income_search.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        income_search.setForeground(new java.awt.Color(102, 0, 0));
        income_search.setText("Αναζήτηση");
        income_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                income_searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(income_subcategory_box, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(income_category_box, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(74, 74, 74)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(income_year_box, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(income_month_box, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(income_search, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(income_year_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(income_search)
                        .addComponent(jLabel14)
                        .addComponent(income_category_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(income_subcategory_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(income_month_box, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton9)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        income_table.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        income_table.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        income_table.setForeground(new java.awt.Color(0, 102, 51));
        income_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Κατηγορία", "Υποκατηγορία", "Έτος", "Μήνας", "Ποσό", "Σχόλια", "Timestamp"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        income_table.setGridColor(new java.awt.Color(0, 51, 51));
        income_table.setSelectionBackground(new java.awt.Color(0, 51, 51));
        jScrollPane2.setViewportView(income_table);
        if (income_table.getColumnModel().getColumnCount() > 0) {
            income_table.getColumnModel().getColumn(0).setResizable(false);
            income_table.getColumnModel().getColumn(1).setResizable(false);
            income_table.getColumnModel().getColumn(2).setResizable(false);
            income_table.getColumnModel().getColumn(3).setResizable(false);
            income_table.getColumnModel().getColumn(4).setResizable(false);
            income_table.getColumnModel().getColumn(5).setResizable(false);
            income_table.getColumnModel().getColumn(6).setResizable(false);
        }

        javax.swing.GroupLayout income_bg_panelLayout = new javax.swing.GroupLayout(income_bg_panel);
        income_bg_panel.setLayout(income_bg_panelLayout);
        income_bg_panelLayout.setHorizontalGroup(
            income_bg_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(income_bg_panel_separator, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, income_bg_panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(income_label)
                .addGap(408, 408, 408))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, income_bg_panelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, income_bg_panelLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        income_bg_panelLayout.setVerticalGroup(
            income_bg_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(income_bg_panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(income_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(income_bg_panel_separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout background_panelLayout = new javax.swing.GroupLayout(background_panel);
        background_panel.setLayout(background_panelLayout);
        background_panelLayout.setHorizontalGroup(
            background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(income_bg_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 1052, Short.MAX_VALUE)
        );
        background_panelLayout.setVerticalGroup(
            background_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(income_bg_panel, javax.swing.GroupLayout.DEFAULT_SIZE, 768, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        add_expense inc_add = new add_expense();
        inc_add.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void income_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_income_searchActionPerformed
        
        if (income_model.getRowCount() > 0) {
            for (int i = income_model.getRowCount() - 1; i > -1; i--) {
                income_model.removeRow(i);
            }
        }
        
        String cat_st=null;
        String cat=String.valueOf(income_category_box.getSelectedItem());
        if(!cat.equals("-ΚΕΝΟ-")){
            cat_st="KATHGORIA="+"'"+cat+"' ";
        }
        
        String subcat_st=null;
        if(income_subcategory_box.isEnabled()){
            String subcat=String.valueOf(income_subcategory_box.getSelectedItem());
            if(!subcat.equals("-ΚΕΝΟ-") && subcat!=null){
                subcat_st="upokathgoria="+"'"+subcat+"' ";
            }
        }
        
        String month_st=null;
        String month=String.valueOf(income_month_box.getSelectedItem());
        if(!month.equals("-ΚΕΝΟ-")){
            month_st="mhnas="+"'"+month+"' ";
        }
        
        String year_st=null;
        String year=String.valueOf(income_year_box.getSelectedItem());
        if(!year.equals("-ΚΕΝΟ-")){
            year_st="etos="+"'"+year+"' ";
        }
        
        String generated_statement=generate_statement(cat_st,subcat_st,month_st,year_st);
        System.out.println(generated_statement);
        try {
            statement=dbConnection.createStatement();
            rs=statement.executeQuery(generated_statement);
            while(rs.next()){
                
                income_model.addRow(new Object[]{rs.getString("kathgoria"),
                        rs.getString("upokathgoria"),
                        rs.getString("etos"),
                        rs.getString("mhnas"),
                        rs.getDouble("poso"),
                        rs.getString("sxolia"),
                        rs.getTimestamp("wra_ypovolhs")});     
            }
            
            double sum=0;
            for (int i = income_model.getRowCount() - 1; i > -1; i--) {
                    sum+=Double.valueOf(String.valueOf(income_model.getValueAt(i, 4)));
            }
            income_model.addRow(new Object[]{"ΣΥΝΟΛΟ :","->","->","->",sum,"<-","<-","<-"});
            
            resize_column_width(income_table);
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }//GEN-LAST:event_income_searchActionPerformed

    private void income_category_boxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_income_category_boxItemStateChanged
        
        String option=String.valueOf(income_category_box.getSelectedItem());
        if(!option.equals("-ΚΕΝΟ-")){
            
            income_subcategory_box.removeAllItems();
            income_subcategory_box.setEnabled(true);
            
            try {
                st=dbConnection.prepareStatement("select DISTINCT upokathgoria from EXPENSE where kathgoria=?");
                st.setString(1, option);
                rs=st.executeQuery();
                income_subcategory_box.addItem("-ΚΕΝΟ-");
                while(rs.next()){
                    income_subcategory_box.addItem(rs.getString("upokathgoria"));
                }
                
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            
        }else{
            income_subcategory_box.removeAllItems();
            income_subcategory_box.setEnabled(false);
        }
        
        
    }//GEN-LAST:event_income_category_boxItemStateChanged

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        remove_combo_items();
        fill_combo_boxes();
    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        remove_combo_items();
    }//GEN-LAST:event_formWindowLostFocus

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
            java.util.logging.Logger.getLogger(expense_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(expense_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(expense_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(expense_menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new expense_menu().setVisible(true);
            }
        });
    }
    
    public void remove_combo_items(){
        income_category_box.removeAllItems();   
        income_month_box.removeAllItems();
        income_year_box.removeAllItems();
        income_subcategory_box.removeAllItems();
    }
    
    private void doPop(MouseEvent e){
        PopUpMenu menu = new PopUpMenu();
        menu.anItem.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String tmstmp = String.valueOf(income_model.getValueAt(income_table.getSelectedRow(),6));
                try{
                   statement = dbConnection.createStatement();
                   statement.executeUpdate("DELETE from EXPENSE where wra_ypovolhs='"+tmstmp+"'");
                   income_model.removeRow(income_table.getSelectedRow());
                   remove_combo_items();
                   fill_combo_boxes();
                }catch(SQLException ex){
                    System.out.println(ex.getMessage());
                }
                System.out.println(String.valueOf(tmstmp));
            }
            
        });
        
        menu.show(e.getComponent(), e.getX(), e.getY());
    }
    
    
    public void resize_column_width(JTable table) {
        final TableColumnModel columnModel = table.getColumnModel();
        for (int column = 0; column < table.getColumnCount(); column++) {
            int width = 15; // Min width
            for (int row = 0; row < table.getRowCount(); row++) {
                TableCellRenderer renderer = table.getCellRenderer(row, column);
                Component comp = table.prepareRenderer(renderer, row, column);
                width = Math.max(comp.getPreferredSize().width +1 , width);
            }
            if(width > 300)
                width=300;
            columnModel.getColumn(column).setPreferredWidth(width);
        }
    }
    
    public void fill_combo_boxes(){
        
        String category_statement="select DISTINCT kathgoria from EXPENSE ";
        String year_statement="select DISTINCT etos from EXPENSE ";
        String month_statement="select DISTINCT mhnas from EXPENSE ";
        
        try {
            statement = dbConnection.createStatement();
            rs = statement.executeQuery(category_statement);
            income_category_box.addItem("-ΚΕΝΟ-");
            while(rs.next()){
                income_category_box.addItem(rs.getString("kathgoria"));
            }
            
            rs=statement.executeQuery(year_statement);
            income_year_box.addItem("-ΚΕΝΟ-");
            while(rs.next()){
                income_year_box.addItem(rs.getString("etos"));
            }
            
            rs=statement.executeQuery(month_statement);
            income_month_box.addItem("-ΚΕΝΟ-");
            while(rs.next()){
                income_month_box.addItem(rs.getString("mhnas"));
            }
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    String generate_statement(String a,String b,String c,String d){
        
        String statement="select kathgoria,upokathgoria,etos,mhnas,poso,sxolia,wra_ypovolhs from EXPENSE";
        
        int counter=0;
        int counter2=0;
        boolean var_a=false;
        boolean var_b=false;
        boolean var_c=false;
        boolean var_d=false;
        
        if(a!=null){
            var_a=true;
            counter++;
            System.out.println("a"+var_a);
        }
        if(b!=null){
            var_b=true;
            counter++;
            System.out.println("b"+var_b);
        }
        if(c!=null){
            var_c=true;
            counter++;
            System.out.println("c"+var_c);
        }
        if(d!=null){
            var_d=true;
            counter++;
            System.out.println("d"+var_d);
        }
        System.out.println(counter);
        
        if(counter>0){
            statement+=" where ";
            
            if(var_a==true){
                statement+=a;
                counter2++;
            }
            if(var_b==true && counter2>0){
                statement+=" and "+b;
                counter2++;
            }else if(var_b==true && counter2<1){
                statement+=b;
                counter2++;
            }
            if(var_c==true && counter2>0){
                statement+=" and "+c;
                counter2++;
            }else if(var_c==true && counter2<1){
                statement+=c;
                counter2++;
            }
            if(var_d==true && counter2>0){
                statement+=" and "+d;
                counter2++;
            }else if(var_d==true && counter2<1){
                statement+=d;
                counter2++;
            }
        }
        
        return statement;
    }
    
    PreparedStatement st=null;
    Statement statement = null;
    ResultSet rs = null;
    static Connection dbConnection = null;
    DefaultTableModel income_model;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background_panel;
    private javax.swing.JPanel income_bg_panel;
    private javax.swing.JSeparator income_bg_panel_separator;
    private javax.swing.JComboBox<String> income_category_box;
    private javax.swing.JLabel income_label;
    private javax.swing.JComboBox<String> income_month_box;
    private javax.swing.JButton income_search;
    private javax.swing.JComboBox<String> income_subcategory_box;
    private javax.swing.JTable income_table;
    private javax.swing.JComboBox<String> income_year_box;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
