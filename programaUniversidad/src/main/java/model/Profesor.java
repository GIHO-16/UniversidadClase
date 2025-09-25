package model;

public abstract class Profesor {
    private String nombre;
    private String identificador;
    private String titulo;
    private byte añosXP;

    public Profesor (String nombre, String identificador, String titulo, byte añosXP){
        this.nombre=nombre;
        this.identificador=identificador;
        this.titulo=titulo;
        this.añosXP= añosXP;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public byte getAñosXP() {
        return añosXP;
    }

    public void setAñosXP(byte añosXP) {
        this.añosXP = añosXP;
    }

}
