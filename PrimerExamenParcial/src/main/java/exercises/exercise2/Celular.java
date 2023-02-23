package exercises.exercise2;


public class Celular implements ICelular {
    private String modelo;
    private String tamaño;
    private int peso;
    private Camara camara;

    private int pulgadas;
    private int imei;
    private String origen;



    public int getSueldo() {
        return sueldo;
    }

    public int getCarga_Horaria() {
        return carga_Horaria;
    }

    public boolean isCurso_Educacion_Superior() {
        return curso_Educacion_Superior;
    }

    public boolean isAccesoPlataforma() {
        return accesoPlataforma;
    }

    public boolean isMarcadoBiométrico() {
        return marcadoBiométrico;
    }

    public int getHoraEntrada() {
        return horaEntrada;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public void setCarga_Horaria(int carga_Horaria) {
        this.carga_Horaria = carga_Horaria;
    }

    public void setCurso_Educacion_Superior(boolean curso_Educacion_Superior) {
        this.curso_Educacion_Superior = curso_Educacion_Superior;
    }

    public void setAccesoPlataforma(boolean accesoPlataforma) {
        this.accesoPlataforma = accesoPlataforma;
    }

    public void setMarcadoBiométrico(boolean marcadoBiométrico) {
        this.marcadoBiométrico = marcadoBiométrico;
    }

    public void setHoraEntrada(int horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Camara getPersona() {
        return persona;
    }

    public void setPersona(Camara persona) {
        this.persona = persona;
    }


    @Override
    public Celular clone() {
        Celular clone = new Celular();
        clone.setSueldo(this.getSueldo());
        clone.setCarga_Horaria(this.getCarga_Horaria());
        clone.setCurso_Educacion_Superior(this.isCurso_Educacion_Superior());
        clone.setAccesoPlataforma(this.isAccesoPlataforma());
        clone.setMarcadoBiométrico(this.isMarcadoBiométrico());
        clone.setHoraEntrada(this.getHoraEntrada());
        clone.setHoraSalida(this.getHoraSalida());
        clone.setPersona(this.getPersona());
        return clone;
    }


    public void showInfo() {
        System.out.println("\n ----------------  \n");
        System.out.println("sueldo " + getSueldo());
        System.out.println("Carga_Horaria " + getCarga_Horaria());
        System.out.println("Curso_Educacion_Superior " + isCurso_Educacion_Superior());
        System.out.println("AccesoPlataforma " + isAccesoPlataforma());
        System.out.println("Marcado Biometrico " + isMarcadoBiométrico());
        System.out.println("HoraEntrada " + getHoraEntrada());
        System.out.println("HoraSalida " + getHoraSalida());
        persona.showInfo();
    }


}
