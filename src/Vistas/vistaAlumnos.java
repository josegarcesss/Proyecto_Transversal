/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoADatos.AlumnoData;
import Entidades.Alumno;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Alakyan
 */
public class vistaAlumnos extends javax.swing.JInternalFrame {
    private AlumnoData alumdata=new AlumnoData();
    private Alumno alumno= null;
   
    /**
     * Creates new form vistaAlumnos
     */
    public vistaAlumnos() {
        
        initComponents();
    }

    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jt_DNI = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jt_Nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jt_Apellido = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jcb_Estado = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jDC_FechaN = new com.toedter.calendar.JDateChooser();
        jb_Buscar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jb_Guardar = new javax.swing.JButton();
        jb_Eliminar = new javax.swing.JButton();
        jb_Salir = new javax.swing.JButton();

        jLabel1.setText("Documento:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Apellido:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setText("Alumno");

        jLabel5.setText("Estado:");

        jLabel6.setText("Fecha de Nacimiento:");

        jb_Buscar.setText("Buscar");
        jb_Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_BuscarActionPerformed(evt);
            }
        });

        jButton2.setText("Nuevo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jb_Guardar.setText("Guardar");
        jb_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_GuardarActionPerformed(evt);
            }
        });

        jb_Eliminar.setText("Eliminar");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcb_Estado))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(29, 29, 29))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jb_Guardar)
                                        .addGap(7, 7, 7)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jt_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jb_Buscar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDC_FechaN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(85, 85, 85)
                                        .addComponent(jb_Eliminar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jb_Salir)))))))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jcb_Estado)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jt_DNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jb_Buscar)
                            .addComponent(jt_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jDC_FechaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jb_Guardar)
                    .addComponent(jb_Eliminar)
                    .addComponent(jb_Salir))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        LimpiarCampos();
        alumno=null;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jb_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_SalirActionPerformed
        dispose();
    }//GEN-LAST:event_jb_SalirActionPerformed

    private void jb_BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_BuscarActionPerformed
        try{
            Integer dni= Integer.parseInt(jt_DNI.getText());
            alumno=alumdata.buscarAlumnoPorDni(dni);
            if(alumno!=null){
            jt_Apellido.setText(alumno.getApellido());
            jt_Nombre.setText(alumno.getNombre());
            jcb_Estado.setSelected(alumno.isEstado());
            LocalDate lc=alumno.getFechaN();
            java.util.Date date=java.util.Date.from(lc.atStartOfDay(ZoneId.systemDefault()).toInstant());
            jDC_FechaN.setDate(date);
            
            }
        
        }catch(NumberFormatException ex){
        JOptionPane.showMessageDialog(this,"Debe ingresar un numero valido");
        }
       
    }//GEN-LAST:event_jb_BuscarActionPerformed

    private void jb_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_GuardarActionPerformed
       try{ 
            Integer dni= Integer.parseInt(jt_DNI.getText());
            String apellido=jt_Apellido.getText();
            String nombre=jt_Nombre.getText();
            if(apellido.isEmpty()||nombre.isEmpty()){
                JOptionPane.showMessageDialog(this, "No puede haber campos vacios");
                return;
            }
            java.util.Date fecha= jDC_FechaN.getDate();
            LocalDate fechanac=fecha.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            Boolean estado=jcb_Estado.isSelected();
            if(alumno==null){
            alumno=new Alumno(dni, apellido, nombre, fechanac, estado);
            alumdata.guardarAlumno(alumno);

            }else{
            alumno.setDNI(dni);
            alumno.setApellido(apellido);
            alumno.setNombre(nombre);
            alumno.setFechaN(fechanac); 
            alumdata.modificarAlumno(alumno);
            }

            }catch(NumberFormatException ext){
            JOptionPane.showMessageDialog(this,"Debe ingresar un numero valido");
            }
    }//GEN-LAST:event_jb_GuardarActionPerformed
    private void LimpiarCampos(){
        jt_Apellido.setText("");
        jt_Nombre.setText("");
        jt_DNI.setText("");
        jcb_Estado.setSelected(true);
        jDC_FechaN.setDate(new Date());
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDC_FechaN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jb_Buscar;
    private javax.swing.JButton jb_Eliminar;
    private javax.swing.JButton jb_Guardar;
    private javax.swing.JButton jb_Salir;
    private javax.swing.JCheckBox jcb_Estado;
    private javax.swing.JTextField jt_Apellido;
    private javax.swing.JTextField jt_DNI;
    private javax.swing.JTextField jt_Nombre;
    // End of variables declaration//GEN-END:variables
}
