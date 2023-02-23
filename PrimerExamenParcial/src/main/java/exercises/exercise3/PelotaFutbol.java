package exercises.exercise3;

public class PelotaFutbol {
    private String tamano;
    private String color;
    private String garantia;

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void showInfo(){
        System.out.println("Pelota > tamano " + tamano);
        System.out.println("Pelota > color " + color);
        System.out.println("Pelota > garantia " + garantia);
    }
}
