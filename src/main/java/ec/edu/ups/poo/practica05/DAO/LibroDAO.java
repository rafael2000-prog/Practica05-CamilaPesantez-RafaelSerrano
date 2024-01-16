package ec.edu.ups.poo.practica05.DAO;

import ec.edu.ups.poo.practica05.Modelo.Libro;
import java.util.ArrayList;
import java.util.List;
import ec.edu.ups.poo.practica05.IDAO.LibroIDAO;

public class LibroDAO implements LibroIDAO{
	
	 private List<Libro> listaLibros;

	    public LibroDAO() {
	        listaLibros = new ArrayList();
	    }

	    @Override
	    public List<Libro> list() {
	        return listaLibros;
	    }
            @Override
	    public Libro read(String titulo) {
	        for (Libro libro : listaLibros) {
	            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
	                return libro;
	            }
	        }
	        return null;
	    }

	    @Override
	    public void create(Libro libro) {
	        listaLibros.add(libro);
	    }

           

	    @Override
	    public boolean update(String titulo, Libro libro) {
	        for (int i = 0; i < listaLibros.size(); i++) {
	            Libro libroEncontrado = listaLibros.get(i);
	            if (libroEncontrado.getTitulo().equalsIgnoreCase(titulo)) {
	                listaLibros.set(i, libro);
	                return true;
	            }
	        }
	        return false;
	    }
            
            @Override
	    public boolean delete(String titulo) {
	        for (int i = 0; i < listaLibros.size(); i++) {
	            Libro libroEncontrado = listaLibros.get(i);
	            if (libroEncontrado.getTitulo().equalsIgnoreCase(titulo)) {
	                listaLibros.remove(i);
	                return true;
	            }
	        }
	        return false;
	    }

  


}
