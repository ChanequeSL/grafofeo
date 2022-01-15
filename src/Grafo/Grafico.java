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

      jLabel2 = new javax.swing.JLabel();
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
      jLabel3 = new javax.swing.JLabel();
      jLabel1 = new javax.swing.JLabel();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

      jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cat01.png"))); // NOI18N
      getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 160, 160));

      jtxtAUno.setColumns(20);
      jtxtAUno.setFont(new java.awt.Font("Leelawadee", 1, 14)); // NOI18N
      jtxtAUno.setRows(5);
      jScrollPane1.setViewportView(jtxtAUno);

      getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 514, 432));

      btnAgregar.setText("Agregar");
      btnAgregar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnAgregarActionPerformed(evt);
         }
      });
      getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 11, -1, -1));

      btnEliminar.setText("Eliminar");
      btnEliminar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnEliminarActionPerformed(evt);
         }
      });
      getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 52, -1, -1));

      btnEnlace.setText("Enlazar");
      btnEnlace.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnEnlaceActionPerformed(evt);
         }
      });
      getContentPane().add(btnEnlace, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 93, -1, -1));

      btnUnidos.setText("Adyacente");
      btnUnidos.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnUnidosActionPerformed(evt);
         }
      });
      getContentPane().add(btnUnidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 134, -1, -1));
      getContentPane().add(jlblSee, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 175, 131, 49));

      btnDes.setText("Desenlazar");
      btnDes.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnDesActionPerformed(evt);
         }
      });
      getContentPane().add(btnDes, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, -1, -1));

      btnExiste.setText("Enlazado");
      btnExiste.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            btnExisteActionPerformed(evt);
         }
      });
      getContentPane().add(btnExiste, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 134, -1, -1));

      jtxtADos.setColumns(20);
      jtxtADos.setFont(new java.awt.Font("Leelawadee", 0, 14)); // NOI18N
      jtxtADos.setRows(5);
      jScrollPane2.setViewportView(jtxtADos);

      getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 242, 327, 201));

      jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cat02.png"))); // NOI18N
      getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, -10, 180, 150));

      jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondito.png"))); // NOI18N
      getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 450));

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
   int nodouno = Integer.parseInt(JOptionPane.showInputDialog(this,"De que nodo quiere saber si tiene relaciones?"));
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
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JScrollPane jScrollPane2;
   private javax.swing.JLabel jlblSee;
   private javax.swing.JTextArea jtxtADos;
   private javax.swing.JTextArea jtxtAUno;
   // End of variables declaration//GEN-END:variables
}
