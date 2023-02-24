package exercises.exercise4;

public class Netflix extends BuilderSuscripcion {
    @Override
    public void buildCosto() {
        this.sus.setCosto(500);
    }

    @Override
    public void buildEmpresa() {
        sus.setEmpresa("Netflix");
    }

    @Override
    public void buildListaDeCanales() {
        String[] canales = {"Disney","Discovery","ESPN"};
        sus.setListaDeCanales(canales);
    }
}
