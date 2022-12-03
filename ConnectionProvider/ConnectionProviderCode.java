package ConnectionProvider;

import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;

public class ConnectionProviderCode {
    public static Connection getcon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentResultSystem", "root", "Pritish@3719");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
    }
    public static void main(String[] args){
        Connection conn = ConnectionProviderCode.getcon();
        
    }
}
