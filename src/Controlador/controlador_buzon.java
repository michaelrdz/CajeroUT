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
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

/**
 *
 * @author Usuario
 */
public class controlador_buzon implements ActionListener, WindowListener, MenuListener{
    public modelo_buzon miModelo;
    public ServBuzon miBuzon;
    public principalMenu miMenu;
    public mainInicial SalidaLogin;
    public int flagRol;
    public int flagmatricula;
    public String usrActivo;
    
    public controlador_buzon(modelo_buzon miModelo, ServBuzon miBuzon, principalMenu miMenu, mainInicial SalidaLogin) {
        this.miModelo = miModelo;
        this.miBuzon = miBuzon;
        this.miMenu = miMenu;
        this.SalidaLogin = SalidaLogin;
        this.miBuzon.btn_enviarBuzon.addActionListener(this);
        this.miBuzon.jMenuItem_servCaja.addActionListener(this);
        this.miBuzon.jMenuItem_servCreditoUT.addActionListener(this);
        this.miBuzon.jMenuItem_servLoboletos.addActionListener(this);
        this.miBuzon.jMenuItem_servEvaluacion.addActionListener(this);
        this.miBuzon.jMenuItem_consCalificaciones.addActionListener(this);
        this.miBuzon.jMenuItem_consHorario.addActionListener(this);
        this.miBuzon.jMenuItem_consEdoCuenta.addActionListener(this);
        this.miBuzon.jMenuItem_ConsMapa.addActionListener(this);
        this.miBuzon.jMenuItem_calendario.addActionListener(this);
        this.miBuzon.jMenuItem_becas.addActionListener(this);
        this.miBuzon.jMenuItem_constancias.addActionListener(this);
        this.miBuzon.jMenuItem_correo.addActionListener(this);
        this.miBuzon.jMenuItem_navega.addActionListener(this);
        this.miBuzon.jMenuItem_soporte.addActionListener(this);
        this.miBuzon.jMenu_cerrarSesion.addMenuListener(this);
        flagRol = 0;
        flagmatricula = 0;
        usrActivo = "";
    }
    @Override
    //Método que recibe los eventos de acciones
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == miBuzon.btn_enviarBuzon) {
            if(miBuzon.txtArea_txtBuzon.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "No se detecto mensaje. Escriba el mensaje que desea enviar");
            }
            else {
                JOptionPane.showMessageDialog(null, "Su mensage anonimo ha sido enviado correctamente");
                miBuzon.txtArea_txtBuzon.setText("");
            }
        }
        
        //Al clic en la opción caja del menú
        if (ae.getSource() == miBuzon.jMenuItem_servCaja) {
            //Instancia de una nueva caja
            servCaja miCaja = new servCaja();
            modelo_servCaja modeloCaja = new modelo_servCaja();
            //se pasa la nueva caja coómo parametro paara el constructor en el controlador de caja
            controlador_servCaja miControladorCaja = new controlador_servCaja(miCaja, modeloCaja,miMenu, SalidaLogin);
            //Desde el controlador se hace visible la caja
            miControladorCaja.miCaja.setVisible(true);
            this.miBuzon.dispose();
        } 
        //Al clic en la opción Loboletos del menú
        if (ae.getSource() == miBuzon.jMenuItem_servLoboletos) {
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
            this.miBuzon.dispose();
        }
        //Al clic en la opción CreditoUT del menú
        if (ae.getSource() == miBuzon.jMenuItem_servCreditoUT) {
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
            this.miBuzon.dispose();
        }
        //Al clic en la opción Evaluación del menú
        if (ae.getSource() == miBuzon.jMenuItem_servEvaluacion) {
            //Instancia de Evaluación
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
            this.miBuzon.dispose();
        }
        //Si se da clic en el menu a la opción Calificaciones
        if (ae.getSource() == miBuzon.jMenuItem_consCalificaciones) {
            File archivo = new File(miModelo.abreCalif(flagmatricula));
            miModelo.abreArchivo(archivo);
        } 
        //Si se da clic en el menu a la opción Horario
        if (ae.getSource() == miBuzon.jMenuItem_consHorario) {
            JOptionPane.showInputDialog("La url es: "+miModelo.abreHorario(flagmatricula));
            miModelo.abreNavegador(miModelo.abreHorario(flagmatricula));
            //miModelo.abreNavegador("http://www.utags.edu.mx/images/Archivos/ti/horarios/sep-dic-2019/TICASI-7-E-9.pdf");
        }      
        //Si se da clic en el menu a la opción Estado de cuenta
        if (ae.getSource() == miBuzon.jMenuItem_consEdoCuenta) {
            File archivo = new File(miModelo.abreEdoCuenta(flagmatricula));
            miModelo.abreArchivo(archivo);
        } 
        //Si se da clic en el menu a la opción de ver mapa
        if (ae.getSource() == miBuzon.jMenuItem_ConsMapa) {
            //Se mandará a traer un documento local anexo en la carpeta documentos en el propio proyecto
            File archivo = new File("src/Documentos/mapaUT.jpg");
            miModelo.abreArchivo(archivo);
        }
        //Si se da clic en el menu a la opción de ver calendario
        if (ae.getSource() == miBuzon.jMenuItem_calendario) {
            //Se mandará a traer un documento local anexo en la carpeta documentos en el propio proyecto
            File archivo = new File("src/Documentos/calendario.pdf");
            miModelo.abreArchivo(archivo);
        }
        //Si se da clic en el menu a la opción becas
        if (ae.getSource() == miBuzon.jMenuItem_becas) {
            miModelo.abreNavegador("http://www.utags.edu.mx/index.php/servicios/becas");
        }
        //Al clic en la opción Constancias del menú
        if (ae.getSource() == miBuzon.jMenuItem_constancias) {
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
            this.miBuzon.dispose();
        }
        //Si se da clic en el menu a la opción correo
        if (ae.getSource() == miBuzon.jMenuItem_correo) {
            miModelo.abreNavegador("https://outlook.office.com/owa/utags.edu.mx");
        }
        //Si se da clic en el menu a la opción navegar
        if (ae.getSource() == miBuzon.jMenuItem_navega) {
            miModelo.abreNavegador("http://www.google.com.mx");
        }
        //Al clic en la opción Soporte del menú
        if (ae.getSource() == miBuzon.jMenuItem_soporte) {
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
            this.miBuzon.dispose();
        }
    }
    
    @Override
    public void windowOpened(WindowEvent we) {
    }

    @Override
    public void windowClosing(WindowEvent we) {
       
    }

    @Override
    public void windowClosed(WindowEvent we) {
    }

    @Override
    public void windowIconified(WindowEvent we) {
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
    }

    @Override
    public void windowActivated(WindowEvent we) {
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
    }
    
    @Override
    //Si se preciona en el menú cerrar sesión
    public void menuSelected(MenuEvent e) {
        int reply = JOptionPane. showConfirmDialog(null, "Seguro de que desea cerrar sesión", "Cerrar sesión", JOptionPane.YES_NO_CANCEL_OPTION);
        if(reply == JOptionPane.YES_OPTION) {
            //Carga el método que incia el login desde la clase main y cierra la ventana acual
            SalidaLogin.cargaLogin();
            this.miBuzon.dispose();
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
}
