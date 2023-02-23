package templates.factoryMethod;

public class Client {
    public static void main (String[]ars){
        IProduct prod1 = new ConcreteCreatorProducto1().factoryMethod();
        prod1.create();
    }
}
