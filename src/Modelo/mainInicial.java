/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.*;
import Vista.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class mainInicial {
    public static void main(String args[]) {
        modelo_login miModelo = new modelo_login();
        controlador_login miControlador = new controlador_login();
        
        Login miLogin = new Login();
        miControlador.setMiVistaModelo(miLogin, miModelo);
    }
    
    public void cargaLogin() {
        modelo_login miModelo = new modelo_login();
        controlador_login miControlador = new controlador_login();
        Login miLogin = new Login();
        miControlador.setMiVistaModelo(miLogin, miModelo);
    }
}
