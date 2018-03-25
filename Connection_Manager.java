package Triplet_Suns_Hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection_Manager {
    
    private static String driverClassName = "" ;
    private static String url = "";
    private static Connection dbConnection ;            //fill the strings with the prefered
    private static String username = "";                //respective JDBC values
    private static String passwd = "" ;
    
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
