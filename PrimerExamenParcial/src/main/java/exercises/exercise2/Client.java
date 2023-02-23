package exercises.exercise2;

public class Client {

    public static void main(String[]args) {
        Celular celular = new Celular(
        );

        celular.setModelo("A1");
        celular.setTamaño("15 cm");
        celular.setPeso(60);
        celular.setImei(10000);
        celular.setOrigen("Bolivia");
        celular.setCamara(new Camara("10","5mp"));
        celular.showInfo();

        Celular c1 = celular.clone();
        c1.setImei(10001);

        Celular c2 = celular.clone();
        c2.setImei(10002);

        Celular c3 = celular.clone();
        c3.setImei(10003);

        Celular c4 = celular.clone();
        c4.setImei(10004);

        Celular c5 = celular.clone();
        c5.setImei(10005);



        c1.showInfo();
        c2.showInfo();
        c3.showInfo();
        c4.showInfo();
        c5.showInfo();


    }

}
