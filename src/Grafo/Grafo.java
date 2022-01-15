package Grafo;

public class Grafo {

   private int[][] matrizAdya;
   private Nodo[] nodos;
   private int numElem;
   private String str;

   public Grafo(int tamaño) {
      matrizAdya = new int[tamaño][tamaño];
      nodos = new Nodo[tamaño];
      numElem = 0;
      str="";
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
   public void establecerMatriz() {
      //Llenara de 0 la matriz, referencia a no tener aristas o enlaces.
      for (int i = 0; i < nodos.length; i++) 
         for (int j = 0; j < nodos.length; j++) {
            matrizAdya[i][j] = 0;
         }
   }
   /**
    * Metodo show, muestra los elementos de la matriz.
    * @return un estring con los elementos de la matriz organizados como tabla.
    */
   public String mostrar() {
      str = "Nodos"+"    ";
      for (int i = 0; i < numElem; i++) {
         str +="["+ nodos[i].getInfo() +"]"+ "    ";
      }
      str+="\n"+"[" + (1) + "]              ";
      //Empezamos a acomodar los datos en la tabla.
      for (int i = 0; i < numElem; i++) {
         for (int j = 0; j < numElem; j++) 
            str += " " + "[" + matrizAdya[i][j] + "]" + "         ";
         
         if(i<nodos.length-1)
         str += "\n" + "[" + (i + 2) + "]              ";   
         
      }
      return str;
   }
   
   
   
   
   
   /*

   public String mostrar() {
      String str = "";
      for (int i = 0; i < numElem; i++) {
         str += nodos[i].getInfo() + "\n";
      }
      return str;
   }
   */
   
   
}
