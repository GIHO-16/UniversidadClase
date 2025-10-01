package model;

import java.util.ArrayList;

public class EstudiantePosgrado extends Estudiante {
    protected String temaInvestigacion;
    protected TipoCurso tipoCurso;

    public EstudiantePosgrado(String identificacion, ArrayList<Materia> listaMaterias, int semestre, String nombre, String temaInvestigacion, TipoCurso tipoCurso){
        super(identificacion, listaMaterias, semestre, nombre);
        this.temaInvestigacion = temaInvestigacion;
        this.tipoCurso = tipoCurso;
    }

    public String getTemaInvestigacion() {
        return temaInvestigacion;
    }

    public void setTemaInvestigacion(String temaInvestigacion) {
        this.temaInvestigacion = temaInvestigacion;
    }

    public TipoCurso getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(TipoCurso tipoCurso) {
        this.tipoCurso = tipoCurso;
    }
}
