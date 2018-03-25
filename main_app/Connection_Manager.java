package main_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection_Manager {
    
    private static String driverClassName = "org.apache.derby.jdbc.ClientDriver" ;
    private static String url = "jdbc:derby://localhost:1527/InOut";
    private static Connection dbConnection ; 
    private static String username = "gbarkos";
    private static String passwd = "116612" ;
    
    public static Connection getConnection() throws SQLException{
        
        try {
            Class.forName(driverClassName);
            try{
                dbConnection = DriverManager.getConnection (url, username, passwd);
            }catch(SQLException ex){
                System.out.println("Failed to establish database conncetion.");
            }
        } catch (ClassNotFoundException ex) {
                System.out.println(ex.getMessage());
        }
        return dbConnection;
    } 
}
