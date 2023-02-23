package exercises.exercise3;

public class ElementosDeportivosCreator extends ElementosCreator {
    @Override
    public ElementosDeportivos create() {
        ElementosDeportivos eD = new ElementosDeportivos();

        PelotaFutbol pelota = new PelotaFutbol();
        pelota.setTamano("5");
        pelota.setColor("blanco y negro");
        eD.setPelota(pelota);


        return eD;
    }
}
