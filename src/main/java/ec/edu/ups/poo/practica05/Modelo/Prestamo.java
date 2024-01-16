package ec.edu.ups.poo.practica05.Modelo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Prestamo {
	
    private int numeroPrestamo;
    private List<Libro> listaLibro;
    private Usuario usuario;
    private Date fechaPrestamo;
    private Date fechaDevolucion;

     public Prestamo() {
        listaLibro = new ArrayList<>();
    }

    public Prestamo(int numeroPrestamo, Usuario usuario, Date fechaPrestamo, Date fechaDevolucion) {
        this.numeroPrestamo = numeroPrestamo;
        listaLibro = new ArrayList<>();
        this.usuario = usuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }
     
    public Prestamo(int numeroPrestamo,Date fechaPrestamo, Date fechaDevolucion) {
        listaLibro = new ArrayList<>();
        this.numeroPrestamo = numeroPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
    }
    

    public int getNumeroPrestamo() {
        return numeroPrestamo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
     public void agregarLibro(Libro libro) {
        listaLibro.add(libro);

    }

    public List<Libro> getLibros() {
        return listaLibro;
    }

    public int calcularDiasPrestamo(Date fechaPrestamo, Date fechaDevolucion) {
        int dias = (int) ((fechaDevolucion.getTime() - fechaPrestamo.getTime()) / (24 * 60 * 60 * 1000));

        return dias;
    }

    public void esPrestamoVigente(boolean estado) {
        if (estado == true) {
            System.out.println("No existe un prestamo vigente, puede continuar.\n");

        } else {
            System.out.println("El libro se encuentra en un prestamo vigente!");

        }
    }

   

}
