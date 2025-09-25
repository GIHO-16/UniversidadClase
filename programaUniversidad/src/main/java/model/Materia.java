package model;

public abstract class Materia {
    private String codigo;
    private String nombre;
    private Double numHoras;
    private int creditos;

    public Materia(String codigo, String nombre, Double numHoras, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numHoras = numHoras;
        this.creditos = creditos;
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

    public Double getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(Double numHoras) {
        this.numHoras = numHoras;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }



    @Override
    public String toString() {
        return "Materia{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", numHoras=" + numHoras +
                ", creditos=" + creditos +
                '}';
    }
}

