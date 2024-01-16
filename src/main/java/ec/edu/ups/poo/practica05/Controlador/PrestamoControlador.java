/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.poo.practica05.Controlador;

import ec.edu.ups.poo.practica05.IDAO.LibroIDAO;
import ec.edu.ups.poo.practica05.IDAO.PrestamoIDAO;
import ec.edu.ups.poo.practica05.IDAO.UsuarioIDAO;
import ec.edu.ups.poo.practica05.Modelo.Libro;
import ec.edu.ups.poo.practica05.Modelo.Prestamo;
import ec.edu.ups.poo.practica05.Modelo.Usuario;
import java.util.Date;
import java.util.List;

/**
 *
 * @author MSI
 */
public class PrestamoControlador {
    private PrestamoIDAO prestamoDAO;
    private Prestamo prestamo;
    private Usuario usuario;
    private UsuarioIDAO usuarioDAO;
    private LibroIDAO libroDAO;
    private Libro libro;

    public PrestamoControlador(PrestamoIDAO prestamoDAO,UsuarioIDAO usuarioDAO, LibroIDAO libroDAO) {
        this.prestamoDAO = prestamoDAO;
        this.usuarioDAO = usuarioDAO;
        this.libroDAO=libroDAO;
    }
    public void create( int numeroPrestamo, Date fechaPrestamo, Date fechaDevolucion){
        prestamo = new Prestamo(numeroPrestamo, fechaPrestamo, fechaDevolucion);
        prestamoDAO.create(prestamo);
    }
    public void delete(int numeroPrestamo){
        prestamoDAO.delete(numeroPrestamo);
        
    }
    public List<Prestamo> list(){
        return prestamoDAO.list();
    }
    public boolean agregarCliente(String identificacion){
        usuario = usuarioDAO.read(identificacion);
        if(usuario!= null){
        prestamo.setUsuario(usuario);
        return true;
        }else{
        return false;
        }
    }
    public boolean agregarLibros(String titulo){
        libro = libroDAO.read(titulo);
        if (libro!= null){
        libro.prestar();
        prestamo.agregarLibro(libro);
        return true;
        }else{
            return false;
        }
    }
    public boolean devolverLibro(String titulo){
        libro = libroDAO.read(titulo);
        if(libro!= null){
        libro.devolver();
        return true;
        }else{
            return false;
        }
    }
    
    public Prestamo read(int numeroPrestamo){
        prestamo = prestamoDAO.read(numeroPrestamo);
        return prestamo;   
    }
    
    public void update(int numeroPrestamo, Date fechaPrestamo, Date fechaDevolucion){
        prestamo = new Prestamo(numeroPrestamo, fechaPrestamo, fechaDevolucion);
        prestamoDAO.update(numeroPrestamo, prestamo);
    }
    
}
