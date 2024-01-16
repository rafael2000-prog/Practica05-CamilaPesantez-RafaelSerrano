/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.poo.practica05.VistaPrestamo;




import ec.edu.ups.poo.practica05.Controlador.BibliotecaControlador;
import javax.swing.JOptionPane;

import ec.edu.ups.poo.practica05.Controlador.PrestamoControlador;
import ec.edu.ups.poo.practica05.Controlador.UsuarioControlador;
import ec.edu.ups.poo.practica05.Modelo.Biblioteca;
import ec.edu.ups.poo.practica05.Modelo.Libro;
import ec.edu.ups.poo.practica05.Modelo.Prestamo;
import ec.edu.ups.poo.practica05.Modelo.Usuario;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PhD. Gabriel A. León Paredes
 */
public class VentanaEditarPrestamo extends javax.swing.JInternalFrame {

    private PrestamoControlador prestamoControlador;
    private BibliotecaControlador bibliotecaControlador;
    private UsuarioControlador usuariocontrolador; 
    private DefaultTableModel tabla;
    /**
     * Creates new form VentanaCrearBiblioteca
     */
    public VentanaEditarPrestamo(PrestamoControlador prestamoControlador) {
        initComponents();
        this.prestamoControlador = prestamoControlador;
        this.usuariocontrolador = usuariocontrolador;
        this.bibliotecaControlador = bibliotecaControlador;
        bibliotecas();
        libros();
        cambiarIdioma(Locale.getDefault());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        lblLibro = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPrestamo = new javax.swing.JTable();
        lblNumPrestamo = new javax.swing.JLabel();
        txtNumPrestamo = new javax.swing.JTextField();
        lblBiblioteca = new javax.swing.JLabel();
        prestamoBox = new javax.swing.JComboBox<>();
        lblLibros = new javax.swing.JLabel();
        libroBox = new javax.swing.JComboBox<>();
        lblcedulaUsuario = new javax.swing.JLabel();
        txtCedulaUsuario = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblCorreo = new javax.swing.JLabel();
        lblDevolucion1 = new javax.swing.JLabel();
        txtDevolucion1 = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnBuscarCliente = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtDevolverLibro1 = new javax.swing.JTextField();
        btnDevolver = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Editar Libro");

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblLibro.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblLibro.setText("Libros");

        tblPrestamo.setBackground(new java.awt.Color(255, 255, 204));
        tblPrestamo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Titulo", "Autor", "Año", "Disponibilidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPrestamo);

        lblNumPrestamo.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblNumPrestamo.setText("Número Prestamo");

        txtNumPrestamo.setBackground(new java.awt.Color(255, 255, 204));
        txtNumPrestamo.setToolTipText("");

        lblBiblioteca.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblBiblioteca.setText("Biblioteca");

