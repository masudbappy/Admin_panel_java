import java.sql.*;
import javax.swing.*;
public class JavaConnect {
    Connection conn = null;
    public static Connection connectDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:G:\\Neatbeans_Projects\\Project\\DbProject.sqlite");
            JOptionPane.showMessageDialog(null, "connection established.");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
