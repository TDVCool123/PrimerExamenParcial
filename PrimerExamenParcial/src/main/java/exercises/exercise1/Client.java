package exercises.exercise1;

import java.util.Scanner;

public class Client {
    public static void main(String []args){


                Vehiculos v1 = new Vehiculos("Suzuki", "6030LAB", "blanco", 200);
                v1.pagarPeaje();

                Vehiculos v2 = new Vehiculos("Nissan", "7894ÑOP", "negro", 300);
                v2.pagarPeaje();

                Vehiculos v3 = new Vehiculos("Volkswagen", "12345QWE", "verde", 800);
                v3.pagarPeaje();

                Vehiculos v4 = new Vehiculos("Ferrari", "4637LUI", "celeste", 1000);
                v4.pagarPeaje();

                Vehiculos v5 = new Vehiculos("Toyota", "5241INE", "rosa", 500);
                v5.pagarPeaje();

    }
}
