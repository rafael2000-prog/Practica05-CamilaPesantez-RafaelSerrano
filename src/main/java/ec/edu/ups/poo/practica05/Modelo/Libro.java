package ec.edu.ups.poo.practica05.Modelo;

import java.util.Objects;

public class Libro implements Prestable  {
	private String titulo;
	private String autor;
	private int año;
        private String disponible;
	
	public Libro() {
		
	}

    public Libro(String titulo, String autor, int año, String disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;
	this.disponible = disponible;
    }


        

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAño() {
        return año;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAño(int año) {
        this.año = año;
    }
    public String getDisponible() {
		return disponible;
	}
	public void setDisponible(String disponible) {
		this.disponible = disponible;
	}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.titulo);
        hash = 59 * hash + Objects.hashCode(this.autor);
        hash = 59 * hash + this.año;
        return hash;
    }

   
    @Override
    public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
        return false;
    }
    Libro other = (Libro) obj;
    return Objects.equals(this.titulo, other.titulo)
            && Objects.equals(this.autor, other.autor)
            && this.año == other.año;
}

    @Override
    public void prestar() {
        setDisponible("NO");
    }

    @Override
    public void devolver() {
        setDisponible("SI");
    }


  
        
}
