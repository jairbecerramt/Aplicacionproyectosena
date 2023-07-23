/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class CConexion {
    
    Connection conectar;
    
    String usuario= "root";
    String contraseña="Jair19951231+";
    String bd="colegio";
    String ip="localhost";
    String puerto="3306";
    
   String cadena= "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
   
    public Connection estableceConexion(){
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena,usuario,contraseña);
            JOptionPane.showMessageDialog(null, "Se conecto correctamente a la base de datos");
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Problemas en la conexion"+e.toString());
        }
        
        return conectar;
    }       
    
    
}
