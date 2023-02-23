package templates.abstractFactory.template;

public class Client {
    public static void main(String[]Args){
        String dato = "productc";


            IProduct concreteProductA = AbstractFactory.make(dato);
            concreteProductA.methodA();
            concreteProductA.methodB();
            concreteProductA.methodC();


    }
}
