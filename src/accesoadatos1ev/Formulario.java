/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoadatos1ev;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author rocio
 */
public class Formulario extends javax.swing.JFrame {

    SAX gesSAX = new SAX();

    
    public Formulario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        MostrarDoc = new javax.swing.JScrollPane();
        MostrarDocXML = new javax.swing.JTextArea();
        btnMostrar = new java.awt.Button();
        mensajero = new javax.swing.JLabel();
        btnModificar = new java.awt.Button();
        btnBuscar = new java.awt.Button();
        btnAnadir = new java.awt.Button();
        btnRefrescar = new java.awt.Button();
        jMenuBar1 = new javax.swing.JMenuBar();
        AbrirDOC = new javax.swing.JMenu();
        MenuItemSeleccionDOC = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MostrarDocXML.setColumns(20);
        MostrarDocXML.setRows(5);
        MostrarDoc.setViewportView(MostrarDocXML);

        btnMostrar.setEnabled(false);
        btnMostrar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnMostrar.setLabel("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        btnModificar.setActionCommand("Modificar\n");
        btnModificar.setEnabled(false);
        btnModificar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnModificar.setLabel("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnBuscar.setActionCommand("Modificar\n");
        btnBuscar.setEnabled(false);
        btnBuscar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnBuscar.setLabel("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnAnadir.setActionCommand("Modificar\n");
        btnAnadir.setEnabled(false);
        btnAnadir.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnAnadir.setLabel("Añadir registro:");
        btnAnadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnadirActionPerformed(evt);
            }
        });

        btnRefrescar.setEnabled(false);
        btnRefrescar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnRefrescar.setLabel("Refrescar");
        btnRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrescarActionPerformed(evt);
            }
        });

        AbrirDOC.setText("Abrir XML");
        AbrirDOC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirDOCActionPerformed(evt);
            }
        });

        MenuItemSeleccionDOC.setText("Selecciona Documento");
        MenuItemSeleccionDOC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemSeleccionDOCActionPerformed(evt);
            }
        });
        AbrirDOC.add(MenuItemSeleccionDOC);

        jMenuBar1.add(AbrirDOC);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MostrarDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAnadir, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mensajero, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mensajero, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MostrarDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(btnRefrescar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(btnAnadir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        btnModificar.getAccessibleContext().setAccessibleName("Modificar");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AbrirDOCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirDOCActionPerformed
 
    }//GEN-LAST:event_AbrirDOCActionPerformed

    private void MenuItemSeleccionDOCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemSeleccionDOCActionPerformed
           File ficheroXML;
        ficheroXML = seleccionaFichero();

        if (ficheroXML == null) {
            this.mensajero.setText("Error al abrir el fichero");
        } else {
            //devuelve 0 si todo ha ido bien
            if (gesSAX.abrirXMLSAX(ficheroXML) == -1) {
                this.mensajero.setText("Error al mostrar");
                System.out.println("Error al crear SAX");
                this.btnMostrar.setEnabled(false);
                this.btnModificar.setEnabled(false);
                this.btnBuscar.setEnabled(false);
            } else {
                this.mensajero.setText("Hay un documento seleccionado, para visualizarlo pulsa el botón");
                this.btnMostrar.setEnabled(true);
                this.btnModificar.setEnabled(false);
                this.btnBuscar.setEnabled(false);
               
            }
        }
    }//GEN-LAST:event_MenuItemSeleccionDOCActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
         String salida;
        try {
            salida = gesSAX.reccorrerSAX();
              this.MostrarDocXML.setText(salida);
              this.btnModificar.setEnabled(true);
              this.btnBuscar.setEnabled(true);
              this.btnAnadir.setEnabled(true);
        } catch (Exception ex) {
            Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
        }
  
    }//GEN-LAST:event_btnMostrarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        VentanaModificar vm = new VentanaModificar(this, false);
        vm.setVisible(true);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAnadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnadirActionPerformed
        VentanaAnadir va= new VentanaAnadir(this, false);
        va.setVisible(true);
    }//GEN-LAST:event_btnAnadirActionPerformed

    private void btnRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRefrescarActionPerformed

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
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu AbrirDOC;
    private javax.swing.JMenuItem MenuItemSeleccionDOC;
    private javax.swing.JScrollPane MostrarDoc;
    private javax.swing.JTextArea MostrarDocXML;
    private java.awt.Button btnAnadir;
    private java.awt.Button btnBuscar;
    private java.awt.Button btnModificar;
    private java.awt.Button btnMostrar;
    private java.awt.Button btnRefrescar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel mensajero;
    // End of variables declaration//GEN-END:variables

    private File seleccionaFichero() {
               File f = null;
        JFileChooser fc = new JFileChooser();
        fc.setMultiSelectionEnabled(false);//para seleccionar solo un archivo
        //se abre el cuadro de dialogo de apertura
        fc.setDialogType(JFileChooser.OPEN_DIALOG);
        //que depende de lo que haga el usuario
        int respuesta = fc.showOpenDialog(this);

        if (respuesta == JFileChooser.APPROVE_OPTION) {
            f = fc.getSelectedFile();
        }
        return f;
    }
}
