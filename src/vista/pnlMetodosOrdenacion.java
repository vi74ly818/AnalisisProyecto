/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Ordenamientos.Consultas;
import Ordenamientos.MetodosNumericos;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import modelo.Cancion;

/**
 *
 * @author Pepe
 */
public class pnlMetodosOrdenacion extends javax.swing.JPanel {

    /**
     * Creates new form pnlMetodosOrdenacion
     */
    DefaultListModel tabla;
    DefaultListModel tablaOrden;
    private List<Cancion> cancionArrayList, cancionOrdenada;
    MetodosNumericos metodoNumerico;
    Cancion cancion;
    Consultas consulta;
    private int numerico;

    public pnlMetodosOrdenacion() {
        initComponents();
        consulta = new Consultas();
        tabla = new DefaultListModel();
        tablaOrden = new DefaultListModel();
        metodoNumerico = new MetodosNumericos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCBTipoDatoOrdenar = new javax.swing.JComboBox<>();
        jCBTipoOrdenamiento = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jCBCantidadElementos = new javax.swing.JComboBox<>();
        btnCargarDatos = new javax.swing.JButton();
        btnOrdenarDatos = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblTiempo = new javax.swing.JLabel();
        lblCantidadElementos = new javax.swing.JLabel();
        lblTipoDato = new javax.swing.JLabel();
        lblTipoOrdenamiento = new javax.swing.JLabel();
        btnNuevaOrdenacion = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jLDatosOriginales = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jLDatosOrdenados = new javax.swing.JList<>();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Ingresar Parametros"));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Parametros de ordenacion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14))); // NOI18N

        jLabel1.setText("Tipo de Ordenamiento :");

        jLabel2.setText("Tipo de dato a ordenar :");

        jCBTipoDatoOrdenar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione opción", "Numerico", "Cadena", "Fecha" }));

        jCBTipoOrdenamiento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione opción", "Burbuja", "Burbuja bidireccional", "Mezcla", "Selección", "Peine", "Shell", "Rápido" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCBTipoDatoOrdenar, 0, 171, Short.MAX_VALUE)
                    .addComponent(jCBTipoOrdenamiento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCBTipoOrdenamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCBTipoDatoOrdenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Seleccion de datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 14))); // NOI18N

        jLabel3.setText("Cantidad de elementos :");

        jCBCantidadElementos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione opción", "10", "100", "1000", "10000", "100000", "500000", "1000000" }));

        btnCargarDatos.setBackground(new java.awt.Color(51, 51, 255));
        btnCargarDatos.setForeground(new java.awt.Color(255, 255, 255));
        btnCargarDatos.setText("CARGAR DATOS");
        btnCargarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCargarDatos)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCBCantidadElementos, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jCBCantidadElementos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCargarDatos)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btnOrdenarDatos.setBackground(new java.awt.Color(255, 0, 0));
        btnOrdenarDatos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnOrdenarDatos.setForeground(new java.awt.Color(255, 255, 255));
        btnOrdenarDatos.setText("ORDENAR DATOS");
        btnOrdenarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdenarDatosActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Resultados"));

        jLabel7.setText("Tipo de ordenamiento :");

        jLabel8.setText("Tipo de dato a ordenar :");

        jLabel9.setText("Cantidad de elementos :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setText("TIEMPO DE ORDENACION :");

        lblTiempo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTiempo.setText("jLabel13");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTiempo)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblCantidadElementos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                        .addComponent(lblTipoDato, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTipoOrdenamiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTipoOrdenamiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTipoDato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCantidadElementos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblTiempo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnNuevaOrdenacion.setText("Nueva Ordenacion");

        btnCancelar.setText("Cancelar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnNuevaOrdenacion, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(btnOrdenarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevaOrdenacion, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOrdenarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setText("DATOS ORIGINALES");

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setText("DATOS ORDENADOS");

        jScrollPane4.setViewportView(jLDatosOriginales);

        jScrollPane3.setViewportView(jLDatosOrdenados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarDatosActionPerformed
        /**
         * Me carga los registros de la base de datos dependiendo de la
         */
        try {
            if (jCBCantidadElementos.getSelectedIndex() == 1 || jCBCantidadElementos.getSelectedIndex() == 2
                    || jCBCantidadElementos.getSelectedIndex() == 3 || jCBCantidadElementos.getSelectedIndex() == 4
                    || jCBCantidadElementos.getSelectedIndex() == 5 || jCBCantidadElementos.getSelectedIndex() == 6
                    || jCBCantidadElementos.getSelectedIndex() == 7) {
                llenarLista();
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Inicio.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnCargarDatosActionPerformed

    private void btnOrdenarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdenarDatosActionPerformed
        if (jCBTipoOrdenamiento.getSelectedIndex() != 0) {
            if (jCBTipoOrdenamiento.getSelectedIndex() == 1) {
                if (jCBTipoDatoOrdenar.getSelectedIndex() == 1) {
                    OrdenarNumericos(numerico, jCBTipoOrdenamiento.getSelectedItem().toString());
                }
            }
        }

    }//GEN-LAST:event_btnOrdenarDatosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCargarDatos;
    private javax.swing.JButton btnNuevaOrdenacion;
    private javax.swing.JButton btnOrdenarDatos;
    private javax.swing.JComboBox<String> jCBCantidadElementos;
    private javax.swing.JComboBox<String> jCBTipoDatoOrdenar;
    private javax.swing.JComboBox<String> jCBTipoOrdenamiento;
    private javax.swing.JList<String> jLDatosOrdenados;
    private javax.swing.JList<String> jLDatosOriginales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCantidadElementos;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JLabel lblTipoDato;
    private javax.swing.JLabel lblTipoOrdenamiento;
    // End of variables declaration//GEN-END:variables
 public void OrdenarNumericos(int cantidad, String metodo) {
        if (jCBTipoOrdenamiento.getSelectedIndex() == 1) {
            if (cancionArrayList.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No hay datos para organizar");
            } else {

                cancionOrdenada = new ArrayList<Cancion>();
                for (int i = 0; i < cancionArrayList.size(); i++) {
                    cancionOrdenada.add(cancionArrayList.get(i));
                }

                switch (metodo) {

                    case "Burbuja":
                        double inicioTiempo = System.nanoTime();
                        metodoNumerico.burbujaNumerica(cancionOrdenada);
                        double tiempoFin = System.nanoTime();
                        double totalTime = tiempoFin - inicioTiempo;
                        tablaOrden = new DefaultListModel();
                        for (int i = 0; i < cancionOrdenada.size(); i++) {
                            tablaOrden.addElement(cancionOrdenada.get(i).getDuracion());

                        }
                        jLDatosOrdenados.setModel(tablaOrden);
                        consulta.insertarTiempos(jCBTipoDatoOrdenar.getSelectedItem().toString(),
                                jCBTipoOrdenamiento.getSelectedItem().toString(),
                                jCBCantidadElementos.getSelectedIndex(),
                                totalTime);
                        System.out.println("Se registro");
                        break;

                        case "Burbuja bidireccional":
                        inicioTiempo = System.nanoTime();
                        metodoNumerico.OrdenarBurbujaBidireccionalList(cancionOrdenada);
                        tiempoFin = System.nanoTime();
                        totalTime = tiempoFin - inicioTiempo;
                        tablaOrden = new DefaultListModel();
                        for (int i = 0; i < cancionOrdenada.size(); i++) {
                            tablaOrden.addElement(cancionOrdenada.get(i).getDuracion());

                        }
                       jLDatosOrdenados.setModel(tabla);
                        consulta.insertarTiempos(jCBTipoDatoOrdenar.getSelectedItem().toString(), jCBTipoOrdenamiento.getSelectedItem().toString(), jCBCantidadElementos.getSelectedIndex(), totalTime);
                        System.out.println("Se registro");
                        break;

                    case "Mezcla":
                        inicioTiempo = System.nanoTime();
                        metodoNumerico.mergeSort(cancionOrdenada);
                        tiempoFin = System.nanoTime();
                        totalTime = tiempoFin - inicioTiempo;
                        tablaOrden = new DefaultListModel();
                        for (int i = 0; i < cancionOrdenada.size(); i++) {
                            tablaOrden.addElement(cancionOrdenada.get(i).getDuracion());

                        }
                        jLDatosOrdenados.setModel(tabla);
                        consulta.insertarTiempos(jCBTipoDatoOrdenar.getSelectedItem().toString(), jCBTipoOrdenamiento.getSelectedItem().toString(), jCBCantidadElementos.getSelectedIndex(), totalTime);
                        System.out.println("Se registro");
                        break;

                    case "Selección":
                        inicioTiempo = System.nanoTime();
                        metodoNumerico.selectionSortNum(cancionOrdenada);
                        tiempoFin = System.nanoTime();
                        totalTime = tiempoFin - inicioTiempo;
                        tablaOrden = new DefaultListModel();
                        for (int i = 0; i < cancionOrdenada.size(); i++) {
                            tablaOrden.addElement(cancionOrdenada.get(i).getDuracion());

                        }
                        jLDatosOrdenados.setModel(tabla);
                        consulta.insertarTiempos(jCBTipoDatoOrdenar.getSelectedItem().toString(), jCBTipoOrdenamiento.getSelectedItem().toString(), jCBCantidadElementos.getSelectedIndex(), totalTime);
                        System.out.println("Se registro");
                        break;


                    case "Shell":
                        inicioTiempo = System.nanoTime();
                        metodoNumerico.ShellSortNum(cancionOrdenada);
                        tiempoFin = System.nanoTime();
                        totalTime = tiempoFin - inicioTiempo;
                        tablaOrden = new DefaultListModel();
                        for (int i = 0; i < cancionOrdenada.size(); i++) {
                           tablaOrden.addElement(cancionOrdenada.get(i).getDuracion());

                        }
                        jLDatosOrdenados.setModel(tabla);
                        consulta.insertarTiempos(jCBTipoDatoOrdenar.getSelectedItem().toString(), 
                                jCBTipoOrdenamiento.getSelectedItem().toString(), jCBCantidadElementos.getSelectedIndex(), totalTime);
                        System.out.println("Se registro");
                        break;

                    case "Rápido":
                        inicioTiempo = System.nanoTime();
                        metodoNumerico.quickSortNum(cancionArrayList,0,cancionArrayList.size() - 1);
                        tiempoFin = System.nanoTime();
                        totalTime = tiempoFin - inicioTiempo;
                        tablaOrden = new DefaultListModel();
                        for (int i = 0; i < cancionOrdenada.size(); i++) {
                           tablaOrden.addElement(cancionOrdenada.get(i).getDuracion());

                        }
                        jLDatosOrdenados.setModel(tabla);
                        consulta.insertarTiempos(jCBTipoDatoOrdenar.getSelectedItem().toString(), jCBTipoOrdenamiento.getSelectedItem().toString(), jCBCantidadElementos.getSelectedIndex(), totalTime);
                        System.out.println("Se registro");
                        break;
                     
                    /* case "Burbuja bidireccional":
                        startTime = System.nanoTime();
                        metodoNumerico.OrdenarBurbujaBidireccionalList(cancionOrderArrayList);
                        endTime = System.nanoTime();
                        totalTime = endTime - startTime;
                        tablaOrden = new DefaultListModel();
                        for (int i = 0; i < cancionOrderArrayList.size(); i++) {
                            tablaOrden.addElement(cancionOrderArrayList.get(i).getDuracion());

                        }
                       jLDatosOrdenados.setModel(tabla);
                        consulta.insertarTiempos(jCBTipoDatoOrdenar.getSelectedItem().toString(), jCBTipoOrdenamiento.getSelectedItem().toString(), jCBCantidadElementos.getSelectedIndex(), totalTime);
                        System.out.println("Se registro");
                        break;

                    case "Mezcla":
                        startTime = System.nanoTime();
                        metodoNumerico.mergeSort(cancionOrderArrayList);
                        endTime = System.nanoTime();
                        totalTime = endTime - startTime;
                        tablaOrden = new DefaultListModel();
                        for (int i = 0; i < cancionOrderArrayList.size(); i++) {
                            tablaOrden.addElement(cancionOrderArrayList.get(i).getDuracion());

                        }
                        jLDatosOrdenados.setModel(tabla);
                        consulta.insertarTiempos(jCBTipoDatoOrdenar.getSelectedItem().toString(), jCBTipoOrdenamiento.getSelectedItem().toString(), jCBCantidadElementos.getSelectedIndex(), totalTime);
                        System.out.println("Se registro");
                        break;

                    case "Selección":
                        startTime = System.nanoTime();
                        metodoNumerico.selectionSortNum(cancionOrderArrayList);
                        endTime = System.nanoTime();
                        totalTime = endTime - startTime;
                        tablaOrden = new DefaultListModel();
                        for (int i = 0; i < cancionOrderArrayList.size(); i++) {
                            tablaOrden.addElement(cancionOrderArrayList.get(i).getDuracion());

                        }
                        jLDatosOrdenados.setModel(tabla);
                        consulta.insertarTiempos(jCBTipoDatoOrdenar.getSelectedItem().toString(), jCBTipoOrdenamiento.getSelectedItem().toString(), jCBCantidadElementos.getSelectedIndex(), totalTime);
                        System.out.println("Se registro");
                        break;


                    case "Shell":
                        startTime = System.nanoTime();
                        metodoNumerico.ShellSortNum(cancionOrderArrayList);
                        endTime = System.nanoTime();
                        totalTime = endTime - startTime;
                        tablaOrden = new DefaultListModel();
                        for (int i = 0; i < cancionOrderArrayList.size(); i++) {
                           tablaOrden.addElement(cancionOrderArrayList.get(i).getDuracion());

                        }
                        jLDatosOrdenados.setModel(tabla);
                        consulta.insertarTiempos(jCBTipoDatoOrdenar.getSelectedItem().toString(), jCBTipoOrdenamiento.getSelectedItem().toString(), jCBCantidadElementos.getSelectedIndex(), totalTime);
                        System.out.println("Se registro");
                        break;

                    case "Rápido":
                        startTime = System.nanoTime();
                        metodoNumerico.quickSortNum(cancionArrayList,0,cancionArrayList.size() - 1);
                        endTime = System.nanoTime();
                        totalTime = endTime - startTime;
                        tablaOrden = new DefaultListModel();
                        for (int i = 0; i < cancionOrderArrayList.size(); i++) {
                           tablaOrden.addElement(cancionOrderArrayList.get(i).getDuracion());

                        }
                        jLDatosOrdenados.setModel(tabla);
                        consulta.insertarTiempos(jCBTipoDatoOrdenar.getSelectedItem().toString(), jCBTipoOrdenamiento.getSelectedItem().toString(), jCBCantidadElementos.getSelectedIndex(), totalTime);
                        System.out.println("Se registro");
                        break;
                     */
                }
            }
        }
    }

    public void llenarLista() throws ClassNotFoundException, SQLException {
        numerico = Integer.parseInt((String) jCBCantidadElementos.getSelectedItem());

        cancionArrayList = consulta.selectCancion(numerico);
        tabla = new DefaultListModel();
        for (int i = 0; i < cancionArrayList.size(); i++) {
            tabla.addElement("Nombre: " + cancionArrayList.get(i).getNombre() + "     " + "Duracion: " + cancionArrayList.get(i).getDuracion() + "     " + "Lanzamiento: " + cancionArrayList.get(i).getLanzamiento());
        }
        jLDatosOriginales.setModel(tabla);

    }

}
