package Grafo;
public class Nodo {
   private String info;
   private boolean arista;
   private int[] enlaces;
   private int num;
   public Nodo(String info,int num){
      this.info = info;
      arista = false;
      this.num = num;
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
