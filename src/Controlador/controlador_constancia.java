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
public class controlador_constancia implements ActionListener, WindowListener, MenuListener {
    public modelo_constancia miModelo;
    public TramConstancia miConstancia;
    public principalMenu miMenu;
    public mainInicial SalidaLogin;
    public int flagRol;
    public int flagmatricula;
    public String usrActivo;
    
    public controlador_constancia(modelo_constancia miModelo,TramConstancia miConstancia,principalMenu miMenu, mainInicial SalidaLogin) {
        this.miModelo = miModelo;
        this.miConstancia = miConstancia;
        this.miMenu = miMenu;
        
        this.miConstancia.rd_pagoCreditoUT.addActionListener(this);
        this.miConstancia.rd_pagoTarjeta.addActionListener(this);
        this.miConstancia.txt_numTarjeta.addActionListener(this);
        this.miConstancia.txt_numTarjeta.setEnabled(false);
        this.miConstancia.tBtn_tecladoTarjeta.addActionListener(this);
        this.miConstancia.pass_cve.addActionListener(this);
        this.miConstancia.pass_cve.setEnabled(false);
        this.miConstancia.tBtn_tecladoCVE.addActionListener(this);
        this.miConstancia.cb_vencimientoMes.addActionListener(this);
        this.miConstancia.cb_vencimientoAnio.addActionListener(this);
        this.miConstancia.txtArea_ticket.setEnabled(false);
        this.miConstancia.btn_pagar.addActionListener(this);        
        this.miConstancia.frame_servTeclado.addWindowListener(this);
        this.miConstancia.teclado_btn0.addActionListener(this);
        this.miConstancia.teclado_btn1.addActionListener(this);
        this.miConstancia.teclado_btn2.addActionListener(this);
        this.miConstancia.teclado_btn3.addActionListener(this);
        this.miConstancia.teclado_btn4.addActionListener(this);
        this.miConstancia.teclado_btn5.addActionListener(this);
        this.miConstancia.teclado_btn6.addActionListener(this);
        this.miConstancia.teclado_btn7.addActionListener(this);
        this.miConstancia.teclado_btn8.addActionListener(this);
        this.miConstancia.teclado_btn9.addActionListener(this);
        this.miConstancia.teclado_btnAtras.addActionListener(this);
        this.miConstancia.teclado_btnLimpiar.addActionListener(this);
        this.miConstancia.teclado_btnAceptar.addActionListener(this);
        
        this.SalidaLogin = SalidaLogin;
        this.miConstancia.jMenuItem_servCaja.addActionListener(this);
        this.miConstancia.jMenuItem_servCreditoUT.addActionListener(this);
        this.miConstancia.jMenuItem_servLoboletos.addActionListener(this);
        this.miConstancia.jMenuItem_servEvaluacion.addActionListener(this);
        this.miConstancia.jMenuItem_consCalificaciones.addActionListener(this);
        this.miConstancia.jMenuItem_consHorario.addActionListener(this);
        this.miConstancia.jMenuItem_consEdoCuenta.addActionListener(this);
        this.miConstancia.jMenuItem_ConsMapa.addActionListener(this);
        this.miConstancia.jMenuItem_calendario.addActionListener(this);
        this.miConstancia.jMenuItem_becas.addActionListener(this);
        this.miConstancia.jMenuItem_constancias.addActionListener(this);
        this.miConstancia.jMenuItem_correo.addActionListener(this);
        this.miConstancia.jMenuItem_navega.addActionListener(this);
        this.miConstancia.jMenuItem_soporte.addActionListener(this);
        this.miConstancia.jMenu_cerrarSesion.addMenuListener(this);
        this.miConstancia.jMenuItem_servBuzon.addActionListener(this);
        flagRol = 0;
        flagmatricula = 0;
        usrActivo = "";
        radioPagoValida();
    }
    
