package Grafo;

import javax.swing.JOptionPane;

public class Grafico extends javax.swing.JFrame {
   Grafo abc;
   public Grafico() {
      initComponents();
      int cant = Integer.parseInt(JOptionPane.showInputDialog(this,"Cuantos nodos seran en total?"));
      abc = new Grafo(cant);
   }
   @SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jScrollPane1 = new javax.swing.JScrollPane();
      jtxtAUno = new javax.swing.JTextArea();
      btnAgregar = new javax.swing.JButton();
      btnEliminar = new javax.swing.JButton();
      btnEnlace = new javax.swing.JButton();
      btnAdya = new javax.swing.JButton();
      jlblSee = new javax.swing.JLabel();
      jButton1 = new javax.swing.JButton();
      jButton2 = new javax.swing.JButton();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

      jtxtAUno.setColumns(20);
      jtxtAUno.setRows(5);
      jScrollPane1.setViewportView(jtxtAUno);

      btnAgregar.setText("Agregar");
      btnAgregar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnAgregarActionPerformed(evt);
         }
      });

      btnEliminar.setText("Eliminar");
      btnEliminar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnEliminarActionPerformed(evt);
         }
      });

      btnEnlace.setText("Enlazar");
      btnEnlace.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnEnlaceActionPerformed(evt);
         }
      });

      btnAdya.setText("adyacente");

      jButton1.setText("Desenlazar");
      jButton1.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
         }
      });

      jButton2.setText("Enlazado");

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addComponent(btnAgregar)
               .addComponent(jlblSee, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(btnEliminar)
               .addGroup(layout.createSequentialGroup()
                  .addComponent(btnEnlace)
                  .addGap(18, 18, 18)
                  .addComponent(jButton1))
               .addGroup(layout.createSequentialGroup()
                  .addComponent(jButton2)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(btnAdya)))
            .addContainerGap(45, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addComponent(btnAgregar)
                  .addGap(18, 18, 18)
                  .addComponent(btnEliminar)
                  .addGap(18, 18, 18)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(btnEnlace)
                     .addComponent(jButton1))
                  .addGap(18, 18, 18)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(jButton2)
                     .addComponent(btnAdya))
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 215, Short.MAX_VALUE)
                  .addComponent(jlblSee, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
               .addComponent(jScrollPane1))
            .addContainerGap())
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
   String info = JOptionPane.showInputDialog(this,"Contenido del Nodo:");
   if(abc.agregarNodo(info)){
      jtxtAUno.setText(abc.mostrar());
      jlblSee.setText("Añadido");
   }else{
      jlblSee.setText("NO Añadido");
   }
   
   }//GEN-LAST:event_btnAgregarActionPerformed

   private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
   String info = JOptionPane.showInputDialog(this,"Contenido del Nodo:");
   if(abc.eliminar(info)){
      jtxtAUno.setText(abc.mostrar());
      jlblSee.setText("Eliminado");
   }else{
      jlblSee.setText("NO Eliminado");
   }
   }//GEN-LAST:event_btnEliminarActionPerformed

   private void btnEnlaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnlaceActionPerformed
   int nodouno = Integer.parseInt(JOptionPane.showInputDialog(this,"Nodo Uno a enlazar:"));
   int nododos = Integer.parseInt(JOptionPane.showInputDialog(this,"Nodo Dos a enlazar:"));
   int dist = Integer.parseInt(JOptionPane.showInputDialog(this,"Distancia entre ambos nodos:"));
   if(abc.enlace(nodouno, nododos, dist)){
      jlblSee.setText("Enlace Hecho");
      jtxtAUno.setText(abc.mostrar());
   }else{
      jlblSee.setText("Enlace NO Hecho");
   }
   }//GEN-LAST:event_btnEnlaceActionPerformed

   private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
   int nodouno = Integer.parseInt(JOptionPane.showInputDialog(this,"Nodo Uno a Desenlazar:"));
   int nododos = Integer.parseInt(JOptionPane.showInputDialog(this,"Nodo Dos a Desenlazar:"));
   if(abc.eliminarEnlace(nodouno, nododos)){
      jlblSee.setText("Desenlace Hecho");
      jtxtAUno.setText(abc.mostrar());
   }else{
      jlblSee.setText("Desenlace NO Hecho");
   }
   }//GEN-LAST:event_jButton1ActionPerformed

   public static void main(String args[]) {
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new Grafico().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btnAdya;
   private javax.swing.JButton btnAgregar;
   private javax.swing.JButton btnEliminar;
   private javax.swing.JButton btnEnlace;
   private javax.swing.JButton jButton1;
   private javax.swing.JButton jButton2;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JLabel jlblSee;
   private javax.swing.JTextArea jtxtAUno;
   // End of variables declaration//GEN-END:variables
}
