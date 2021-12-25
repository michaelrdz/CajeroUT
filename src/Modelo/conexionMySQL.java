/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.sql.*;
import javax.swing.JOptionPane;

/**
    *
    * @author Usuario
 */
public class conexionMySQL {
   // Conexión...
    public Connection conn;
    // Librería de MySQL, SQL SEVER, ORALCE, etc...
    public String driver = "com.mysql.jdbc.Driver";
    // Host
    public String hostname = "localhost";
    // Puerto
    public String port = "3306";
    // Nombre de la base de datos
    public String database = "javacnn";
    // Ruta de nuestra base de datos
    public String url = "jdbc:mysql://"+hostname+":"+port+"/"+database;
    //public String url = "jdbc:sqlserver://"+hostname+":"+port+"; database="+database;
    // Nombre de usuario
    public String username = "javacon";
    // Clave de usuario
    public String password = "C4jer0UT.2019";
    
    //Abrir la conexion a la BD
    public Connection conectarSQL() {        
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Conexion exitosa");
        } catch (ClassNotFoundException | SQLException exsql) {
            JOptionPane.showMessageDialog(null,"Error al conectar...\nERROR= "+exsql,"ERROR",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"ERROR= "+ex,"ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return conn;
    }
   
    //Cerrar la conexion a la BD
    public void cerrarConexion(){
        try {
            conn.close();
            System.out.println("Conexion cerrada con exito!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"No se pudo cerrar la conexión...\nERROR= "+e,"ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
  /* Connection conexion=null;
   ResultSet rs;
   Statement st=null;
    
public boolean validarUsuario(int matricula, int password) {

        try {
//Driver JDBC
            Class.forName("com.mysql.jdbc.Driver");
            //Nombre del servidor. localhost:3306 es la ruta y el puerto de la conexión MySQL
            //lavanderia es el nombre que le dimos a la base de datos
            String servidor = "jdbc:mysql://localhost:3306/cajerout";
            //El root es el nombre de usuario por default.
            String usuario = "UsrCajeroUT";
            String pass = "C4jer0UT.2019";
            //Se inicia la conexión
            conexion = DriverManager.getConnection(servidor, usuario, pass);

           String sql = "SELECT * FROM cajerout.usuarios where idusuarios='"+matricula+"'"+" and password='"+password+"';";

//nuestro evento captura el usuario y password de nuestro formulario y lo busca en la consulta sql

            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);

             
                if( rs.first() )  // si es valido el primer registro. hay una fila, entonces el usuario y su                                                //contraseña existen      
                return true;        //
            else

                return false;
        }
        catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }*/
}