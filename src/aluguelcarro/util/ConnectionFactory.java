package aluguelcarro.util;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionFactory {
    
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/bdaluguel-carro?useTimezone=true&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "admin";
    
    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            
            //return  DriverManager.getConnection("jdbc:mysql://localhost/bdaluguel-carro?" + "user=root&password=admin");
            return  DriverManager.getConnection(URL, USER, PASS);
            
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão: ", ex);
        }           
    }
    
    public static void closeConnection(Connection con) {
        if (con!= null){
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
   public static void closeConnection(Connection con, PreparedStatement stmt) {
        
       closeConnection(con);
       
        try {
            
            if(stmt != null){
                stmt.close();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
   public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {
        
       closeConnection(con, stmt);
       
        try {
            
            if(rs != null){
                rs.close();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
