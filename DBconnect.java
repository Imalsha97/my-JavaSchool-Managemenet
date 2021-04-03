
package codes;

//import com.sun.jdi.connect.spi.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Imalsha
 */
public class DBconnect {
    public static Connection connect(){
    Connection conn = null;
    
     
    try{
        Class.forName("com.mysql.jdbc.Driver");
        conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/project123","root","");
    }catch(ClassNotFoundException | SQLException e){
        JOptionPane.showMessageDialog(null,e);
    }
        return conn;
    }
}
    
