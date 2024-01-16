package ec.edu.ups.poo.practica05.IDAO;

import ec.edu.ups.poo.practica05.Modelo.Prestamo;
import java.util.List;

public interface PrestamoIDAO {
    List<Prestamo> list();
    Prestamo read(int  numeroPrestamo);
    void create(Prestamo prestamo);
    boolean update(int numeroPrestamo, Prestamo prestamo);
    boolean delete(int numeroPrestamo);
}

