/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.poo.practica05.Controlador;

import ec.edu.ups.poo.practica05.IDAO.BibliotecaIDAO;
import ec.edu.ups.poo.practica05.Modelo.Biblioteca;
import java.util.List;

/**
 *
 * @author MSI
 */
public class BibliotecaControlador {
    private BibliotecaIDAO bibliotecaDAO;
    private Biblioteca biblioteca;

    public BibliotecaControlador(BibliotecaIDAO bibliotecaDAO) {
        this.bibliotecaDAO = bibliotecaDAO;
        this.biblioteca = biblioteca;
    }
    
    public void create(int codigo, String nombre,String direccion,String telefono){
        biblioteca = new Biblioteca (codigo,nombre,direccion,telefono);
        bibliotecaDAO.create(biblioteca);
    }
    public Biblioteca read(int codigo){
        biblioteca = bibliotecaDAO.read(codigo);
        return biblioteca;
    }
    public void  update(int codigo, String nombre,String direccion,String telefono){
        biblioteca = bibliotecaDAO.read(codigo);
        biblioteca.setNombre(nombre);
        biblioteca.setDireccion(direccion);
        biblioteca.setTelefono(telefono);
        bibliotecaDAO.update(codigo, biblioteca);
    }
    public void delete (int codigo){
        biblioteca = bibliotecaDAO.read(codigo);
        bibliotecaDAO.delete(codigo);
    }
    public List<Biblioteca> list(){
        return bibliotecaDAO.list();
          
    }
 

}
