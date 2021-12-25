/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Vista.*;
import Modelo.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author Usuario
 */
public class controlador_login implements ActionListener, WindowListener {
    Login miLogin = new Login();
    modelo_login miModeloLogin = new modelo_login();
    //Contructor que inicializa los objetos vista y modelo
    public void setMiVistaModelo(Login miLogin, modelo_login miModeloLogin) {
        this.miLogin = miLogin;
        this.miModeloLogin = miModeloLogin;
        //Hago visible el login
        miLogin.setVisible(true);
        miLogin.btn_login.addActionListener(this);
        this.miLogin.tBtn_tecladoMatricula.addActionListener(this);
        this.miLogin.tBtn_tecladoPass.addActionListener(this);
        this.miLogin.txt_loginMatricula.enable(false);
        this.miLogin.txt_loginPass.enable(false);
        this.miLogin.frame_servTeclado.addWindowListener(this);
        this.miLogin.teclado_btn0.addActionListener(this);
        this.miLogin.teclado_btn1.addActionListener(this);
        this.miLogin.teclado_btn2.addActionListener(this);
        this.miLogin.teclado_btn3.addActionListener(this);
        this.miLogin.teclado_btn4.addActionListener(this);
        this.miLogin.teclado_btn5.addActionListener(this);
        this.miLogin.teclado_btn6.addActionListener(this);
        this.miLogin.teclado_btn7.addActionListener(this);
        this.miLogin.teclado_btn8.addActionListener(this);
        this.miLogin.teclado_btn9.addActionListener(this);
        this.miLogin.teclado_btnAtras.addActionListener(this);
        this.miLogin.teclado_btnLimpiar.addActionListener(this);
        this.miLogin.teclado_btnAceptar.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e) {
        //Autentifica al usuario comparando si la información es correcta mediante la función autentifica en modelo_login
        if(e.getSource() == miLogin.btn_login) {
            if(miLogin.txt_loginMatricula.getText().equals("") || miLogin.txt_loginPass.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Favor de llenar los campos");
            }
            else {
                if(miModeloLogin.autentifica(Integer.parseInt(miLogin.txt_loginMatricula.getText()),Integer.parseInt(miLogin.txt_loginPass.getText()))) {
                    JOptionPane.showMessageDialog(null, "Hola "+miModeloLogin.usuarioActivo+", Bienvenido/a");
                    //Si la información es correcta abrirá el menú principal
                    AbrirMenu();
                }
                else {
                    JOptionPane.showMessageDialog(null, "Información incorrecta");
                }
            }
        }
        /*if(e.getSource() == miLogin.btn_login) {
            if(miModeloLogin.autentifica(miLogin.txt_loginMatricula.getText(), miLogin.txt_loginPass.getText())) {
                JOptionPane.showMessageDialog(null, "Acceso permitido");
                //Si la información es correcta abrirá el menú principal
                AbrirMenu();
            }
            else {
                JOptionPane.showMessageDialog(null, "Información incorrecta");
            }
        }*/
        //Si se cliquea el toggle button de matricula
         if (e.getSource() == miLogin.tBtn_tecladoMatricula) {
             /*ImageIcon icon = new ImageIcon("src/imagenes/cena.gif");
             JOptionPane.showMessageDialog(null, "Tecleo matricula", "Seguro", JOptionPane.PLAIN_MESSAGE,icon);*/
             //controla estados de los botones y muestra el teclado
             if (miLogin.tBtn_tecladoMatricula.isSelected()) {
                 miLogin.frame_servTeclado.setVisible(true);
                 miLogin.tBtn_tecladoPass.setSelected(false);
            } else {
                miLogin.frame_servTeclado.setVisible(false);
            }
         }
         //En caso de que se clique el toggle de password
         else if (e.getSource() == miLogin.tBtn_tecladoPass) {
             if (miLogin.tBtn_tecladoPass.isSelected()) {
                 miLogin.tBtn_tecladoPass.setSelected(false);
                miLogin.frame_servTeclado.setVisible(true);
                miLogin.teclado_btnAtras.setVisible(false);
            } else {
                miLogin.frame_servTeclado.setVisible(false);
            }
         }
         //Eventos del clic de botones del teclado controlado por toggle buttons
         if (e.getSource() == miLogin.teclado_btn0) {
             String nTarjeta = miLogin.txt_loginMatricula.getText();
             String nCVE = miLogin.txt_loginPass.getText();
             
             if (miLogin.tBtn_tecladoMatricula.isSelected()) {
                 miLogin.txt_loginMatricula.setText(nTarjeta+"0");
             }
             else {
                 miLogin.txt_loginPass.setText(nCVE + "0");
             }
         }
         if (e.getSource() == miLogin.teclado_btn1) {
             String nTarjeta = miLogin.txt_loginMatricula.getText();
             String nCVE = miLogin.txt_loginPass.getText();
             
             if (miLogin.tBtn_tecladoMatricula.isSelected()) {
                 miLogin.txt_loginMatricula.setText(nTarjeta+"1");
             }
             else {
                 miLogin.txt_loginPass.setText(nCVE + "1");
             }
         }
         if (e.getSource() == miLogin.teclado_btn2) {
             String nTarjeta = miLogin.txt_loginMatricula.getText();
             String nCVE = miLogin.txt_loginPass.getText();
             
             if (miLogin.tBtn_tecladoMatricula.isSelected()) {
                 miLogin.txt_loginMatricula.setText(nTarjeta+"2");
             }
             else {
                 miLogin.txt_loginPass.setText(nCVE + "2");
             }
         }
         if (e.getSource() == miLogin.teclado_btn3) {
             String nTarjeta = miLogin.txt_loginMatricula.getText();
             String nCVE = miLogin.txt_loginPass.getText();
             
             if (miLogin.tBtn_tecladoMatricula.isSelected()) {
                 miLogin.txt_loginMatricula.setText(nTarjeta+"3");
             }
             else {
                 miLogin.txt_loginPass.setText(nCVE + "3");
             }
         }
         if (e.getSource() == miLogin.teclado_btn4) {
             String nTarjeta = miLogin.txt_loginMatricula.getText();
             String nCVE = miLogin.txt_loginPass.getText();
             
             if (miLogin.tBtn_tecladoMatricula.isSelected()) {
                 miLogin.txt_loginMatricula.setText(nTarjeta+"4");
             }
             else {
                 miLogin.txt_loginPass.setText(nCVE + "4");
             }
         }
         if (e.getSource() == miLogin.teclado_btn5) {
             String nTarjeta = miLogin.txt_loginMatricula.getText();
             String nCVE = miLogin.txt_loginPass.getText();
             
             if (miLogin.tBtn_tecladoMatricula.isSelected()) {
                 miLogin.txt_loginMatricula.setText(nTarjeta+"5");
             }
             else {
                 miLogin.txt_loginPass.setText(nCVE + "5");
             }
         }
         if (e.getSource() == miLogin.teclado_btn6) {
             String nTarjeta = miLogin.txt_loginMatricula.getText();
             String nCVE = miLogin.txt_loginPass.getText();
             
             if (miLogin.tBtn_tecladoMatricula.isSelected()) {
                 miLogin.txt_loginMatricula.setText(nTarjeta+"6");
             }
             else {
                 miLogin.txt_loginPass.setText(nCVE + "6");
             }
         }
         if (e.getSource() == miLogin.teclado_btn7) {
             String nTarjeta = miLogin.txt_loginMatricula.getText();
             String nCVE = miLogin.txt_loginPass.getText();
             
             if (miLogin.tBtn_tecladoMatricula.isSelected()) {
                 miLogin.txt_loginMatricula.setText(nTarjeta+"7");
             }
             else {
                 miLogin.txt_loginPass.setText(nCVE + "7");
             }
         }
         if (e.getSource() == miLogin.teclado_btn8) {
             String nTarjeta = miLogin.txt_loginMatricula.getText();
             String nCVE = miLogin.txt_loginPass.getText();
             
             if (miLogin.tBtn_tecladoMatricula.isSelected()) {
                 miLogin.txt_loginMatricula.setText(nTarjeta+"8");
             }
             else {
                 miLogin.txt_loginPass.setText(nCVE + "8");
             }
         }
         if (e.getSource() == miLogin.teclado_btn9) {
             String nTarjeta = miLogin.txt_loginMatricula.getText();
             String nCVE = miLogin.txt_loginPass.getText();
             
             if (miLogin.tBtn_tecladoMatricula.isSelected()) {
                 miLogin.txt_loginMatricula.setText(nTarjeta+"9");
             }
             else {
                 miLogin.txt_loginPass.setText(nCVE + "9");
             }
         }
         //Acciones de limpiar campos con el botón C del teclado
         if (e.getSource() == miLogin.teclado_btnLimpiar) {
             if (miLogin.tBtn_tecladoMatricula.isSelected()) {
                 miLogin.txt_loginMatricula.setText("");
             }
             else {
                 miLogin.txt_loginPass.setText("");
             }
         }
         //Borrar último caracter de las cajas de texto y password
         if (e.getSource() == miLogin.teclado_btnAtras) {
             String nTarjeta = miLogin.txt_loginMatricula.getText();
             String nCVE = miLogin.txt_loginPass.getText();
             if (miLogin.tBtn_tecladoMatricula.isSelected()) {
                if(nTarjeta.length() != 0) {
                    nTarjeta = nTarjeta.substring(0, nTarjeta.length()-1);
                    miLogin.txt_loginMatricula.setText(nTarjeta);
                }
                else {}
             }
             else {}
         }
         //Cerrar el teclado
         if (e.getSource() == miLogin.teclado_btnAceptar) {
             miLogin.frame_servTeclado.dispose();
             miLogin.tBtn_tecladoMatricula.setSelected(false);
             miLogin.tBtn_tecladoPass.setSelected(false);
         }
    }
    
