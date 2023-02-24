package exercises.exercise4;

public class HBO extends BuilderSuscripcion {
    @Override
    public void buildCosto() {
        this.sus.setCosto(100);
    }

    @Override
    public void buildEmpresa() {
        sus.setEmpresa("HBO");
    }

    @Override
    public void buildListaDeCanales() {
        String[] canales = {"Disney XD","Hisory","ESPN"};
        sus.setListaDeCanales(canales);
    }
}