        prestamoBox.setBackground(new java.awt.Color(255, 255, 204));
        prestamoBox.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        prestamoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prestamoBoxActionPerformed(evt);
            }
        });

        lblLibros.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblLibros.setText("Libros");

        libroBox.setBackground(new java.awt.Color(255, 255, 204));

        lblcedulaUsuario.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblcedulaUsuario.setText("Cedula Usuario");

        txtCedulaUsuario.setEditable(false);
        txtCedulaUsuario.setBackground(new java.awt.Color(255, 255, 204));

        lblNombre.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblNombre.setText("Nombre");

        txtNombre.setEditable(false);
        txtNombre.setBackground(new java.awt.Color(255, 255, 204));

        lblCorreo.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblCorreo.setText("Correo");

        lblDevolucion1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        lblDevolucion1.setText("Fecha devolucion");

        txtDevolucion1.setEditable(false);
        txtDevolucion1.setBackground(new java.awt.Color(255, 255, 204));

        txtCorreo.setEditable(false);
        txtCorreo.setBackground(new java.awt.Color(255, 255, 204));

        btnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnBuscarCliente.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscarCliente.setText("Buscar");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtDevolverLibro1.setText("Ingrese el titulo");
        txtDevolverLibro1.setToolTipText("Ingrese el titulo de libro");
        txtDevolverLibro1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDevolverLibro1ActionPerformed(evt);
            }
        });

        btnDevolver.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDevolver.setText("Devolver");
        btnDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblNumPrestamo)
                                                .addGap(22, 22, 22)
                                                .addComponent(txtNumPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblNombre)
                                                    .addComponent(lblCorreo))
                                                .addGap(83, 83, 83)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtDevolucion1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(lblcedulaUsuario)
                                                .addGap(38, 38, 38)
                                                .addComponent(txtCedulaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lblBiblioteca)
                                            .addGap(71, 71, 71)
                                            .addComponent(prestamoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblLibros)
                                        .addGap(78, 78, 78)
                                        .addComponent(libroBox, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnBuscarCliente)
                                            .addComponent(btnActualizar)
                                            .addComponent(btnBuscar)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnAgregar)
                                        .addGap(8, 8, 8))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDevolucion1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 282, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(167, 167, 167)
                                .addComponent(txtDevolverLibro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(btnDevolver)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(247, 247, 247))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardar)
                        .addGap(113, 113, 113)
                        .addComponent(btnEliminar)
                        .addGap(328, 328, 328))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLibro)
                .addGap(453, 453, 453))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(lblLibro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnEliminar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNumPrestamo)
                            .addComponent(btnBuscar))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(lblBiblioteca))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(prestamoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnActualizar))))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLibros)
                            .addComponent(libroBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAgregar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblcedulaUsuario)
                            .addComponent(txtCedulaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarCliente))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCorreo)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDevolucion1)
                            .addComponent(txtDevolucion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addComponent(txtDevolverLibro1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDevolver)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(656, 656, 656))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       int numeroPrestamo = Integer.parseInt(txtNumPrestamo.getText());
       Prestamo prestamo = prestamoControlador.read(numeroPrestamo);
       if(prestamo!= null){
           SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
           String fehchaPrestamo= fecha.format(prestamo.getFechaPrestamo());
           String fechaDevolucion = fecha.format(prestamo.getFechaDevolucion());
           txtNumPrestamo.setText(fehchaPrestamo);
           txtDevolucion1.setText(fechaDevolucion);
           txtCedulaUsuario.setText(prestamo.getUsuario().getIdentificacion());
           txtNombre.setText(prestamo.getUsuario().getNombre());
           txtCorreo.setText(prestamo.getUsuario().getCorreo());
           cargarDatos();
     
       }else{
           JOptionPane.showMessageDialog(this, "No existe el prestamo");
       }
    
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void prestamoBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prestamoBoxActionPerformed
        // TODO add your handling code here:
        }
        public void bibliotecas(){
            prestamoBox.removeAllItems();
            List<Biblioteca> bibliotecas = bibliotecaControlador.list();
            for (Biblioteca biblioteca : bibliotecas) {
                prestamoBox.addItem(biblioteca.getNombre());
            }
        }
        public void libros(){
            libroBox.removeAllItems();
            String nombre = String.valueOf(prestamoBox.getSelectedItem());
            Biblioteca biblioteca= bibliotecaControlador.read(WIDTH);
            List<Libro> libros = biblioteca.getLibros();
            for(Libro libro : libros){
                libroBox.addItem(libro.getTitulo());
            }
    }//GEN-LAST:event_prestamoBoxActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        libros();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        if(prestamoControlador.agregarLibros(String.valueOf(libroBox.getSelectedItem()))){
            JOptionPane.showMessageDialog(this, "Se agregó correctamente!");
        }else{
            JOptionPane.showMessageDialog(this, "Se ha producido un error!");

        }

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        // TODO add your handling code here:
        String identificacion = txtCedulaUsuario.getText();
        Usuario usuario = usuariocontrolador.read(identificacion);
        if (usuario==null){
            JOptionPane.showMessageDialog(this, "El cliente no existe!");
        }else{
            txtCedulaUsuario.setText(usuario.getIdentificacion());
            txtNombre.setText(usuario.getNombre());
            txtCorreo.setText(usuario.getCorreo());

        }
    }
    private void cargarDatos() {
        Prestamo prestamo = prestamoControlador.read(Integer.parseInt(txtNumPrestamo.getText()));
        List<Libro> libros = prestamo.getLibros();
         tabla = (DefaultTableModel) tblPrestamo.getModel();
        tabla.setNumRows(0);
        for (Libro libro : libros) {
            Object[] rowData = {libro.getTitulo(), libro.getAutor(), libro.getAño(), libro.getDisponible()};
            tabla.addRow(rowData);
        }

    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int numPrestamo = Integer.parseInt(txtNumPrestamo.getText());
        Prestamo prestamo = prestamoControlador.read(numPrestamo);
        if(prestamo!= null){
            String identificacion = txtCedulaUsuario.getText();

            SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
            Date fechaDevolucion = null;
            try {
                fechaDevolucion = fecha.parse(txtDevolucion1.getText());
            } catch (ParseException ex) {
                Logger.getLogger(VentanaCrearPrestamo.class.getName()).log(Level.SEVERE, null, ex);
            }
            prestamoControlador.update(numPrestamo,prestamo.getFechaPrestamo(),fechaDevolucion);

            if(prestamoControlador.agregarCliente(identificacion)==false) {

                JOptionPane.showMessageDialog(this, "El cliente no se encuentra registrado");
            }else{
                Usuario usuario = usuariocontrolador.read(identificacion);
                prestamo.setUsuario(usuario);
                JOptionPane.showMessageDialog(this, "Se edito correctamente!");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error!");

        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        txtNumPrestamo.setText("");
        txtNumPrestamo.setEditable(true);
        txtCedulaUsuario.setText("");
        txtCedulaUsuario.setEditable(false);
        txtNombre.setText("");
        txtNombre.setEditable(false);
        txtCorreo.setText("");
        txtCorreo.setEditable(false);
        txtDevolucion1.setText("");
        txtDevolucion1.setEditable(false);
        txtDevolverLibro1.setText("");
        txtDevolverLibro1.setEditable(false);
        tabla.setNumRows(0);

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolverActionPerformed
        if(prestamoControlador.devolverLibro(txtDevolverLibro1.getText())){
         JOptionPane.showMessageDialog(this, "Se ha devuelto correctamente!");
        }else{
            JOptionPane.showMessageDialog(this, "Se ha producido un error!");    
        }
    }//GEN-LAST:event_btnDevolverActionPerformed

    private void txtDevolverLibro1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDevolverLibro1ActionPerformed
       prestamoControlador.agregarLibros(String.valueOf(libroBox.getSelectedItem()));
    }//GEN-LAST:event_txtDevolverLibro1ActionPerformed

    public void cambiarIdioma(Locale locale) {
        ResourceBundle mensajes = ResourceBundle.getBundle("mensajes.mensajes", locale);
        String titulo = mensajes.getString("lblTitulo");
        String autor = mensajes.getString("lblAutor");
        String año = mensajes.getString("lblAño");
        String disponible = mensajes.getString("tablaDisponible");               
        DefaultTableModel tabla = (DefaultTableModel) tblPrestamo.getModel();
        tabla.setColumnIdentifiers(new String [] {titulo, autor,año,disponible});
            this.setTitle(mensajes.getString("EditarPrestamo"));
        lblNumPrestamo.setText(mensajes.getString("lblNumPrestamo"));
        lblcedulaUsuario.setText(mensajes.getString("lblcedulaUsuario"));
        lblNombre.setText(mensajes.getString("lblNombre"));
        lblCorreo.setText(mensajes.getString("lblCorreo"));
        lblBiblioteca.setText(mensajes.getString("bibliotecaMenu"));
        lblNombre.setText(mensajes.getString("lblNombre"));
        lblLibro.setText(mensajes.getString("libroMenu"));
        btnBuscar.setText(mensajes.getString("btnBuscar"));
        btnDevolver.setText(mensajes.getString("btnDevolver"));
        lblLibros.setText(mensajes.getString("libroMenu"));
        btnGuardar.setText(mensajes.getString("btnGuardar"));
        btnEliminar.setText(mensajes.getString("btnEliminar"));
        btnActualizar.setText(mensajes.getString("btnActualizar"));
        btnBuscarCliente.setText(mensajes.getString("btnBuscar"));      
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnDevolver;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBiblioteca;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDevolucion1;
    private javax.swing.JLabel lblLibro;
    private javax.swing.JLabel lblLibros;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumPrestamo;
    private javax.swing.JLabel lblcedulaUsuario;
    private javax.swing.JComboBox<String> libroBox;
    private javax.swing.JComboBox<String> prestamoBox;
    private javax.swing.JTable tblPrestamo;
    private javax.swing.JTextField txtCedulaUsuario;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDevolucion1;
    private javax.swing.JTextField txtDevolverLibro1;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumPrestamo;
    // End of variables declaration//GEN-END:variables
}