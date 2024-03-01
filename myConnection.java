
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed_Abdeldayem
 */
public class myConnection {
        public myConnection(){
    
        connect();
    
    }
    
    public static java.sql.Connection connect(){
    
        java.sql.Connection con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/student","root","");
            JOptionPane.showMessageDialog(null, "Connected Sucessful");

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    
        return con;
    }
    
}
