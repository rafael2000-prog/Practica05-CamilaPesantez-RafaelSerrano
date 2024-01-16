package ec.edu.ups.poo.practica05.DAO;

import ec.edu.ups.poo.practica05.Modelo.Prestamo;
import java.util.ArrayList;
import java.util.List;
import ec.edu.ups.poo.practica05.IDAO.PrestamoIDAO;



public class PrestamoDAO implements PrestamoIDAO{
    private List<Prestamo> listaPrestamos;

    public PrestamoDAO() {
        listaPrestamos = new ArrayList();
    }

    @Override
    public List<Prestamo> list() {
        return listaPrestamos;
    }

    @Override
    public Prestamo read(int numeroPrestamo) {
        for (Prestamo prestamo : listaPrestamos) {
            if (String.valueOf(prestamo.getNumeroPrestamo()).equals(numeroPrestamo)) {
                return prestamo;
            }
        }
        return null;
    }

    @Override
    public void create(Prestamo prestamo) {
        listaPrestamos.add(prestamo);
    }

    @Override
    public boolean update(int numeroPrestamo, Prestamo prestamo) {
        for (int i = 0; i < listaPrestamos.size(); i++) {
            Prestamo prestamoEncontrado = listaPrestamos.get(i);
            if (String.valueOf(prestamoEncontrado.getNumeroPrestamo()).equals(numeroPrestamo)) {
                listaPrestamos.set(i, prestamo);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(int numeroPrestamo) {
        for (int i = 0; i < listaPrestamos.size(); i++) {
            Prestamo prestamo = listaPrestamos.get(i);
            if (String.valueOf(prestamo.getNumeroPrestamo()).equals(numeroPrestamo)) {
                listaPrestamos.remove(i);
                return true;
            }
        }
        return false;
    }

}
