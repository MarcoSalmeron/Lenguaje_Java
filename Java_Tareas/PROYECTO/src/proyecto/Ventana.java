/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;


/**
 *
 * @author Marco
 */
public class Ventana extends javax.swing.JFrame {
   
    //lista para agregar nuevas notas//
     public List<String> lista1 = new ArrayList<>();
       
         //atributos a compartir//
    String Titulo;
    String Prioridad;
    String Descripcion;
     
    //Objetos para mandarlos a llamar// 
    CREAR nueva = new CREAR(lista1, Titulo, Prioridad, Descripcion);
    MOSTRAR mostrar = new MOSTRAR();
    BUSCAR buscar = new BUSCAR(lista1);
    EDITAR editar = new EDITAR(lista1, Titulo, Prioridad, Descripcion);
    ELIMINAR eliminar = new ELIMINAR(lista1);
 
     
    /**
     * Creates new form Ventana
     */

    public Ventana(String Titulo, String Prioridad, String Descripcion) {
      initComponents();
      this.Titulo = Titulo;
      this.Prioridad = Prioridad;
      this.Descripcion = Descripcion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getPrioridad() {
        return Prioridad;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setPrioridad(String Prioridad) {
        this.Prioridad = Prioridad;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
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
        jLabel1 = new javax.swing.JLabel();
        CREAR = new javax.swing.JButton();
        EDITAR = new javax.swing.JButton();
        ELIMINAR = new javax.swing.JButton();
        BUSCAR = new javax.swing.JButton();
        MOSTRAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setText("Block de Notas:  ");

        CREAR.setText("NUEVO");
        CREAR.setMaximumSize(new java.awt.Dimension(100, 70));
        CREAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CREARActionPerformed(evt);
            }
        });

        EDITAR.setText("EDITAR");
        EDITAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDITARActionPerformed(evt);
            }
        });

        ELIMINAR.setText("ELIMINAR");
        ELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELIMINARActionPerformed(evt);
            }
        });

        BUSCAR.setText("BUSCAR");
        BUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSCARActionPerformed(evt);
            }
        });

        MOSTRAR.setText("MOSTRAR");
        MOSTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MOSTRARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CREAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EDITAR)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ELIMINAR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MOSTRAR, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BUSCAR, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 62, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(390, 390, 390)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CREAR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(EDITAR)
                        .addGap(32, 32, 32)
                        .addComponent(ELIMINAR)
                        .addGap(30, 30, 30)
                        .addComponent(BUSCAR)
                        .addGap(27, 27, 27)
                        .addComponent(MOSTRAR)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CREARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CREARActionPerformed
   nueva.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
   nueva.setVisible(true);
   nueva.setResizable(false);
    
    }//GEN-LAST:event_CREARActionPerformed

    private void EDITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITARActionPerformed

       editar.datos(lista1);
       editar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       editar.setVisible(true);
        
    }//GEN-LAST:event_EDITARActionPerformed

    private void MOSTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MOSTRARActionPerformed
     
        mostrar.datos(lista1);
        mostrar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mostrar.setVisible(true);
      
        
    }//GEN-LAST:event_MOSTRARActionPerformed

    private void BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSCARActionPerformed
      
       buscar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       buscar.setVisible(true);
    }//GEN-LAST:event_BUSCARActionPerformed

    private void ELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINARActionPerformed
    eliminar.datos(lista1);
    eliminar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    eliminar.setVisible(true);
    }//GEN-LAST:event_ELIMINARActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BUSCAR;
    private javax.swing.JButton CREAR;
    private javax.swing.JButton EDITAR;
    private javax.swing.JButton ELIMINAR;
    private javax.swing.JButton MOSTRAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}