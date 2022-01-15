package Grafo;

public class Grafo {

   private int[][] matrizAdya;
   private Nodo[] nodos;
   private int numElem;

   public Grafo(int tamaño) {
      matrizAdya = new int[tamaño][tamaño];
      nodos = new Nodo[tamaño];
      numElem = 0;
   }

   public boolean agregarNodo(String info) {
      if (numElem < nodos.length) {
         nodos[numElem] = new Nodo(info, (numElem + 1));
         numElem++;
         return true;
      } else {
         return false;
      }
   }

   public boolean eliminar(String info) {
      if(numElem==0){
         return false;
   }else if (numElem == 1) {
            numElem--;
            return true;
   }else {
            for (int i = 0; i < numElem; i++) {
               if (nodos[i].getInfo().compareTo(info) == 0) {
                  for (int j = i; j < numElem-1; j++) {
                     nodos[j] = nodos[j + 1];
                  }
                     numElem--;
                     return true;
                  
               }
            }
         }
      return false;
   }

   public String mostrar() {
      String str = "";
      for (int i = 0; i < numElem; i++) {
         str += nodos[i].getInfo() + "\n";
      }
      return str;
   }
}
