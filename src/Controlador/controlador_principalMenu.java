/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.*;
import Vista.*;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * @author Usuario
 */
public class controlador_principalMenu implements ActionListener, MenuListener {
    public modelo_principalMenu miModelo; 
    public principalMenu miMenu;
    public mainInicial SalidaLogin;
    public int flagRol;
    public int flagmatricula;
    public String usrActivo;
    
    //Constructor del controlador
    public controlador_principalMenu(modelo_principalMenu miModelo, principalMenu miMenu, mainInicial SalidaLogin){
        this.miMenu = miMenu;
        this.miModelo = miModelo;
        this.SalidaLogin = SalidaLogin;
        this.miMenu.jMenuItem_servCaja.addActionListener(this);
        this.miMenu.jMenuItem_servCreditoUT.addActionListener(this);
        this.miMenu.jMenuItem_consCalificaciones.addActionListener(this);
        this.miMenu.jMenuItem_consHorario.addActionListener(this);
        this.miMenu.jMenuItem_consEdoCuenta.addActionListener(this);
        this.miMenu.jMenuItem_ConsMapa.addActionListener(this);
        this.miMenu.jMenuItem_calendario.addActionListener(this);
        this.miMenu.jMenuItem_becas.addActionListener(this);
        this.miMenu.jMenuItem_constancias.addActionListener(this);
        this.miMenu.jMenuItem_correo.addActionListener(this);
        this.miMenu.jMenuItem_navega.addActionListener(this);
        this.miMenu.jMenuItem_soporte.addActionListener(this);
        this.miMenu.jMenuItem_servBuzon.addActionListener(this);
        this.miMenu.jMenuItem_servLoboletos.addActionListener(this);
        this.miMenu.jMenuItem_servEvaluacion.addActionListener(this);
        this.miMenu.jMenu_cerrarSesion.addMenuListener(this);
        flagRol = 0;
        flagmatricula = 0;
        usrActivo = "";
    }
    
