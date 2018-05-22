/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author riche
 */
public class Conexion {
    Connection conn; //es una variable nueva que servira para la conexion con mysql//  ASIGNA UNA CONEXION 
    String respuesta; //capturar una respus¿esta
    
    
    public String Conectar()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/registros_huella","root",""); //OBTIENE DIRECION  //tres datos 1ro direccion de la base de datos
                                                                                               //2do es el usuario y 3ro si tiene contraseña
            
            return "Se conectó a la Base de Datos Home";
        }
        catch(Exception e)
        {
            
            return "Ocurrio un error al momento de conectarse: "+e;
        }
    }
    
    
    public Connection getConexion()  // retorna la variable conn que se crea al principio que contiene la direcion, usuario y contraseña
    {
        return conn; 
    }
    
}
