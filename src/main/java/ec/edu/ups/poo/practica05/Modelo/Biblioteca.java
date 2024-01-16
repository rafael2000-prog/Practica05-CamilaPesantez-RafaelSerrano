/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.poo.practica05.Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MSI
 */
public class Biblioteca {
    private int codigo;
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Libro> libros;

    public Biblioteca() {
	this.libros = new ArrayList<>();
	}
    public Biblioteca(int codigo, String nombre, String direccion, String telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
            this.libros = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void agregarLibros(Libro libro){
        libros.add(libro);
                
    }
    public List<Libro> getLibros() {
        return libros;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + this.codigo;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Biblioteca other = (Biblioteca) obj;
        return this.codigo == other.codigo;
    }

    
}
