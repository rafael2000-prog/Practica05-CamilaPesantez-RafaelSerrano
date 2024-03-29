/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package ec.edu.ups.poo.practica05.Vista;


import ec.edu.ups.poo.practica05.Controlador.BibliotecaControlador;
import ec.edu.ups.poo.practica05.Controlador.LibroControlador;
import ec.edu.ups.poo.practica05.Controlador.PrestamoControlador;
import ec.edu.ups.poo.practica05.Controlador.UsuarioControlador;
import ec.edu.ups.poo.practica05.DAO.BibliotecaDAO;
import ec.edu.ups.poo.practica05.DAO.LibroDAO;
import ec.edu.ups.poo.practica05.DAO.PrestamoDAO;
import ec.edu.ups.poo.practica05.DAO.UsuarioDAO;
import ec.edu.ups.poo.practica05.IDAO.BibliotecaIDAO;
import ec.edu.ups.poo.practica05.IDAO.LibroIDAO;
import ec.edu.ups.poo.practica05.IDAO.PrestamoIDAO;
import ec.edu.ups.poo.practica05.IDAO.UsuarioIDAO;
import ec.edu.ups.poo.practica05.VistaBiblioteca.VentanaBuscarBiblioteca;
import ec.edu.ups.poo.practica05.VistaBiblioteca.VentanaCrearBiblioteca;
import ec.edu.ups.poo.practica05.VistaBiblioteca.VentanaEditarBiblioteca;
import ec.edu.ups.poo.practica05.VistaBiblioteca.VentanaEliminarBiblioteca;
import ec.edu.ups.poo.practica05.VistaBiblioteca.VentanaListarBibliotecas;
import ec.edu.ups.poo.practica05.VistaLibro.VentanaBuscarLibro;
import ec.edu.ups.poo.practica05.VistaLibro.VentanaCrearLibro;
import ec.edu.ups.poo.practica05.VistaLibro.VentanaEditarLibro;
import ec.edu.ups.poo.practica05.VistaLibro.VentanaEliminarLibro;
import ec.edu.ups.poo.practica05.VistaLibro.VentanaListarLibros;
import ec.edu.ups.poo.practica05.VistaPrestamo.VentanaBuscarPrestamo;
import ec.edu.ups.poo.practica05.VistaPrestamo.VentanaCrearPrestamo;
import ec.edu.ups.poo.practica05.VistaPrestamo.VentanaEditarPrestamo;
import ec.edu.ups.poo.practica05.VistaPrestamo.VentanaEliminarPrestamo;
import ec.edu.ups.poo.practica05.VistaPrestamo.VentanaListarPrestamo;
import ec.edu.ups.poo.practica05.VistaUsuario.VentanaBuscarUsuario;
import ec.edu.ups.poo.practica05.VistaUsuario.VentanaCrearUsuario;
import ec.edu.ups.poo.practica05.VistaUsuario.VentanaEditarUsuario;
import ec.edu.ups.poo.practica05.VistaUsuario.VentanaEliminarUsuario;
import ec.edu.ups.poo.practica05.VistaUsuario.VentanaListarUsuarios;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.ImageIcon;

