package Grafo;
public class Nodo {
   private String info;
   private boolean arista;
   private int[] enlaces;
   private int num=0;
   public Nodo(String info){
      this.info = info;
      num+=1;
   }

   public String getInfo() {
      return info;
   }

   public void setInfo(String info) {
      this.info = info;
   }

   public boolean isArista() {
      return arista;
   }

   public void setArista(boolean arista) {
      this.arista = arista;
   }

   public int[] getEnlaces() {
      return enlaces;
   }

   public void setEnlaces(int[] enlaces) {
      this.enlaces = enlaces;
   }

   public int getNum() {
      return num;
   }

   public void setNum(int num) {
      this.num = num;
   }
   
}
