package exercises.exercise2;

public class Client {

    public static void main(String[]args) {
        Celular prototypeC = new Celular(
        );

        prototypeC.setSueldo(5000);
        prototypeC.setCarga_Horaria(80);
        prototypeC.setCurso_Educacion_Superior(true);
        prototypeC.setAccesoPlataforma(true);
        prototypeC.setMarcadoBiométrico(false);
        prototypeC.setHoraEntrada(8);
        prototypeC.setHoraSalida(18);
        prototypeC.setPersona(new Camara("",""));
        prototypeC.showInfo();

        Celular c1 = prototypeC.clone();
        c1.setPersona(new Camara("Jose", "Vargas"));

        Celular c2 = prototypeC.clone();
        c2.setPersona(new Camara("Sebastian", "Tapia"));

        Celular c3 = prototypeC.clone();
        c3.setPersona(new Camara("Gabriel", "Flores"));

        Celular c4 = prototypeC.clone();
        c4.setPersona(new Camara("Gerald", "Martinez"));

        Celular c5 = prototypeC.clone();
        c5.setPersona(new Camara("Kevin", "Morales"));



        c1.showInfo();
        c2.showInfo();
        c3.showInfo();
        c4.showInfo();
        c5.showInfo();


    }

}
