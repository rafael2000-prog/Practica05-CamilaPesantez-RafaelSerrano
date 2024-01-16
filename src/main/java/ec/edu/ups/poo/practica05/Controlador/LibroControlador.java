/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.poo.practica05.Controlador;

import ec.edu.ups.poo.practica05.IDAO.LibroIDAO;
import ec.edu.ups.poo.practica05.Modelo.Libro;
import java.util.List;

/**
 *
 * @author MSI
 */
public class LibroControlador {
    private LibroIDAO libroDAO;
    private Libro libro;

    public LibroControlador(LibroIDAO libroDAO) {
        this.libroDAO = libroDAO;
    }
    
    public void create(String titulo, String autor, int año, String disponible){
        libro = new Libro (titulo,autor,año,disponible);
        libroDAO.create(libro);
    }
    public Libro read(String titulo){
        libro = libroDAO.read(titulo);
        return libro;
    }
    public void  update(String titulo, String autor, int año,String disponible){
        libro = new  Libro(titulo, autor, año, disponible);
        
        libroDAO.update(titulo, libro);
    }
    public void delete (String titulo){
        libroDAO.delete(titulo);
    }
    public List<Libro> list(){
        return libroDAO.list();
          
    }
 

}
