/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author riche
 */
public interface IrtUsuario {
    
    public String AgregarUsuario(Usuario nuevoUsuario);
    public void BuscarUsuario(String Apellidos);
    public void EditarUsuario(String Apellidos);
    public void EliminarUsuario(String Apellidos);
    
}