    //método para abrir el menú
    public void AbrirMenu(){
        //this.miLogin.dispose();
        //Instancio el modelo y el  mwnu y se lo mando cómo parametro al constructor del controlador de menu
        modelo_principalMenu modeloMenu = new modelo_principalMenu();
        principalMenu miMenu = new principalMenu();
        mainInicial miMain = new mainInicial();
        controlador_principalMenu controladorMenu = new controlador_principalMenu(modeloMenu, miMenu, miMain);
        controladorMenu.flagRol = miModeloLogin.flagRol;
        controladorMenu.flagmatricula = miModeloLogin.flagMatricula;
        controladorMenu.usrActivo = miModeloLogin.usuarioActivo;
        controladorMenu.setUsrVisible(miModeloLogin.usuarioActivo);
        if(miModeloLogin.flagRol == 1) {
            controladorMenu.miMenu.jMenuItem_servCaja.setVisible(false);
            controladorMenu.miMenu.jMenuItem_servCreditoUT.setVisible(false);
            controladorMenu.miMenu.jMenuItem_servLoboletos.setVisible(false);
            controladorMenu.miMenu.jMenuItem_servEvaluacion.setVisible(false);
            controladorMenu.miMenu.jMenuItem_consCalificaciones.setVisible(false);
            controladorMenu.miMenu.jMenuItem_consEdoCuenta.setVisible(false);
            controladorMenu.miMenu.jMenu_tramites.setVisible(false);
        }
        else {
            
        }
        //Abro el menu principal
        controladorMenu.miMenu.setVisible(true);
        //oculto el login
        this.miLogin.setVisible(false);
    }
    @Override
    public void windowOpened(WindowEvent we) {
    }

    @Override
    public void windowClosing(WindowEvent we) {
       miLogin.tBtn_tecladoMatricula.setSelected(false);
       this.miLogin.tBtn_tecladoPass.setSelected(false);
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
}
