/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBD;

import colegio.FrmPrincipal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author MARCELA
 */
public class CLogin {
    
    public void ValidarUsuario(JTextField usuario, JPasswordField contraseña){
        
        try {
            
            ResultSet rs = null;
            PreparedStatement ps = null;
            
            ConexionBD.CConexion objetoConexion= new ConexionBD.CConexion();
            
            String consulta="SELECT * FROM usuario WHERE usuario.Correo =(?) AND usuario.Pass=(?);";
            ps=objetoConexion.estableceConexion().prepareStatement(consulta);
            
            String contra = String.valueOf(contraseña.getPassword());
            
            ps.setString(1, usuario.getText());
            ps.setString(2, contra);
            
            rs=ps.executeQuery();
            
            if (rs.next()) {
                
                JOptionPane.showMessageDialog(null, "Bienvenido");
                FrmPrincipal objetoPrincipal = new FrmPrincipal();
                objetoPrincipal.setVisible(true);
                
            }
            
            else
            {
                JOptionPane.showMessageDialog(null, "Datos Incorrectos verifique el usuario y la contraseña");
            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Error:" +e.toString());
        }
        
    }
    
}
