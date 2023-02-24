package exercises.exercise4;

public abstract class BuilderSuscripcion {

    protected Suscripcion sus;

    public Suscripcion getSus(){
        return sus;
    }

    public void sucribirse(){
        sus = new Suscripcion();
    }

    public abstract void buildCosto();
    public abstract void buildEmpresa();
    public abstract void buildListaDeCanales();
}
