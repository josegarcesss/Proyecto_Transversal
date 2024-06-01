/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thomas
 */
public class vistaInscripcion extends javax.swing.JInternalFrame {
    private List<Materia>listaM;
    private List<Alumno> listaA;
    private InscripcionData inscdata;
    private MateriaData matdata;
    private AlumnoData alumdata;
    private DefaultTableModel tabla;
    
    public vistaInscripcion() {
        
        alumdata=new AlumnoData();
        listaA=alumdata.listarAlumnos();
        tabla= new DefaultTableModel();
        matdata= new MateriaData();
        inscdata= new InscripcionData();
        initComponents();
        armarCabecera();
        cargarAlumnos();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcb_ListaAlumno = new javax.swing.JComboBox<>();
        jrb_Inscripto = new javax.swing.JRadioButton();
        jrb_NoInscripto = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_ListaMaterias = new javax.swing.JTable();
        jb_Inscribir = new javax.swing.JButton();
        jb_Anular = new javax.swing.JButton();
        jb_Salir = new javax.swing.JButton();

        setTitle("Formulario de Inscripcion");

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setText("Formulario de Inscripción");

        jLabel2.setText("Seleccione un Alumno:");

        jcb_ListaAlumno.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_ListaAlumnoItemStateChanged(evt);
            }
        });

        jrb_Inscripto.setText("Materia Inscripto");
        jrb_Inscripto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_InscriptoActionPerformed(evt);
            }
        });

        jrb_NoInscripto.setText("Materia no Inscripto");
        jrb_NoInscripto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrb_NoInscriptoActionPerformed(evt);
            }
        });

        jt_ListaMaterias.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jt_ListaMaterias);

        jb_Inscribir.setText("Inscribir");
        jb_Inscribir.setEnabled(false);
        jb_Inscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_InscribirActionPerformed(evt);
            }
        });

        jb_Anular.setText("Anular Inscripcion");
        jb_Anular.setEnabled(false);

        jb_Salir.setText("Salir");
        jb_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_SalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jrb_Inscripto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jrb_NoInscripto)
                .addGap(90, 90, 90))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcb_ListaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jb_Inscribir)
                .addGap(71, 71, 71)
                .addComponent(jb_Anular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_Salir)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcb_ListaAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrb_Inscripto)
                    .addComponent(jrb_NoInscripto))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_Inscribir)
                    .addComponent(jb_Anular)
                    .addComponent(jb_Salir))
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrb_InscriptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_InscriptoActionPerformed
        borrarFilas();
        if(jrb_Inscripto.isSelected()){
            jrb_NoInscripto.setSelected(false);
            cargarDatosInscriptos();
            jb_Anular.setEnabled(true);
            jb_Inscribir.setEnabled(false);
}
        
    }//GEN-LAST:event_jrb_InscriptoActionPerformed

    private void jb_InscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_InscribirActionPerformed
        int numID;
        String input1 = JOptionPane.showInputDialog("Ingrese el ID de la materia a Inscribir: ");
        try{
            if(!input1.equalsIgnoreCase("")){
        numID = Integer.parseInt(input1);
            }else{
                JOptionPane.showMessageDialog(this, "Ingrese un valor entero!");
                return;
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Ingrese un valor entero!");
                return;
        }
        Alumno alum=(Alumno) jcb_ListaAlumno.getSelectedItem();
        Inscripcion inscripcion;
        inscripcion = new Inscripcion(alum,matdata.buscarMateria(numID),0);
        inscdata.GuardarInscripcion(inscripcion);
        
    }//GEN-LAST:event_jb_InscribirActionPerformed

    private void jb_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_SalirActionPerformed
    dispose();
    }//GEN-LAST:event_jb_SalirActionPerformed

    private void jcb_ListaAlumnoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_ListaAlumnoItemStateChanged
        borrarFilas();
        if(jrb_Inscripto.isSelected() && !jrb_NoInscripto.isSelected()){
            jrb_NoInscripto.setSelected(false);
            cargarDatosInscriptos();
            jb_Anular.setEnabled(true);
            jb_Inscribir.setEnabled(false);
        }else if(jrb_NoInscripto.isSelected() && !jrb_Inscripto.isSelected()){
            jrb_Inscripto.setSelected(false);
            cargarDatosnoInscriptos();
            jb_Anular.setEnabled(false);
            jb_Inscribir.setEnabled(true);
        }
        
    }//GEN-LAST:event_jcb_ListaAlumnoItemStateChanged

    private void jrb_NoInscriptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrb_NoInscriptoActionPerformed
        borrarFilas();
        if(jrb_NoInscripto.isSelected()){
            jrb_Inscripto.setSelected(false);
            cargarDatosnoInscriptos();
            jb_Anular.setEnabled(false);
            jb_Inscribir.setEnabled(true);
        }
    }//GEN-LAST:event_jrb_NoInscriptoActionPerformed
 private void cargarAlumnos(){
     for(Alumno item:listaA){
     jcb_ListaAlumno.addItem(item);
     }   
 }
    private void armarCabecera(){
    ArrayList<Object>filacabecera=new ArrayList<>();
    filacabecera.add("ID");
    filacabecera.add("Nombre");
    filacabecera.add("Año");
    for(Object it:filacabecera){
    tabla.addColumn(it);
    }
    jt_ListaMaterias.setModel(tabla);
    }
    private void borrarFilas(){
        int filas=tabla.getRowCount()-1;        
        for (int f = filas; f >= 0; f--) {
            tabla.removeRow(f);
        }
    }
    
    private void cargarDatosnoInscriptos(){
     Alumno selec=(Alumno)jcb_ListaAlumno.getSelectedItem();
       listaM =(ArrayList) inscdata.obtenerMateriasNOCursadas(selec.getId_alumno());
        for(Materia m:listaM){
            tabla.addRow(new Object[]{m.getId_Materia(), m.getNombre(), m.getAnio_materia()});
        }
    }
    
    private void cargarDatosInscriptos(){
      Alumno selec=(Alumno)jcb_ListaAlumno.getSelectedItem();
        List<Materia> list=inscdata.obtenerMateriasCursadas(selec.getId_alumno());
        for(Materia mat:list){
            tabla.addRow(new Object[] {mat.getId_Materia(), mat.getNombre(), mat.getAnio_materia()});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_Anular;
    private javax.swing.JButton jb_Inscribir;
    private javax.swing.JButton jb_Salir;
    private javax.swing.JComboBox<Alumno> jcb_ListaAlumno;
    private javax.swing.JRadioButton jrb_Inscripto;
    private javax.swing.JRadioButton jrb_NoInscripto;
    private javax.swing.JTable jt_ListaMaterias;
    // End of variables declaration//GEN-END:variables
}
