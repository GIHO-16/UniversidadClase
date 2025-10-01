package model;

public class ProfesorCatedra extends Profesor{
    protected int horaContrato;
    protected boolean trabajoExtra;

    public ProfesorCatedra(String nombre, String identificador, String titulo, byte aniosXP, int horaContrato, boolean trabajoExtra) {
        super(nombre, identificador, titulo, aniosXP);
        this.horaContrato = horaContrato;
        this.trabajoExtra = trabajoExtra;
    }

    public int getHoraContrato() {
        return horaContrato;
    }

    public void setHoraContrato(int horaContrato) {
        this.horaContrato = horaContrato;
    }

    public boolean isTrabajoExtra() {
        return trabajoExtra;
    }

    public void setTrabajoExtra(boolean trabajoExtra) {
        this.trabajoExtra = trabajoExtra;
    }
}
