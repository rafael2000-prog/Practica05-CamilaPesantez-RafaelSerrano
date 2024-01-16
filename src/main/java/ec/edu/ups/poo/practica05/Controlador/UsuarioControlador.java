/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.poo.practica05.Controlador;


import ec.edu.ups.poo.practica05.IDAO.UsuarioIDAO;
import ec.edu.ups.poo.practica05.Modelo.Usuario;
import java.util.List;

/**
 *
 * @author MSI
 */
public class UsuarioControlador {
     private UsuarioIDAO usuarioDAO;
    private Usuario usuario;

    public UsuarioControlador(UsuarioIDAO UsuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }
    public void create(String nombre, String identificacion, String correo){
        usuario = new Usuario(nombre, identificacion, correo);
        usuarioDAO.create(usuario);
    }
    public Usuario read(String identificacion){
        usuario = usuarioDAO.read(identificacion);
        return usuario;
    }
    public void update(String nombre, String identificacion, String correo){
        usuario = new Usuario(nombre, identificacion, correo);
        usuarioDAO.update(identificacion, usuario);      
    }
    public void delete(String identificacion){
        usuarioDAO.delete(identificacion);
  
    }
    public List<Usuario> list(){
        return usuarioDAO.list();
    }
   
}
