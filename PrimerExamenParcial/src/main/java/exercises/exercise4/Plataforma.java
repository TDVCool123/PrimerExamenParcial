package exercises.exercise4;

public class Plataforma {

    private BuilderSuscripcion builder;

    public Suscripcion getSus(){
        return builder.getSus();
    }

    public void setSucripcion(BuilderSuscripcion builder){
        this.builder = builder;
    }

    public void buildSuscripcion(){
        this.builder.sucribirse();
        this.builder.buildListaDeCanales();
        this.builder.buildEmpresa();
        this.builder.buildCosto();
    }
}
