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
      btnUnidos = new javax.swing.JButton();
      jlblSee = new javax.swing.JLabel();
      btnDes = new javax.swing.JButton();
      btnExiste = new javax.swing.JButton();
      jScrollPane2 = new javax.swing.JScrollPane();
      jtxtADos = new javax.swing.JTextArea();

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

      btnUnidos.setText("Adyacente");
      btnUnidos.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnUnidosActionPerformed(evt);
         }
      });

      btnDes.setText("Desenlazar");
      btnDes.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnDesActionPerformed(evt);
         }
      });

      btnExiste.setText("Enlazado");
      btnExiste.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnExisteActionPerformed(evt);
         }
      });

      jtxtADos.setColumns(20);
      jtxtADos.setRows(5);
      jScrollPane2.setViewportView(jtxtADos);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(btnAgregar)
                     .addComponent(jlblSee, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addComponent(btnEliminar)
                     .addGroup(layout.createSequentialGroup()
                        .addComponent(btnEnlace)
                        .addGap(18, 18, 18)
                        .addComponent(btnDes))
                     .addGroup(layout.createSequentialGroup()
                        .addComponent(btnExiste)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUnidos)))
                  .addGap(0, 35, Short.MAX_VALUE))
               .addComponent(jScrollPane2))
            .addContainerGap())
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
                     .addComponent(btnDes))
                  .addGap(18, 18, 18)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                     .addComponent(btnExiste)
                     .addComponent(btnUnidos))
                  .addGap(18, 18, 18)
                  .addComponent(jlblSee, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addGap(18, 18, 18)
                  .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
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

   private void btnDesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesActionPerformed
   int nodouno = Integer.parseInt(JOptionPane.showInputDialog(this,"Nodo Uno a Desenlazar:"));
   int nododos = Integer.parseInt(JOptionPane.showInputDialog(this,"Nodo Dos a Desenlazar:"));
   if(abc.eliminarEnlace(nodouno, nododos)){
      jlblSee.setText("Desenlace Hecho");
      jtxtAUno.setText(abc.mostrar());
   }else{
      jlblSee.setText("Desenlace NO Hecho");
   }
   }//GEN-LAST:event_btnDesActionPerformed

   private void btnExisteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExisteActionPerformed
   int nodouno = Integer.parseInt(JOptionPane.showInputDialog(this,"De que nodo quiere saber si tiene relacionse?"));
   jtxtADos.setText(abc.existe(nodouno));
   }//GEN-LAST:event_btnExisteActionPerformed

   private void btnUnidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnidosActionPerformed
   int nodouno = Integer.parseInt(JOptionPane.showInputDialog(this,"Ingrese el primer nodo que quiere saber si tiene relacion con otro:"));
   int nododos = Integer.parseInt(JOptionPane.showInputDialog(this,"Ingrese el segundo:"));
   jtxtADos.setText(abc.adyacencia(nodouno, nododos));
   }//GEN-LAST:event_btnUnidosActionPerformed

   public static void main(String args[]) {
      java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
            new Grafico().setVisible(true);
         }
      });
   }

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton btnAgregar;
   private javax.swing.JButton btnDes;
   private javax.swing.JButton btnEliminar;
   private javax.swing.JButton btnEnlace;
   private javax.swing.JButton btnExiste;
   private javax.swing.JButton btnUnidos;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JScrollPane jScrollPane2;
   private javax.swing.JLabel jlblSee;
   private javax.swing.JTextArea jtxtADos;
   private javax.swing.JTextArea jtxtAUno;
   // End of variables declaration//GEN-END:variables
}
