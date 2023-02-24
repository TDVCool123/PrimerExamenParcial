package exercises.exercise4;

public class Suscripcion {
    private int costo;
    private String empresa;
    private String [] listaDeCanales = new String[3];

    public int getCosto() {
        return costo;
    }

    public Suscripcion setCosto(int costo) {
        this.costo = costo;
        return this;
    }

    public String getEmpresa() {
        return empresa;
    }

    public Suscripcion setEmpresa(String empresa) {
        this.empresa = empresa;
        return this;
    }

    public String[] getListaDeCanales() {
        return listaDeCanales;
    }

    public Suscripcion setListaDeCanales(String[] listaDeCanales) {
        this.listaDeCanales = listaDeCanales;
        return this;
    }

    public void showSuscripcion(){
        System.out.println("--------------------------------");
        System.out.println("Costo: "+ costo);
        System.out.println("Empresa: "+ empresa);
        System.out.println("Lista De Canales: "+ listaDeCanales);
    }
}
