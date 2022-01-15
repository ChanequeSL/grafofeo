package Grafo;
public class Nodo {
   private String info;
   protected int arista;
   private int num;
   public Nodo(String info,int num){
      this.info = info;
      arista = 0;
      this.num = num;
   }

   public String getInfo() {
      return info;
   }

   public void setInfo(String info) {
      this.info = info;
   }

   public int getArista() {
      return arista;
   }

   public void setArista(int arista) {
      this.arista = arista;
   }

   public int getNum() {
      return num;
   }

   public void setNum(int num) {
      this.num = num;
   }
   
}
