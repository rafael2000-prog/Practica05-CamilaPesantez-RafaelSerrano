/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ups.poo.practica05.IDAO;

import ec.edu.ups.poo.practica05.Modelo.Biblioteca;
import java.util.List;

/**
 *
 * @author MSI
 */
public interface BibliotecaIDAO {
    void create(Biblioteca biblioteca);
    Biblioteca read(int codigo);
    void update(int codigo, Biblioteca bilioteca);
    void delete(int codigo);
    List<Biblioteca> list();
}
