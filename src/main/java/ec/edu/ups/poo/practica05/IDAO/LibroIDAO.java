package ec.edu.ups.poo.practica05.IDAO;

import ec.edu.ups.poo.practica05.Modelo.Libro;
import java.util.List;


public interface LibroIDAO {
    
    List<Libro> list();
    Libro read(String titulo);
    void create(Libro libro);
    boolean update(String titulo, Libro libro);
    boolean delete(String titulo);


}

