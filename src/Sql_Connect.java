
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TENGAH
 */
public class Sql_Connect {
    Connection conn=null;
    public static Connection Connectdb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/libot","root","tinotenda");
            return conn;
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
                return null;
            }
    }
       
    }