    @Override
    //Método que recibe los eventos de acciones
    public void actionPerformed(ActionEvent ae) {
        //Si cambia la selección del radio button group, mediante un método
         if (ae.getSource() == miConstancia.rd_pagoCreditoUT || ae.getSource() == miConstancia.rd_pagoTarjeta) {
             radioPagoValida();
         }
        //Comparamos el estado de los toogle buttons
        //Si se cliquea el toggle button de tarjeta
         if (ae.getSource() == miConstancia.tBtn_tecladoTarjeta) {
             //controla estados de los botones y muestra el teclado
             if (miConstancia.tBtn_tecladoTarjeta.isSelected()) {
                 miConstancia.frame_servTeclado.setVisible(true);
                 miConstancia.tBtn_tecladoCVE.setSelected(false);
            } else {
                miConstancia.frame_servTeclado.setVisible(false);
            }
         }
         //En caso de que se clique el toggle de CVE
         else if (ae.getSource() == miConstancia.tBtn_tecladoCVE) {
             if (miConstancia.tBtn_tecladoCVE.isSelected()) {
                miConstancia.tBtn_tecladoTarjeta.setSelected(false);
                miConstancia.frame_servTeclado.setVisible(true);
                miConstancia.teclado_btnAtras.setVisible(false);
            } else {
                miConstancia.frame_servTeclado.setVisible(false);
            }
         }
         //Eventos del clic de botones del teclado controlado por toggle buttons
         if (ae.getSource() == miConstancia.teclado_btn0) {
             String nTarjeta = miConstancia.txt_numTarjeta.getText();
             String nCVE = miConstancia.pass_cve.getText();
             
             if (miConstancia.tBtn_tecladoTarjeta.isSelected()) {
                 miConstancia.txt_numTarjeta.setText(nTarjeta+"0");
             }
             else {
                 miConstancia.pass_cve.setText(nCVE + "0");
             }
         }
         if (ae.getSource() == miConstancia.teclado_btn1) {
             String nTarjeta = miConstancia.txt_numTarjeta.getText();
             String nCVE = miConstancia.pass_cve.getText();
             
             if (miConstancia.tBtn_tecladoTarjeta.isSelected()) {
                 miConstancia.txt_numTarjeta.setText(nTarjeta+"1");
             }
             else {
                 miConstancia.pass_cve.setText(nCVE + "1");
             }
         }
         if (ae.getSource() == miConstancia.teclado_btn2) {
             String nTarjeta = miConstancia.txt_numTarjeta.getText();
             String nCVE = miConstancia.pass_cve.getText();
             
             if (miConstancia.tBtn_tecladoTarjeta.isSelected()) {
                 miConstancia.txt_numTarjeta.setText(nTarjeta+"2");
             }
             else {
                 miConstancia.pass_cve.setText(nCVE + "2");
             }
         }
         if (ae.getSource() == miConstancia.teclado_btn3) {
             String nTarjeta = miConstancia.txt_numTarjeta.getText();
             String nCVE = miConstancia.pass_cve.getText();
             
             if (miConstancia.tBtn_tecladoTarjeta.isSelected()) {
                 miConstancia.txt_numTarjeta.setText(nTarjeta+"3");
             }
             else {
                 miConstancia.pass_cve.setText(nCVE + "3");
             }
         }
         if (ae.getSource() == miConstancia.teclado_btn4) {
             String nTarjeta = miConstancia.txt_numTarjeta.getText();
             String nCVE = miConstancia.pass_cve.getText();
             
             if (miConstancia.tBtn_tecladoTarjeta.isSelected()) {
                 miConstancia.txt_numTarjeta.setText(nTarjeta+"4");
             }
             else {
                 miConstancia.pass_cve.setText(nCVE + "4");
             }
         }
         if (ae.getSource() == miConstancia.teclado_btn5) {
             String nTarjeta = miConstancia.txt_numTarjeta.getText();
             String nCVE = miConstancia.pass_cve.getText();
             
             if (miConstancia.tBtn_tecladoTarjeta.isSelected()) {
                 miConstancia.txt_numTarjeta.setText(nTarjeta+"5");
             }
             else {
                 miConstancia.pass_cve.setText(nCVE + "5");
             }
         }
         if (ae.getSource() == miConstancia.teclado_btn6) {
             String nTarjeta = miConstancia.txt_numTarjeta.getText();
             String nCVE = miConstancia.pass_cve.getText();
             
             if (miConstancia.tBtn_tecladoTarjeta.isSelected()) {
                 miConstancia.txt_numTarjeta.setText(nTarjeta+"6");
             }
             else {
                 miConstancia.pass_cve.setText(nCVE + "6");
             }
         }
         if (ae.getSource() == miConstancia.teclado_btn7) {
             String nTarjeta = miConstancia.txt_numTarjeta.getText();
             String nCVE = miConstancia.pass_cve.getText();
             
             if (miConstancia.tBtn_tecladoTarjeta.isSelected()) {
                 miConstancia.txt_numTarjeta.setText(nTarjeta+"7");
             }
             else {
                 miConstancia.pass_cve.setText(nCVE + "7");
             }
         }
         if (ae.getSource() == miConstancia.teclado_btn8) {
             String nTarjeta = miConstancia.txt_numTarjeta.getText();
             String nCVE = miConstancia.pass_cve.getText();
             
             if (miConstancia.tBtn_tecladoTarjeta.isSelected()) {
                 miConstancia.txt_numTarjeta.setText(nTarjeta+"8");
             }
             else {
                 miConstancia.pass_cve.setText(nCVE + "8");
             }
         }
         if (ae.getSource() == miConstancia.teclado_btn9) {
             String nTarjeta = miConstancia.txt_numTarjeta.getText();
             String nCVE = miConstancia.pass_cve.getText();
             
             if (miConstancia.tBtn_tecladoTarjeta.isSelected()) {
                 miConstancia.txt_numTarjeta.setText(nTarjeta+"9");
             }
             else {
                 miConstancia.pass_cve.setText(nCVE + "9");
             }
         }
         //Acciones de limpiar campos con el botón C del teclado
         if (ae.getSource() == miConstancia.teclado_btnLimpiar) {
             if (miConstancia.tBtn_tecladoTarjeta.isSelected()) {
                 miConstancia.txt_numTarjeta.setText("");
             }
             else {
                 miConstancia.pass_cve.setText("");
             }
         }
         //Borrar último caracter de las cajas de texto y password
         if (ae.getSource() == miConstancia.teclado_btnAtras) {
             String nTarjeta = miConstancia.txt_numTarjeta.getText();
             String nCVE = miConstancia.pass_cve.getText();
             if (miConstancia.tBtn_tecladoTarjeta.isSelected()) {
                if(nTarjeta.length() != 0) {
                    nTarjeta = nTarjeta.substring(0, nTarjeta.length()-1);
                    miConstancia.txt_numTarjeta.setText(nTarjeta);
                }
                else {}
             }
             else {}
         }
         //Cerrar el teclado
         if (ae.getSource() == miConstancia.teclado_btnAceptar) {
             miConstancia.frame_servTeclado.dispose();
             miConstancia.tBtn_tecladoCVE.setSelected(false);
             miConstancia.tBtn_tecladoTarjeta.setSelected(false);
         }
         //Al dar clic en pagar
         if (ae.getSource() == miConstancia.btn_pagar) {
             if((miConstancia.rd_pagoTarjeta.isSelected())&&(miConstancia.txt_numTarjeta.getText().equals("") || miConstancia.pass_cve.getText().equals(""))) {
                JOptionPane.showMessageDialog(null, "ERROR: Favor de completar sus datos de pago");
             }
             else {
               JOptionPane.showMessageDialog(null, "Su pagao fue aceptado. Espere a que se genere su comprobante, de igual forma este se enviará a su correo institucional");
                //Se mandará a traer un documento local anexo en la carpeta documentos en el propio proyecto
               File archivo = new File("src/Documentos/CAJERO-UT-COMPROBANTE DE PAGO.pdf");
               miModelo.abreArchivo(archivo);
             }
         }
         
         //Al clic en la opción caja del menú
        if (ae.getSource() == miConstancia.jMenuItem_servCaja) {
            //Instancia de una nueva caja
            servCaja miCaja = new servCaja();
            modelo_servCaja modeloCaja = new modelo_servCaja();
            //se pasa la nueva caja coómo parametro paara el constructor en el controlador de caja
            controlador_servCaja miControladorCaja = new controlador_servCaja(miCaja, modeloCaja,miMenu, SalidaLogin);
            //Desde el controlador se hace visible la caja
            miControladorCaja.miCaja.setVisible(true);
            this.miConstancia.dispose();
        } 
        //Al clic en la opción CreditoUT del menú
        if (ae.getSource() == miConstancia.jMenuItem_servCreditoUT) {
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
            this.miConstancia.dispose();
        }
        //Al clic en la opción Loboletos del menú
        if (ae.getSource() == miConstancia.jMenuItem_servLoboletos) {
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
            this.miConstancia.dispose();
        }
        //Al clic en la opción Evaluación del menú
        if (ae.getSource() == miConstancia.jMenuItem_servEvaluacion) {
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
            this.miConstancia.dispose();
        }
        //Al clic en la opción Buzón del menú
        if (ae.getSource() == miConstancia.jMenuItem_servBuzon) {
            //Instancia de buzón
            modelo_buzon modeloBuzon = new modelo_buzon();
            ServBuzon vistaBuzon = new ServBuzon();
            //se pasa la nueva caja cómo parametro paara el constructor en el controlador de buzon
            controlador_buzon miControladorBuzon = new controlador_buzon(modeloBuzon, vistaBuzon, miMenu, SalidaLogin);
            //Paso los datos de usuario
            miControladorBuzon.flagRol = this.flagRol;
            miControladorBuzon.flagmatricula = this.flagmatricula;
            miControladorBuzon.usrActivo = this.usrActivo;
            //Desde el controlador se hace visible el buzon
            miControladorBuzon.miBuzon.setVisible(true);
            this.miConstancia.dispose();
        }
        //Si se da clic en el menu a la opción Calificaciones
        if (ae.getSource() == miConstancia.jMenuItem_consCalificaciones) {
            File archivo = new File(miModelo.abreCalif(flagmatricula));
            miModelo.abreArchivo(archivo);
        } 
        //Si se da clic en el menu a la opción Horario
        if (ae.getSource() == miConstancia.jMenuItem_consHorario) {
            miModelo.abreNavegador(miModelo.abreHorario(flagmatricula));
            //miModelo.abreNavegador("http://www.utags.edu.mx/images/Archivos/ti/horarios/sep-dic-2019/TICASI-7-E-9.pdf");
        }      
        //Si se da clic en el menu a la opción Estado de cuenta
        if (ae.getSource() == miConstancia.jMenuItem_consEdoCuenta) {
            File archivo = new File(miModelo.abreEdoCuenta(flagmatricula));
            miModelo.abreArchivo(archivo);
        } 
        //Si se da clic en el menu a la opción de ver mapa
        if (ae.getSource() == miConstancia.jMenuItem_ConsMapa) {
            //Se mandará a traer un documento local anexo en la carpeta documentos en el propio proyecto
            File archivo = new File("src/Documentos/mapaUT.jpg");
            miModelo.abreArchivo(archivo);
        }
        //Si se da clic en el menu a la opción de ver calendario
        if (ae.getSource() == miConstancia.jMenuItem_calendario) {
            //Se mandará a traer un documento local anexo en la carpeta documentos en el propio proyecto
            File archivo = new File("src/Documentos/calendario.pdf");
            miModelo.abreArchivo(archivo);
        }
        //Si se da clic en el menu a la opción becas
        if (ae.getSource() == miConstancia.jMenuItem_becas) {
            miModelo.abreNavegador("http://www.utags.edu.mx/index.php/servicios/becas");
        }
        //Al clic en la opción Constancias del menú
        if (ae.getSource() == miConstancia.jMenuItem_constancias) {
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
            this.miConstancia.dispose();
        }
        //Si se da clic en el menu a la opción correo
        if (ae.getSource() == miConstancia.jMenuItem_correo) {
            miModelo.abreNavegador("https://outlook.office.com/owa/utags.edu.mx");
        }
        //Si se da clic en el menu a la opción navegar
        if (ae.getSource() == miConstancia.jMenuItem_navega) {
            miModelo.abreNavegador("http://www.google.com.mx");
        }
         //Al clic en la opción Soporte del menú
        if (ae.getSource() == miConstancia.jMenuItem_soporte) {
            //Instancia de buzón
            modelo_soporte modeloSoporte = new modelo_soporte();
            ServSoporte vistaSoporte = new ServSoporte();
            //se pasa la nueva caja cómo parametro paara el constructor en el controlador de buzon
            controlador_soporte miControladorSoporte = new controlador_soporte(modeloSoporte, vistaSoporte, miMenu, SalidaLogin);
            //Paso los datos de usuario
            miControladorSoporte.flagRol = this.flagRol;
            miControladorSoporte.flagmatricula = this.flagmatricula;
            miControladorSoporte.usrActivo = this.usrActivo;
            miControladorSoporte.mensajeUsuarioSoporte();
            //Desde el controlador se hace visible el buzon
            miControladorSoporte.miSoporte.setVisible(true);
            this.miConstancia.dispose();
        }
    }
    
    @Override
    public void windowOpened(WindowEvent we) {
    }

    @Override
    public void windowClosing(WindowEvent we) {
       miConstancia.tBtn_tecladoTarjeta.setSelected(false);
       this.miConstancia.tBtn_tecladoCVE.setSelected(false);
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
            this.miConstancia.dispose();
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
    
    public void radioPagoValida(){
        if(miConstancia.rd_pagoCreditoUT.isSelected()) {
            miConstancia.cb_vencimientoMes.setEnabled(false);
            miConstancia.cb_vencimientoAnio.setEnabled(false);
            miConstancia.tBtn_tecladoTarjeta.setEnabled(false);
            miConstancia.tBtn_tecladoCVE.setEnabled(false);
        }
        else if (miConstancia.rd_pagoTarjeta.isSelected()) {
            miConstancia.cb_vencimientoMes.setEnabled(true);
            miConstancia.cb_vencimientoAnio.setEnabled(true);
            miConstancia.tBtn_tecladoTarjeta.setEnabled(true);
            miConstancia.tBtn_tecladoCVE.setEnabled(true);
        }
    }
}
