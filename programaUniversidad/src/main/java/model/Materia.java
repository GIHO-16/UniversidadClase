package model;

import java.util.ArrayList;

public abstract class Materia {
    protected String codigo;
    protected String nombre;
    protected double numHoras;
    protected int creditos;
    protected byte semestres;
    protected Profesor profesor;
    protected ArrayList<Estudiante> listaEstudiantes;

    public Materia(String codigo, String nombre, double numHoras, int creditos, byte semestres, Profesor profesor){
        this.codigo = codigo;
        this.nombre = nombre;
        this.numHoras = numHoras;
        this.creditos = creditos;
        this.semestres = semestres;
        this.profesor = profesor;
        this.listaEstudiantes = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(double numHoras) {
        this.numHoras = numHoras;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public byte getSemestres() {
        return semestres;
    }

    public void setSemestres(byte semestres) {
        this.semestres = semestres;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

}


