package exercises.exercise2;


public class Celular implements ICelular {
    private String modelo;
    private String tamaño;
    private int peso;
    private Camara camara;
    private int imei;
    private String origen;


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Camara getCamara() {
        return camara;
    }

    public void setCamara(Camara camara) {
        this.camara = camara;
    }

    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }


    @Override
    public Celular clone() {

        Celular clone = new Celular();

        clone.setModelo(this.getModelo());
        clone.setTamaño(this.getTamaño());
        clone.setPeso(this.getPeso());
        clone.setCamara(this.getCamara());
        clone.setImei(this.getImei());
        clone.setOrigen(this.getOrigen());
        return clone;

    }


    public void showInfo() {
        System.out.println("----------------------------------------");
        System.out.println("Modelo: " + getModelo());
        System.out.println("Tamaño: " + getTamaño());
        System.out.println("Peso: " + getPeso());

        System.out.println("Imei: " + getImei());
        System.out.println("Origen " + getOrigen());

        camara.showInfo();
    }


}
