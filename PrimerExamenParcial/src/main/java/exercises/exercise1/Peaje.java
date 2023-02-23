package exercises.exercise1;

public class Peaje {

   private static Peaje instance = null;
   private int dinero=0;

   private Peaje(){
       dinero = 0;
       System.out.println("Dinero inicial:" + dinero);
   }

   public static Peaje getInstance(){
       if (instance == null){
           instance = new Peaje();
       }
       return instance;
   }


    public void cobrarPeaje(int amount){

        if(amount >= 0){
            dinero=dinero+amount;
            System.out.println("Pago realizado con exito: "+ amount + ". Recaudacion hasta el momento: " + dinero);
        }else {
            System.out.println("Ingrese un dato valido:" + "Recaudacion hasta el momento:: " + dinero);
        }
    }

}