    //Metodo que recibe los eventos de ación mediante la evaluación de condicionales
    public void actionPerformed(ActionEvent ae) {
        //Al clic en la opción caja del menú
        if (ae.getSource() == miMenu.jMenuItem_servCaja) {
            //Instancia de una nueva caja
            servCaja miCaja = new servCaja();
            modelo_servCaja modeloCaja = new modelo_servCaja();
            //se pasa la nueva caja cómo parametro paara el constructor en el controlador de caja
            controlador_servCaja miControladorCaja = new controlador_servCaja(miCaja, modeloCaja,miMenu, SalidaLogin);
            //Paso los datos de usuario
            miControladorCaja.flagRol = this.flagRol;
            miControladorCaja.flagmatricula = this.flagmatricula;
            miControladorCaja.usrActivo = this.usrActivo;
            //Desde el controlador se hace visible la caja
            miControladorCaja.miCaja.setVisible(true);
            this.miMenu.dispose();
        } 
        //Al clic en la opción CreditoUT del menú
        if (ae.getSource() == miMenu.jMenuItem_servCreditoUT) {
            //Instancia de CreditoUT
            modelo_creditoUT modeloCreditoUT = new modelo_creditoUT();
            ServCreditoUT vistaCreditoUt = new ServCreditoUT();
            //se pasa la nueva caja cómo parametro paara el constructor en el controlador de buzon
            controlador_creditoUT miControladorCredtoUT = new controlador_creditoUT(modeloCreditoUT, vistaCreditoUt, miMenu, SalidaLogin);
            //Paso los datos de usuario
            miControladorCredtoUT.flagRol = this.flagRol;
            miControladorCredtoUT.flagmatricula = this.flagmatricula;
            miControladorCredtoUT.usrActivo = this.usrActivo;
            miControladorCredtoUT.cargaEstadoCreditoUT();
            //Desde el controlador se hace visible el buzon
            miControladorCredtoUT.miCreditoUT.setVisible(true);
            this.miMenu.dispose();
        }
        //Al clic en la opción Loboletos del menú
        if (ae.getSource() == miMenu.jMenuItem_servLoboletos) {
            //Instancia de una nueva caja
            servCaja miCaja = new servCaja();
            modelo_servCaja modeloCaja = new modelo_servCaja();
            //se pasa la nueva caja cómo parametro paara el constructor en el controlador de caja
            controlador_servCaja miControladorCaja = new controlador_servCaja(miCaja, modeloCaja,miMenu, SalidaLogin);
            //Paso los datos de usuario
            miControladorCaja.flagRol = this.flagRol;
            miControladorCaja.flagmatricula = this.flagmatricula;
            miControladorCaja.usrActivo = this.usrActivo;
            miControladorCaja.miCaja.cb_tipoPago.setSelectedIndex(4);
            miControladorCaja.miCaja.cb_tipoPago.setEnabled(false);
            //Desde el controlador se hace visible la caja
            miControladorCaja.miCaja.setVisible(true);
            this.miMenu.dispose();
        }
        //Al clic en la opción Evaluación del menú
        if (ae.getSource() == miMenu.jMenuItem_servEvaluacion) {
            //Instancia de buzón
            modelo_evaluacion modeloEvaluacion = new modelo_evaluacion();
            ServEvaluacion vistaEvaluacion = new ServEvaluacion();
            //se pasa la nueva caja cómo parametro paara el constructor en el controlador de buzon
            controlador_evaluacion miControladorEvaluacion = new controlador_evaluacion(modeloEvaluacion, vistaEvaluacion, miMenu, SalidaLogin);
            //Paso los datos de usuario
            miControladorEvaluacion.flagRol = this.flagRol;
            miControladorEvaluacion.flagmatricula = this.flagmatricula;
            miControladorEvaluacion.usrActivo = this.usrActivo;
            //Desde el controlador se hace visible el buzon
            miControladorEvaluacion.miEvaluacion.setVisible(true);
            this.miMenu.dispose();
        }
        //Al clic en la opción Buzón del menú
        if (ae.getSource() == miMenu.jMenuItem_servBuzon) {
            //Instancia de buzón
            modelo_buzon modeloBuzon = new modelo_buzon();
            ServBuzon vistaBuzon = new ServBuzon();
            //se pasa la nueva caja cómo parametro paara el constructor en el controlador de buzon
            controlador_buzon miControladorBuzon = new controlador_buzon(modeloBuzon, vistaBuzon, miMenu, SalidaLogin);
            //Paso los datos de usuario
            miControladorBuzon.flagRol = this.flagRol;
            miControladorBuzon.flagmatricula = this.flagmatricula;
            miControladorBuzon.usrActivo = this.usrActivo;
            if(miControladorBuzon.flagRol == 1) {
                miControladorBuzon.miBuzon.jMenuItem_servCaja.setVisible(false);
                miControladorBuzon.miBuzon.jMenuItem_servCreditoUT.setVisible(false);
                miControladorBuzon.miBuzon.jMenuItem_servLoboletos.setVisible(false);
                miControladorBuzon.miBuzon.jMenuItem_servEvaluacion.setVisible(false);
                miControladorBuzon.miBuzon.jMenuItem_consCalificaciones.setVisible(false);
                miControladorBuzon.miBuzon.jMenuItem_consEdoCuenta.setVisible(false);
                miControladorBuzon.miBuzon.jMenu_tramites.setVisible(false);
            }
            else {
            
            }
            //Desde el controlador se hace visible el buzon
            miControladorBuzon.miBuzon.setVisible(true);
            this.miMenu.dispose();
        }
        //Si se da clic en el menu a la opción Calificaciones
        if (ae.getSource() == miMenu.jMenuItem_consCalificaciones) {
            File archivo = new File(miModelo.abreCalif(flagmatricula));
            miModelo.abreArchivo(archivo);
        } 
        //Si se da clic en el menu a la opción Horario
        if (ae.getSource() == miMenu.jMenuItem_consHorario) {
            JOptionPane.showInputDialog("La url es: "+miModelo.abreHorario(flagmatricula));
            miModelo.abreNavegador(miModelo.abreHorario(flagmatricula));
            //miModelo.abreNavegador("http://www.utags.edu.mx/images/Archivos/ti/horarios/sep-dic-2019/TICASI-7-E-9.pdf");
        }      
        //Si se da clic en el menu a la opción Estado de cuenta
        if (ae.getSource() == miMenu.jMenuItem_consEdoCuenta) {
            File archivo = new File(miModelo.abreEdoCuenta(flagmatricula));
            miModelo.abreArchivo(archivo);
        } 
        //Si se da clic en el menu a la opción de ver mapa
        if (ae.getSource() == miMenu.jMenuItem_ConsMapa) {
            //Se mandará a traer un documento local anexo en la carpeta documentos en el propio proyecto
            File archivo = new File("src/Documentos/mapaUT.jpg");
            miModelo.abreArchivo(archivo);
        }
        //Si se da clic en el menu a la opción de ver calendario
        if (ae.getSource() == miMenu.jMenuItem_calendario) {
            //Se mandará a traer un documento local anexo en la carpeta documentos en el propio proyecto
            File archivo = new File("src/Documentos/calendario.pdf");
            miModelo.abreArchivo(archivo);
        }
        //Si se da clic en el menu a la opción becas
        if (ae.getSource() == miMenu.jMenuItem_becas) {
            miModelo.abreNavegador("http://www.utags.edu.mx/index.php/servicios/becas");
        }
        //Al clic en la opción Constancias del menú
        if (ae.getSource() == miMenu.jMenuItem_constancias) {
            //Instancia de buzón
            modelo_constancia modeloConstancia = new modelo_constancia();
            TramConstancia vistaConstancia = new TramConstancia();
            //se pasa la nueva caja cómo parametro paara el constructor en el controlador de buzon
            controlador_constancia miControladorConstancia = new controlador_constancia(modeloConstancia, vistaConstancia, miMenu, SalidaLogin);
            //Paso los datos de usuario
            miControladorConstancia.flagRol = this.flagRol;
            miControladorConstancia.flagmatricula = this.flagmatricula;
            miControladorConstancia.usrActivo = this.usrActivo;
            //Desde el controlador se hace visible el buzon
            miControladorConstancia.miConstancia.setVisible(true);
            this.miMenu.dispose();
        }
        //Si se da clic en el menu a la opción correo
        if (ae.getSource() == miMenu.jMenuItem_correo) {
            miModelo.abreNavegador("https://outlook.office.com/owa/utags.edu.mx");
        }
        //Si se da clic en el menu a la opción navegar
        if (ae.getSource() == miMenu.jMenuItem_navega) {
            miModelo.abreNavegador("http://www.google.com.mx");
        }
        //Al clic en la opción Soporte del menú
        if (ae.getSource() == miMenu.jMenuItem_soporte) {
            //Instancia de Soporte
            modelo_soporte modeloSoporte = new modelo_soporte();
            ServSoporte vistaSoporte = new ServSoporte();
            //se pasa la nueva caja cómo parametro paara el constructor en el controlador de buzon
            controlador_soporte miControladorSoporte = new controlador_soporte(modeloSoporte, vistaSoporte, miMenu, SalidaLogin);
            //Paso los datos de usuario
            miControladorSoporte.flagRol = this.flagRol;
            miControladorSoporte.flagmatricula = this.flagmatricula;
            miControladorSoporte.usrActivo = this.usrActivo;
            miControladorSoporte.mensajeUsuarioSoporte();
            if(miControladorSoporte.flagRol == 1) {
                miControladorSoporte.miSoporte.jMenuItem_servCaja.setVisible(false);
                miControladorSoporte.miSoporte.jMenuItem_servCreditoUT.setVisible(false);
                miControladorSoporte.miSoporte.jMenuItem_servLoboletos.setVisible(false);
                miControladorSoporte.miSoporte.jMenuItem_servEvaluacion.setVisible(false);
                miControladorSoporte.miSoporte.jMenuItem_consCalificaciones.setVisible(false);
                miControladorSoporte.miSoporte.jMenuItem_consEdoCuenta.setVisible(false);
                miControladorSoporte.miSoporte.jMenu_tramites.setVisible(false);
            }
            else {
            
            }
            //Desde el controlador se hace visible el Soporte
            miControladorSoporte.miSoporte.setVisible(true);
            this.miMenu.dispose();
        }
    }
    
    @Override
    //Si se preciona en el menú cerrar sesión
    public void menuSelected(MenuEvent e) {
        int reply = JOptionPane. showConfirmDialog(null, "Seguro de que desea cerrar sesión", "Cerrar sesión", JOptionPane.YES_NO_CANCEL_OPTION);
        if(reply == JOptionPane.YES_OPTION) {
            //Carga el método que incia el login desde la clase main y cierra la ventana acual
            SalidaLogin.cargaLogin();
            this.miMenu.dispose();
        }
        else {
            
        }
    }
    @Override
    public void menuDeselected(MenuEvent e) {
        
    }
    @Override
    public void menuCanceled(MenuEvent e) {
        
    }
    /*public void Abrir_servCaja() {
        miMenu.dispose();
        modelo_servCaja modeloCaja = new modelo_servCaja();
        servCaja vistaCaja = new servCaja();
        controlador_servCaja controladorCaja = new controlador_servCaja(vistaCaja, modeloCaja, miMenu);
        controladorCaja.miCaja.setVisible(true);
    }*/
    public void setUsrVisible(String usr) {
        miMenu.lbl_usrSaudo.setText("Usuario activo: "+usr);
    }
}