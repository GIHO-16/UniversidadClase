package model;

import java.util.ArrayList;

public abstract class Estudiante {
    protected String identificacion;
    protected String nombre;
    protected String id;
    protected String programa;
    protected String semestre;
    protected ArrayList<Materia> ListaMaterias;
    public Estudiante(String identificacion, ArrayList<Materia> listaMaterias, int semestre, String nombre) {

        this.identificacion = identificacion;
        this.nombre = nombre;
        this.programa = programa;
        this.semestre = this.semestre;
        this.id = id;
        this.ListaMaterias = listaMaterias;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        System.out.println ();
        return "";
    }


}