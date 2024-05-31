
package Vistas;





public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jm_FormularioAlumno = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jm_FormularioMateria = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jm_Inscripciones = new javax.swing.JMenuItem();
        jm_Notas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jm_AlumnosXMateria = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 759, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 471, Short.MAX_VALUE)
        );

        jMenu1.setText("Alumno");

        jm_FormularioAlumno.setText("Formulario de Alumno");
        jm_FormularioAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_FormularioAlumnoActionPerformed(evt);
            }
        });
        jMenu1.add(jm_FormularioAlumno);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Materia");

        jm_FormularioMateria.setText("Formulario de Materia");
        jm_FormularioMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_FormularioMateriaActionPerformed(evt);
            }
        });
        jMenu2.add(jm_FormularioMateria);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Administracion");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jm_Inscripciones.setText("Manejo de Inscripciones");
        jm_Inscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_InscripcionesActionPerformed(evt);
            }
        });
        jMenu3.add(jm_Inscripciones);

        jm_Notas.setText("Manipulacion de notas");
        jm_Notas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jm_NotasActionPerformed(evt);
            }
        });
        jMenu3.add(jm_Notas);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Consulta");

        jm_AlumnosXMateria.setText("Alumnos por Materia");
        jMenu4.add(jm_AlumnosXMateria);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Salir");
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(escritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(escritorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jm_FormularioAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_FormularioAlumnoActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        vistaAlumnos va= new vistaAlumnos();
        va.setVisible(true);
        escritorio.add(va);              
    }//GEN-LAST:event_jm_FormularioAlumnoActionPerformed

    private void jm_FormularioMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_FormularioMateriaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        vistaMateria vM= new vistaMateria();
        vM.setVisible(true);
        escritorio.add(vM); 
    }//GEN-LAST:event_jm_FormularioMateriaActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jm_NotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_NotasActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        vistaNotas vN= new vistaNotas();
        vN.setVisible(true);
        escritorio.add(vN);       
    }//GEN-LAST:event_jm_NotasActionPerformed

    private void jm_InscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jm_InscripcionesActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        vistaInscripcion vI= new vistaInscripcion();
        vI.setVisible(true);
        escritorio.add(vI);
        
    }//GEN-LAST:event_jm_InscripcionesActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jm_AlumnosXMateria;
    private javax.swing.JMenuItem jm_FormularioAlumno;
    private javax.swing.JMenuItem jm_FormularioMateria;
    private javax.swing.JMenuItem jm_Inscripciones;
    private javax.swing.JMenuItem jm_Notas;
    // End of variables declaration//GEN-END:variables
}
