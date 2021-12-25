/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import Controlador.controlador_principalMenu;
import java.*;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Usuario
 */
public class modelo_creditoUT {
    private conexionMySQL miCnn = new conexionMySQL();
    
    public Integer buscaCreditoUT(int id) {
       int monto = 0;
        try {
            String SQL = "SELECT * FROM usrconexion WHERE id='"+id+"';";
            Statement stmt = miCnn.conectarSQL().createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            if (rs.next()) {
                monto = rs.getInt("CreditoUT");
            }
            rs.close();
            stmt.close();
        }
        catch (SQLException ex)
        {
        }
        return monto; 
    }
    
    public Integer actualizaCreditoUT(int id, int monto, int abono) {
        int nuevoMonto = monto + abono;
        try {
            String SQL = "UPDATE usrconexion SET CreditoUT = '"+nuevoMonto+"' WHERE id='"+id+"';";
            JOptionPane.showMessageDialog(null,SQL);
            Statement stmt = miCnn.conectarSQL().createStatement();
            stmt.executeUpdate(SQL);
            JOptionPane.showMessageDialog(null, "Se cretitoUT ahora es de: "+nuevoMonto);
            stmt.close();
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "ERROR al actualizar CreditoUT");
        }
        return monto; 
    }
    
    public String abreCalif(int id) {
        String url = "";
        try {
            String SQL = "SELECT * FROM usrconexion WHERE id='"+id+"';";
            Statement stmt = miCnn.conectarSQL().createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            if (rs.next()) {
                url = rs.getNString("calif");
            }
            rs.close();
            stmt.close();
        }
        catch (SQLException ex)
        {
        }
        return url;
    }
    public String abreHorario(int id) {
        String url = "";
        try {
            String SQL = "SELECT * FROM usrconexion WHERE id='"+id+"';";
            Statement stmt = miCnn.conectarSQL().createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            if (rs.next()) {
                url = rs.getNString("horario");
            }
            rs.close();
            stmt.close();
        }
        catch (SQLException ex)
        {
        }
        return url;
    }
    public String abreEdoCuenta(int id) {
        String url = "";
        try {
            String SQL = "SELECT * FROM usrconexion WHERE id='"+id+"';";
            Statement stmt = miCnn.conectarSQL().createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            if (rs.next()) {
                url = rs.getNString("edoCuenta");
            }
            rs.close();
            stmt.close();
        }
        catch (SQLException ex)
        {
        }
        return url;
    }
    public void abreArchivo(File archivo) {
        try {
                /*la clase Desktop nos permitirá visualizar el archivo mediante sus métodos getDesktop 
                  y el método open ( ), con esto, colocaremos como argumento el objeto File que creamos 
                  anteriormente.*/
                Desktop.getDesktop().open(archivo);
            } catch (IOException ex) {
                Logger.getLogger(controlador_principalMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
    public void abreNavegador(String url) {
        try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
        }catch(Exception e) {
            
        }
        
    }
}
