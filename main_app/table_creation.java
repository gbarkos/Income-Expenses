package main_app;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class table_creation {
    
    static Connection dbConnection = null;
    static Statement  statement    = null;
    
    public static void main(String args[]){
        
        try {
            dbConnection = Connection_Manager.getConnection();
            statement    = dbConnection.createStatement();
            String sql_statement="";
            
            sql_statement="create table Income (" +
                          "poso double , " +
                          "etos varchar(5), " +
                          "mhnas varchar(30), " +
                          "kathgoria varchar(30), " +
                          "upokathgoria varchar(30), " +
                          "wra_ypovolhs timestamp not null primary key, " +
                          "sxolia varchar(100) ) ";
                           
            statement.executeUpdate(sql_statement);
            System.out.println("Table Income created successfully");
            
            sql_statement="create table Expense (" +
                          "poso double , " +
                          "etos varchar(5), " +
                          "mhnas varchar(30), " +
                          "kathgoria varchar(30), " +
                          "upokathgoria varchar(30), " +
                          "wra_ypovolhs timestamp not null primary key, " +
                          "sxolia varchar(100) ) ";
                           
            statement.executeUpdate(sql_statement);
            System.out.println("Table Expense created successfully");
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
    }
}
