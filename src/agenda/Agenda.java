package agenda;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.awt.Color;
import java.awt.Font; 

/**
 *
 * @author kthanid
 */
public class Agenda extends javax.swing.JFrame {

    /**
     * Creates new form Agenda
     */
    public Agenda() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtvariable = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        lblestado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        abrir = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        direccion = new javax.swing.JTextField();
        mousr = new javax.swing.JTextField();
        editar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        jLabel1.setText("Agenda");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Telefono:");

        telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefonoKeyTyped(evt);
            }
        });

        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        jButton1.setText("Guardar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Usuario:");

        txtvariable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtvariableActionPerformed(evt);
            }
        });

        jButton2.setText("Abrir");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eliminarMousePressed(evt);
            }
        });
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        lblestado.setText("Estado");

        abrir.setEditable(false);
        abrir.setColumns(20);
        abrir.setForeground(new java.awt.Color(1, 1, 1));
        abrir.setRows(5);
        abrir.setText("Informacion de contacto");
        abrir.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                abrirPropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(abrir);

        jLabel5.setText("Correo:");

        jLabel6.setText("Direccion:");

        correo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoActionPerformed(evt);
            }
        });

        mousr.setForeground(new java.awt.Color(1, 1, 1));
        mousr.setText("Abrir usuario");
        mousr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mousrMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mousrMouseEntered(evt);
            }
        });
        mousr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mousrActionPerformed(evt);
            }
        });

        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblestado)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(mousr, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(editar)
                                .addGap(18, 18, 18)
                                .addComponent(eliminar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtvariable, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(nombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 293, Short.MAX_VALUE)
                                .addComponent(correo, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtvariable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(lblestado)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mousr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(editar)
                    .addComponent(eliminar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        // TODO add your handling code here:
        Scanner sc = new Scanner(System.in);
         try
        {
            File file = new File(txtvariable.getText()+".txt");
            if (file.exists()) { 
            lblestado.setText("Ingresar usuario diferente"); 
            } 
            else 
            { 
            FileWriter file_writer = new FileWriter(file);    
            BufferedWriter buffered_writter = new BufferedWriter(file_writer);
            buffered_writter.write("Nombre:"+nombre.getText());
            buffered_writter.newLine();
            buffered_writter.write("Telefono:"+telefono.getText());
            buffered_writter.newLine();
            buffered_writter.write("Correo:"+correo.getText());
            buffered_writter.newLine();
            buffered_writter.write("Direccion:"+direccion.getText());
            buffered_writter.close();
            file_writer.close();  
            txtvariable.setText("");
            nombre.setText("");
            telefono.setText("");
            correo.setText("");
            direccion.setText("");    
            lblestado.setText("Archivo guardado"); 
            } 
        }catch(Exception e)
        {
            lblestado.setText("Error");
        }
    
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        // TODO add your handling code here:
        Scanner sc = new Scanner(System.in);
        try
        {
            File file = new File(mousr.getText()+".txt");
            Scanner scanner = new Scanner(file).useDelimiter("\0");
            
            String lectura = scanner.next();
            
            abrir.setText(lectura);
            scanner.close();
            
            lblestado.setText("Puede editar los datos");
            abrir.setEditable(true);
            abrir.setEnabled(true);
            
        }catch(Exception e)
        {
            lblestado.setText("Error");
        }
    }//GEN-LAST:event_jButton2MousePressed

    private void eliminarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMousePressed
        // TODO add your handling code here:

        File fichero = new File(mousr.getText()+".txt");
        if(fichero.delete()){
          lblestado.setText(""+mousr.getText()+" Eliminado");}
        else
        {
            lblestado.setText("Archivo no existe");
        }
          
        mousr.setText("");
        abrir.setText("");
        
    }//GEN-LAST:event_eliminarMousePressed

    private void txtvariableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtvariableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtvariableActionPerformed

    private void correoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_correoActionPerformed

    private void abrirPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_abrirPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_abrirPropertyChange

    private void mousrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mousrMouseEntered
        // TODO add your handling code here:
      
    }//GEN-LAST:event_mousrMouseEntered

    private void mousrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mousrMouseClicked
        // TODO add your handling code here:
        mousr.setText("");
        
    }//GEN-LAST:event_mousrMouseClicked

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        // TODO add your handling code here:
        Scanner sc = new Scanner(System.in);
         try
        {
            File file = new File(mousr.getText()+".txt");
            if (file.exists()) {
            FileWriter file_writer = new FileWriter(file);
            BufferedWriter buffered_writter = new BufferedWriter(file_writer);
            buffered_writter.write(abrir.getText());
            buffered_writter.newLine();
            buffered_writter.write("El contato fue editado");
            buffered_writter.close();
            file_writer.close();              
            lblestado.setText("Datos editados guardados");
             
            } 
            else 
            {
                lblestado.setText("El usuario no existe");
            }
            
        }catch(Exception e)
        {
            lblestado.setText("Error");
        }
    }//GEN-LAST:event_editarActionPerformed

    private void mousrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mousrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mousrActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_eliminarActionPerformed

    private void telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefonoKeyTyped
        // TODO add your handling code here:
        
         
    }//GEN-LAST:event_telefonoKeyTyped

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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea abrir;
    private javax.swing.JTextField correo;
    private javax.swing.JTextField direccion;
    private javax.swing.JButton editar;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblestado;
    private javax.swing.JTextField mousr;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField telefono;
    private javax.swing.JTextField txtvariable;
    // End of variables declaration//GEN-END:variables
}
