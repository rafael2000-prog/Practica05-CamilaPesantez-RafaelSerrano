/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.poo.practica05.DAO;

import ec.edu.ups.poo.practica05.IDAO.BibliotecaIDAO;
import ec.edu.ups.poo.practica05.Modelo.Biblioteca;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MSI
 */
public class BibliotecaDAO implements BibliotecaIDAO {
        private List<Biblioteca> bibliotecas;
     
     public BibliotecaDAO (){
         bibliotecas = new ArrayList<>();
     }
    @Override
    public void create(Biblioteca biblioteca) {
        bibliotecas.add(biblioteca);
    }

    @Override
    public Biblioteca read(int codigo) {
        for (Biblioteca biblioteca : bibliotecas){
            if (biblioteca.getCodigo() == codigo){
                return biblioteca;
            }
        }
        return null;
    }

    @Override
    public void update(int codigo, Biblioteca biblioteca) {
        for(int i = 0; 1< bibliotecas.size(); i++){
            Biblioteca bibliotecaBuscada = bibliotecas.get(i);
            if (bibliotecaBuscada.getCodigo() == codigo);
                bibliotecas.set(i,biblioteca);
                break;
        }
    }

    @Override
    public List<Biblioteca> list() {
        return bibliotecas;
    }

    @Override
    public void delete(int codigo) {
        for(int i = 0; 1< bibliotecas.size(); i++){
            Biblioteca bibliotecaBuscada = bibliotecas.get(i);
            if (bibliotecaBuscada.getCodigo() == codigo);
                bibliotecas.remove(i);
                break;
        }
    }

    
    
}
