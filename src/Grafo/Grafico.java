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

      btnEnlace.setText("enlace");

      btnAdya.setText("adyacente");

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
               .addComponent(btnAdya)
               .addGroup(layout.createSequentialGroup()
                  .addGap(6, 6, 6)
                  .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(btnEliminar)
                     .addComponent(btnEnlace)))
               .addComponent(jlblSee, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(84, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                  .addGap(62, 62, 62)
                  .addComponent(btnAgregar)
                  .addGap(18, 18, 18)
                  .addComponent(btnEliminar)
                  .addGap(18, 18, 18)
                  .addComponent(btnEnlace)
                  .addGap(18, 18, 18)
                  .addComponent(btnAdya)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
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
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JLabel jlblSee;
   private javax.swing.JTextArea jtxtAUno;
   // End of variables declaration//GEN-END:variables
}
