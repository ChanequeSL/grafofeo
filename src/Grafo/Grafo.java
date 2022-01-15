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
   }else if (numElem == 1&&nodos[0].getInfo().compareTo(info) == 0) {
            numElem--;
            for (int x = 0; x < nodos.length; x++) {
            matrizAdya[0][x] = 0;
            matrizAdya[x][0] = 0;
         }
            return true;
   }else {
            for (int i = 0; i < numElem; i++) {
               if (nodos[i].getInfo().compareTo(info) == 0) {
                  int elemento = i;
                  for (int j = i; j < numElem-1; j++) {
                     nodos[j] = nodos[j + 1];
                  }
                     numElem--;
                     for (int z = 0; z < nodos.length; z++) 
                        for (int x = 0; x < nodos.length; x++) {
                        matrizAdya[elemento][x] = 0;
                        matrizAdya[x][elemento] = 0;
                   }
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
   public boolean enlace(int nuno,int ndos,int distancia){
      if(matrizAdya[nuno-1][ndos-1]==0){
      nodos[nuno-1].arista++;
      nodos[ndos-1].arista++;
      matrizAdya[nuno-1][ndos-1]=distancia;
      matrizAdya[ndos-1][nuno-1]=distancia;
      return true;
      }else{
       return false;  
      }
   }
   public boolean eliminarEnlace(int nuno,int ndos){
      if(matrizAdya[nuno-1][ndos-1]!=0){
      nodos[nuno-1].arista--;
      nodos[ndos-1].arista--;
      matrizAdya[nuno-1][ndos-1]=0;
      matrizAdya[ndos-1][nuno-1]=0;
      return true;
      }else{
       return false;  
      }
   }
   public String adyacencia(int nuno,int ndos){
      String cadena="";
      if(matrizAdya[nuno][ndos]!=0){
         cadena+="Si estan conectados los nodos -> "+nodos[nuno]+" y "+nodos[ndos] +"\n"
                 + "Por una distancia de: -> "+matrizAdya[nuno][ndos]+"."; 
         return cadena;
      }
      return cadena+="Los Nodos -> "+nodos[nuno]+" y "+nodos[ndos] +"\n"
              + "NO estan conectados.";
   }
   public String existe(int nuno){
      String cadena="";
      if(nodos[nuno].arista>0){
         cadena+="El nodo -> "+nodos[nuno]+" si tiene aristas (relaciones) con otros nodos"+"\n"
                 + "Los nodos con los que se relaciona son: "+"\n";
                  for (int z = 0; z < nodos.length; z++) 
                        for (int x = 0; x < nodos.length; x++)
                           if(matrizAdya[nuno][x]!=0)
                              cadena+="Nodo "+(x+1)+" -> "+nodos[x+1].getInfo()+"\n";               
         return cadena;
      }
      return cadena+="El nodo -> "+nodos[nuno]+" NO tiene aristas (relaciones) con otros nodos";
   }
}
