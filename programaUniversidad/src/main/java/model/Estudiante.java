package model;

public abstract class Estudiante {
    private String identificacion;
    private String nombre;
    private String id;
    private String programa;
    private String semestre;
    public Estudiante(String identificacion, String nombre, String programa, String semestre, String id) {

        this.identificacion = identificacion;
        this.nombre = nombre;
        this.programa = programa;
        this.semestre = semestre;
        this.id = id;
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