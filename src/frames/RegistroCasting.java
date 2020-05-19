/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class RegistroCasting extends javax.swing.JFrame {

    /**
     * Creates new form RegistroCasting
     */
    public RegistroCasting() {
        initComponents();
        this.getContentPane().setBackground(Color.DARK_GRAY);
        ventanaEliminar.setSize(500,200);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ventanaEliminar = new javax.swing.JFrame();
        etiquetaFecha = new javax.swing.JLabel();
        botonAceptarEliminar = new javax.swing.JButton();
        botonCancelarEliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        botonRegistrar = new javax.swing.JButton();
        botonRegresar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonAgregar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaFases = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        textoCoste = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textoDescripcion = new javax.swing.JTextArea();
        labelDescripcion = new javax.swing.JLabel();
        textoNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        boxAgente = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        boxCliente = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        mbClientes = new javax.swing.JMenuBar();
        jmMenu1 = new javax.swing.JMenu();
        jmPrincipal = new javax.swing.JMenuItem();
        jmMenuCasting = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmSalir = new javax.swing.JMenuItem();

        etiquetaFecha.setText("Esta seguro que deseas eliminar la fecha xx/xx/xxxx");

        botonAceptarEliminar.setText("Aceptar");
        botonAceptarEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarEliminarActionPerformed(evt);
            }
        });

        botonCancelarEliminar.setText("Cancelar");
        botonCancelarEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ventanaEliminarLayout = new javax.swing.GroupLayout(ventanaEliminar.getContentPane());
        ventanaEliminar.getContentPane().setLayout(ventanaEliminarLayout);
        ventanaEliminarLayout.setHorizontalGroup(
            ventanaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaEliminarLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(ventanaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiquetaFecha)
                    .addGroup(ventanaEliminarLayout.createSequentialGroup()
                        .addComponent(botonAceptarEliminar)
                        .addGap(92, 92, 92)
                        .addComponent(botonCancelarEliminar)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        ventanaEliminarLayout.setVerticalGroup(
            ventanaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ventanaEliminarLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(etiquetaFecha)
                .addGap(32, 32, 32)
                .addGroup(ventanaEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAceptarEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCancelarEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar Casting");

        jPanel2.setBackground(new java.awt.Color(187, 209, 234));

        botonRegistrar.setBackground(new java.awt.Color(0, 0, 0));
        botonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        botonRegistrar.setText("Registrar");
        botonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarActionPerformed(evt);
            }
        });

        botonRegresar.setBackground(new java.awt.Color(0, 0, 0));
        botonRegresar.setForeground(new java.awt.Color(255, 255, 255));
        botonRegresar.setText("Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });

        botonEliminar.setBackground(new java.awt.Color(0, 0, 0));
        botonEliminar.setForeground(new java.awt.Color(255, 255, 255));
        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonAgregar.setBackground(new java.awt.Color(0, 0, 0));
        botonAgregar.setForeground(new java.awt.Color(255, 255, 255));
        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        listaFases.setModel(new DefaultListModel<>());
        listaFases.setToolTipText("");
        jScrollPane2.setViewportView(listaFases);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fases");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Coste");

        textoDescripcion.setColumns(20);
        textoDescripcion.setRows(5);
        jScrollPane1.setViewportView(textoDescripcion);

        labelDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        labelDescripcion.setText("Descripción");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre");

        boxAgente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Agente");

        boxCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cliente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 408, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(labelDescripcion)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6))
                            .addGap(25, 25, 25)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(boxAgente, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textoNombre)
                                        .addComponent(jScrollPane1)
                                        .addComponent(boxCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textoCoste))
                                    .addGap(14, 14, 14))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(botonAgregar)
                                        .addComponent(botonEliminar)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(botonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(55, 55, 55)))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 489, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(boxCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(boxAgente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(112, 112, 112)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(labelDescripcion)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textoCoste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addComponent(jLabel6))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(botonAgregar)
                                    .addGap(18, 18, 18)
                                    .addComponent(botonEliminar))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(28, 28, 28)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jmMenu1.setText("Menú");

        jmPrincipal.setText("Principal");
        jmPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPrincipalActionPerformed(evt);
            }
        });
        jmMenu1.add(jmPrincipal);

        jmMenuCasting.setText("Menú Casting");
        jmMenuCasting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmMenuCastingActionPerformed(evt);
            }
        });
        jmMenu1.add(jmMenuCasting);
        jmMenu1.add(jSeparator1);

        jmSalir.setText("Salir");
        jmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmSalirActionPerformed(evt);
            }
        });
        jmMenu1.add(jmSalir);

        mbClientes.add(jmMenu1);

        setJMenuBar(mbClientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        String fecha=JOptionPane.showInputDialog(this, "Ingrese una fecha");
        if(!this.validarFecha(fecha))
        {
            JOptionPane.showMessageDialog(this, "Fecha no valida");
        }
        else
        {
            DefaultListModel model = (DefaultListModel) listaFases.getModel();
            model.addElement(fecha);
            listaFases.setModel(model);
        }
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
       MenuCasting casting = new MenuCasting();
       casting.show();
       this.dispose();
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void botonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarActionPerformed
       if(textoNombre.getText().equals("") || textoCoste.getText().equals("") || textoDescripcion.getText().equals(""))
       {
           JOptionPane.showMessageDialog(this, "Llene todos los campos");
       }
       else if(!this.validarTexto(textoNombre.getText()))
       {
           JOptionPane.showMessageDialog(this, "Ingrese un nombre valido");
       }
       else if(!this.validarCoste(textoCoste.getText()))
       {
           JOptionPane.showMessageDialog(this, "Ingrese un coste valido");
       }
       else if(listaFases.countComponents()<=2)
       {
           JOptionPane.showMessageDialog(this, "Se necesitan mínimo dos fases");
       }
    }//GEN-LAST:event_botonRegistrarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        if(listaFases.getSelectedValue()==null)
        {
            JOptionPane.showMessageDialog(this, "Selecciona una fecha");
        }
        else
        {
            etiquetaFecha.setText("¿Estas seguro que deseas eliminar "+listaFases.getSelectedValue()+"?");
            ventanaEliminar.show();
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonAceptarEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarEliminarActionPerformed
        int index=listaFases.getSelectedIndex();
        System.out.println(index);
        DefaultListModel modelo = (DefaultListModel) listaFases.getModel();
        modelo.remove(index);
        listaFases.setModel(modelo);
        ventanaEliminar.hide();
    }//GEN-LAST:event_botonAceptarEliminarActionPerformed

    private void botonCancelarEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarEliminarActionPerformed
        ventanaEliminar.hide();
    }//GEN-LAST:event_botonCancelarEliminarActionPerformed

    private void jmPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPrincipalActionPerformed
        this.setVisible(false);
        Principal principal = new Principal();
        principal.setVisible(true);
    }//GEN-LAST:event_jmPrincipalActionPerformed

    private void jmMenuCastingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmMenuCastingActionPerformed
        this.setVisible(false);
        MenuCasting mCasting = new MenuCasting();
        mCasting.setVisible(true);
    }//GEN-LAST:event_jmMenuCastingActionPerformed

    private void jmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmSalirActionPerformed

   
    
    private boolean validarTexto(String texto)
    {
        Pattern p = Pattern.compile("[a-zA-Z]+");
        Matcher validacion = p.matcher(texto);

        return validacion.matches();
    }
    
    private boolean validarCoste(String texto)
    {
        Pattern p = Pattern.compile("[0-9,]+");
        Matcher validacion = p.matcher(texto);

        return validacion.matches();
    }
    
    private boolean validarFecha(String fecha)
    {
        Pattern p = Pattern.compile("[0-9/]+");
        Matcher validacion = p.matcher(fecha);

        if(!validacion.matches())
        {
            return false;
        }
        else if(fecha.length()!=10)
        {
            return false;
        }
        else if(fecha.charAt(2)!='/' || fecha.charAt(5)!='/')
        {
            return false;
        }
        
        Pattern p2 = Pattern.compile("[0-9]*");
        Matcher val1 = p.matcher(fecha.substring(0, 1));
        Matcher val2 = p.matcher(fecha.substring(3, 4));
        Matcher val3 = p.matcher(fecha.substring(6,9));
        
        if(!val1.matches() || !val2.matches() || !val3.matches())
        {
            return false;
        }
        
        
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAceptarEliminar;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonCancelarEliminar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JComboBox<String> boxAgente;
    private javax.swing.JComboBox<String> boxCliente;
    private javax.swing.JLabel etiquetaFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu jmMenu1;
    private javax.swing.JMenuItem jmMenuCasting;
    private javax.swing.JMenuItem jmPrincipal;
    private javax.swing.JMenuItem jmSalir;
    private javax.swing.JLabel labelDescripcion;
    private javax.swing.JList<String> listaFases;
    private javax.swing.JMenuBar mbClientes;
    private javax.swing.JTextField textoCoste;
    private javax.swing.JTextArea textoDescripcion;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JFrame ventanaEliminar;
    // End of variables declaration//GEN-END:variables
}
