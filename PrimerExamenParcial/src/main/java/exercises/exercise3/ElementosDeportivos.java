package exercises.exercise3;

public class ElementosDeportivos implements IElementos {
    private PelotaFutbol pelota = new PelotaFutbol();
    private String camiseta;
    private String shorts;
    private String medias;
    private String tenis;

    public ElementosDeportivos(){}

    public PelotaFutbol getPelota() {
        return pelota;
    }

    public void setPelota(PelotaFutbol pelota) {
        this.pelota = pelota;
    }

    public String getCamiseta() {
        return camiseta;
    }

    public void setCamiseta(String camiseta) {
        camiseta = camiseta;
    }

    public String getShorts() {
        return shorts;
    }

    public void setShorts(String shorts) {
        shorts = shorts;
    }

    public String getMedias() {
        return medias;
    }

    public void setMedias(String medias) {
        medias = medias;
    }

    public String getTenis() {
        return tenis;
    }

    public void setTenis(String tenis) {
        tenis = tenis;
    }

    @Override
    public void showKit() {
        System.out.println(" Elementos deportivos ");
        System.out.println("camiseta");
        System.out.println("shorts");
        System.out.println("medias");
        System.out.println("tenis");
        pelota.showInfo();
    }
}
