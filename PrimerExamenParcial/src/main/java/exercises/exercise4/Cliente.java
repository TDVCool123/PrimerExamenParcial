package exercises.exercise4;

public class Cliente {
    public static void main (String[]args){

        Plataforma plataforma = new Plataforma();

        Netflix netflix = new Netflix();
        Amazon amazon = new Amazon();
        HBO hbo = new HBO();

        plataforma.setSucripcion(netflix);
        plataforma.buildSuscripcion();

        plataforma.setSucripcion(amazon);
        plataforma.buildSuscripcion();

        plataforma.setSucripcion(hbo);
        plataforma.buildSuscripcion();

        Suscripcion p1 = plataforma.getSus();
        Suscripcion p2 = plataforma.getSus();
        Suscripcion p3 = plataforma.getSus();

        p1.showSuscripcion();
        p2.showSuscripcion();
        p3.showSuscripcion();

    }
}
