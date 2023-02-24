package exercises.exercise4;

public class Amazon extends BuilderSuscripcion {
    @Override
    public void buildCosto() {
        this.sus.setCosto(300);
    }

    @Override
    public void buildEmpresa() {
        sus.setEmpresa("Amazon");
    }

    @Override
    public void buildListaDeCanales() {
        String[] canales = {"Bolivision","Twitch","ESPN"};
        sus.setListaDeCanales(canales);
    }
}
