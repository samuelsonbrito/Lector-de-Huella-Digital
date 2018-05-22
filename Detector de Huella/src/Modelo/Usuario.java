/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Controlador.Conexion;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author riche
 */
public class Usuario implements IrtUsuario{
    
String Apellidos;
String Nombre;
String Direccion;
String Telefono;
String huella; //estara pendiente, ya que no se sabe como se guardara la huella

public Usuario(String Apellidos,String Nombre, String Direccion,String Telefono)
{
    this.Apellidos=Apellidos;
    this.Nombre=Nombre;
    this.Direccion=Direccion;
    this.Telefono=Direccion;
    
}

public String AgregarUsuario(Usuario nuevoUsuario) 
{        
    Conexion nconexion = new Conexion();  //objeto de la clase conexion
    Connection conex; 
        
    try
    {
        nconexion.Conectar(); // ejecuta el metodo conectar de la clase conexion el que contiene la direccion de la base de datos 
        conex = nconexion.getConexion();  //aca se retorna la conexion que se obtuvo
        Statement comando = conex.createStatement(); //comando para poder ejecutar
            
        //EJECUTAR LA CONSULTA DE INSERCION
        //update actualizar 
        comando.executeUpdate("insert into usuario() values('0','"+nuevoUsuario.getNombre()+"','"+nuevoUsuario.getApellidos()+"','"+nuevoUsuario.getDireccion()+"','"+nuevoUsuario.getTelefono()+"')");
    }
        
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null, "Dio un error al insertar registro"+e);
            
    }
        
        return "Usuario Agregado Correctamente";
        //CONECTAR A LA BASE DE 
      }

    

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getHuella() {
        return huella;
    }

    public void setHuella(String huella) {
        this.huella = huella;
    }

    
    public void BuscarUsuario(String Apellidos) {
    
    }

  
    public void EditarUsuario(String Apellidos) {
  
    }

  
    public void EliminarUsuario(String Apellidos) {
  
    }
    
}





    

