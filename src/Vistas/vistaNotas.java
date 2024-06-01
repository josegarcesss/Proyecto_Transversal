package Vistas;
import AccesoADatos.AlumnoData;
import AccesoADatos.InscripcionData;
import AccesoADatos.MateriaData;
import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;


/**
 *
 * @author Alakyan
 */

public class vistaNotas extends javax.swing.JInternalFrame {
   
    private AlumnoData alumdata= new AlumnoData();
    private InscripcionData inscData= new InscripcionData();
    private MateriaData matData= new MateriaData();
    private ArrayList<Alumno> alumnos;
    private ArrayList<Inscripcion> inscripciones;
    private DefaultTableModel modelo= new DefaultTableModel(){ 
    public boolean isCellEditable(int f,int c){
       
        return c!=3;
        }
    };
    /**
     * Creates new form vistaNotas
     */
      public vistaNotas() {
        initComponents();
        alumnos=(ArrayList<Alumno>) alumdata.listarAlumnos();
        armarCabecera();
        llenarComboBox();
    }
    
     private void llenarComboBox(){
        for (Alumno alumno : alumnos) { 
          jcb_Alumnos.addItem(alumno);  
        }
        
    }
    
        private void armarCabecera(){
        ArrayList<Object> filaCabecera = new ArrayList<>();
        modelo.addColumn("Codigo");
        modelo.addColumn("Nombre");
        modelo.addColumn("Nota");
        for(Object it: filaCabecera){
            modelo.addColumn(it);
        }
        jt_Tabla.setModel(modelo);
    }

    private void borrarFilas(){
        int filas=jt_Tabla.getRowCount()-1;        
        for (int f = filas; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
    
    private void cargaDatosInscripcion(){
        borrarFilas();
        Alumno selec=(Alumno) jcb_Alumnos.getSelectedItem();
        inscripciones=(ArrayList<Inscripcion>) inscData.obtenerInscripcionPorAlumno(selec.getId_alumno());
        for(Inscripcion i: inscripciones){
           modelo.addRow(new Object[] {matData.buscarMateria(i.getMateria().getId_Materia()).getId_Materia(),matData.buscarMateria(i.getMateria().getId_Materia()).getNombre(),i.getNota()});
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jcb_Alumnos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_Tabla = new javax.swing.JTable();
        jb_Guardar = new javax.swing.JButton();
        jb_Salir = new javax.swing.JButton();

        setTitle("Carga de Notas");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Carga de Notas");

        jLabel2.setText("Seleccione un Alumno: ");

        jcb_Alumnos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcb_AlumnosItemStateChanged(evt);
            }
        });

        jt_Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Nota"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jt_Tabla);

        jb_Guardar.setText("Guardar");
        jb_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_GuardarActionPerformed(evt);
            }
        });

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
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jcb_Alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jb_Guardar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(66, 66, 66)
                .addComponent(jb_Salir)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jb_Salir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcb_Alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_Guardar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_SalirActionPerformed
        dispose();
    }//GEN-LAST:event_jb_SalirActionPerformed

    private void jcb_AlumnosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcb_AlumnosItemStateChanged
       cargaDatosInscripcion();
    }//GEN-LAST:event_jcb_AlumnosItemStateChanged

    private void jb_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_GuardarActionPerformed
       Alumno selec=(Alumno) jcb_Alumnos.getSelectedItem();
        double nota;
        //        JOptionPane.showMessageDialog(this,"Dato columna 0 fila 0= "+(int)modelo.getValueAt(0,0));
        for (int i = 0; i < modelo.getRowCount(); i++) {
                        try{
                            if((Object)modelo.getValueAt(i, 2) instanceof String){
                              nota=Double.parseDouble((String) modelo.getValueAt(i, 2));  
                            }else{
                               nota=(Double)modelo.getValueAt(i, 2); 
                            }                               
                               if(nota>10 || nota<1){
                                        JOptionPane.showMessageDialog(this,"Ingrese un valor entre 1 y 10!");
                                       return;
                                   }
                            }catch(NumberFormatException e){
                                JOptionPane.showMessageDialog(this, "Tiene que ingresar un valor Decimal o Entero!");
                                return;
                            }
                      inscData.actualizarNota(selec.getId_alumno(),(int) modelo.getValueAt(i, 0) ,nota);
        }
    }//GEN-LAST:event_jb_GuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jb_Guardar;
    private javax.swing.JButton jb_Salir;
    private javax.swing.JComboBox<Alumno> jcb_Alumnos;
    private javax.swing.JTable jt_Tabla;
    // End of variables declaration//GEN-END:variables
}