/**
 *
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private VentanaCrearBiblioteca ventanaCrearBiblioteca;
    private VentanaBuscarBiblioteca ventanaBuscarBiblioteca;
    private VentanaEditarBiblioteca ventanaEditarBiblioteca;
    private VentanaEliminarBiblioteca ventanaEliminarBiblioteca;
    private VentanaListarBibliotecas ventanaListarBibliotecas;
    private BibliotecaIDAO bibliotecaDAO;
    private BibliotecaControlador bibliotecaControlador;
    private VentanaCrearLibro ventanaCrearLibro;
    private VentanaBuscarLibro ventanaBuscarLibro;
    private VentanaEditarLibro ventanaEditarLibro;
    private VentanaEliminarLibro ventanaEliminarLibro;
    private VentanaListarLibros ventanaListarLibros;
    private LibroIDAO libroDAO;
    private LibroControlador libroControlador;
     private VentanaCrearUsuario crearUsuario;
    private VentanaEditarUsuario editarUsuario;
    private VentanaBuscarUsuario buscarUsuario;
    private VentanaEliminarUsuario eliminarUsuario;
    private VentanaListarUsuarios listarUsuario;
    private UsuarioIDAO usuarioDAO;
    private UsuarioControlador usuarioControlador;
    private VentanaCrearPrestamo crearPrestamo;
    private VentanaBuscarPrestamo buscarPrestamo;
    private VentanaEditarPrestamo editarPrestamo;
    private VentanaEliminarPrestamo eliminarPrestamo;
    private VentanaListarPrestamo listarPrestamo;
    private PrestamoIDAO prestamoDAO;
    private PrestamoControlador prestamoControlador;
    private Locale locale;
    
    
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        bibliotecaDAO = new BibliotecaDAO();
        bibliotecaControlador = new BibliotecaControlador(bibliotecaDAO);
        libroDAO = new LibroDAO();
        libroControlador = new LibroControlador(libroDAO);
        usuarioDAO = new UsuarioDAO();
        usuarioControlador = new UsuarioControlador(usuarioDAO);
        prestamoDAO = new PrestamoDAO();
        prestamoControlador = new PrestamoControlador(prestamoDAO, usuarioDAO, libroDAO);
        locale = Locale.getDefault();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/imagenes/biblioteca.PNG"));
        Image image = icon.getImage();
        desktopPane = new javax.swing.JDesktopPane()
        {
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        }
        ;
        menuBar = new javax.swing.JMenuBar();
        bibliotecaMenu = new javax.swing.JMenu();
        crearBibliotecaMenuItem = new javax.swing.JMenuItem();
        buscarBibliotecaMenuItem = new javax.swing.JMenuItem();
        editarBibliotecaMenuItem = new javax.swing.JMenuItem();
        eliminarBibliotecaMenuItem = new javax.swing.JMenuItem();
        listarBibliotecaMenuItem = new javax.swing.JMenuItem();
        libroMenu = new javax.swing.JMenu();
        crearLibroMenuItem = new javax.swing.JMenuItem();
        buscarLibroMenuItem = new javax.swing.JMenuItem();
        editarLibroMenuItem = new javax.swing.JMenuItem();
        eliminarLibroMenuItem = new javax.swing.JMenuItem();
        listarLibroMenuItem = new javax.swing.JMenuItem();
        clienteMenu = new javax.swing.JMenu();
        crearUsuarioMenuItem = new javax.swing.JMenuItem();
        buscarUsuarioMenuItem = new javax.swing.JMenuItem();
        editarUsuarioMenuItem = new javax.swing.JMenuItem();
        eliminarUsuarioMenuItem = new javax.swing.JMenuItem();
        listarUsuarioMenuItem = new javax.swing.JMenuItem();
        prestamoMenu = new javax.swing.JMenu();
        crearPrestamoMenuItem = new javax.swing.JMenuItem();
        buscarPrestamoMenuItem = new javax.swing.JMenuItem();
        editarPrestamoMenuItem = new javax.swing.JMenuItem();
        eliminarPrestamoMenuItem = new javax.swing.JMenuItem();
        listarPrestamoMenuItem = new javax.swing.JMenuItem();
        opcionesMenu = new javax.swing.JMenu();
        menuItemIdiomaIngles = new javax.swing.JMenuItem();
        menuItemIdiomaEspanol = new javax.swing.JMenuItem();
        menuItemIdiomaFrances = new javax.swing.JMenuItem();
        opcionSalirMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bibliotecaMenu.setMnemonic('f');
        bibliotecaMenu.setText("Biblioteca");

        crearBibliotecaMenuItem.setMnemonic('o');
        crearBibliotecaMenuItem.setText("Crear");
        crearBibliotecaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearBibliotecaMenuItemActionPerformed(evt);
            }
        });
        bibliotecaMenu.add(crearBibliotecaMenuItem);

        buscarBibliotecaMenuItem.setText("Buscar");
        buscarBibliotecaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBibliotecaMenuItemActionPerformed(evt);
            }
        });
        bibliotecaMenu.add(buscarBibliotecaMenuItem);

        editarBibliotecaMenuItem.setMnemonic('s');
        editarBibliotecaMenuItem.setText("Editar");
        editarBibliotecaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarBibliotecaMenuItemActionPerformed(evt);
            }
        });
        bibliotecaMenu.add(editarBibliotecaMenuItem);

        eliminarBibliotecaMenuItem.setMnemonic('a');
        eliminarBibliotecaMenuItem.setText("Eliminar");
        eliminarBibliotecaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarBibliotecaMenuItemActionPerformed(evt);
            }
        });
        bibliotecaMenu.add(eliminarBibliotecaMenuItem);

        listarBibliotecaMenuItem.setMnemonic('x');
        listarBibliotecaMenuItem.setText("Listar");
        listarBibliotecaMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarBibliotecaMenuItemActionPerformed(evt);
            }
        });
        bibliotecaMenu.add(listarBibliotecaMenuItem);

        menuBar.add(bibliotecaMenu);

        libroMenu.setMnemonic('f');
        libroMenu.setText("Libro");

        crearLibroMenuItem.setMnemonic('o');
        crearLibroMenuItem.setText("Crear");
        crearLibroMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearLibroMenuItemActionPerformed(evt);
            }
        });
        libroMenu.add(crearLibroMenuItem);

        buscarLibroMenuItem.setText("Buscar");
        buscarLibroMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarLibroMenuItemActionPerformed(evt);
            }
        });
        libroMenu.add(buscarLibroMenuItem);

        editarLibroMenuItem.setMnemonic('s');
        editarLibroMenuItem.setText("Editar");
        editarLibroMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarLibroMenuItemActionPerformed(evt);
            }
        });
        libroMenu.add(editarLibroMenuItem);

        eliminarLibroMenuItem.setMnemonic('a');
        eliminarLibroMenuItem.setText("Eliminar");
        eliminarLibroMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarLibroMenuItemActionPerformed(evt);
            }
        });
        libroMenu.add(eliminarLibroMenuItem);

        listarLibroMenuItem.setMnemonic('x');
        listarLibroMenuItem.setText("Listar");
        listarLibroMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarLibroMenuItemActionPerformed(evt);
            }
        });
        libroMenu.add(listarLibroMenuItem);

        menuBar.add(libroMenu);

        clienteMenu.setMnemonic('f');
        clienteMenu.setText("Cliente");

        crearUsuarioMenuItem.setMnemonic('o');
        crearUsuarioMenuItem.setText("Crear");
        crearUsuarioMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearUsuarioMenuItemActionPerformed(evt);
            }
        });
        clienteMenu.add(crearUsuarioMenuItem);

        buscarUsuarioMenuItem.setText("Buscar");
        buscarUsuarioMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarUsuarioMenuItemActionPerformed(evt);
            }
        });
        clienteMenu.add(buscarUsuarioMenuItem);

        editarUsuarioMenuItem.setMnemonic('s');
        editarUsuarioMenuItem.setText("Editar");
        editarUsuarioMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarUsuarioMenuItemActionPerformed(evt);
            }
        });
        clienteMenu.add(editarUsuarioMenuItem);

        eliminarUsuarioMenuItem.setMnemonic('a');
        eliminarUsuarioMenuItem.setText("Eliminar");
        eliminarUsuarioMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarUsuarioMenuItemActionPerformed(evt);
            }
        });
        clienteMenu.add(eliminarUsuarioMenuItem);

        listarUsuarioMenuItem.setMnemonic('x');
        listarUsuarioMenuItem.setText("Listar");
        listarUsuarioMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarUsuarioMenuItemActionPerformed(evt);
            }
        });
        clienteMenu.add(listarUsuarioMenuItem);

        menuBar.add(clienteMenu);

        prestamoMenu.setMnemonic('f');
        prestamoMenu.setText("Prestamo");

        crearPrestamoMenuItem.setMnemonic('o');
        crearPrestamoMenuItem.setText("Crear");
        crearPrestamoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearPrestamoMenuItemActionPerformed(evt);
            }
        });
        prestamoMenu.add(crearPrestamoMenuItem);

        buscarPrestamoMenuItem.setText("Buscar");
        buscarPrestamoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarPrestamoMenuItemActionPerformed(evt);
            }
        });
        prestamoMenu.add(buscarPrestamoMenuItem);

        editarPrestamoMenuItem.setMnemonic('s');
        editarPrestamoMenuItem.setText("Editar");
        editarPrestamoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarPrestamoMenuItemActionPerformed(evt);
            }
        });
        prestamoMenu.add(editarPrestamoMenuItem);

        eliminarPrestamoMenuItem.setMnemonic('a');
        eliminarPrestamoMenuItem.setText("Eliminar");
        eliminarPrestamoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPrestamoMenuItemActionPerformed(evt);
            }
        });
        prestamoMenu.add(eliminarPrestamoMenuItem);

        listarPrestamoMenuItem.setMnemonic('x');
        listarPrestamoMenuItem.setText("Listar");
        listarPrestamoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarPrestamoMenuItemActionPerformed(evt);
            }
        });
        prestamoMenu.add(listarPrestamoMenuItem);

        menuBar.add(prestamoMenu);

        opcionesMenu.setText("Opciones");

        menuItemIdiomaIngles.setText("Inglés");
        menuItemIdiomaIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemIdiomaInglesActionPerformed(evt);
            }
        });
        opcionesMenu.add(menuItemIdiomaIngles);

        menuItemIdiomaEspanol.setText("Español");
        menuItemIdiomaEspanol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemIdiomaEspanolActionPerformed(evt);
            }
        });
        opcionesMenu.add(menuItemIdiomaEspanol);

        menuItemIdiomaFrances.setText("Fránces");
        menuItemIdiomaFrances.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemIdiomaFrancesActionPerformed(evt);
            }
        });
        opcionesMenu.add(menuItemIdiomaFrances);

        opcionSalirMenuItem.setText("Salir");
        opcionSalirMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcionSalirMenuItemActionPerformed(evt);
            }
        });
        opcionesMenu.add(opcionSalirMenuItem);

        menuBar.add(opcionesMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarBibliotecaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBibliotecaMenuItemActionPerformed
        if(ventanaBuscarBiblioteca == null){
            ventanaBuscarBiblioteca = new VentanaBuscarBiblioteca(bibliotecaControlador); 
        }
        
        if(!ventanaBuscarBiblioteca.isVisible()){
            ventanaBuscarBiblioteca.setVisible(true);
            desktopPane.add(ventanaBuscarBiblioteca);
        }
        ventanaBuscarBiblioteca.cambiarIdioma(locale);
    }//GEN-LAST:event_buscarBibliotecaMenuItemActionPerformed

    private void editarBibliotecaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarBibliotecaMenuItemActionPerformed
        if(ventanaEditarBiblioteca == null){
            ventanaEditarBiblioteca = new VentanaEditarBiblioteca(bibliotecaControlador); 
        }
        
        if(!ventanaEditarBiblioteca.isVisible()){
            ventanaEditarBiblioteca.setVisible(true);
            desktopPane.add(ventanaEditarBiblioteca);
        }
          ventanaEditarBiblioteca.cambiarIdioma(locale);

    }//GEN-LAST:event_editarBibliotecaMenuItemActionPerformed

    private void eliminarBibliotecaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarBibliotecaMenuItemActionPerformed
        if(ventanaEliminarBiblioteca == null){
            ventanaEliminarBiblioteca = new VentanaEliminarBiblioteca(bibliotecaControlador); 
        }
        
        if(!ventanaEliminarBiblioteca.isVisible()){
            ventanaEliminarBiblioteca.setVisible(true);
            desktopPane.add(ventanaEliminarBiblioteca);
        }
                ventanaEliminarBiblioteca.cambiarIdioma(locale);

                
    }//GEN-LAST:event_eliminarBibliotecaMenuItemActionPerformed

    private void listarBibliotecaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarBibliotecaMenuItemActionPerformed
        if(ventanaListarBibliotecas == null){
            ventanaListarBibliotecas = new VentanaListarBibliotecas(bibliotecaControlador); 
        }
        
        if(!ventanaListarBibliotecas.isVisible()){
            ventanaListarBibliotecas.setVisible(true);
            ventanaListarBibliotecas.cargarDatos();
            desktopPane.add(ventanaListarBibliotecas);
        }
                ventanaListarBibliotecas.cambiarIdioma(locale);

    }//GEN-LAST:event_listarBibliotecaMenuItemActionPerformed

    private void menuItemIdiomaInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemIdiomaInglesActionPerformed
        locale = new Locale("en", "US");
        cambiarIdioma();                
    }//GEN-LAST:event_menuItemIdiomaInglesActionPerformed

    private void menuItemIdiomaEspanolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemIdiomaEspanolActionPerformed
        locale = new Locale("es", "EC");
        cambiarIdioma();        
    }//GEN-LAST:event_menuItemIdiomaEspanolActionPerformed

    private void menuItemIdiomaFrancesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemIdiomaFrancesActionPerformed
        locale = new Locale("fr", "FR");
        cambiarIdioma();        
    }//GEN-LAST:event_menuItemIdiomaFrancesActionPerformed

    private void opcionSalirMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcionSalirMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_opcionSalirMenuItemActionPerformed

    private void crearBibliotecaMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearBibliotecaMenuItemActionPerformed
        if(ventanaCrearBiblioteca == null){
            ventanaCrearBiblioteca = new VentanaCrearBiblioteca(bibliotecaControlador);
            ventanaCrearBiblioteca.cambiarIdioma(locale);
        }

        if(!ventanaCrearBiblioteca.isVisible()){
            ventanaCrearBiblioteca.setVisible(true);
            desktopPane.add(ventanaCrearBiblioteca);
        }
        ventanaCrearBiblioteca.cambiarIdioma(locale);
    }//GEN-LAST:event_crearBibliotecaMenuItemActionPerformed

    private void crearLibroMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearLibroMenuItemActionPerformed
        if(ventanaCrearLibro == null){
            ventanaCrearLibro = new VentanaCrearLibro(libroControlador, bibliotecaControlador, bibliotecaDAO);
            ventanaCrearLibro.cambiarIdioma(locale);
        }

        if(! ventanaCrearLibro.isVisible()){
            ventanaCrearLibro.setVisible(true);
            desktopPane.add(ventanaCrearLibro);

        }
    }//GEN-LAST:event_crearLibroMenuItemActionPerformed

    private void buscarLibroMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarLibroMenuItemActionPerformed
        if(ventanaBuscarLibro== null){
            ventanaBuscarLibro = new VentanaBuscarLibro(libroControlador); 
        }
        
        if(!ventanaBuscarLibro.isVisible()){
            ventanaBuscarLibro.setVisible(true);
            desktopPane.add(ventanaBuscarLibro);
        }
            ventanaBuscarLibro.cambiarIdioma(locale);
    }//GEN-LAST:event_buscarLibroMenuItemActionPerformed

    private void editarLibroMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarLibroMenuItemActionPerformed
        if(ventanaEditarLibro == null){
            ventanaEditarLibro = new VentanaEditarLibro(libroControlador); 
        }
        
        if(!ventanaEditarLibro.isVisible()){
            ventanaEditarLibro.setVisible(true);
            desktopPane.add(ventanaEditarLibro);
        }
                ventanaEditarLibro.cambiarIdioma(locale);

    }//GEN-LAST:event_editarLibroMenuItemActionPerformed

    private void eliminarLibroMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarLibroMenuItemActionPerformed
        if(ventanaEliminarLibro == null){
            ventanaEliminarLibro = new VentanaEliminarLibro(libroControlador); 
        }
        
        if(!ventanaEliminarLibro.isVisible()){
            ventanaEliminarLibro.setVisible(true);
            desktopPane.add(ventanaEliminarLibro);
        }
                ventanaEliminarLibro.cambiarIdioma(locale);

    }//GEN-LAST:event_eliminarLibroMenuItemActionPerformed

    private void listarLibroMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarLibroMenuItemActionPerformed
        if(ventanaListarLibros == null){
            ventanaListarLibros = new VentanaListarLibros(libroControlador); 
        }
        
        if(!ventanaListarLibros.isVisible()){
            ventanaListarLibros.setVisible(true);
            ventanaListarLibros.cargarDatos();
            desktopPane.add(ventanaListarLibros);
        }
        ventanaListarLibros.cambiarIdioma(locale);

    }//GEN-LAST:event_listarLibroMenuItemActionPerformed

    private void crearPrestamoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearPrestamoMenuItemActionPerformed
        if (crearPrestamo == null) {
            crearPrestamo = new VentanaCrearPrestamo(prestamoControlador);
        }
        if (!crearPrestamo.isVisible()) {
            crearPrestamo.setVisible(true);
            desktopPane.add(crearPrestamo);
        }
        crearPrestamo.cambiarIdioma(locale);    }//GEN-LAST:event_crearPrestamoMenuItemActionPerformed

    private void buscarPrestamoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarPrestamoMenuItemActionPerformed
     if (buscarPrestamo == null) {
            buscarPrestamo = new VentanaBuscarPrestamo(prestamoControlador);

        }
        if (!buscarPrestamo.isVisible()) {
            buscarPrestamo.setVisible(true);
            desktopPane.add(buscarPrestamo);
        }
        buscarPrestamo.cambiarIdioma(locale);
    }//GEN-LAST:event_buscarPrestamoMenuItemActionPerformed

    private void editarPrestamoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarPrestamoMenuItemActionPerformed
        if (editarPrestamo == null) {
            editarPrestamo = new VentanaEditarPrestamo(prestamoControlador);

        }
        if (!editarPrestamo.isVisible()) {
            editarPrestamo.setVisible(true);
            desktopPane.add(editarPrestamo);
        }
        editarPrestamo.cambiarIdioma(locale);    }//GEN-LAST:event_editarPrestamoMenuItemActionPerformed

    private void eliminarPrestamoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPrestamoMenuItemActionPerformed
        if (eliminarPrestamo == null) {
            eliminarPrestamo = new VentanaEliminarPrestamo(prestamoControlador);

        }
        if (!eliminarPrestamo.isVisible()) {
            eliminarPrestamo.setVisible(true);
            desktopPane.add(eliminarPrestamo);
        }
        eliminarPrestamo.cambiarIdioma(locale);    }//GEN-LAST:event_eliminarPrestamoMenuItemActionPerformed

    private void listarPrestamoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarPrestamoMenuItemActionPerformed
        if (listarPrestamo == null) {
            listarPrestamo = new VentanaListarPrestamo(prestamoControlador);

        }
        if (!listarPrestamo.isVisible()) {
            listarPrestamo.setVisible(true);
            listarPrestamo.cargarDatos();
            desktopPane.add(listarPrestamo);
        }
        listarPrestamo.cambiarIdioma(locale);    }//GEN-LAST:event_listarPrestamoMenuItemActionPerformed

    private void crearUsuarioMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearUsuarioMenuItemActionPerformed
    if (crearUsuario == null) {
            crearUsuario = new VentanaCrearUsuario(usuarioControlador);

        }
        if (!crearUsuario.isVisible()) {
            crearUsuario.setVisible(true);
            desktopPane.add(crearUsuario);
        }
        crearUsuario.cambiarIdioma(locale);
    }//GEN-LAST:event_crearUsuarioMenuItemActionPerformed

    private void buscarUsuarioMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarUsuarioMenuItemActionPerformed
        if (buscarUsuario == null) {
            buscarUsuario = new VentanaBuscarUsuario(usuarioControlador);

        }
        if (!buscarUsuario.isVisible()) {
            buscarUsuario.setVisible(true);
            desktopPane.add(buscarUsuario);
        }
        buscarUsuario.cambiarIdioma(locale);
           }//GEN-LAST:event_buscarUsuarioMenuItemActionPerformed

    private void editarUsuarioMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarUsuarioMenuItemActionPerformed
    if (listarUsuario == null) {
            listarUsuario = new VentanaListarUsuarios(usuarioControlador);

        }
        if (!listarUsuario.isVisible()) {
            listarUsuario.cargarDatos();
            listarUsuario.setVisible(true);
            desktopPane.add(listarUsuario);
        }
        listarUsuario.cambiarIdioma(locale);
    }//GEN-LAST:event_editarUsuarioMenuItemActionPerformed

    private void eliminarUsuarioMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarUsuarioMenuItemActionPerformed
    if (eliminarUsuario == null) {
            eliminarUsuario = new VentanaEliminarUsuario(usuarioControlador);

        }
        if (!eliminarUsuario.isVisible()) {
            eliminarUsuario.setVisible(true);
            desktopPane.add(eliminarUsuario);
        }
        eliminarUsuario.cambiarIdioma(locale);
    }//GEN-LAST:event_eliminarUsuarioMenuItemActionPerformed

    private void listarUsuarioMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarUsuarioMenuItemActionPerformed
        if (listarUsuario == null) {
            listarUsuario = new VentanaListarUsuarios(usuarioControlador);

        }
        if (!listarUsuario.isVisible()) {
            listarUsuario.cargarDatos();
            listarUsuario.setVisible(true);
            desktopPane.add(listarUsuario);
        }
        listarUsuario.cambiarIdioma(locale);
    }//GEN-LAST:event_listarUsuarioMenuItemActionPerformed

    public void cambiarIdioma(){
        ResourceBundle mensajes = ResourceBundle.getBundle("mensajes.mensajes", locale);
        bibliotecaMenu.setText(mensajes.getString("bibliotecaMenu"));
        clienteMenu.setText(mensajes.getString("clienteMenu"));
        prestamoMenu.setText(mensajes.getString("prestamoMenu"));
        opcionesMenu.setText(mensajes.getString("opcionesMenu"));
        libroMenu.setText(mensajes.getString("libroMenu"));
        
        crearBibliotecaMenuItem.setText(mensajes.getString("crearBibliotecaMenu"));
        buscarBibliotecaMenuItem.setText(mensajes.getString("buscarBibliotecaMenu"));
        eliminarBibliotecaMenuItem.setText(mensajes.getString("eliminarBiblioteca"));
        editarBibliotecaMenuItem.setText(mensajes.getString("editarBiblioteca"));
        listarBibliotecaMenuItem.setText(mensajes.getString("listarBiblioteca"));
        
        crearLibroMenuItem.setText(mensajes.getString("crearBibliotecaMenu"));
        buscarLibroMenuItem.setText(mensajes.getString("buscarBibliotecaMenu"));
        eliminarLibroMenuItem.setText(mensajes.getString("eliminarBiblioteca"));
        editarLibroMenuItem.setText(mensajes.getString("editarBiblioteca"));
        listarLibroMenuItem.setText(mensajes.getString("listarBiblioteca"));
        
        crearUsuarioMenuItem.setText(mensajes.getString("crearBibliotecaMenu"));
        buscarUsuarioMenuItem.setText(mensajes.getString("buscarBibliotecaMenu"));
        eliminarUsuarioMenuItem.setText(mensajes.getString("eliminarBiblioteca"));
        editarUsuarioMenuItem.setText(mensajes.getString("editarBiblioteca"));
        listarUsuarioMenuItem.setText(mensajes.getString("listarBiblioteca"));
        
        crearPrestamoMenuItem.setText(mensajes.getString("crearBibliotecaMenu"));
        buscarPrestamoMenuItem.setText(mensajes.getString("buscarBibliotecaMenu"));
        eliminarPrestamoMenuItem.setText(mensajes.getString("eliminarBiblioteca"));
        editarPrestamoMenuItem.setText(mensajes.getString("editarBiblioteca"));
        listarPrestamoMenuItem.setText(mensajes.getString("listarBiblioteca"));
        
        opcionesMenu.setText(mensajes.getString("opcionesMenu"));
        opcionSalirMenuItem.setText(mensajes.getString("opcionesMenu"));
       
        if(ventanaCrearBiblioteca != null){
            ventanaCrearBiblioteca.cambiarIdioma(locale);
        }
        if (ventanaEditarBiblioteca != null) {
            ventanaEditarBiblioteca.cambiarIdioma(locale);
        }
        if (ventanaBuscarBiblioteca != null) {
            ventanaBuscarBiblioteca.cambiarIdioma(locale);
        }
        if (ventanaEliminarBiblioteca != null) {
            ventanaEliminarBiblioteca.cambiarIdioma(locale);
        }
        if (ventanaListarBibliotecas != null) {
            ventanaListarBibliotecas.cambiarIdioma(locale);
        }
        
        if (ventanaCrearLibro != null) {
            ventanaCrearLibro.cambiarIdioma(locale);
        }
        if (ventanaEditarLibro != null) {
            ventanaEditarLibro.cambiarIdioma(locale);
        }
        if (ventanaBuscarLibro != null) {
            ventanaBuscarLibro.cambiarIdioma(locale);
        }
        if (ventanaEliminarLibro != null) {
            ventanaEliminarLibro.cambiarIdioma(locale);
        }
        if (ventanaListarLibros != null) {
            ventanaListarLibros.cambiarIdioma(locale);
        }

        if (crearUsuario != null) {
            crearUsuario.cambiarIdioma(locale);
        }
        if (editarUsuario != null) {
            editarUsuario.cambiarIdioma(locale);
        }
        if (buscarUsuario!= null) {
            buscarUsuario.cambiarIdioma(locale);
        }
        if (eliminarUsuario != null) {
            eliminarUsuario.cambiarIdioma(locale);
        }
        if (listarUsuario != null) {
            listarUsuario.cambiarIdioma(locale);
        }

        if (crearPrestamo != null) {
            crearPrestamo.cambiarIdioma(locale);
        }
        if (editarPrestamo != null) {
            editarPrestamo.cambiarIdioma(locale);
        }
        if (buscarPrestamo != null) {
            buscarPrestamo.cambiarIdioma(locale);
        }
        if (eliminarPrestamo != null) {
            eliminarPrestamo.cambiarIdioma(locale);
        }
        if (listarPrestamo != null) {
            listarPrestamo.cambiarIdioma(locale);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu bibliotecaMenu;
    private javax.swing.JMenuItem buscarBibliotecaMenuItem;
    private javax.swing.JMenuItem buscarLibroMenuItem;
    private javax.swing.JMenuItem buscarPrestamoMenuItem;
    private javax.swing.JMenuItem buscarUsuarioMenuItem;
    private javax.swing.JMenu clienteMenu;
    private javax.swing.JMenuItem crearBibliotecaMenuItem;
    private javax.swing.JMenuItem crearLibroMenuItem;
    private javax.swing.JMenuItem crearPrestamoMenuItem;
    private javax.swing.JMenuItem crearUsuarioMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem editarBibliotecaMenuItem;
    private javax.swing.JMenuItem editarLibroMenuItem;
    private javax.swing.JMenuItem editarPrestamoMenuItem;
    private javax.swing.JMenuItem editarUsuarioMenuItem;
    private javax.swing.JMenuItem eliminarBibliotecaMenuItem;
    private javax.swing.JMenuItem eliminarLibroMenuItem;
    private javax.swing.JMenuItem eliminarPrestamoMenuItem;
    private javax.swing.JMenuItem eliminarUsuarioMenuItem;
    private javax.swing.JMenu libroMenu;
    private javax.swing.JMenuItem listarBibliotecaMenuItem;
    private javax.swing.JMenuItem listarLibroMenuItem;
    private javax.swing.JMenuItem listarPrestamoMenuItem;
    private javax.swing.JMenuItem listarUsuarioMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuItemIdiomaEspanol;
    private javax.swing.JMenuItem menuItemIdiomaFrances;
    private javax.swing.JMenuItem menuItemIdiomaIngles;
    private javax.swing.JMenuItem opcionSalirMenuItem;
    private javax.swing.JMenu opcionesMenu;
    private javax.swing.JMenu prestamoMenu;
    // End of variables declaration//GEN-END:variables

}
