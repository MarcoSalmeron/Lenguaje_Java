/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Marco
 */
public class CREAR extends javax.swing.JFrame {
    //crear lista para almacenar nuevas notas//
    public List<String> lista1 = new ArrayList<>();
    public String nuevo;
    //atributos a compartir//
    String Titulo,Prioridad,Descripcion;

    public CREAR(List<String> lista1, String Titulo, String Prioridad, String Descripcion) {
       initComponents();
       //meter lista de clase padre//
        this.lista1 = (lista1);
        this.Titulo = Titulo;
        this.Prioridad = Prioridad;
        this.Descripcion = Descripcion;
    }
    /**
     * Creates new form CREAR
     */
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TXTITULO = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TXTPRIORI = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        NUEVA = new javax.swing.JButton();
        TXTDESCRIP = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("NUEVA NOTA");

        jLabel2.setText("TITULO:");

        TXTITULO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTITULOActionPerformed(evt);
            }
        });

        jLabel3.setText("PRIORIDAD: ");

        TXTPRIORI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTPRIORIActionPerformed(evt);
            }
        });

        jLabel4.setText("DESCRIPCION:");

        NUEVA.setText("CREAR");
        NUEVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NUEVAActionPerformed(evt);
            }
        });

        TXTDESCRIP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTDESCRIPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(TXTITULO)
                            .addComponent(TXTPRIORI)
                            .addComponent(jLabel4)
                            .addComponent(TXTDESCRIP, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(NUEVA)))
                .addGap(35, 35, 35))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(NUEVA)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(TXTITULO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(TXTPRIORI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TXTDESCRIP, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXTITULOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTITULOActionPerformed
    
    }//GEN-LAST:event_TXTITULOActionPerformed

    private void TXTPRIORIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTPRIORIActionPerformed
     
    }//GEN-LAST:event_TXTPRIORIActionPerformed

    private void TXTDESCRIPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTDESCRIPActionPerformed
     
    }//GEN-LAST:event_TXTDESCRIPActionPerformed

    private void NUEVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NUEVAActionPerformed
    //Cambiar el nombre de variablede las celdas para asignarlas a in String   
        Titulo = TXTITULO.getText();
      Prioridad= TXTPRIORI.getText();
    Descripcion= TXTDESCRIP.getText();
       
       //Verificar que el String no ste vacio//
       if (Titulo.isEmpty() || Prioridad.isEmpty() || Descripcion.isEmpty()){
           JOptionPane.showMessageDialog(null,"Ninguna Celda Debe ir Vacia...","ERROR",JOptionPane.ERROR_MESSAGE);
       }else{
           
           //auxiliar para detectar titulo repetido//
           boolean tituloexistente = false;
           for(String nota : lista1){
            
               if(nota.contains("TITULO:                                \n"+Titulo+"\n")){
                   tituloexistente = true;
                   break;
               }
           }
           //verificar que no se repita//
        if(tituloexistente){
            JOptionPane.showMessageDialog(null, "Titulo ya existente");
     TXTITULO.setText("");
     TXTPRIORI.setText("");
     TXTDESCRIP.setText("");
        }else{  
        //crear formato de fecha para el registro de nuevas notas//
        Date fecha = new Date();
      SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy-HH:mm:ss");
      String NFecha = formato.format(fecha);
      nuevo = NFecha + "  ** NUEVA NOTA ** \n                                                   TITULO:                                \n"+Titulo+ "\n                                                   PRIORIDAD:                                              \n"+Prioridad+ "\n                                                  DESCRIPCION:                 \n"+Descripcion ;
      lista1.add(nuevo);
      TXTITULO.setText("");
      TXTPRIORI.setText("");
      TXTDESCRIP.setText("");
       } 
       }
       
    }//GEN-LAST:event_NUEVAActionPerformed

   
    
    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton NUEVA;
    private javax.swing.JTextField TXTDESCRIP;
    private javax.swing.JTextField TXTITULO;
    private javax.swing.JTextField TXTPRIORI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

}
