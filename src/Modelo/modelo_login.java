/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author Usuario
 */
public class modelo_login {
    public int flagMatricula;
    public String usuarioActivo;
    public int flagRol;
    private conexionMySQL miCnn = new conexionMySQL();
    //Variables requeridas para el login
    /*String usr, pass;
    boolean respuesta;
    
    //Incializo varibles con un constructor
    public modelo_login() {
        this.usr = "171679";
        this.pass = "1234";
        this.respuesta = false;
    }
    //Funciones para obtener los datos guardados
    public String getUsr() {
        return usr;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }*/
    //Función que evalua los datos enviados desde el controlador del controlador del login
    public boolean autentifica(int usr, int pass){
        boolean respuesta = false;
        try {
            String SQL = "SELECT * FROM usrconexion WHERE id='"+usr+"' AND pass='"+pass+"'";
            Statement stmt = miCnn.conectarSQL().createStatement();
            ResultSet rs = stmt.executeQuery(SQL);
            if (rs.next()) {
                respuesta = true;
                this.flagMatricula = rs.getInt("id");
                this.flagRol = rs.getInt("rol");
                this.usuarioActivo = rs.getNString("nombre");
                //JOptionPane.showMessageDialog(null, "nombre es: "+usuarioActivo+" rol: "+flagRol);
            }
            rs.close();
            stmt.close();
        }
        catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"ERROR= "+ex,"ERROR", JOptionPane.ERROR_MESSAGE);
        }
        /*if(usr.equals(getUsr()) && pass.equals(getPass())) {
            respuesta = true;
        }
        else {
            respuesta = false;
        }*/
        return respuesta;
    }
}