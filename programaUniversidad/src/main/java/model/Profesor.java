package model;

import java.util.ArrayList;

public abstract class Profesor {
    protected String nombre;
    protected String identificador;
    protected String titulo;
    protected byte aniosXP;
    protected ArrayList<Materia>listaMaterias;

    public Profesor(String nombre, String identificador, String titulo, byte aniosXP) {
        this.nombre = nombre;
        this.identificador = identificador;
        this.titulo = titulo;
        this.aniosXP = aniosXP;
        this.listaMaterias = new ArrayList<>();
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

    public byte getAniosXP() {
        return aniosXP;
    }

    public void setAniosXP(byte aniosXP) {
        this.aniosXP = aniosXP;
    }

    public ArrayList<Materia> getListaMaterias() {
        return listaMaterias;
    }

    public void setListaMaterias(ArrayList<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }


}
