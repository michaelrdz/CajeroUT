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
/**
 *
 * @author Usuario
 */
public class modelo_buzon {
    private conexionMySQL miCnn = new conexionMySQL();
    
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
