package exercises.exercise1;

import java.util.SplittableRandom;

public class Vehiculos {
    private String modelo;
    private String placa;
    private String color;
    private int pago;

    public Vehiculos(String modelo, String placa, String color, int pago) {
        this.modelo = modelo;
        this.placa = placa;
        this.color = color;
        this.pago = pago;
    }


    public void pagarPeaje(){

        System.out.println("----------------------------------------------");
        System.out.println("Peaje: " + pago);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Placa: " + placa);
        Peaje.getInstance().cobrarPeaje(pago);

    }
}
