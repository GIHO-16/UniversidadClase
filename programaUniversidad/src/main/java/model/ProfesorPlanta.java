package model;

public class ProfesorPlanta extends Profesor{
    protected TipoContrato tipoContrato;
    protected boolean participaProyecto;

    public ProfesorPlanta(String nombre, String identificador, String titulo, byte aniosXP, TipoContrato tipoContrato, boolean participaProyecto) {
        super(nombre, identificador, titulo, aniosXP);
        this.tipoContrato = tipoContrato;
        this.participaProyecto = participaProyecto;
    }

    public TipoContrato getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(TipoContrato tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public boolean isParticipaProyecto() {
        return participaProyecto;
    }

    public void setParticipaProyecto(boolean participaProyecto) {
        this.participaProyecto = participaProyecto;
    }
}
