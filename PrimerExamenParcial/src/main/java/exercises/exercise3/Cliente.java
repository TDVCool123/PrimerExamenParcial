package exercises.exercise3;

public class Cliente {
    public static void main(String [] args) {
        ElementosDeportivos eD = new ElementosDeportivosCreator().create();

        eD.showKit();

    }
}
